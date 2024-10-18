package tercerejercicio;

import tercerejercicio.Medicamento.Posologia;

public class TercerEjercicio {

    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "oral");
        Posologia posologia = medicamento.new Posologia("Adultos y mayores de 16"
                + " años", 500, "6 horas", "No debe tomar este medicamento con "
                        + "el estomago vacío.");
        
        // metodo
        posologia.imprimir();
    }
    
}
