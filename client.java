import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("enter contract Id : ");
        String ContractId=reader.nextLine();
        System.out.println("enter rental amount : ");
        double RentalAmount=reader.nextDouble();
        System.out.println("enter tenant Id : ");
        String TenantId=reader.nextLine();
        String temp=reader.nextLine();
        TenantId+=temp;
        System.out.println("enter Property  Id : ");
        String PropertyId=reader.nextLine();
        Contract contract=new LongTerm(ContractId, RentalAmount, TenantId, PropertyId);
        System.out.println(contract.toString());
        reader.close();
    }
    
}
