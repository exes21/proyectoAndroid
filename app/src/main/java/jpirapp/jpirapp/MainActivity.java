package jpirapp.jpirapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView url;
    private String direccion;
    private CheckBox terminos;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = (TextView)findViewById(R.id.enlace);
        terminos = (CheckBox)findViewById(R.id.checkBoxAceptar);
        boton = (Button)findViewById(R.id.buttonConectarse);

        direccion = "";

        url.setOnClickListener(this);
        terminos.setOnClickListener(this);
        boton.setOnClickListener(this);
        boton.setEnabled(false);

    }
    public void onClick(View v) { //esta es una linda fincion que hace algo cuando se da un click

        switch (v.getId()){
            case R.id.enlace:
                direccion = "https://www.google.com.do";
                irAweb(direccion);
                break;
            case R.id.checkBoxAceptar:
                if (terminos.isChecked()){
                    boton.setEnabled(true);
                }else{
                    boton.setEnabled(false);
                }
                break;

        }

    }
    public void irAweb (String d){
        Uri uri = Uri.parse(d);
        Intent intentNav = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intentNav);





    }




}
