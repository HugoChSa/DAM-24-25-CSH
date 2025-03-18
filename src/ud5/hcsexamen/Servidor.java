package ud5.hcsexamen;
//Hugo Chan Saball - DAM 1 Examen UD5 - 26/03/2025
import java.util.Arrays;

public class Servidor extends Host {
    
    // Tu código aquí


    public Servidor(String nombre, String DireccionMac, String DireccionIP) {
        super(nombre, DireccionMac, DireccionIP);
    }

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        // Tu código aquí

    }

    public void addServicio(String nombreServicio, int numPuerto, String Protocolo) {
       //super(nombreServicio, numPuerto, Protocolo);
        System.out.println("* " + nombreServicio + ": " + numPuerto);
    }
}
