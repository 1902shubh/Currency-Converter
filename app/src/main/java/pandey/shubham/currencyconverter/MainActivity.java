package pandey.shubham.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button yen,dollar,euro,rubal,dinar,pound,ausdollar,candollar,bitcoin;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.doller);
        yen=findViewById(R.id.yen);
        rubal=findViewById(R.id.rubel);
        dinar=findViewById(R.id.dinar);
        pound=findViewById(R.id.pound);
        ausdollar=findViewById(R.id.ausdoller);
        candollar=findViewById(R.id.candoller);
        bitcoin=findViewById(R.id.bitcoin);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.012;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.014;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.011;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.021;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0043;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0000014;
                    DecimalFormat decimalFormat=new DecimalFormat("#.0000000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.019;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*1.49;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
        rubal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=editText.getText().toString();
                if (TextUtils.isEmpty(e)){
                    editText.setError("Please Input Number ");
                }else {
                    double n,k;
                    n=Double.parseDouble(e);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.92;
                    DecimalFormat decimalFormat=new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
    }
}
