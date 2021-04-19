import com.barcodelib.barcode.QRCode;
import java.awt.Color;
import java.awt.Image;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Taday
 */
public class Parqueadero extends javax.swing.JFrame {
    
    Parqueadero_Ups obj = new Parqueadero_Ups();
    static String direccionqr;
    String placa;
    /**
     * Creates new form Parqueadero
     */
    
    public Parqueadero(){
    }
    
    public Parqueadero(String placa) {
        this.placa = placa;
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        fondoparqueo.setIcon(escala("/imagenes/negro.jpg ", fondoparqueo.getWidth(), fondoparqueo.getHeight()));
//        auto.setIcon(escala("/imagenes/auto.jpg ", auto.getWidth(), auto.getHeight()));
        estadio.setIcon(escala("/imagenes/estadio.jpg ", estadio.getWidth(), estadio.getHeight()));
        auto.setBackground(new Color(105,105,255));
        parqueo1.setBackground(ColoresBotones(0));
        parqueo2.setBackground(ColoresBotones(1));
        parqueo3.setBackground(ColoresBotones(2));
        parqueo4.setBackground(ColoresBotones(3));
        parqueo5.setBackground(ColoresBotones(4));
        parqueo6.setBackground(ColoresBotones(5));
        parqueo7.setBackground(ColoresBotones(6));
        parqueo8.setBackground(ColoresBotones(7));
        parqueo9.setBackground(ColoresBotones(8));
        parqueo10.setBackground(ColoresBotones(9));
        parqueo11.setBackground(ColoresBotones(10));
        parqueo12.setBackground(ColoresBotones(11));
        parqueo13.setBackground(ColoresBotones(12));
        parqueo14.setBackground(ColoresBotones(13));
        parqueo15.setBackground(ColoresBotones(14));
        parqueo16.setBackground(ColoresBotones(15));
        parqueo17.setBackground(ColoresBotones(16));
        parqueo18.setBackground(ColoresBotones(17));
        parqueo19.setBackground(ColoresBotones(18));
        parqueo20.setBackground(ColoresBotones(19));
        parqueo21.setBackground(ColoresBotones(20));
        parqueo22.setBackground(ColoresBotones(21));
        parqueo23.setBackground(ColoresBotones(22));
        parqueo24.setBackground(ColoresBotones(23));
        parqueo25.setBackground(ColoresBotones(24));
        parqueo26.setBackground(ColoresBotones(25));
        parqueo27.setBackground(ColoresBotones(26));
        parqueo28.setBackground(ColoresBotones(27));
        parqueo29.setBackground(ColoresBotones(28));
        parqueo30.setBackground(ColoresBotones(29));
        parqueo31.setBackground(ColoresBotones(30));
        parqueo32.setBackground(ColoresBotones(31));
        parqueo33.setBackground(ColoresBotones(32));
        parqueo34.setBackground(ColoresBotones(33));
        parqueo35.setBackground(ColoresBotones(34));
        parqueo36.setBackground(ColoresBotones(35));
        parqueo37.setBackground(ColoresBotones(36));
        parqueo38.setBackground(ColoresBotones(37));
        parqueo39.setBackground(ColoresBotones(38));
        parqueo40.setBackground(ColoresBotones(39));
        parqueo41.setBackground(ColoresBotones(40));
        parqueo42.setBackground(ColoresBotones(41));
        parqueo43.setBackground(ColoresBotones(42));
        parqueo44.setBackground(ColoresBotones(43));
        parqueo45.setBackground(ColoresBotones(44));
        btnvolver.setBackground(Color.RED);
        btnvolver.setEnabled(false);
    }

