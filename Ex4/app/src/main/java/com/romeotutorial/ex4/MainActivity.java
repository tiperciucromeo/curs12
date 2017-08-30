package com.romeotutorial.ex4;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginMethod(View v)
    {
        MyDialog dialog = new MyDialog();
        dialog.show(getFragmentManager(),"my_dialog");
    }
}
