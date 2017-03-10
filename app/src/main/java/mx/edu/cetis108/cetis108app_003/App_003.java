package mx.edu.cetis108.cetis108app_003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class App_003 extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    EditText edText1,edText2;
    TextView txtResultado;

    Integer num1,num2,operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn1=(Button) findViewById(R.id.btcal);
        edText1=(EditText) findViewById(R.id.et1);
        edText2=(EditText) findViewById(R.id.et2);
        txtResultado=(TextView) findViewById(R.id.txtresul);

btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        num1=Integer.parseInt(edText1.getText().toString());
        num2=Integer.parseInt(edText2.getText().toString());
        if (num1>num2){
            operacion=num1-num2;
            txtResultado.setText(operacion.toString());
    }
        else {
             if (num2 > num1) {
                operacion = num1 + num2;
                txtResultado.setText(operacion.toString());
            }
        }
    }
}
