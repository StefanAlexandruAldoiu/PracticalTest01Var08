package ro.pub.cs.systems.eim.practicatest01Var08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PracticalTest01Var08SecondaryActivity extends AppCompatActivity {



    private TextView b1;
    private TextView b2;
    private TextView b3;
    private TextView b4;

    private Button sum;
    private Button prod;

    private ContactsImageButtonClickListener SumListener = new ContactsImageButtonClickListener();
    private class ContactsImageButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String s1 = b1.getText().toString();
            String s2 = b2.getText().toString();
            String s3 = b3.getText().toString();
            String s4 = b4.getText().toString();
        }
    }
    private ContactsImageButtonClickListener1 ProdListener = new ContactsImageButtonClickListener1();
    private class ContactsImageButtonClickListener1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String s1 = b1.getText().toString();
            String s2 = b2.getText().toString();
            String s3 = b3.getText().toString();
            String s4 = b4.getText().toString();

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_secondary);
    }
}
