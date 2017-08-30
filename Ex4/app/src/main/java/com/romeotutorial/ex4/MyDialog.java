package com.romeotutorial.ex4;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.romeotutorial.ex4.R.id.editText;

/**
 * Created by romeotiperciuc on 29/08/2017.
 */

public class MyDialog extends DialogFragment {
    LayoutInflater inflater;
    EditText bla;
    View v;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.my_dialog_background,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setView(v).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                bla = (EditText) v.findViewById(editText);
                Toast.makeText(getActivity(),"Text :" + bla.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"CANCEL clicked",Toast.LENGTH_SHORT).show();

            }
        });
        return builder.create();
    }

}
