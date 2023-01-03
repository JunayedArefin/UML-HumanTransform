package humantransform;


public class HumanTransform {

    
    public static void main(String[] args) {
        
        varsity v = new varsity("201-15-3294", "Cse", "7th", "Design", "Junayed Arefin", "Male", 25, 5.6);
        System.out.println("");
        System.out.println("A Boy in Varsity,");
        System.out.println("");
        System.out.println("Name : "+v.getName());
        System.out.println("Gender : "+v.getGender());
        System.out.println("Age : "+v.getAge());
        System.out.println("Hight : "+v.getHight());
        System.out.println("ID : "+v.getId());
        System.out.println("Department : "+v.getDept());
        System.out.println("Semester : "+v.getSemester());
        System.out.println("Skill : "+v.getSkill());
        
        
        
        
        Job j = new Job("201", "It Dept", "HR","20000$", "Junayed Arefin", "Male", 25, 5.6);
        System.out.println("");
        System.out.println("A Boy in Company,");
        System.out.println("");
        System.out.println("Name : "+j.getName());
        System.out.println("Gender : "+j.getGender());
        System.out.println("Age : "+j.getAge());
        System.out.println("Hight : "+j.getHight());
        System.out.println("ID : "+j.getId());
        System.out.println("Department : "+j.getDept());
        System.out.println("Post : "+j.getPost());
        System.out.println("Salary : "+j.getSalary());
        
       
        
        Market m = new Market("201-15-3294", "XjedWjT", "Gaibandha", "Junayed Arefin", "Male", 25, 5.6);
        
        System.out.println("");
        System.out.println("A Boy in Market,");
        System.out.println("");
        System.out.println("Name : "+m.getName());
        System.out.println("Gender : "+m.getGender());
        System.out.println("Age : "+m.getAge());
        System.out.println("Hight : "+m.getHight());
        System.out.println("ID : "+m.getId());
        System.out.println("Cupon Code : "+m.getCupon());
        System.out.println("Address : "+m.getAddress());

        
        
        
        
        
    }
    
}
