package JAVA1.TwoWeek.Leacture.Wednesday.Interface;

//writing 학습
interface Basic { public abstract void reading(); public abstract void listening(); }

//speaking 학습
interface Intermediate { public abstract void speaking(); }

//reading, listening 학습
interface Advanced { public abstract void writing(); }

class ClassForm {
    String className;

    ClassForm(String className) {
        this. className = className;
    }
}

//basic, intermediate, advanced 사용자가 참여할 수 있는 수업
class ClassA extends ClassForm implements Basic, Intermediate, Advanced {

    ClassA(String className) { super(className); }

    public void reading() {
        System.out.println(super.className + "의 reading 수업은 " + "화 15시");
    }

    public void listening() {
        System.out.println(super.className + "의 listening 수업은 " + "수 18시");
    }

    public void speaking() {
        System.out.println(super.className + "의 speaking 수업은 " + "월 16시");
    }

    public void writing() {
        System.out.println(super.className + "의 writing 수업은 " + "금 13시");
    }

}


//basic, intermediate 사용자가 참여할 수 있는 수업
class ClassB extends ClassForm implements Basic, Intermediate {

    ClassB(String className) { super(className); }



    public void reading() {
        System.out.println(super.className + "의 reading 수업은 " + "화 17시");
    }

    public void listening() {
        System.out.println(super.className + "의 listening 수업은 " + "수 16시");
    }

    public void speaking() {
        System.out.println(super.className + "의 speaking 수업은 " + "월 17시");
    }


}

//basic 사용자가 참여할 수 있는 수업
class ClassC extends ClassForm implements Basic {

    ClassC(String className) { super(className); }

    public void reading() {
        System.out.println(super.className + "의 reading 수업은 " + "화 16시");
    }

    public void listening() {
        System.out.println(super.className + "의 listening 수업은 " + "수 17시");
    }


}
