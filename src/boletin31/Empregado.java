package boletin31;

public abstract class Empregado {
    private String dni;
    private String nome;
    private String apelidos;
    private String direccion;
    private int anosAntiguedade;
    private int telefono;
    private float salario;
    private String supervisor;

    public Empregado() {
    }

    public Empregado(String dni, String nome, String apelidos, String direccion, int anosAntiguedade, int telefono, float salario, String supervisor) {
        this.dni = dni;
        this.nome = nome;
        this.apelidos = apelidos;
        this.direccion = direccion;
        this.anosAntiguedade = anosAntiguedade;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor=supervisor; 
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return "Empregado:\n DNI: " + dni + " --  Nome: " + nome + " --  Apelidos: " + apelidos +
                " --  Direccion: " + direccion + " --  Anos de Antiguedade: " + anosAntiguedade + 
                " --  Telefono:" + telefono + " -- Salario: " + salario;
    }
    
    public void cambiarSuprvisor(String novoSupervisor, Empregado empregado){
        empregado.supervisor=novoSupervisor;
    }
    
    public void imprimir(Empregado e){
        System.out.println(e.toString());
    }
    
    public abstract void aumentarSalario(Empregado empregado);
}
