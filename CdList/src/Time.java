public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second)
    {
      this(hour * 3600 + minute * 60 + second);
    }

    public Time(int timeInSeconds)
    {
      if (timeInSeconds < 0)
      {
        timeInSeconds = 0;
      }
      this.hour = timeInSeconds / 3600;
      this.minute = (timeInSeconds % 3600) / 60;
      this.second = (timeInSeconds % 3600) % 60;
    }

    public void setTimeInSeconds(int timeInSeconds)
    {
      if (timeInSeconds < 0)
      {
        timeInSeconds = 0;
      }
      hour = timeInSeconds / 3600;
      minute = (timeInSeconds % 3600) / 60;
      second = (timeInSeconds % 3600) % 60;
    }

    public void set(int h, int m, int s)
    {
      if (h < 0)
      {
        h = 0;
      }
      if (m < 0 || m > 59)
      {
        m = 0;
      }
      if (s < 0 || s > 59)
      {
        s = 0;
      }

      this.hour = h;
      this.minute = m;
      this.second = s;
    }

    public int getHour()
    {
      return hour;
    }

    public int getMinute()
    {
      return minute;
    }

    public int getSecond()
    {
      return second;
    }

    public int getTimeInSeconds()
    {
      return hour*3600 + minute*60 + second;
    }

    public Time copy()
    {
    Time other = new Time(hour, minute, second);
    return other;
    }

    public String toString()
    {
      return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
