public class vehiculo {
    private String Placa;
    private String Fecha;
    private int horaentrada;
    private int horasalida;
    private int minutoentrada;
    private int minutosalida;
    private int segundoentrada;
    private int segundosalida;
    private String FHoraingreso;
    private String FHorasalida;
    private String Valor;
    private String DatoQr;
    private int Puesto;

    public vehiculo() {
    }

    public vehiculo(String Placa, String Fecha, int horaentrada, int horasalida, int minutoentrada, int minutosalida, int segundoentrada, int segundosalida, String FHoraingreso, String FHorasalida, String Valor, String DatoQr, int Puesto) {
        this.Placa = Placa;
        this.Fecha = Fecha;
        this.horaentrada = horaentrada;
        this.horasalida = horasalida;
        this.minutoentrada = minutoentrada;
        this.minutosalida = minutosalida;
        this.segundoentrada = segundoentrada;
        this.segundosalida = segundosalida;
        this.FHoraingreso = FHoraingreso;
        this.FHorasalida = FHorasalida;
        this.Valor = Valor;
        this.DatoQr = DatoQr;
        this.Puesto=Puesto;
    }
    
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(int horaentrada) {
        this.horaentrada = horaentrada;
    }

    public int getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(int horasalida) {
        this.horasalida = horasalida;
    }

    public int getMinutoentrada() {
        return minutoentrada;
    }

    public void setMinutoentrada(int minutoentrada) {
        this.minutoentrada = minutoentrada;
    }

    public int getMinutosalida() {
        return minutosalida;
    }

    public void setMinutosalida(int minutosalida) {
        this.minutosalida = minutosalida;
    }

    public int getSegundoentrada() {
        return segundoentrada;
    }

    public void setSegundoentrada(int segundoentrada) {
        this.segundoentrada = segundoentrada;
    }

    public int getSegundosalida() {
        return segundosalida;
    }

    public void setSegundosalida(int segundosalida) {
        this.segundosalida = segundosalida;
    }

    public String getFHoraingreso() {
        return FHoraingreso;
    }

    public void setFHoraingreso(String FHoraingreso) {
        this.FHoraingreso = FHoraingreso;
    }

    public String getFHorasalida() {
        return FHorasalida;
    }

    public void setFHorasalida(String FHorasalida) {
        this.FHorasalida = FHorasalida;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public String getDatoQr() {
        return DatoQr;
    }

    public void setDatoQr(String DatoQr) {
        this.DatoQr = DatoQr;
    }

    public int getPuesto() {
        return Puesto;
    }

    public void setPuesto(int Puesto) {
        this.Puesto = Puesto;
    }
    
    
    
}
