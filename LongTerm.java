public class LongTerm implements Contract {
    private String ContractId;
    private double RentalAmount;
    private String TenantId;
    private String PropertyId;

    public LongTerm(String contractId, double rentalAmount, String tenantId, String propertyId) {
        ContractId = contractId;
        RentalAmount = rentalAmount;
        TenantId = tenantId;
        PropertyId = propertyId;
    }

   

    @Override
    public String BuildContractId() {
        // TODO Auto-generated method stub
        return this.ContractId;
    }



    @Override
    public String BuildPropertyId() {
        // TODO Auto-generated method stub
        return this.PropertyId;
    }



    @Override
    public double BuildRentalAmount() {
        // TODO Auto-generated method stub
        return this.RentalAmount;
    }



    @Override
    public String BuildTenantId() {
        // TODO Auto-generated method stub
        return this.TenantId;
    }



    @Override
    public Contract SignContract(String contractId, double rentalAmount, String tenantId, String propertyId) {
       Contract contract=new LongTerm(contractId, rentalAmount, tenantId, propertyId);
       return contract;
    }

    @Override
    public String toString() {
        return "LongTerm [ContractId=" + ContractId + ", RentalAmount=" + RentalAmount + ", TenantId=" + TenantId
                + ", PropertyId=" + PropertyId + "]";
    }

}
