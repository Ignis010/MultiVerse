package com.example.multverse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    Button btnLogin, btnToRegistration;
    EditText loginIn, passwordIn;

    DatabaseReference DB;

    String USER_KEY = "User";

    private void init(){
        btnLogin = findViewById(R.id.login_button);
        btnToRegistration = findViewById(R.id.registration_button);

        loginIn = findViewById(R.id.loginIn);
        passwordIn = findViewById(R.id.passwordIn);

        DB = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ValueEventListener vListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for(DataSnapshot ds : snapshot.getChildren()){
                            User user = ds.getValue(User.class);

                            String loginText = user.login;
                            String passwordText = user.password;

                            String loginMain = loginIn.getText().toString();
                            String passwordMain = passwordIn.getText().toString();

                            if((loginMain.equals(loginText)) && (passwordMain.equals(passwordText))){
                                Intent intent = new Intent(Login.this, Catalog.class);
                                startActivity(intent);
                                break;
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                };

                DB.addValueEventListener(vListener);
            }
        });

        btnToRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });
    }
}