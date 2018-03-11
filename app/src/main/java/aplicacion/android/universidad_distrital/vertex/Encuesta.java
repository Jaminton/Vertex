package aplicacion.android.universidad_distrital.vertex;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;
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


public class Encuesta extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        Button regresar11,consulta1,enviar1;
        final EditText cedula,rpt1,rpt2,rpt3,rpt4,rpt5,rpt6,rpt7;


        consulta1       =(Button)findViewById(R.id.c1);
        enviar1         =(Button)findViewById(R.id.e1);
        regresar11      =(Button)findViewById(R.id.regresar1);




        cedula       =(EditText)findViewById(R.id.cdu1);
        rpt1        = (EditText)findViewById(R.id.r1);
        rpt2        = (EditText)findViewById(R.id.r2);
        rpt3        = (EditText)findViewById(R.id.r3);
        rpt4        = (EditText)findViewById(R.id.r4);
        rpt5        = (EditText)findViewById(R.id.r5);
        rpt6        = (EditText)findViewById(R.id.r6);
        rpt7        = (EditText)findViewById(R.id.r7);



        enviar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                RegistroDatosEncuesta RegistroD3 = new RegistroDatosEncuesta
//                        (cedula.getText().toString(),rpt1.getText().toString(),rpt2.getText().toString(),
//                                rpt3.getText().toString(),rpt4.getText().toString(),rpt5.getText().toString(),
//                                rpt6.getText().toString(),rpt7.getText().toString());
//
//                RegistroD3.save();
//
//                Toast toast1 = Toast.makeText(getApplicationContext(), "registro guardado", Toast.LENGTH_LONG);
//                toast1.setGravity(Gravity.CENTER,5,5);
//
//                toast1.show();
//
//                Toast toast2 = Toast.makeText(getApplicationContext(), cedula.getText().toString(), Toast.LENGTH_LONG);
//                toast1.setGravity(Gravity.CENTER,5,5);
//                toast2.show();

                String ce,rp1,rp2,rp3,rp4,rp5,rp6,rp7;

        ce =  cedula.getText().toString();
        rp1 = rpt1.getText().toString();
        rp2 = rpt2.getText().toString();
        rp3 = rpt3.getText().toString();
        rp4 = rpt4.getText().toString();
        rp5 = rpt5.getText().toString();
        rp6 = rpt6.getText().toString();
        rp7 = rpt7.getText().toString();

        BDHelper bd = new BDHelper(Encuesta.this,"encuesta",null,1 );

        if(bd!=null){

            SQLiteDatabase db = bd.getWritableDatabase();
            ContentValues con = new ContentValues();
            con.put("cedula",ce);
            con.put("rpt1",rp1);
            con.put("rpt2", rp2);
            con.put("rpt3",rp3);
            con.put("rpt4",rp4);
            con.put("rpt5",rp5);
            con.put("rpt6",rp7);
            con.put("rpt7",rp7);

            long insertado = db.insert("encuesta",null,con);

            if(insertado >0) {

                Toast.makeText(Encuesta.this, "registros insertados con exito", Toast.LENGTH_SHORT).show();

            }else{

                Toast.makeText(Encuesta.this, "Datos no insertados", Toast.LENGTH_SHORT).show();


            }



                }


            }
        });

        consulta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BDHelper bd = new BDHelper(Encuesta.this,"encuesta",null,1 );
                SQLiteDatabase db = bd.getReadableDatabase();
                //String[] projection = {BDHelper}
                Cursor c =db.rawQuery("SELECT * FROM encuesta",null);
                if(c.moveToFirst()){

                    rpt1.setText(c.getString(0));
                    rpt2.setText(c.getString(1));
                    rpt3.setText(c.getString(2));
                    rpt4.setText(c.getString(3));
                    rpt5.setText(c.getString(4));
                    rpt6.setText(c.getString(5));
                    rpt7.setText(c.getString(6));

//                    rpt2.setText(RegistroD3.getRpt2());
//                    rpt3.setText(RegistroD3.getRpt3());
//                    rpt5.setText(RegistroD3.getRpt4());
//                    rpt4.setText(RegistroD3.getRpt5());
//
//                    rpt6.setText(RegistroD3.getRpt6());
//                    rpt7.setText(RegistroD3.getRpt7());


                }





////                //List<RegistroDatosEncuesta> RegistroDatoslista =  RegistroDatosEncuesta.listAll(RegistroDatosEncuesta.class);
//              List<RegistroDatosEncuesta> RegistroDatoslista =  RegistroDatosEncuesta.find(RegistroDatosEncuesta.class, "cedula = ?", cedula.getText().toString());
//
//                if(RegistroDatoslista.isEmpty()){
//                    Toast toast1 = Toast.makeText(getApplicationContext(), "No existen elementos en el ArrayList", Toast.LENGTH_LONG);
//                    toast1.setGravity(Gravity.CENTER,5,5);
//                    toast1.show();
//                    Toast toast2 = Toast.makeText(getApplicationContext(), cedula.getText().toString(), Toast.LENGTH_LONG);
//                    toast1.setGravity(Gravity.CENTER,5,5);
//                    toast2.show();
//                }
//                else {
//                    RegistroDatosEncuesta RegistroD3 = RegistroDatoslista.get(0);
//                    rpt1.setText(RegistroD3.getRpt1());
//                    rpt2.setText(RegistroD3.getRpt2());
//                    rpt3.setText(RegistroD3.getRpt3());
//                    rpt5.setText(RegistroD3.getRpt4());
//                    rpt4.setText(RegistroD3.getRpt5());
//
//                    rpt6.setText(RegistroD3.getRpt6());
//                    rpt7.setText(RegistroD3.getRpt7());
//
////                RegistroDatosEncuesta RegistroD3 = R1.get(0);
////                r1.setText(RegistroD3.getR1());
////                r2.setText(RegistroD3.getR2());
////                r3.setText(RegistroD3.getR3());
////                r4.setText(RegistroD3.getR4());
////                r5.setText(RegistroD3.getR5());
////                r6.setText(RegistroD3.getR6());
//
////                r7.setText(RegistroD3.getR7());
//                }






            }

        });


        regresar11.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {

                        Intent regresar1 = new Intent(Encuesta.this, Main.class);
                        startActivity(regresar1);

                    }
                });

//        salir1.setOnClickListener((new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view)
//            {
//
//                finish();
//
//
//
//            }
//        }));

    }
}
