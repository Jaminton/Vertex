package aplicacion.android.universidad_distrital.vertex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Encuesta extends AppCompatActivity {

    Button regresar1,salir1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        regresar1 =(Button)findViewById(R.id.regresar1);
        salir1 =(Button)findViewById(R.id.salir1);

        regresar1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                Intent regresar1 = new Intent(Encuesta.this,Main.class);
                startActivity(regresar1);

            }
        });

        salir1.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {

                finish();



            }
        }));

    }
}
