package JavaTestProgrammes;

public class EmployeeDataTest {

    static void EmpData(int ID, String name, int Salary){
        System.out.println("ID: " +ID +  "\nName: " +name + "\nSalary: " + Salary);

    }

    public static void main(String[] args) {
        EmployeeDataTest test = new EmployeeDataTest();
        EmpData(001, "Chetan", 35000);
        EmpData(002, "Tester", 40000);
        EmpData(003, "Val", 45000);

        EmplData Data = new EmplData();


    }


}
