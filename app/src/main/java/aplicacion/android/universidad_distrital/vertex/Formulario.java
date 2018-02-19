package aplicacion.android.universidad_distrital.vertex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

public class Formulario extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


        Button enviar,consultar;
        final String datum = "WGS-84";
        final Spinner opciones,opestado,municipio,departamento;
        final EditText cedula,Formulario,nombrev,nomenclatura,lat,log,altura,entidad,tipovertice,sitio,estadovertice,describio,hora,fecha;




        opciones        = (Spinner)findViewById(R.id.sp01);
        opestado        = (Spinner)findViewById(R.id.sp02);
        municipio       = (Spinner)findViewById(R.id.sp03);
        departamento    = (Spinner)findViewById(R.id.sp04);
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
        enviar          =(Button)findViewById(R.id.enviar1);
        consultar       =(Button)findViewById(R.id.consultar1);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item );
        opciones.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.opestado, android.R.layout.simple_spinner_item );
        opestado.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.municipio, android.R.layout.simple_spinner_item );
        municipio.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.departamento, android.R.layout.simple_spinner_item );
        departamento.setAdapter(adapter4);




//
//        enviar =(Button)findViewById(R.id.enviar1);
//
//        final BDHelper  bdhelper = new BDHelper(getApplicationContext());

        enviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

//
//                private boolean checkDataBase( "/data/data/vertex.app.package/databases/bdvertex.db3)" {
//                    SQLiteDatabase checkDB = null;
//                    try {
//                        checkDB = SQLiteDatabase.openDatabase(Database_path, null, SQLiteDatabase.OPEN_READONLY);
//                        checkDB.close();
//                    } catch (SQLiteException e) {
//                        Log.e("Error", "No existe la base de datos " + .getMessage());
//                    }
//                    return checkDB != null;
//                }
//


//                try {
//                    SQLiteDatabase db = bdhelper.getWritableDatabase();
//                    ContentValues valores = new ContentValues();
//
//                    valores.put(BDHelper.DatosTabla.COLUMNA_NOMBRESV, nombrev.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_NOMENCLATURA, nomenclatura.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_LAT, lat.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_LONG, log.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_ALTURA, altura.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_ENTIDAD, entidad.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_TIPOVERTICE, opciones.getSelectedItem().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_DATUM, datum.toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_DEPARTAMENTO, departamento.getSelectedItem().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_MUNICIPIO, municipio.getSelectedItem().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_SITIO, sitio.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_ESTADOVERTICE, opestado.getSelectedItem().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_DESCRIBIO, describio.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_FECHA, fecha.getText().toString());
//                    valores.put(BDHelper.DatosTabla.COLUMNA_HORA, hora.getText().toString());
//
//                    Long Idsave = db.insert(BDHelper.DatosTabla.NOMBRE_TABLA, BDHelper.DatosTabla.CEDULA_ID, valores);
//
//
//                    Toast.makeText(getApplicationContext(), "formulario vertex guardado" + Idsave, Toast.LENGTH_LONG).show();
//
//                }
//                catch (Exception e){
//                    Toast.makeText(getApplicationContext(), "datos no guardados!!", Toast.LENGTH_SHORT).show();
//                }



                RegistroDatos RegistroD = new RegistroDatos
                        (cedula.getText().toString(),nombrev.getText().toString(),nomenclatura.getText().toString(),
                        lat.getText().toString(),log.getText().toString(),altura.getText().toString(),
                        entidad.getText().toString(),opciones.getSelectedItem().toString(),datum.toString(),
                        departamento.getSelectedItem().toString(),municipio.getSelectedItem().toString(),
                        sitio.getText().toString(),opestado.getSelectedItem().toString(),describio.getText().toString(),
                        fecha.getText().toString(),hora.getText().toString());



                RegistroD.save();









            }
        });



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
                datum.setText(RegistroD1.getDatum());
                departamento.setText(RegistroD1.getNombrev());
                municipio.setText(RegistroD1.getNombrev());
                sitio.setText(RegistroD1.getSitio());
                opestado.setText(RegistroD1.getNombrev());
                describio.setText(RegistroD1.getDescribio());
                fecha.setText(RegistroD1.getFecha());
                hora.setText(RegistroD1.getHora());




            }
        });
    }
}
