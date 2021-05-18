public class NextDayCalculator {

        public String calculatorNextDay(int day, int month, int year) {
            String result = "";
            int nextDay = day + 1;
            if (day > 31 || day <= 0) {
                throw new RuntimeException();
            } else {
                switch (month) {
                    case 1:
                    case 8:
                    case 3:
                    case 5:
                    case 7:
                    case 10:
                        if (nextDay > 31) {
                            nextDay = 1;
                            month += 1;
                        }
                        break;
                    case 12:
                        if (nextDay > 31) {
                            nextDay = 1;
                            month = 1;
                            year += 1;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (nextDay > 30) {
                            nextDay = 1;
                            month += 1;
                        }
                        break;
                    case 2:
                        boolean isLeapYear = false;
                        boolean isDivisibleBy4 = year % 4 == 0;
                        if (isDivisibleBy4) {
                            boolean isDivisiblleBy100 = year % 100 == 0;
                            if (isDivisiblleBy100) {
                                boolean isDivisibleBy400 = year % 400 == 0;
                                if (isDivisibleBy400) {
                                    isLeapYear = true;
                                }
                            } else isLeapYear = true;
                        }
                        if (!isLeapYear) {
                            if (nextDay > 28) {
                                nextDay = 1;
                                month += 1;
                            }
                        } else {
                            if (nextDay > 29) {
                                nextDay = 1;
                                month += 1;
                            }
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                result = nextDay + "/" + month + "/" + year;
            }
            return result;
        }
    }


