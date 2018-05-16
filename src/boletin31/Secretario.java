package boletin31;

public class Secretario extends Empregado{

    private String despacho;
    private int numFax;
    private final int aumento=5;

    public Secretario(String despacho, int numFax, String dni, String nome, String apelidos, String direccion, int anosAntiguedade, int telefono, float salario, String supervisor) {
        super(dni, nome, apelidos, direccion, anosAntiguedade, telefono, salario, supervisor);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Secretario: Despacho: " + despacho + " -- Numero de Fax: " + numFax;
    }
    
    @Override
    public void imprimir(Empregado e) {
        System.out.println(super.toString()+" - Secretario");
    }
    
    @Override
    public void aumentarSalario(Empregado empregado) {
        float novoSoldo = empregado.getSalario()+empregado.getSalario()*aumento/100;
        empregado.setSalario(novoSoldo);
        System.out.println("Novo soldo: "+novoSoldo+" €");
    }
}
