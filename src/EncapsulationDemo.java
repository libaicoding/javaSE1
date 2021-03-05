class Student{
    //把属性私化，不对外暴露，用后面的方法做对外能力提供
    private String name;
    private String gender;
    private int age;

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String GrandFromAge(){
        if (age>7){
            return ("这个孩子是小学生");
        }
        return ("这个孩子是幼儿园");
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student s=new Student("zhangsan","男",11);
        // 通过get方法去取到类对象的年龄，而不是直接拿它的属性
        System.out.println(s.getAge());
        /* 通过GrandFromAge方法判断这个孩子是小学生还是幼儿园，这样也就无需关心这个孩子到底是几岁，保护对象的隐私性 */
        System.out.println(s.GrandFromAge());
    }

}
