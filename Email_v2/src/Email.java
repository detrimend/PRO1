import static java.lang.StringUTF16.charAt;

public class Email
{
  private String user;
  private String host;
  private String domain;

  public boolean userRules()
  {
    String str = user;
    char ch = 0;
    for (int i = 0; i < str.length(); i++)
    {
      ch = str.charAt(i);
      if (!(!user.isEmpty() && user.length() <= 64 && (ch >= 'A' && ch <= 'Z')
          || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
      {
        return false;
      }
    }
    return true;
  }

  public boolean hostRules()
  {
    if ((!host.isEmpty() && host.length() <= 64)
        && (host.charAt(0) >= 'A' && host.charAt(0) <= 'Z')
        || (host.charAt(0) >= 'a' && host.charAt(0) <= 'z'))
    {
      String str = host;
      char ch = 0;
      for (int i = 0; i < str.length(); i++)
      {
        ch = str.charAt(i);
        if (!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||
            (ch >= '0' && ch <= '9'))
        {
          return false;
        }
      }
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean domainRules()
  {
    if ((!domain.isEmpty() && domain.length() <= 64))
    {
      String str = domain;
      char ch = 0;
      for (int i = 0; i < str.length(); i++)
      {
        ch = str.charAt(i);
        if (!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||
            (ch >= '0' && ch <= '9'))
        {
          return false;
        }
      }
      return true;
    }
    else
    {
      return false;
    }
  }



  public Email(String user, String host, String domain)
  {
    if (userRules() && hostRules() && domainRules())
    {
      this.user = user;
      this.host = host;
      this.domain = domain;
    }
    else
    {
      this.user = "wrong";
      this.host = "email";
      this.domain = "address";
    }
  }

  public String getUser()
  {
    return user;
  }

  public String getHost()
  {
    return host;
  }

  public String getDomain()
  {
    return domain;
  }


  public String toString()
  {
    return user + "@" + host + "." + domain;
  }

}
