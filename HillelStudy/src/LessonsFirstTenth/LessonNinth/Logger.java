package LessonsFirstTenth.LessonNinth;

//Написать свой класс Logger, который потом можно в разных местах наших программ.
//Логгер должен поддерживать разные уровни логирования (info, debug, warn, error).
//Можно добавить Enum для разных уровней логирования, чтобы по этим уровням менять цвет выводимого сообщения.

public class Logger {
    private static Status status;

    public static void setStatus(Status statValue) {
        status = statValue;
    }

    public static String getStatus() {
        return status.getStatus();
    }
}