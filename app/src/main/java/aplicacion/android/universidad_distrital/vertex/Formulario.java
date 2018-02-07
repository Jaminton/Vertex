package aplicacion.android.universidad_distrital.vertex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Formulario extends AppCompatActivity {



    Spinner opciones,opestado,municipio,departamento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


        opciones        = (Spinner)findViewById(R.id.sp01);
        opestado        = (Spinner)findViewById(R.id.sp02);
        municipio       = (Spinner)findViewById(R.id.sp03);
        departamento    = (Spinner)findViewById(R.id.sp04);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item );
        opciones.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.opestado, android.R.layout.simple_spinner_item );
        opestado.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.municipio, android.R.layout.simple_spinner_item );
        municipio.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.departamento, android.R.layout.simple_spinner_item );
        departamento.setAdapter(adapter4);


    }
}
