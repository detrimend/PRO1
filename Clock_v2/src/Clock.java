public class Clock
{
  private int hour;
  private int minute;
  private int second;

  public Clock(int hour, int minute, int second)
  {
    set(hour, minute, second);
  }

  public Clock(int totalSeconds)
  {
    set(totalSeconds);
  }

  public void set(int hour, int minute, int second)
  {
    if (hour < 0 || hour > 23)
    {
      hour = 0;
    }
    if (minute < 0 || minute > 59)
    {
      minute = 0;
    }
    if (second < 0 || second > 59)
    {
      second = 0;
    }
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void set(int totalSeconds)
  {
    if (totalSeconds < 0 || totalSeconds > 24 * 3600)
    {
      totalSeconds = 0;
    }
    hour = totalSeconds / 3600;
    minute = (totalSeconds % 3600) / 60;
    second = (totalSeconds % 3600) % 60;
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
    return hour * 3600 + minute * 60 + second;
  }

  public void tic()
  {
    second++;
    if (second > 59)
    {
      second = 0;
      minute++;
      if (minute > 59)
      {
        minute = 0;
        hour++;
        if (hour > 23)
        {
          hour = 0;
        }
      }
    }
  }

  public boolean isBefore(Clock time)
  {
    return (getTimeInSeconds() - time.getTimeInSeconds() < 0);
  }

  public String toString()
  {
    String s = getSimpleTime() + ":";
    if (second < 10)
    {
      s += "0";
    }
    s += second;
    return s;
  }

  public String getSimpleTime()
  {
    String s = "";
    if (hour < 10)
    {
      s = "0";
    }
    s += hour + ":";
    if (minute < 10)
    {
      s += "0";
    }
    s += minute;
    return s;
  }

}
