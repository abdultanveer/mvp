package com.example.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * mainactivity is a view in mvp
 */
public class MainActivity extends AppCompatActivity implements MainContract.View {//4
    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);//wiring---6
    }

    public void clickListener(View view) {
        //view: hey mr presenter somebody clicked a button on me
        presenter.onButtonClicked();//7
    }

    @Override
    public void showToast(String abdul) {
        Toast.makeText(this, abdul, Toast.LENGTH_SHORT).show();
    }
}
