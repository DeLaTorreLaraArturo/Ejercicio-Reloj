class Reloj
{
    private int horas;
    private int minutos;
    
    Reloj(int horasIniciales, int minutosIniciales)
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
