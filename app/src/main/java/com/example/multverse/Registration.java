package com.example.multverse;

import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.ThreadLocalRandom;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity {

    Button btnToLogin, btnRegistration;
    EditText login, password,number;
    DatabaseReference DB;
    String USER_KEY = "User";

    private void init() {
        btnToLogin = findViewById(R.id.login_button);
        btnRegistration = findViewById(R.id.registration_button);

        login = findViewById(R.id.loginIn);
        password = findViewById(R.id.passwordIn);
        number = findViewById(R.id.numberIn);

        DB = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        init();

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
            }
        });

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = DB.getKey();
                String mLogin = login.getText().toString();
                String mPassword = password.getText().toString();
                String mNumber = number.getText().toString();

                User newUser = new User(id, mLogin,mPassword,mNumber);

                if ((!TextUtils.isEmpty(mLogin)) && (!TextUtils.isEmpty(mPassword)) && (!TextUtils.isEmpty(mNumber))){
                    DB.push().setValue(newUser);
                    Intent intent = new Intent(Registration.this, Login.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Registration.this, "Не все поля заполненны!", Toast.LENGTH_SHORT).show();
                }




            }
        });
    }
}