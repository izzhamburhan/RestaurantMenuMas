

import java.util.* ;
public class HotelDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Enter Customer Name");
        String name = sc.nextLine();
        System.out.println(" ");
        System.out.println("Restaurant Name\t\t"+"User Name\t\t"+"Date and Time");
        System.out.println(" ");
        System.out.println("Welcome to Zam Restaurant" + "\t" + name + "\t\t\t" + date.toString());
        int a,b,c,d,e,f,l,i;
        int eachcost = 0; 
        int cost = 0 ;
        int price = 0 ;
        int y=0 , v=0 ;
        String item = " ";
        //int press [] ;
        System.out.println(" ");
        System.out.println("Our Menu Card");
        System.out.println(" ");
        System.out.println("Item Name\t\t\t" + "Price\t\t" + "Press to order");
        System.out.println(" ");
        System.out.println("Nasi Lemak and Ayam\t\t" + "60\t\t" + "1");
        System.out.println("Mee Goreng and Pisang\t\t" + "40\t\t" + "2");
        System.out.println("Bihun Sup and Sirih\t\t" + "50\t\t" + "3");
        System.out.println("Kuetiaow and Nugget\t\t" + "50\t\t" + "4");
        System.out.println("Nasi Ayam and Bahulu\t\t" + "70\t\t" + "5");
        System.out.println(" ");

        //System.out.println("How Many Orders You Want to Add");
        //int n=sc.nextInt();
        System.out.println(" ");
        ArrayList order = new ArrayList();
        ArrayList<Integer> pric = new ArrayList<>();
        ArrayList plate = new ArrayList() ;
        //int press[] ; 

        do
        {

            System.out.println("Press to order");

            a = sc.nextInt();
            int press[] = new int[]{a};
            //System.out.println(press[0]);

            //System.out.println(" ");

            //System.out.println("You have Pressed" + "\t" + a);
            //System.out.println(" ");
            System.out.println("Enter the Number of plates");
            b=sc.nextInt();
            System.out.println(" ");
            //System.out.println("Item Name\t\t" + "Number of plates\t\t" + "Total");
            //System.out.println(" ");
            //Code for item select

            if(a==1)
            {
                item = "Nasi Lemak and Ayam";
                price=60;
                eachcost = price*b ;
                cost += eachcost ; 
                //System.out.println("Item" + "\t\t" + b + "\t\t\t\t" + eachcost );
                boolean of = order.contains(item);
                if(of)
                {
                    order.add("");
                    pric.add(eachcost);
                    plate.add(b);
                } 
                else
                {
                    pric.add(eachcost);
                    plate.add(b);
                    order.add(item);
                }
            }
            if(a==2)
            {
                item = "Mee Goreng and Pisang";
                price=40;
                eachcost = price*b ;
                cost += eachcost ; 
                
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==3)
            {
                item = "Bihun Sup and Sirih";
                price=50;
                eachcost = price*b ;
                cost += eachcost ; 
                System.out.println(item + "\t\t\t\t" + eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==4)
            {
                item = "Kuetiaow and Nugget";
                price=50;
                eachcost = price*b ;
                cost += eachcost ; 
                //System.out.println(item + "\t\t\t\t" + eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==5)
            {
                item = "Nasi Ayam and Bahulu";
                price=70;
                eachcost = price*b ;
                cost += eachcost ; 
                //System.out.println(item + "\t\t\t\t" + eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }



            //System.out.println(" ");
            //System.out.println("Report : ");
            //System.out.println(" ");
            for(int k =0 ; k<press.length ; k++)
            {
                String fetchitemname = "  " ;

                //System.out.println("Item Name\t\t" + "No. of plates\t\t\t" + "Price");
                if(press[k] == 1)
                {
                    fetchitemname = "Nasi Lemak and Ayam";
                    //System.out.println(fetchitemname + "\t\t" + b + "\t\t\t\t" + "Price");

                }
                if(press[k] == 2)
                {
                    fetchitemname = "Mee Goreng and Pisang";
                    //System.out.println(fetchitemname + "\t\t" + b + "\t\t\t\t" + "Price");
                }
                if(press[k] == 3)
                {
                    fetchitemname = "Bihun Sup and Sirih";
                    //System.out.println(fetchitemname + "\t\t" + b + "\t\t\t\t" + "Price");
                }
                if(press[k] == 4)
                {
                    fetchitemname = "Kuetiaow and Nugget";
                    //System.out.println(fetchitemname + "\t\t" + b + "\t\t\t\t" + "Price");
                }
                if(press[k] == 5)
                {
                    fetchitemname = "Nasi Ayam and Bahulu";
                    //System.out.println(fetchitemname + "\t\t" + b + "\t\t\t\t" + "Price");
                }
            }

            System.out.println("Do you want to continue the order(Press 1 for continue/Othereise Press 0)");
            y = sc.nextInt();

            //for(int k=0;press.length;k++)
            //
            //System.out.print(press[k] + "\t");

            //
            System.out.println(" ");

        }while(y!=0);

        //System.out.println(" ");
        //System.out.println("Report:");
        System.out.println(" ");
        //System.out.println("press[0]");
        System.out.println(" ");

        System.out.println("Item Name" + "\t\t\t\t\t\t" + "No. of plates" + "\t\t" + "sub total");
        Iterator itr = order.iterator();
        Iterator<Integer> itr1 = pric.iterator();
        Iterator itr2 = plate.iterator();

        while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
        {
            System.out.println(itr.next() + "\t\t\t\t\t\t\t" + itr2.next() + "\t\t" + itr1.next());
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Total Bill : " + "\t\t\t\t\t\t\t" + "\t\t" + cost);
        System.out.println(" ");

        System.out.println("Do you want to delete the order(Press 1 for continue /otherwise press 0 )");
        l = sc.nextInt();

        System.out.println("");

        if(l==1)
        {
            do
            {
                if(order.isEmpty())
                {
                    System.out.println("Your cart is empty.");
                    break;
                }
                else
                {
                    System.out.println("Press to delete");
                    f = sc.nextInt();
                    int delete[] = new int[]{f};


                    if(f==1)
                {
                    item = "Nasi Lemak and Ayam";
                    boolean of = order.contains(item);
                    int of1 = order.indexOf(item);

                    if(of)
                    {
                        order.remove(item);
                        cost = cost - pric.remove(of1);

                        plate.remove(of1);
                    }
                }
                if(f==2)
                {
                    item = "Mee Goreng and Pisang";
                    boolean of = order.contains(item);
                    int of1 = order.indexOf(item);

                    if(of)
                    {
                        order.remove(item);
                        cost = cost - pric.remove(of1);

                        plate.remove(of1);
                    }
                }
                if(f==3)
                {
                    item = "Bihun Sup and Sirih";
                    boolean of = order.contains(item);
                    int of1 = order.indexOf(item);

                    if(of)
                    {
                        
                        order.remove(item);
                        cost = cost - pric.remove(of1);

                        plate.remove(of1);
                    }
                }
                if(f==4)
                {
                    item = "Kuetiaow and Nugget";
                    boolean of = order.contains(item);
                    int of1 = order.indexOf(item);

                    if(of)
                    {
                        order.remove(item);
                        cost = cost - pric.remove(of1);

                        plate.remove(of1);
                    }
                }
                if(f==5)
                {
                    item = "Nasi Ayam and Bahulu";
                    boolean of = order.contains(item);
                    int of1 = order.indexOf(item);

                    if(of)
                    {
                        order.remove(item);
                        cost = cost - pric.remove(of1);

                        plate.remove(of1);
                    }
                }
                System.out.println("Continue to delete the Order(press 1 for continue/otherwise press 0 )");
                v = sc.nextInt();
                }

            }while(v!=0);
            System.out.println(" ");
            System.out.println("Item Names"+ "\t\t\t\t\t\t"+ "No. of plates" + "\t\t" + "Sub Total");
            itr = order.iterator();
            itr1 = pric.iterator();
            itr2 = plate.iterator();
            int scost = 0 ;
            
            while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
            {
                System.out.print(itr.next() + "\t\t\t\t\t\t\t" + itr2.next() + "\t\t" + itr1.next());
                System.out.println(" ");

                System.out.println(" ");
            }

            System.out.println("Total Bill : " + "\t\t\t\t\t\t\t" + "     " + "\t\t" + cost);


        }

        System.out.println("Thank you for visiting our hotel " + " " + name + "\t\t\t" + "signature");

    }
}

