package ro.pub.cs.systems.eim.practicaltest01Var08;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PracticalTest01Var08MainActivity extends AppCompatActivity {
    private EditText b1;
    private EditText b2;
    private EditText b3;
    private EditText b4;

    private Button set;

    private ContactsImageButtonClickListener contactsImageButtonClickListener = new ContactsImageButtonClickListener();
    private class ContactsImageButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String s1 = b1.getText().toString();
            String s2 = b2.getText().toString();
            String s3 = b3.getText().toString();
            String s4 = b4.getText().toString();


            String sa = s1 + s2+ s3+ s4;
            if (s1.length() > 0 && s3.length() > 0 && s2.length() > 0 && s4.length() > 0) {



                Intent intent = new Intent("ro.pub.cs.systems.eim.practicatest01Var08.intent.action.PracticalTest01Var08SecondaryActivity");
                //intent.putExtra("ro.pub.cs.systems.eim.lab04.contactsmanager.PHONE_NUMBER_KEY", sa);
                startActivityForResult(intent, 2017);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_main);


        b1= (EditText)findViewById(R.id.editText1);
        b2= (EditText)findViewById(R.id.editText2);
        b3= (EditText)findViewById(R.id.editText3);
        b4= (EditText)findViewById(R.id.editText4);


        set = (Button)findViewById(R.id.button5);
        set.setOnClickListener(contactsImageButtonClickListener);


    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        b1= (EditText)findViewById(R.id.editText1);
        b2= (EditText)findViewById(R.id.editText2);
        b3= (EditText)findViewById(R.id.editText3);
        b4= (EditText)findViewById(R.id.editText4);

        savedInstanceState.putString("USERNAME_EDIT_TEXT1", b1.getText().toString());
        savedInstanceState.putString("USERNAME_EDIT_TEXT2", b2.getText().toString());
        savedInstanceState.putString("USERNAME_EDIT_TEXT3", b3.getText().toString());
        savedInstanceState.putString("USERNAME_EDIT_TEXT4", b4.getText().toString());


    }



    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.containsKey("USERNAME_EDIT_TEXT1")) {
            b1= (EditText)findViewById(R.id.editText1);
            b1.setText(savedInstanceState.getString("USERNAME_EDIT_TEXT1"));
        }
        if (savedInstanceState.containsKey("USERNAME_EDIT_TEXT2")) {
            b2= (EditText)findViewById(R.id.editText2);
            b2.setText(savedInstanceState.getString("USERNAME_EDIT_TEXT2"));
        }
        if (savedInstanceState.containsKey("USERNAME_EDIT_TEXT3")) {
            b3= (EditText)findViewById(R.id.editText3);
            b3.setText(savedInstanceState.getString("USERNAME_EDIT_TEXT3"));
        }
        if (savedInstanceState.containsKey("USERNAME_EDIT_TEXT4")) {
            b4= (EditText)findViewById(R.id.editText4);
            b4.setText(savedInstanceState.getString("USERNAME_EDIT_TEXT4"));
        }




    }
}
