package view;

import model.CdModel;
import java.util.Scanner;

public class CdConsoleView
{

  private CdModel model;

  public CdConsoleView(CdModel model)
  {
    this.model = model;
  }

  public void start()
  {
    Scanner input = new Scanner(System.in);
    boolean running = true;
    while(running)
    {
      System.out.println("1) Get a Cd by index");
      System.out.println("2) Get Cds by title");
      System.out.println("3) Get number of Cds");
      System.out.println("4) Add a Cd");
      System.out.println("5) Remove first Cd by title");
      System.out.println("6) Clear");
      System.out.println("0) QUIT");

      System.out.print("\nEnter choice: ");
      int choice = input.nextInt();

      switch(choice)
      {
        case 1:
          System.out.print("Enter Cd index: ");
          int index = input.nextInt();
          input.nextLine();
          System.out.println(model.getCd(index).toString());
          break;

        case 2:
          System.out.print("Enter Cd title: ");
          String title = input.nextLine();
          System.out.println(model.getCdsByTitle(title).toString());
          break;

        case 3:
          System.out.println("Number of Cds: " + model.getNumberOfCds());
          break;

        case 4:
          System.out.println("Not implemented");
          break;

        case 5:
          System.out.print("Enter Cd title: ");
          title = input.nextLine();
          System.out.println("Removed Cd: " + model.removeFirstCdByTitle(title).toString());

        case 6:
          model.clear();
          System.out.println("Cleared successfully");

        case 0:
          running = false;
      }
      System.out.println("-----------------------------");

    }
  }


}
