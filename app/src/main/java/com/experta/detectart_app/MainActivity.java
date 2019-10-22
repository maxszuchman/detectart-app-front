package com.experta.detectart_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.experta.detectart_app.google_login.LoginActivity;
import com.experta.detectart_app.ui.BottomNavActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.SignInButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SignInButton mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginBtn = findViewById(R.id.login_button);

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        this.getSupportActionBar().hide();
    }

    private void checkUserStatus(){
        // Obtengo la instancia del usuario
        GoogleSignInAccount user = GoogleSignIn.getLastSignedInAccount(getApplicationContext());

        // Si es null el usuario no está conectado en memoria
        if (user != null) {
            startActivity(new Intent(MainActivity.this, BottomNavActivity.class));
            finish();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        // Chequea que el usuario no esté conectado
        checkUserStatus();
    }

}

