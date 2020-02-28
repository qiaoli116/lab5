package com.holmesglen.lab05multiscreenapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.holmesglen.lab05multiscreenapp.Models.Contact;
import com.holmesglen.lab05multiscreenapp.PhoneBookDB.PhonebookDb;
import com.holmesglen.lab05multiscreenapp.R;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button btnCancel = findViewById(R.id.btn_add_cancel);
        btnCancel.setOnClickListener(new btnCancelOnClickListener());

        Button btnSubmit = findViewById(R.id.btn_add_submit);
        btnSubmit.setOnClickListener(new btnSubmitOnClickListener());
    }

    // for button cancel
    class btnCancelOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            finish();
        }
    }
    // for button submit
    class btnSubmitOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText edtName = findViewById(R.id.txt_add_input_name);
            EditText edtPhone = findViewById(R.id.txt_add_input_phone);
            String name = edtName.getText().toString();
            String phone = edtPhone.getText().toString();

            // create a new contract
            Contact contact = new Contact(name, phone);

            // add into database
            PhonebookDb.getInstance().addContact(contact);

            // dump the database
            PhonebookDb.getInstance().dumpDB();

            // return back to home page
            AddActivity.this.finish();
        }
    }
}
