package aplicacion.android.universidad_distrital.vertex;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

public class consultaformulario extends AppCompatActivity {



    private Bitmap takeScreenshot() {
        try {
            // crear un bitmap con la captura de pantalla
            View v1 = getWindow().getDecorView().getRootView();
            v1.setDrawingCacheEnabled(true);
            Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
            v1.setDrawingCacheEnabled(false);
            return bitmap;
        } catch (Throwable e) {
            // Several error may come out with file handling or OOM
            e.printStackTrace();
        }

        return null;
    }


    public void saveScreenshot(Bitmap bitmap) {
        Date now = new Date();
        android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);

        try {
            // nombre y ruta de la imagen a incluir
            String mPath = Environment.getExternalStorageDirectory().toString() + "/" + now + ".jpg";

            File imageFile = new File(mPath);

            FileOutputStream outputStream = new FileOutputStream(imageFile);
            int quality = 100;
            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
            outputStream.flush();
            outputStream.close();

        } catch (Throwable e) {
            // Captura los distintos errores que puedan surgir
            e.printStackTrace();
        }
    }


    public void openScreenshot(File imageFile) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        Uri uri = Uri.fromFile(imageFile);
        intent.setDataAndType(uri, "image/*");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultaformulario);






        Button consultar,captura;
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
        captura       =(Button)findViewById(R.id.capura1);





        consultar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                List<RegistroDatos> RegistroDatoslista = RegistroDatos.find(RegistroDatos.class, "Cedula = ?", cedula.getText().toString());
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


        captura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    Date now = new Date();
                    android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);

                    try {

                        String mPath = Environment.getExternalStorageDirectory().toString() + "/" + now + ".jpg";

                        // create bitmap screen capture
                        View v1 = getWindow().getDecorView().getRootView();
                        v1.setDrawingCacheEnabled(true);
                        Bitmap bitmap = Bitmap.createBitmap(v1.getDrawingCache());
                        v1.setDrawingCacheEnabled(false);

                        File imageFile = new File(mPath);

                        FileOutputStream outputStream = new FileOutputStream(imageFile);
                        int quality = 100;
                        bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
                        outputStream.flush();
                        outputStream.close();


                    } catch (Throwable e) {
                        // Several error may come out with file handling or DOM
                        e.printStackTrace();
                    }





            }










        });
    }
    }
