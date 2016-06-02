package com.thedeveloperworldisyours.espressosetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText;
    Button mButton;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.activity_main_text);
        mButton = (Button) findViewById(R.id.activity_main_button);
        mEditText = (EditText) findViewById(R.id.activity_main_edit_text);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String enterString = mEditText.getText().toString();
        if (!enterString.isEmpty()){
            mTextView.setText(enterString);
        }
    }

}
