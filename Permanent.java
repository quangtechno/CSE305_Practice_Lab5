public class Permanent implements Contract {
    private String ContractId;
    private double RentalAmount;
    private String TenantId;
    private String PropertyId;

    public Permanent(String contractId, double rentalAmount, String tenantId, String propertyId) {
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
        Contract permanent = new Permanent(contractId, rentalAmount, tenantId, propertyId);
        return permanent;
    }

    @Override
    public String toString() {
        return "Permanent [ContractId=" + ContractId + ", RentalAmount=" + RentalAmount + ", TenantId=" + TenantId
                + ", PropertyId=" + PropertyId + "]";
    }

}