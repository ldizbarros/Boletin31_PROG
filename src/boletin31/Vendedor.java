package boletin31;

import java.util.ArrayList;

public class Vendedor extends Empregado{

    private Coche cocheEmpresa;
    private int telefonoMobil;
    private String areaVenda;
    private ArrayList <String> listaClientes;
    private int porcentaxeVendas;
    private final int aumento=10;

    public Vendedor(Coche cocheEmpresa, int telefonoMobil, String areaVenda, int porcentaxeVendas, String dni, String nome, String apelidos, String direccion, int anosAntiguedade, int telefono, float salario, String supervisor) {
        super(dni, nome, apelidos, direccion, anosAntiguedade, telefono, salario, supervisor);
        this.cocheEmpresa = cocheEmpresa;
        this.telefonoMobil = telefonoMobil;
        this.areaVenda = areaVenda;
        this.porcentaxeVendas = porcentaxeVendas;
    }
    
    @Override
    public void imprimir(Empregado e) {
        System.out.println(super.toString()+" - Vendedor");
    }

    public void novoCliente(String nomeCliente){
        listaClientes.add(nomeCliente);
    }
    
    public void borrarCliente(String nomeCliente){
        listaClientes.remove(listaClientes.indexOf(nomeCliente));
    }
    
    public void cambiarCoche(Coche nuevoCoche){
        cocheEmpresa=nuevoCoche;
    }

    @Override
    public void aumentarSalario(Empregado empregado) {
        float novoSoldo = empregado.getSalario()+empregado.getSalario()*aumento/100;
        empregado.setSalario(novoSoldo);
        System.out.println("Novo soldo: "+novoSoldo+" €");
    }
}
