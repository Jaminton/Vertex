package aplicacion.android.universidad_distrital.vertex;

import com.orm.SugarRecord;

/**
 * Created by Android on 02/03/2018.
 */

public class RegistroDatosEncuesta extends SugarRecord {



  String cedula,rpt1,rpt2,rpt3,rpt4,rpt5,rpt6,rpt7;

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getRpt1() {
    return rpt1;
  }

  public void setRpt1(String rpt1) {
    this.rpt1 = rpt1;
  }

  public String getRpt2() {
    return rpt2;
  }

  public void setRpt2(String rpt2) {
    this.rpt2 = rpt2;
  }

  public String getRpt3() {
    return rpt3;
  }

  public void setRpt3(String rpt3) {
    this.rpt3 = rpt3;
  }

  public String getRpt4() {
    return rpt4;
  }

  public void setRpt4(String rpt4) {
    this.rpt4 = rpt4;
  }

  public String getRpt5() {
    return rpt5;
  }

  public void setRpt5(String rpt5) {
    this.rpt5 = rpt5;
  }

  public String getRpt6() {
    return rpt6;
  }

  public void setRpt6(String rpt6) {
    this.rpt6 = rpt6;
  }

  public String getRpt7() {
    return rpt7;
  }

  public void setRpt7(String rpt7) {
    this.rpt7 = rpt7;
  }

  public RegistroDatosEncuesta(String cedula, String rpt1, String rpt2, String rpt3, String rpt4, String rpt5, String rpt6, String rpt7) {
    {}
  }
}