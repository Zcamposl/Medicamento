
package tercerejercicio;


public class Medicamento {
     private String nombre;
    private String fabricante;
    private String viaAdministracionMedicamento;

    public Medicamento(String nombre, String fabricante, String viaAdministracionMedicamento) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracionMedicamento = viaAdministracionMedicamento;
    }
    //clase interna
    public class Posologia{
        private String usuarios;
        private int dosis;
        private String periodo;
        private String recomendaciones;

        public Posologia(String usuarios, int dosis, String periodo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendaciones = recomendaciones;
        }
        public void imprimir(){
            System.out.println("Nombre del medicamento = " + nombre);
            System.out.println("Fabricante del medicamento = " + fabricante);
            System.out.println("Vía de administración = " + 
                    viaAdministracionMedicamento);
            System.out.println("Usuarios = " + usuarios);
            System.out.println("Dosis = " + dosis);
            System.out.println("Periodo = " + periodo);
            System.out.println("Recomendaciones = " + recomendaciones);
            
        }
        
    
    }
    
}
