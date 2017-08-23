class Reloj
{
    private int horas;
    private int minutos;
    
    Reloj(int horasIniciales, int minutosIniciales)
    {
        horas = horasIniciales;
        minutos = minutosIniciales;
    }
    
    public String dimeTuTiempo()
    {
        String cadResult = "";
        cadResult += horas;
        cadResult += ":";
        cadResult += minutos;
        return cadResult;
    }
}
