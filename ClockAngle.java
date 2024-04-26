package clockAngle;

public class ClockAngle {

  public static void main(String[] args) {
    int hour = 3; // Example: 3 o'clock
    int minute = 30; // Example: 30 minutes past the hour

    double angle = calculateClockAngle(hour, minute);
    System.out.println("The angle between the hour and minute hands is: " + angle + " degrees");
  }

  public static double calculateClockAngle(int hour, int minute) {
    // Validate input
    if (hour < 0 || hour > 12 || minute < 0 || minute > 59) {
      throw new IllegalArgumentException("Invalid input for hour or minute");
    }

    // Calculate the angle made by the hour hand with respect to 12 o'clock
    double hourAngle = (hour % 12 + minute / 60.0) * 30;

    // Calculate the angle made by the minute hand with respect to 12 o'clock
    double minuteAngle = minute * 6;

    // Calculate the angle between the two hands
    double angle = Math.abs(hourAngle - minuteAngle);

    // If the angle is greater than 180 degrees, find the smaller angle
    if (angle > 180) {
      angle = 360 - angle;
    }

    return angle;
  }
}
