package yinyong;

    //先定义一个学生类
    public class Student {

        public String name;
        //设计重载构造函数，为了后面的演示方便
        public Student(){
        }
        //用于取名的构造函数
        public Student(String p){
            name=p;
        }
        //用于改名的的函数，不过得改成别人的名字
        public void changName(Student p){
            this.name=p.name;
        }

    }
