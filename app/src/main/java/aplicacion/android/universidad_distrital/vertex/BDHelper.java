package aplicacion.android.universidad_distrital.vertex;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Android on 06/02/2018.
 */

public class BDHelper extends SQLiteOpenHelper {
    public BDHelper(Context context, String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);


    }

public String encuesta = "CREATE TABLE encuesta(cedula INTEGER PRIMARY KEY,rpt1 TEXT,rpt2 TEXT,rpt3 TEXT,rpt4 TEXT,rpt5 TEXT,rpt6 TEXT,rpt7 TEXT)";

    @Override
    public void onCreate(SQLiteDatabase db) {
                db.execSQL(encuesta);

   }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
   //     db.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
