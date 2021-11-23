package LessonsFirstTenth.LessonSeventh;

abstract class AbstractClass {
    public abstract void result();
}

class ResultPrint extends AbstractClass {
    @Override
    public void result() {
        System.out.println("The result of the match!");
    }
}