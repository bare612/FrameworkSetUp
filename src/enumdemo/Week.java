package enumdemo;

public class Week {
    Day day;

    public Week(Day day){
        this.day = day;

    }

    public void whatToDo() {
        switch (day) {
            case MONDAY:
                System.out.println("Star reading java book");
                break;
            case TUESDAY:
                System.out.println("Start codeLab");
                break;
            case WEDNESDAY:
                System.out.println(" Start joining mentoring");
                break;
            case THURSDAY:
                System.out.println("Continue CodeLab");
                break;
            case FRIDAY:
                System.out.println(" submit homework");
                break;
            case SATURDAY:
                System.out.println(" join the Class");
                break;
            case SUNDAY:
                System.out.println("Be there Sunday Class");
                break;
            default:
                System.out.println(" not a valid day");
                break;

        }

    }

    }