package enums;

public enum Day implements PrintDayNumber {

    MONDAY{
        @Override
        public void printDayNumber() {
            System.out.println("1");
        }

        void printName() {
            System.out.println("Понеділок");
        }
    },
    TUESDAY{
        @Override
        public void printDayNumber() {
            System.out.println("2");
        }

        void printName() {
            System.out.println("Вівторок");
        }
    },
    WEDNESDAY{
        @Override
        public void printDayNumber() {
            System.out.println("3");
        }

        void printName() {
            System.out.println("Середа");
        }
    },
    THURSDAY{
        @Override
        public void printDayNumber() {
            System.out.println("4");
        }

        void printName() {
            System.out.println("Чт");
        }
    },
    FRIDAY{
        @Override
        public void printDayNumber() {
            System.out.println("5");
        }

        void printName() {
            System.out.println("Пт");
        }
    },
    SATURDAY{
        @Override
        public void printDayNumber() {
            System.out.println("6");
        }

        void printName() {
            System.out.println("Сб");
        }
    },
    SUNDAY{
        @Override
        public void printDayNumber() {
            System.out.println("7");
        }

        void printName() {
            System.out.println("Нд");
        }
    };

    private int dayNumber;

    abstract void printName();

    public int getDayNumber() {
        return dayNumber;
    }
}
