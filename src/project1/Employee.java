package project1;

class EmployeeData
{
  String[][] Einfo ={
          {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
          {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
          {"1003","Rahul","01/04/2009","k","Acct","10000","8000","1000"},
          {"1004","Chahat","01/04/2009","r","Front Desk","12000","6000","2000"},
          {"1005","Rajan","01/04/2009","m","Engg","50000","20000","20000"},
          {"1006","Suman","01/04/2009","e","Manufacturing","23000","9000","4400"},
          {"1007","Tanmey","01/04/2009","c","PM","29000","12000","10000"}
  };
  String des[][]=
          {{"e","Engineer","20000"},{"c","Consultant","32000"},
                  {"k","Clerk","12000"},{"r","Receptionist","20000"},{"m","Manager","40000"}};

  // methods to display the  employee information

  public void displayEmpInfo()
  {
    for(int i=0;i<7;i++)
    {
      for(int j=0;j<8;j++)
      {

        System.out.printf("%-15s",Einfo[i][j]);
        System.out.print("\t");
      }
      System.out.println();
    }
  }


  public void displayEmpDes()
  {
    System.out.println("\n");

    for(int i=0;i<5;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.printf("%-15s",des[i][j]);

      }
      System.out.println();
    }
  }
  public void showData(String s)
  {
    int row;
    boolean flag=false;
    int calculated_salary,da,basic,hra,it;
    System.out.println("\n");
    for(int i=0;i<7;i++)
    {
      if(Einfo[i][0].equals(s))
      {

        row=i;
      //  System.out.println(row);
        flag=true;
        char des_code= Einfo[row][3].charAt(0);
        String h1,h2,h3,h4,h5;
        h1 ="Emp No.";
        h2 = "Emp Name";
        h3 = "Department";
        h4 = "Designation";
        h5 = "Salary";
      //  System.out.println(des_code);
        switch(des_code)
        {

          case 'e':
            basic=Integer.parseInt(Einfo[row][5]);
            hra=Integer.parseInt(Einfo[row][6]);
            it=Integer.parseInt(Einfo[row][7]);
            da=Integer.parseInt(des[0][2]);
            calculated_salary=basic+hra+da-it;
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" ,h1,h2,h3,h4,h5 );
            System.out.printf("%-15s %-15s %-15s %-15s %-15s",Einfo[i][0],Einfo[i][1],Einfo[i][4],des[0][1],calculated_salary);
            break;

          case 'c':
            basic=Integer.parseInt(Einfo[row][5]);
            hra=Integer.parseInt(Einfo[row][6]);
            it=Integer.parseInt(Einfo[row][7]);
            da=Integer.parseInt(des[1][2]);
            calculated_salary=basic+hra+da-it;
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" ,h1,h2,h3,h4,h5 );
            System.out.printf("%-15s %-15s %-15s %-15s %-15s",Einfo[i][0],Einfo[i][1],Einfo[i][4],des[1][1],calculated_salary);

            break;

          case 'k':
            basic=Integer.parseInt(Einfo[row][5]);
            hra=Integer.parseInt(Einfo[row][6]);
            it=Integer.parseInt(Einfo[row][7]);
            da=Integer.parseInt(des[2][2]);
            calculated_salary=basic+hra+da-it;
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" ,h1,h2,h3,h4,h5 );
            System.out.printf("%-15s %-15s %-15s %-15s %-15s",Einfo[i][0],Einfo[i][1],Einfo[i][4],des[2][1],calculated_salary);

            break;

          case 'r':
            basic=Integer.parseInt(Einfo[row][5]);
            hra=Integer.parseInt(Einfo[row][6]);
            it=Integer.parseInt(Einfo[row][7]);
            da=Integer.parseInt(des[3][2]);
            calculated_salary=basic+hra+da-it;
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" ,h1,h2,h3,h4,h5 );
            System.out.printf("%-15s %-15s %-15s %-15s %-15s",Einfo[i][0],Einfo[i][1],Einfo[i][4],des[3][1],calculated_salary);
            break;

          case 'm':
            basic=Integer.parseInt(Einfo[row][5]);
            hra=Integer.parseInt(Einfo[row][6]);
            it=Integer.parseInt(Einfo[row][7]);
            da=Integer.parseInt(des[4][2]);
            calculated_salary=basic+hra+da-it;
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %n" ,h1,h2,h3,h4,h5 );
            System.out.printf("%-15s %-15s %-15s %-15s %-15s",Einfo[i][0],Einfo[i][1],Einfo[i][4],des[4][1],calculated_salary);
            break;

        }
      }

    }

    if(flag==false)
      System.out.println("There is no record of emp_number: "+s);
  }

}

class Employee
{
  public static void main(String args[])
  {
    EmployeeData e=new EmployeeData();
    e.displayEmpInfo();
    e.displayEmpDes();
    e.showData(args[0]);
  }
}
