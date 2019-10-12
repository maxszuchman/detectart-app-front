package com.experta.detectart.ui.dispositivos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.experta.detectart.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DispositivosFragment extends Fragment {

    private DispositivosViewModel dispositivosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        dispositivosViewModel = ViewModelProviders.of(this).get(DispositivosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contactos, container, false);

        final TextView textView = root.findViewById(R.id.text_contactos);
        dispositivosViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}