    public void ParquearAuto(int x, int x2, int y, int y2, int caso1, int caso2, int caso3){
        auto.setBounds(0, 10, 30, 20);
        Thread hilo = new Thread(){
            public void run() {
                try {
                    for (int i = 0; i <5 ; i++) {
                        auto.setBounds(auto.getX()+10, auto.getY(), 30, 20);
                        sleep(100);
                    }
                    for (int i = 0; i < y; i++) {
                        auto.setBounds(auto.getX(), auto.getY()+10, 20, 30);
                        sleep(100);
                    }
                    switch(caso1){
                        case 1:
                            //izquierda
                            for (int i = 0; i < x; i++) {
                                auto.setBounds(auto.getX()-10, auto.getY(), 30, 20);
                                sleep(100);  
                            }
                            switch(caso2){
                                case 1:
                                    //arriba
                                    for (int i = 0; i < y2; i++) {
                                        auto.setBounds(auto.getX(), auto.getY()-10, 20, 30);
                                        sleep(100);
                                    }

                                    break;
                                case 2:
                                    //abajo
                                    for (int i = 0; i < y2; i++) {
                                        auto.setBounds(auto.getX(), auto.getY()+10, 20, 30);
                                        sleep(100);
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            //derecha
                            for (int i = 0; i < x; i++) {
                                auto.setBounds(auto.getX()+10, auto.getY(), 30, 20);
                                sleep(100);
                            }
                            switch(caso2){
                                case 1:
                                    //arriba
                                    for (int i = 0; i < y2; i++) {
                                        auto.setBounds(auto.getX(), auto.getY()-10, 20, 30);
                                        sleep(100);
                                    }
                                    switch(caso3){
                                        case 1:
                                            //izquierda
                                            for (int i = 0; i < x2; i++) {
                                                auto.setBounds(auto.getX()-10, auto.getY(), 30, 20);
                                                sleep(100);
                                            }
                                            break;
                                        case 2:
                                            //derecha
                                            for (int i = 0; i < x2; i++) {
                                                auto.setBounds(auto.getX()+10, auto.getY(), 30, 20);
                                                sleep(100);
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    //abajo
                                    for (int i = 0; i < y2; i++) {
                                        auto.setBounds(auto.getX(), auto.getY()+10, 20, 30);
                                        sleep(100);
                                    }
                                    break;
                            }
                            break;
                    }


                } catch (Exception e) {
                }
            }
        };
        hilo.start();
    }
    
    public Icon escala(String s, int ancho, int altura){
        ImageIcon icono = new ImageIcon(getClass().getResource(s));
        Image imagen = icono.getImage();
        Image imagen2 = imagen.getScaledInstance(ancho, altura, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoicono = new ImageIcon(imagen2);
        return(nuevoicono);
    }
    
    public Color ColoresBotones(int n){
        if(obj.disponible[n]){
            return new Color(105,255,105);
        }else{
            return new Color(255,105,105);
        }
    }
    
    public void BloquearBotones(boolean boo){
        parqueo1.setEnabled(boo);
        parqueo2.setEnabled(boo);
        parqueo3.setEnabled(boo);
        parqueo4.setEnabled(boo);
        parqueo5.setEnabled(boo);
        parqueo6.setEnabled(boo);
        parqueo7.setEnabled(boo);
        parqueo8.setEnabled(boo);
        parqueo9.setEnabled(boo);
        parqueo10.setEnabled(boo);
        parqueo11.setEnabled(boo);
        parqueo12.setEnabled(boo);
        parqueo13.setEnabled(boo);
        parqueo14.setEnabled(boo);
        parqueo15.setEnabled(boo);
        parqueo16.setEnabled(boo);
        parqueo17.setEnabled(boo);
        parqueo18.setEnabled(boo);
        parqueo19.setEnabled(boo);
        parqueo20.setEnabled(boo);
        parqueo21.setEnabled(boo);
        parqueo22.setEnabled(boo);
        parqueo23.setEnabled(boo);
        parqueo24.setEnabled(boo);
        parqueo25.setEnabled(boo);
        parqueo26.setEnabled(boo);
        parqueo27.setEnabled(boo);
        parqueo28.setEnabled(boo);
        parqueo29.setEnabled(boo);
        parqueo30.setEnabled(boo);
        parqueo31.setEnabled(boo);
        parqueo32.setEnabled(boo);
        parqueo33.setEnabled(boo);
        parqueo34.setEnabled(boo);
        parqueo35.setEnabled(boo);
        parqueo36.setEnabled(boo);
        parqueo37.setEnabled(boo);
        parqueo38.setEnabled(boo);
        parqueo39.setEnabled(boo);
        parqueo40.setEnabled(boo);
        parqueo41.setEnabled(boo);
        parqueo42.setEnabled(boo);
        parqueo43.setEnabled(boo);
        parqueo44.setEnabled(boo);
        parqueo45.setEnabled(boo);
    }
    
    public void GenerarQR(String dato, String direccion){
        Thread mihilo = new Thread(){
            public void run(){
                try {
                    QRCode qr = new QRCode();
                    qr.setData(dato);
                    qr.setDataMode(QRCode.MODE_BYTE);
                    qr.setUOM(0);
                    qr.setLeftMargin(0.000f);
                    qr.setRightMargin(0.000f);
                    qr.setTopMargin(0.000f);
                    qr.setBottomMargin(0.000f);
                    qr.setResolution(72);
                    qr.setRotate(0);
                    qr.setModuleSize(5.00f);
                    String url = getClass().getResource("imagenes/").toString();
                    String CodigoQR = url.substring(6)+direccion;
                    qr.renderBarcode(CodigoQR);
                    QR ventana = new QR();
                    ventana.setVisible(true);
                } catch (Exception e) {
                    System.out.println("error"+e);
                }
            }
        };
        mihilo.start();
    }
    
    public void AccionBoton(int i, int x, int x2, int y, int y2, int c1, int c2, int c3){
        btnvolver.setEnabled(true);
        Calendar date = Calendar.getInstance();
        if(obj.disponible[i]){
            int segundo=date.get(Calendar.SECOND),minuto=date.get(Calendar.MINUTE),hora=date.get(Calendar.HOUR_OF_DAY);
            int dia=date.get(Calendar.DAY_OF_MONTH),mes=date.get(Calendar.MONTH)+1,año=date.get(Calendar.YEAR);
            String ffecha=dia+"/"+mes+"/"+año;
            String fhora=hora+":"+minuto+":"+segundo;
            String dfecha=""+dia+mes+año;
            String dhora=""+hora+minuto+segundo;
            String dato=placa+"_"+ffecha+"_"+fhora;
            vehiculo objVehiculo = new vehiculo();
            objVehiculo.setPlaca(placa);
            objVehiculo.setFecha(ffecha);
            objVehiculo.setHoraentrada(hora);
            objVehiculo.setMinutoentrada(minuto);
            objVehiculo.setSegundoentrada(segundo);
            objVehiculo.setFHoraingreso(fhora);
            objVehiculo.setDatoQr(dato);
            objVehiculo.setPuesto(i+1);
            Parqueadero_Ups.vehiculos.add(objVehiculo);
            String direccion=placa+"_"+dhora+dfecha+".gif";
            direccionqr=direccion;
            BloquearBotones(false);
            ParquearAuto(x,x2,y,y2,c1,c2,c3);
            GenerarQR(dato,direccion);
            obj.disponible[i]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        auto = new javax.swing.JLabel();
        btnvolver = new javax.swing.JButton();
        estadio = new javax.swing.JLabel();
        parqueo1 = new javax.swing.JButton();
        parqueo2 = new javax.swing.JButton();
        parqueo3 = new javax.swing.JButton();
        parqueo4 = new javax.swing.JButton();
        parqueo5 = new javax.swing.JButton();
        parqueo6 = new javax.swing.JButton();
        parqueo7 = new javax.swing.JButton();
        parqueo8 = new javax.swing.JButton();
        parqueo9 = new javax.swing.JButton();
        parqueo10 = new javax.swing.JButton();
        parqueo11 = new javax.swing.JButton();
        parqueo12 = new javax.swing.JButton();
        parqueo13 = new javax.swing.JButton();
        parqueo14 = new javax.swing.JButton();
        parqueo15 = new javax.swing.JButton();
        parqueo16 = new javax.swing.JButton();
        parqueo17 = new javax.swing.JButton();
        parqueo18 = new javax.swing.JButton();
        parqueo19 = new javax.swing.JButton();
        parqueo20 = new javax.swing.JButton();
        parqueo21 = new javax.swing.JButton();
        parqueo22 = new javax.swing.JButton();
        parqueo23 = new javax.swing.JButton();
        parqueo24 = new javax.swing.JButton();
        parqueo25 = new javax.swing.JButton();
        parqueo26 = new javax.swing.JButton();
        parqueo27 = new javax.swing.JButton();
        parqueo28 = new javax.swing.JButton();
        parqueo29 = new javax.swing.JButton();
        parqueo30 = new javax.swing.JButton();
        parqueo31 = new javax.swing.JButton();
        parqueo32 = new javax.swing.JButton();
        parqueo33 = new javax.swing.JButton();
        parqueo34 = new javax.swing.JButton();
        parqueo35 = new javax.swing.JButton();
        parqueo36 = new javax.swing.JButton();
        parqueo37 = new javax.swing.JButton();
        parqueo38 = new javax.swing.JButton();
        parqueo39 = new javax.swing.JButton();
        parqueo40 = new javax.swing.JButton();
        parqueo41 = new javax.swing.JButton();
        parqueo42 = new javax.swing.JButton();
        parqueo43 = new javax.swing.JButton();
        parqueo44 = new javax.swing.JButton();
        parqueo45 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondoparqueo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        auto.setOpaque(true);
        getContentPane().add(auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 20));

        btnvolver.setText("Volver...");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 80, 30));
        getContentPane().add(estadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 200, 90));

        parqueo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo1ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 30, 20));

        parqueo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo2ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 30, 20));

        parqueo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo3ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 30, 20));

        parqueo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo4ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 30, 20));

        parqueo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo5ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 30, 20));

        parqueo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo6ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 30, 20));

        parqueo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo7ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 30, 20));

        parqueo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo8ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 30, 20));

        parqueo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo9ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 20, 30));

        parqueo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo10ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 20, 30));

        parqueo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo11ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 20, 30));

        parqueo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo12ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 20, 30));

        parqueo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo13ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 20, 30));

        parqueo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo14ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 20, 30));

        parqueo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo15ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 20, 30));

        parqueo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo16ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 20, 30));

        parqueo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo17ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 20, 30));

        parqueo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo18ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 20, 30));

        parqueo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo19ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, 20));

        parqueo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo20ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 30, 20));

        parqueo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo21ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 20));

        parqueo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo22ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 30, 20));

        parqueo23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo23ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 30, 20));

        parqueo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo24ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 30, 20));

        parqueo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo25ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 30, 20));

        parqueo26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo26ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 30, 20));

        parqueo27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo27ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 30, 20));

        parqueo28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo28ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 30, 20));

        parqueo29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo29ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 30, 20));

        parqueo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo30ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 30, 20));

        parqueo31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo31ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 20));

        parqueo32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo32ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 20));

        parqueo33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo33ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 20));

        parqueo34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo34ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 20));

        parqueo35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo35ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 30, 20));

        parqueo36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo36ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 30, 20));

        parqueo37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo37ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 30, 20));

        parqueo38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo38ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 30, 20));

        parqueo39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo39ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 30, 20));

        parqueo40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo40ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 30, 20));

        parqueo41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo41ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo41, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 30, 20));

        parqueo42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo42ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 30, 20));

        parqueo43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo43ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo43, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 30, 20));

        parqueo44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo44ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo44, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 30, 20));

        parqueo45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parqueo45ActionPerformed(evt);
            }
        });
        getContentPane().add(parqueo45, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 30, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un lugar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 310, -1));

        fondoparqueo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fondoparqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parqueo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo1ActionPerformed
        AccionBoton(0,5,0,4,0,1,0,0);
    }//GEN-LAST:event_parqueo1ActionPerformed

    private void parqueo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo2ActionPerformed
        AccionBoton(1,5,0,7,0,1,0,0);
        /*if(obj.disponible[1]){
            ParquearAuto(5,0,7,0,1,0,0);
            parqueo2.setBackground(Color.RED);
            obj.disponible[1]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo2ActionPerformed

    private void parqueo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo3ActionPerformed
        AccionBoton(2,5,0,10,0,1,0,0);
        /*if(obj.disponible[2]){
            ParquearAuto(5,0,10,0,1,0,0);
            parqueo3.setBackground(Color.RED);
            obj.disponible[2]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo3ActionPerformed

    private void parqueo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo4ActionPerformed
        AccionBoton(3,5,0,13,0,1,0,0);
        /*if(obj.disponible[3]){
            ParquearAuto(5,0,13,0,1,0,0);
            parqueo4.setBackground(Color.RED);
            obj.disponible[3]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo4ActionPerformed

    private void parqueo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo5ActionPerformed
        AccionBoton(4,5,0,16,0,1,0,0);
        /*if(obj.disponible[4]){
            ParquearAuto(5,0,16,0,1,0,0);
            parqueo5.setBackground(Color.RED);
            obj.disponible[4]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo5ActionPerformed

    private void parqueo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo6ActionPerformed
        AccionBoton(5,5,0,19,0,1,0,0);
        /*if(obj.disponible[5]){
            ParquearAuto(5,0,19,0,1,0,0);
            parqueo6.setBackground(Color.RED);
            obj.disponible[5]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo6ActionPerformed

    private void parqueo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo7ActionPerformed
        AccionBoton(6,5,0,22,0,1,0,0);
        /*if(obj.disponible[6]){
            ParquearAuto(5,0,22,0,1,0,0);
            parqueo7.setBackground(Color.RED);
            obj.disponible[6]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo7ActionPerformed

    private void parqueo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo8ActionPerformed
        AccionBoton(7,5,0,25,0,1,0,0);
        /*if(obj.disponible[7]){
            ParquearAuto(5,0,25,0,1,0,0);
            parqueo8.setBackground(Color.RED);
            obj.disponible[7]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo8ActionPerformed

    private void parqueo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo9ActionPerformed
        AccionBoton(8,1,0,25,3,1,2,0);
        /*if(obj.disponible[8]){
            ParquearAuto(1,0,25,3,1,2,0);
            parqueo9.setBackground(Color.RED);
            obj.disponible[8]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo9ActionPerformed

    private void parqueo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo10ActionPerformed
        AccionBoton(9,2,0,25,3,2,2,0);
        /*if(obj.disponible[9]){
            ParquearAuto(2,0,25,3,2,2,0);
            parqueo10.setBackground(Color.RED);
            obj.disponible[9]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo10ActionPerformed

    private void parqueo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo11ActionPerformed
        AccionBoton(10,5,0,25,3,2,2,0);
        /*if(obj.disponible[10]){
            ParquearAuto(5,0,25,3,2,2,0);
            parqueo11.setBackground(Color.RED);
            obj.disponible[10]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo11ActionPerformed

    private void parqueo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo12ActionPerformed
        AccionBoton(11,8,0,25,3,2,2,0);
        /*if(obj.disponible[11]){
            ParquearAuto(8,0,25,3,2,2,0);
            parqueo12.setBackground(Color.RED);
            obj.disponible[11]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo12ActionPerformed

    private void parqueo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo13ActionPerformed
        AccionBoton(12,11,0,25,3,2,2,0);
        /*if(obj.disponible[12]){
            ParquearAuto(11,0,25,3,2,2,0);
            parqueo13.setBackground(Color.RED);
            obj.disponible[12]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo13ActionPerformed

    private void parqueo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo14ActionPerformed
        AccionBoton(13,14,0,25,3,2,2,0);
        /*if(obj.disponible[13]){
            ParquearAuto(14,0,25,3,2,2,0);
            parqueo14.setBackground(Color.RED);
            obj.disponible[13]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo14ActionPerformed

    private void parqueo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo15ActionPerformed
        AccionBoton(14,17,0,25,3,2,2,0);
        /*if(obj.disponible[14]){
            ParquearAuto(17,0,25,3,2,2,0);
            parqueo15.setBackground(Color.RED);
            obj.disponible[14]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo15ActionPerformed

    private void parqueo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo16ActionPerformed
        AccionBoton(15,20,0,25,3,2,2,0);
        /*if(obj.disponible[15]){
            ParquearAuto(20,0,25,3,2,2,0);
            parqueo16.setBackground(Color.RED);
            obj.disponible[15]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo16ActionPerformed

    private void parqueo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo17ActionPerformed
        AccionBoton(16,23,0,25,3,2,2,0);
        /*if(obj.disponible[16]){
            ParquearAuto(23,0,25,3,2,2,0);
            parqueo17.setBackground(Color.RED);
            obj.disponible[16]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo17ActionPerformed

    private void parqueo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo18ActionPerformed
        AccionBoton(17,26,0,25,3,2,2,0);
        /*if(obj.disponible[17]){
            ParquearAuto(26,0,25,3,2,2,0);
            parqueo18.setBackground(Color.RED);
            obj.disponible[17]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo18ActionPerformed

    private void parqueo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo19ActionPerformed
        AccionBoton(18,29,4,25,3,2,1,2);
        /*if(obj.disponible[18]){
            ParquearAuto(29,4,25,3,2,1,2);
            parqueo19.setBackground(Color.RED);
            obj.disponible[18]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo19ActionPerformed

    private void parqueo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo20ActionPerformed
        AccionBoton(19,29,4,25,6,2,1,2);
        /*if(obj.disponible[19]){
            ParquearAuto(29,4,25,6,2,1,2);
            parqueo20.setBackground(Color.RED);
            obj.disponible[19]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo20ActionPerformed

    private void parqueo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo21ActionPerformed
        AccionBoton(20,29,4,25,9,2,1,2);
        /*if(obj.disponible[20]){
            ParquearAuto(29,4,25,9,2,1,2);
            parqueo21.setBackground(Color.RED);
            obj.disponible[20]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo21ActionPerformed

    private void parqueo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo22ActionPerformed
        AccionBoton(21,29,4,25,12,2,1,2);
        /*if(obj.disponible[21]){
            ParquearAuto(29,4,25,12,2,1,2);
            parqueo22.setBackground(Color.RED);
            obj.disponible[21]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo22ActionPerformed

    private void parqueo23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo23ActionPerformed
        AccionBoton(22,29,4,25,15,2,1,2);
        /*if(obj.disponible[22]){
            ParquearAuto(29,4,25,15,2,1,2);
            parqueo23.setBackground(Color.RED);
            obj.disponible[22]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo23ActionPerformed

    private void parqueo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo24ActionPerformed
        AccionBoton(23,29,4,25,18,2,1,2);
        /*if(obj.disponible[23]){
            ParquearAuto(29,4,25,18,2,1,2);
            parqueo24.setBackground(Color.RED);
            obj.disponible[23]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo24ActionPerformed

    private void parqueo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo25ActionPerformed
        AccionBoton(24,29,4,25,21,2,1,2);
        /*if(obj.disponible[24]){
            ParquearAuto(29,4,25,21,2,1,2);
            parqueo25.setBackground(Color.RED);
            obj.disponible[24]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo25ActionPerformed

    private void parqueo26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo26ActionPerformed
        AccionBoton(25,5,0,10,0,2,0,0);
        /*if(obj.disponible[25]){
            ParquearAuto(5,0,10,0,2,0,0);
            parqueo26.setBackground(Color.RED);
            obj.disponible[25]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo26ActionPerformed

    private void parqueo27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo27ActionPerformed
        AccionBoton(26,5,0,13,0,2,0,0);
        /*if(obj.disponible[26]){
            ParquearAuto(5,0,13,0,2,0,0);
            parqueo27.setBackground(Color.RED);
            obj.disponible[26]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo27ActionPerformed

    private void parqueo28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo28ActionPerformed
        AccionBoton(27,5,0,16,0,2,0,0);
        /*if(obj.disponible[27]){
            ParquearAuto(5,0,16,0,2,0,0);
            parqueo28.setBackground(Color.RED);
            obj.disponible[27]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo28ActionPerformed

    private void parqueo29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo29ActionPerformed
        AccionBoton(28,5,0,19,0,2,0,0);
        /*if(obj.disponible[28]){
            ParquearAuto(5,0,19,0,2,0,0);
            parqueo29.setBackground(Color.RED);
            obj.disponible[28]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo29ActionPerformed

    private void parqueo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo30ActionPerformed
        AccionBoton(29,5,0,22,0,2,0,0);
        /*if(obj.disponible[29]){
            ParquearAuto(5,0,22,0,2,0,0);
            parqueo30.setBackground(Color.RED);
            obj.disponible[29]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo30ActionPerformed

    private void parqueo31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo31ActionPerformed
        AccionBoton(30,15,6,25,15,2,1,1);
        /*if(obj.disponible[30]){
            ParquearAuto(15,6,25,15,2,1,1);
            parqueo31.setBackground(Color.RED);
            obj.disponible[30]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo31ActionPerformed

    private void parqueo32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo32ActionPerformed
        AccionBoton(31,15,6,25,12,2,1,1);
        /*if(obj.disponible[31]){
            ParquearAuto(15,6,25,12,2,1,1);
            parqueo32.setBackground(Color.RED);
            obj.disponible[31]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo32ActionPerformed

    private void parqueo33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo33ActionPerformed
        AccionBoton(32,15,6,25,9,2,1,1);
        /*if(obj.disponible[32]){
            ParquearAuto(15,6,25,9,2,1,1);
            parqueo33.setBackground(Color.RED);
            obj.disponible[32]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo33ActionPerformed

    private void parqueo34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo34ActionPerformed
        AccionBoton(33,15,6,25,6,2,1,1);
        /*if(obj.disponible[33]){
            ParquearAuto(15,6,25,6,2,1,1);
            parqueo34.setBackground(Color.RED);
            obj.disponible[33]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo34ActionPerformed

    private void parqueo35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo35ActionPerformed
        AccionBoton(34,15,6,25,3,2,1,1);
        /*if(obj.disponible[34]){
            ParquearAuto(15,6,25,3,2,1,1);
            parqueo35.setBackground(Color.RED);
            obj.disponible[34]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo35ActionPerformed

    private void parqueo36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo36ActionPerformed
        AccionBoton(35,15,4,25,15,2,1,2);
        /*if(obj.disponible[35]){
            ParquearAuto(15,4,25,15,2,1,2);
            parqueo36.setBackground(Color.RED);
            obj.disponible[35]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo36ActionPerformed

    private void parqueo37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo37ActionPerformed
        AccionBoton(36,15,4,25,12,2,1,2);
        /*if(obj.disponible[36]){
            ParquearAuto(15,4,25,12,2,1,2);
            parqueo37.setBackground(Color.RED);
            obj.disponible[36]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo37ActionPerformed

    private void parqueo38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo38ActionPerformed
        AccionBoton(37,15,4,25,9,2,1,2);
        /*if(obj.disponible[37]){
            ParquearAuto(15,4,25,9,2,1,2);
            parqueo38.setBackground(Color.RED);
            obj.disponible[37]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo38ActionPerformed

    private void parqueo39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo39ActionPerformed
        AccionBoton(38,15,4,25,6,2,1,2);
        /*if(obj.disponible[38]){
            ParquearAuto(15,4,25,6,2,1,2);
            parqueo39.setBackground(Color.RED);
            obj.disponible[38]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo39ActionPerformed

    private void parqueo40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo40ActionPerformed
        AccionBoton(39,15,4,25,3,2,1,2);
        /*if(obj.disponible[39]){
            ParquearAuto(15,4,25,3,2,1,2);
            parqueo40.setBackground(Color.RED);
            obj.disponible[139]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo40ActionPerformed

    private void parqueo41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo41ActionPerformed
        AccionBoton(40,29,6,25,15,2,1,1);
        /*if(obj.disponible[40]){
            ParquearAuto(29,6,25,15,2,1,1);
            parqueo41.setBackground(Color.RED);
            obj.disponible[40]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo41ActionPerformed

    private void parqueo42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo42ActionPerformed
        AccionBoton(41,29,6,25,12,2,1,1);
        /*if(obj.disponible[41]){
            ParquearAuto(29,6,25,12,2,1,1);
            parqueo42.setBackground(Color.RED);
            obj.disponible[41]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo42ActionPerformed

    private void parqueo43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo43ActionPerformed
        AccionBoton(42,29,6,25,9,2,1,1);
        /*if(obj.disponible[42]){
            ParquearAuto(29,6,25,9,2,1,1);
            parqueo43.setBackground(Color.RED);
            obj.disponible[42]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo43ActionPerformed

    private void parqueo44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo44ActionPerformed
        AccionBoton(43,29,6,25,6,2,1,1);
        /*if(obj.disponible[43]){
            ParquearAuto(29,6,25,6,2,1,1);
            parqueo44.setBackground(Color.RED);
            obj.disponible[43]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo44ActionPerformed

    private void parqueo45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parqueo45ActionPerformed
        AccionBoton(44,29,6,25,3,2,1,1);
        /*if(obj.disponible[44]){
            ParquearAuto(29,6,25,3,2,1,1);
            parqueo45.setBackground(Color.RED);
            obj.disponible[44]=false;
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
        }*/
    }//GEN-LAST:event_parqueo45ActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auto;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel estadio;
    private javax.swing.JLabel fondoparqueo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton parqueo1;
    private javax.swing.JButton parqueo10;
    private javax.swing.JButton parqueo11;
    private javax.swing.JButton parqueo12;
    private javax.swing.JButton parqueo13;
    private javax.swing.JButton parqueo14;
    private javax.swing.JButton parqueo15;
    private javax.swing.JButton parqueo16;
    private javax.swing.JButton parqueo17;
    private javax.swing.JButton parqueo18;
    private javax.swing.JButton parqueo19;
    private javax.swing.JButton parqueo2;
    private javax.swing.JButton parqueo20;
    private javax.swing.JButton parqueo21;
    private javax.swing.JButton parqueo22;
    private javax.swing.JButton parqueo23;
    private javax.swing.JButton parqueo24;
    private javax.swing.JButton parqueo25;
    private javax.swing.JButton parqueo26;
    private javax.swing.JButton parqueo27;
    private javax.swing.JButton parqueo28;
    private javax.swing.JButton parqueo29;
    private javax.swing.JButton parqueo3;
    private javax.swing.JButton parqueo30;
    private javax.swing.JButton parqueo31;
    private javax.swing.JButton parqueo32;
    private javax.swing.JButton parqueo33;
    private javax.swing.JButton parqueo34;
    private javax.swing.JButton parqueo35;
    private javax.swing.JButton parqueo36;
    private javax.swing.JButton parqueo37;
    private javax.swing.JButton parqueo38;
    private javax.swing.JButton parqueo39;
    private javax.swing.JButton parqueo4;
    private javax.swing.JButton parqueo40;
    private javax.swing.JButton parqueo41;
    private javax.swing.JButton parqueo42;
    private javax.swing.JButton parqueo43;
    private javax.swing.JButton parqueo44;
    private javax.swing.JButton parqueo45;
    private javax.swing.JButton parqueo5;
    private javax.swing.JButton parqueo6;
    private javax.swing.JButton parqueo7;
    private javax.swing.JButton parqueo8;
    private javax.swing.JButton parqueo9;
    // End of variables declaration//GEN-END:variables
}
