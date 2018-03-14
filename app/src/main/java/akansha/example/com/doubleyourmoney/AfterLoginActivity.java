package akansha.example.com.doubleyourmoney;

import android.app.Activity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class AfterLoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner,yesnopayment;
    private static final String[]paths = {"Select your Ticket Price","10","20","50","100","500"};
    private static final String[]yesno={"Is Payment Successfully Received","Yes","No"};
private TextView selectedvalue_textview;
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        play = (Button) findViewById(R.id.play);
        play.setVisibility(View.INVISIBLE);

        selectedvalue_textview= (TextView) findViewById(R.id.selectedvalue_textview);
        spinner = (Spinner)findViewById(R.id.spinner);
        yesnopayment=(Spinner)findViewById(R.id.yesnopayment);
         play=(Button)findViewById(R.id.play);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AfterLoginActivity.this, android.R.layout.simple_spinner_item,paths);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(AfterLoginActivity.this, android.R.layout.simple_spinner_item,yesno);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        yesnopayment.setAdapter(adapter1);
        yesnopayment.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        if (parent.getId() == R.id.spinner) {
            switch (position) {
                case 0:
                    // Whatever you want to happen when the first item gets selected
                    break;
                case 1:
                    selectedvalue_textview.setText(String.valueOf(spinner.getSelectedItem()));
                    // Whatever you want to happen when the second item gets selected
                    break;
                case 2:
                    selectedvalue_textview.setText(String.valueOf(spinner.getSelectedItem()));
                    // Whatever you want to happen when the thrid item gets selected
                    break;
                case 3:
                    selectedvalue_textview.setText(String.valueOf(spinner.getSelectedItem()));
                    // Whatever you want to happen when the second item gets selected
                    break;
                case 4:
                    selectedvalue_textview.setText(String.valueOf(spinner.getSelectedItem()));
                    // Whatever you want to happen when the thrid item gets selected
                    break;
                case 5:
                    selectedvalue_textview.setText(String.valueOf(spinner.getSelectedItem()));
                    // Whatever you want to happen when the thrid item gets selected
                    break;
                default:
                    selectedvalue_textview.setText("Nothing Selected");

            }
        }
        if (parent.getId() == R.id.yesnopayment) {
            switch (position) {
                case 0:
                   // selectedvalue_textview.setText("Selected Value is:" + String.valueOf(yesnopayment.getSelectedItem()));
                    // Whatever you want to happen when the first item gets selected
                    break;
                case 1:
                   // selectedvalue_textview.setText("Selected Value is:" + String.valueOf(yesnopayment.getSelectedItem()));
                    play.setVisibility(View.VISIBLE);

                    break;
                case 2:
                    play.setVisibility(View.INVISIBLE);

                        break;


            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
