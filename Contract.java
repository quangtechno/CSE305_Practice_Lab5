public interface Contract{


    public String BuildContractId();
    public String BuildPropertyId();
    public String BuildTenantId();
    public double BuildRentalAmount();
    public Contract SignContract(String contractId, double rentalAmount, String tenantId, String propertyId);
}