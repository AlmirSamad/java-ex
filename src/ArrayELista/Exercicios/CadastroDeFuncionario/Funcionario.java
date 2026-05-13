package ArrayELista.Exercicios.CadastroDeFuncionario;

public class Funcionario {
    private Long id;
    private String name;
    private Double salary;

    public Funcionario(){}

    public void increase(double x){
       var increaseSalary = getSalary() * (x/100);
       double nSalary = increaseSalary + getSalary();
       setSalary(nSalary);
    }

    public Funcionario(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary
                ;
    }


}
