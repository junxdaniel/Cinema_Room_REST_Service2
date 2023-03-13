class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me

        minutes += 1;
        if (minutes >= 60) {
            minutes %= 60;
            hours += 1;
            if (hours > 12) {
                hours -= 12;
            }
        }
    }
}