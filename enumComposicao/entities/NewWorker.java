package EnumComposicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enumComposicao.entities.enums.WorkerLevel;

public class NewWorker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public NewWorker(){
    }
    
    public NewWorker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);

    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public void income(int year, int month){
        Double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum+= c.totalValue();
                
            }
        }
    }
}
