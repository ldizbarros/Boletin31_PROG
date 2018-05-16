package boletin31;

import java.util.ArrayList;

public class XefeZona extends Empregado{

    private String despacho;
    private Secretario secretario;
    private ArrayList <Vendedor> listaVendedores;
    private Coche cocheEmpresa;
    private final int aumento=20;

    public XefeZona(String despacho, Secretario secretario, Coche cocheEmpresa, String dni, String nome, String apelidos, String direccion, int anosAntiguedade, int telefono, float salario, String supervisor) {
        super(dni, nome, apelidos, direccion, anosAntiguedade, telefono, salario, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;
        this.cocheEmpresa = cocheEmpresa;
    }
    
    @Override
    public void imprimir(Empregado e) {
        System.out.println(super.toString()+" - Xefe de Zona");
    }
    
    public void cambiarSecretario(Secretario nuevoSecretario){
        secretario=nuevoSecretario;
    }
    
    public void cambiarCoche(Coche nuevoCoche){
        cocheEmpresa=nuevoCoche;
    }
    
    public void novoCliente(Vendedor novoVendedor){
        listaVendedores.add(novoVendedor);
    }
    
    public void borrarCliente(Vendedor novoVendedor){
        listaVendedores.remove(listaVendedores.indexOf(novoVendedor));
    }
    
    @Override
    public void aumentarSalario(Empregado empregado) {
        float novoSoldo = empregado.getSalario()+empregado.getSalario()*aumento/100;
        empregado.setSalario(novoSoldo);
        System.out.println("Novo soldo: "+novoSoldo+" €");
    }
    
}
