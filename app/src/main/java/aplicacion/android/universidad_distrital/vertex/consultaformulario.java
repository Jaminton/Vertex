package aplicacion.android.universidad_distrital.vertex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class consultaformulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultaformulario);


        Button consultar;
//        final String datum = "WGS-84";
        final EditText opciones,opestado,municipio,departamento;
        final EditText cedula,Formulario,nombrev,nomenclatura,lat,log,altura,entidad,tipovertice,datum,sitio,estadovertice,describio,hora,fecha;

        opciones        = (EditText)findViewById(R.id.tipovertice1);
        opestado        = (EditText)findViewById(R.id.estadovertice1);
        municipio       = (EditText)findViewById(R.id.municipio1);
        departamento    = (EditText)findViewById(R.id.departamento1);
        cedula          = (EditText)findViewById(R.id.cedula1);
        nombrev         =(EditText)findViewById(R.id.nombrev1);
        nomenclatura   =(EditText)findViewById(R.id.nomenclaura1);
        lat            =(EditText)findViewById(R.id.latitud1);
        log           =(EditText)findViewById(R.id.longitud1);
        altura        =(EditText)findViewById(R.id.altura1);
        entidad       =(EditText)findViewById(R.id.entidad1);
        sitio          =(EditText)findViewById(R.id.sitio1);
        describio       =(EditText)findViewById(R.id.describio1);
        hora            =(EditText)findViewById(R.id.hora1);
        fecha           =(EditText)findViewById(R.id.fecha1);
        consultar       =(Button)findViewById(R.id.consultar1);
        datum           =(EditText)findViewById(R.id.datum1);



        consultar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                List<RegistroDatos> RegistroDatoslista = RegistroDatos.find(RegistroDatos.class, "Cedula = ?",cedula.getText().toString());
                RegistroDatos RegistroD1 = RegistroDatoslista.get(0);
                nombrev.setText(RegistroD1.getNombrev());
                nomenclatura.setText(RegistroD1.getNomenclatura());
                lat.setText(RegistroD1.getLat());
                log.setText(RegistroD1.getLog());
                altura.setText(RegistroD1.getAltura());
                entidad.setText(RegistroD1.getEntidad());
                opciones.setText(RegistroD1.getTipovertice());
                datum.setText(RegistroD1.getDatum()); //poner en un tipo texto.
                departamento.setText(RegistroD1.getDepartamento());
                municipio.setText(RegistroD1.getMunicipio());
                sitio.setText(RegistroD1.getSitio());
                opestado.setText(RegistroD1.getEstadovertice());
                describio.setText(RegistroD1.getDescribio());
                fecha.setText(RegistroD1.getFecha());
                hora.setText(RegistroD1.getHora());
            }
        });
    }
    }
