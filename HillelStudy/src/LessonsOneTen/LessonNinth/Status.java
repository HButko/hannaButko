package LessonsOneTen.LessonNinth;

import static LessonsOneTen.LessonNinth.Formatting.*;

public enum Status {
    INFO(ANSI_BLUE + "Information " + ANSI_RESET),
    DEBUG(ANSI_PURPLE + "Debug " + ANSI_RESET),
    WARN(ANSI_YELLOW + "Warning " + ANSI_RESET),
    ERROR(ANSI_RED + "Error " + ANSI_RESET);

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
