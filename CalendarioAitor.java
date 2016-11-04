
/**
 * Write a description of class CalendarioAitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioAitor
{   
    private int dia;
    
    private int mes;
    
    private int año;

    public CalendarioAitor()
    {
       dia = 01;
       mes = 01;
       año = 01;
    }
    
    public void fijarFecha(int d, int m, int a)
    {
       dia = d;
       mes = m;
       año = a;           
    }
    
    public void avanzarFecha()
    {
       dia = dia + 1;
       if(dia > 30){
           dia = 1;
           mes = mes + 1;
       
           if(mes > 12){
               mes = 1;
               año = año + 1;
           }
       }
    }
    
    public String obtenerFecha()
    {
        if(año > 99){
            return ("Error");
        }
        else{
            return (dia+"-"+mes+"-"+año);
        }
    }            
}
