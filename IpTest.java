import IpPackage.*;
import java.util.Scanner;
class IpTest {
        public static void main (String args[]) {
            
            System.out.println("Les octets d'adresse IP 1 sont :");
            IpPackage ip1 = IpPackage.getInstance(192,168,77,1);
            System.out.println("L'adresse ip est :" + ip1.getOctet1() +"  "+ ip1.getOctet2()+"  " + ip1.getOctet3()+" " +" "+ ip1.getOctet4() + "  " + "La classe est :" + ip1.getClasse());
            IpPackage ip2 = IpPackage.getInstance(192,168,77,2);
            System.out.println("L'adresse ip est :" + ip2.getOctet1() +"  "+ ip2.getOctet2()+"  " + ip2.getOctet3()+" " +" "+ ip2.getOctet4() + "  " + "La classe est :" + ip2.getClasse());
            IpPackage ip3 = IpPackage.getInstance(192,168,77,3);
            System.out.println("L'adresse ip est :" + ip3.getOctet1() +"  "+ ip3.getOctet2()+"  " + ip3.getOctet3()+" " +" "+ ip3.getOctet4() + "  " + "La classe est :" + ip3.getClasse());
            IpPackage ip4 = IpPackage.getInstance(192,168,77,4);
            System.out.println("L'adresse ip est :" + ip4.getOctet1() +"  "+ ip4.getOctet2()+"  " + ip4.getOctet3()+" " +" "+ ip4.getOctet4() + "  " + "La classe est :" + ip4.getClasse());
            IpPackage ip5 = IpPackage.getInstance(192,168,77,5);
            System.out.println("L'adresse ip est :" + ip5.getOctet1() +"  "+ ip5.getOctet2()+"  " + ip5.getOctet3()+" " +" "+ ip5.getOctet4() + "  " + "La classe est :" + ip5.getClasse());
            String ip1octet1 = Integer.toHexString(ip1.getOctet1());
            String ip1octet2 = Integer.toHexString(ip1.getOctet2());
            String ip1octet3 = Integer.toHexString(ip1.getOctet3());
            String ip1octet4 = Integer.toHexString(ip1.getOctet4());
            System.out.println("IP 1 en hexadecimal : " + ip1octet1 +"."+ip1octet2+"."+ip1octet3+"."+ip1octet4);
            String ip2octet1 = Integer.toHexString(ip2.getOctet1());
            String ip2octet2 = Integer.toHexString(ip2.getOctet2());
            String ip2octet3 = Integer.toHexString(ip2.getOctet3());
            String ip2octet4 = Integer.toHexString(ip2.getOctet4());
            System.out.println("IP 2 en hexadecimal : " + ip2octet1 +"."+ip2octet2+"."+ip2octet3+"."+ip2octet4);
            String ip3octet1 = Integer.toHexString(ip3.getOctet1());
            String ip3octet2 = Integer.toHexString(ip3.getOctet2());
            String ip3octet3 = Integer.toHexString(ip3.getOctet3());
            String ip3octet4 = Integer.toHexString(ip3.getOctet4());
            System.out.println("IP 3 en hexadecimal : " + ip3octet1 +"."+ip3octet2+"."+ip3octet3+"."+ip3octet4);
            String ip4octet1 = Integer.toHexString(ip4.getOctet1());
            String ip4octet2 = Integer.toHexString(ip4.getOctet2());
            String ip4octet3 = Integer.toHexString(ip4.getOctet3());
            String ip4octet4 = Integer.toHexString(ip4.getOctet4());
            System.out.println("IP 4 en hexadecimal : " + ip4octet1 +"."+ip4octet2+"."+ip4octet3+"."+ip4octet4);
            String ip5octet1 = Integer.toHexString(ip5.getOctet1());
            String ip5octet2 = Integer.toHexString(ip5.getOctet2());
            String ip5octet3 = Integer.toHexString(ip5.getOctet3());
            String ip5octet4 = Integer.toHexString(ip5.getOctet4());
            System.out.println("IP 5 en hexadecimal : " + ip5octet1 +"."+ip5octet2+"."+ip5octet3+"."+ip5octet4);
            }
        }
        