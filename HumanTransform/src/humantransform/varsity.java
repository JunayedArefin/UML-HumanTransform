package humantransform;

public class varsity extends Human {
    public String id;
    public String dept;
    public String semester;
    public String skill;

    public varsity(String id, String dept, String semester, String skill, String Name, String Gender, int Age, double Hight) {
        super(Name, Gender, Age, Hight);
        this.id = id;
        this.dept = dept;
        this.semester = semester;
        this.skill = skill;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getSemester() {
        return semester;
    }

    public String getSkill() {
        return skill;
    }

    
}
