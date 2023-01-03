package humantransform;

public class Job extends Human{
    public String id;
    public String dept;
    public String post;
    public String salary;

    public Job(String id, String dept, String post, String salary, String Name, String Gender, int Age, double Hight) {
        super(Name, Gender, Age, Hight);
        this.id = id;
        this.dept = dept;
        this.post = post;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getPost() {
        return post;
    }

    public String getSalary() {
        return salary;
    }

   
}
