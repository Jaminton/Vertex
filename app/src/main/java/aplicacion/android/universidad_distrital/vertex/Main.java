package aplicacion.android.universidad_distrital.vertex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button formulario1,encuesta1,salir2,consultar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formulario1 =  (Button)findViewById(R.id.formulario1);
        encuesta1= (Button)findViewById(R.id.encuesta1);
        salir2 = (Button)findViewById(R.id.salir2);
        consultar1 =(Button)findViewById(R.id.consulta1);



        encuesta1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(Main.this,Encuesta.class);
                startActivity(intent);





            }
        });

        formulario1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Main.this,Formulario.class);
                startActivity(intent);
            }
        });

        salir2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finish();


            }
        });

        consultar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main.this,consultaformulario.class);
                startActivity(intent);

            }
        });







    }
}
