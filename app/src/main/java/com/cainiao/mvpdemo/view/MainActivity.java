package com.cainiao.mvpdemo.view;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cainiao.mvpdemo.R;
import com.cainiao.mvpdemo.presenter.UserPresenter;

public class MainActivity extends Activity implements View.OnClickListener,IUserView {
    private EditText mFirstNameEditText,mLastNameEditText,mIdEditText;
    private Button mSaveButton,mLoadButton;
    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        userPresenter=new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);
    }

    @Override
    public int getID() {
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getFirstName() {
        return mFirstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastNameEditText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastNameEditText.setText(lastName);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.saveButton:
                userPresenter.saveUser(getID(),getFirstName(),getLastName());
                break;
            case R.id.loadButton:
                userPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    void findWidgets(){
        mFirstNameEditText = (EditText) findViewById(R.id.first_name_edt);
        mLastNameEditText = (EditText) findViewById(R.id.last_name_edt);
        mIdEditText = (EditText) findViewById(R.id.id_edt);

        mSaveButton = (Button) findViewById(R.id.saveButton);
        mLoadButton = (Button) findViewById(R.id.loadButton);
    }
}
