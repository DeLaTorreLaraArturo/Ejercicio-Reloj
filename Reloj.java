/**
 * @author Arturo De La Torre Lara
 * @version 23 de Agosto del 2017
 */
public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horasIniciales, int minutosIniciales)
    {
        if(horasIniciales > 23)
        {
            horas = 0;
            if(minutosIniciales > 59)
            {
                minutos = 0;
            }
            else
            {
                minutos = minutosIniciales;
            }
        }
        else
        {
            horas = horasIniciales;
            if(minutosIniciales > 59)
            {
                minutos = 0;
            }
            else
            {
                minutos = minutosIniciales;
            }
            
        }   
    }
    /**
     * Muestra en pantalla la hora en que va el reloj en este metodo se concatenan los valores en que esta actualmente las variables de instancia minutos
       y usa las condiciones para dar la hora correctamente
     * @return retorna la cadena concatenad para mostrar la hora ejemplo "00:00"
     */
    public String dimeTuTiempo()
    {
        String cadResult = "";
        
        if(horas == 0)
        {
            cadResult += "00";
            cadResult += ":";
            if(minutos == 0)
            {
                cadResult += "00";
            }
            else
            {
                if(minutos < 10)
                {
                    cadResult += "0";
                    cadResult += minutos;
                }
                else
                {
                    cadResult += minutos;
                }
            }
        }
        else
        {
            if(horas < 10)
            {
                cadResult += "0";
                cadResult += horas;
                cadResult += ":";
                
            }
            else
            {
                cadResult += horas;
                cadResult += ":";
            }
            if(minutos == 0)
            {
                cadResult += "00";
            }
            else
            {
                if(minutos < 10)
                {
                    cadResult += "0";
                    cadResult += minutos;
                }
                else
                {
                    cadResult += minutos;
                }
            }
        }
        return cadResult;
    }
    /**
     * Aumenta lso minutos cad aque se hace uso de este metodo asi como las horas y usa condiciones para acumular la hora correcta
     */
    public void ticTac()
    {
        if(minutos == 59)
        {
            minutos = 0;
            if(horas == 23)
            {
                horas = 0;
            }
            else
            {
                horas ++;
            }
            
        }
        else 
        {
            minutos++;
        }
    }
}
