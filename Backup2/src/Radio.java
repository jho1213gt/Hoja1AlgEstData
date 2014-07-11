
//*******************************************************************************************************
// Autor: Pablo Argueta Carné: 13028
//        Kuk Chung     Carné: 13279
//        Aarón Girón   Carné: 13042
// Sección: 30
// Fecha: 5/7/14
// Nombre de Archivo: GUI.java
// Breve Descripción: Es la interfaz gráfica, que muestra todas las funciones del sistema hidráulico.
//********************************************************************************************************

public class Radio implements InterfazRadio{
    private boolean frecuencia=false;
    private boolean encendido=false;
    private double estacion=0;
    private double estacionAM=530;
    private double estacionFM=87.9;
    private double f1=0;
    private double f2=0;
    private double f3=0;
    private double f4=0;
    private double f5=0;
    private double f6=0;
    private double f7=0;
    private double f8=0;
    private double f9=0;
    private double f10=0;
    private double f11=0;
    private double f12=0;
    private int fav;
    public Radio() {
    }
    public void cambiarFrecuencia(boolean frecuencia) {
        this.frecuencia = frecuencia;        
    }
    public double sacar(int boton){
        fav=boton;
        if(fav==1){
            return f1;
        }
        if(fav==2){
            return f2;
        }
        if(fav==3){
            return f3;
        }
        if(fav==4){
            return f4;
        }
        if(fav==5){
            return f5;
        }
        if(fav==6){
            return f6;
        }
        if(fav==7){
            return f7;
        }
        if(fav==8){
            return f8;
        }
        if(fav==9){
            return f9;
        }
        if(fav==10){
            return f10;
        }
        if(fav==11){
            return f11;
        }
        if(fav==12){
            return f12;
        }
        else{
            return 0;
        }
    }
    public void apagar(){
        encendido=false;        
    }
    public void encender(){
        encendido=true;        
    }
    public void guardar(int boton, double estacion){
        this.estacion= estacion;
        fav=boton;
        if(fav==1){
            f1=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==2){
            f2=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==3){
            f3=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==4){
            f4=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==5){            
            f5=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==6){
            f6=estacion; 
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }           
        }
        if(fav==7){
            f7=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }    
        if(fav==8){
            f8=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==9){
            f9=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==10){
            f10=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==11){
            f11=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
        if(fav==12){
            f12=estacion;
            if(estacion>120){
                frecuencia=false;
            }
            else{
                frecuencia=true;
            }
        }
    }
    public double subirEstacion(){
        this.frecuencia=frecuencia;
        if(frecuencia){
            if(estacionFM<107.9){
              estacionFM+=0.2;
              estacion=estacionFM;
              return estacionFM;              
           }
            else{
                estacionFM=87.9;
                estacion=estacionFM;
                return estacionFM;
            }            
        }
        else{
           if(estacionAM<1610){
              estacionAM+=10;
              estacion=estacionAM;
              return estacionAM;
           }
            else{
                estacionAM=530;
                estacion=estacionAM;
                return estacionAM;
            }
        }
    }
        public double bajarEstacion(){
        if(frecuencia){
            if(estacionFM<=107.9 & estacionFM>87.9){
              estacionFM-=0.2;
              estacion=estacionFM;
              return estacionFM;
           }
            else{
                estacionFM=107.9;
                estacion=estacionFM;
                return estacionFM;
            }
        }
        else{
            if(estacionAM<=1610 & estacionAM>530){
                  estacionAM-=10;
                  estacion=estacionAM;
                  return estacionAM;
            }
                else{
                    estacionAM=1610;
                    estacion=estacionAM;
                    return estacionAM;
                }
            }
    }
    public boolean getFrecuencia() {
        return frecuencia;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getEstacion() {
        return estacion;
    }

    public void setEstacion(double estacion) {
        this.estacion = estacion;
    }

    public double getF1() {
        return f1;
    }

    public void setF1(double f1) {
        this.f1 = f1;
    }

    public double getF2() {
        return f2;
    }

    public void setF2(double f2) {
        this.f2 = f2;
    }

    public double getF3() {
        return f3;
    }

    public void setF3(double f3) {
        this.f3 = f3;
    }

    public double getF4() {
        return f4;
    }

    public void setF4(double f4) {
        this.f4 = f4;
    }

    public double getF5() {
        return f5;
    }

    public void setF5(double f5) {
        this.f5 = f5;
    }

    public double getF6() {
        return f6;
    }

    public void setF6(double f6) {
        this.f6 = f6;
    }

    public double getF7() {
        return f7;
    }

    public void setF7(double f7) {
        this.f7 = f7;
    }

    public double getF8() {
        return f8;
    }

    public void setF8(double f8) {
        this.f8 = f8;
    }

    public double getF9() {
        return f9;
    }

    public void setF9(double f9) {
        this.f9 = f9;
    }

    public double getF10() {
        return f10;
    }

    public void setF10(double f10) {
        this.f10 = f10;
    }

    public double getF11() {
        return f11;
    }

    public void setF11(double f11) {
        this.f11 = f11;
    }

    public double getF12() {
        return f12;
    }

    public void setF12(double f12) {
        this.f12 = f12;
    }

    public double getEstacionAM() {
        return estacionAM;
    }

    public void setEstacionAM(double estacionAM) {
        this.estacionAM = estacionAM;
    }

    public double getEstacionFM() {
        return estacionFM;
    }

    public void setEstacionFM(double estacionFM) {
        this.estacionFM = estacionFM;
    }
    
    
}