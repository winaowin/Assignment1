import javax.swing.JOptionPane;

public class test {//open public class




        public static void main(String [] args) {//open main class

            //Declaratiom
            String num1,num2,name,output,userName;
            int a, b;
            int c = 0;

            //process
            name = JOptionPane.showInputDialog(null, "Please enter your name here : ");

            num1 = JOptionPane.showInputDialog(null, "Please enter the first number ");
            a = Integer.parseInt(num1);
            num2 = JOptionPane.showInputDialog(null, "Please enter the second number ");
            b = Integer.parseInt(num2);
            c = a + b;
            // output
            output = "Hey " +name +" " +a +" " +"+" +" " +b +" is " +c;
            JOptionPane.showMessageDialog(null, output, "result", JOptionPane.INFORMATION_MESSAGE);


        }//close main class

    }//close public class

