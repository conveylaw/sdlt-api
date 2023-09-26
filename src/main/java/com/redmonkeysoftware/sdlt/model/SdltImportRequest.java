package com.redmonkeysoftware.sdlt.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SdltImportRequest implements Serializable {

    private static final long serialVersionUID = -7041373645478666702L;
    @SdltXmlValue("F_ID")
    protected String id;
    @SdltXmlValue("F_DateCreated")
    protected LocalDateTime created;
    @SdltXmlValue("F_UserNotes")
    protected String userNotes;
    @SdltXmlValue("F_FTBExemptionYesNo")
    protected Boolean firstTimeBuyer;
    @SdltXmlValue("F_ClosedOffYesNo")
    protected Boolean closedOff;
    @SdltXmlValue("F_StampDutyPaidYesNo")
    protected Boolean stampDutyPaid;
    @SdltXmlValue("F_ChequeNumber")
    protected String chequeNumber;
    @SdltXmlValue("SDLT_PropertyTypeCode")
    protected PropertyType propertyType;
    @SdltXmlValue("SDLT_TransactionDescriptionCode")
    protected TransactionDescriptionType transactionDescription;
    @SdltXmlValue("SDLT_InterestCreatedCode")
    protected InterestCreatedType interestCreated;//
    @SdltXmlValue("SDLT_InterestCreatedCodeDetailed")
    protected String interestCreatedDetailed;
    @SdltXmlValue("SDLT_DateOfTransaction")
    protected LocalDate dateOfTransaction;
    @SdltXmlValue("SDLT_AnyRestrictionsYesNo")
    protected Boolean anyRestrictions;
    @SdltXmlValue("SDLT_IfYesRestrictionDetails")
    protected String restrictionDetails;
    @SdltXmlValue("SDLT_DateOfContract")
    protected LocalDate dateOfContract;
    @SdltXmlValue("SDLT_AnyLandExchangedYesNo")
    protected Boolean anyLandExchanged;
    @SdltXmlValue("SDLT_IfYesExchangedPostcode")
    protected String exchangedPostcode;
    @SdltXmlValue("SDLT_IfYesExchangedBuildingNo")
    protected String exchangedProperty;
    @SdltXmlValue("SDLT_IfYesExchangedAddress1")
    protected String exchangedAddress1;
    @SdltXmlValue("SDLT_IfYesExchangedAddress2")
    protected String exchangedAddress2;
    @SdltXmlValue("SDLT_IfYesExchangedAddress3")
    protected String exchangedAddress3;
    @SdltXmlValue("SDLT_IfYesExchangedAddress4")
    protected String exchangedAddress4;
    @SdltXmlValue("SDLT_PursantToPreviousAgreementYesNo")
    protected Boolean pursantToPreviousAgreement;
    @SdltXmlValue("SDLT_ClaimingTaxReliefYesNo")
    protected Boolean claimingTaxRelief;
    @SdltXmlValue("SDLT_IfYesTaxReliefReasonCode")
    protected TaxReliefType taxReliefReason;
    @SdltXmlValue("SDLT_IfYesTaxReliefCharityNo")
    protected String taxReliefCharityNumber;
    @SdltXmlValue("SDLT_IfYesTaxReliefAmount")
    protected BigDecimal taxReliefAmount;
    @SdltXmlValue("SDLT_TotalConsiderationIncVAT")
    protected BigDecimal totalConsiderationIncVat;
    @SdltXmlValue("SDLT_PurchaserTypeCode")
    protected PurchaserType purchaserTypeCode;
    @SdltXmlValue("SDLT_TotalConsiderationVAT")
    protected BigDecimal totalConsiderationVat;
    @SdltXmlValue("SDLT_ConsiderationFormCode1")
    protected ConsiderationType considerationFormCode1;
    @SdltXmlValue("SDLT_ConsiderationFormCode2")
    protected ConsiderationType considerationFormCode2;
    @SdltXmlValue("SDLT_ConsiderationFormCode3")
    protected ConsiderationType considerationFormCode3;
    @SdltXmlValue("SDLT_ConsiderationFormCode4")
    protected ConsiderationType considerationFormCode4;
    @SdltXmlValue("SDLT_TransactionLinkedYesNo")
    protected Boolean transactionLinked;
    @SdltXmlValue("SDLT_IfYesTotalLinkedConsiderationIncVAT")
    protected BigDecimal totalLinkedConsiderationIncVat;
    @SdltXmlValue("SDLT_TotalTaxDue")
    protected BigDecimal totalTaxDue;
    @SdltXmlValue("SDLT_TotalTaxPaid")
    protected BigDecimal totalTaxPaid;
    @SdltXmlValue("SDLT_TotalTaxPaidIncPenaltyYesNo")
    protected Boolean totalTaxPaidIncPenalty;
    @SdltXmlValue("SDLT_LeaseTypeCode")
    protected String leaseTypeCode;
    @SdltXmlValue("SDLT_LeaseStartDate")
    protected LocalDate leaseStartDate;
    @SdltXmlValue("SDLT_LeaseEndDate")
    protected LocalDate leaseEndDate;
    @SdltXmlValue("SDLT_RentFreePeriod")
    protected String rentFreePeriod;
    @SdltXmlValue("SDLT_TotalAnnualRentIncVAT")
    protected BigDecimal totalAnnualRentIncVat;
    @SdltXmlValue("SDLT_EndDateForStartingRent")
    protected LocalDate endDateForStartingRent;
    @SdltXmlValue("SDLT_LaterRentKnownYesNo")
    protected Boolean laterRentKnown;
    @SdltXmlValue("SDLT_LeaseAmountVAT")
    protected BigDecimal leaseAmountVat;
    @SdltXmlValue("SDLT_TotalLeasePremiumPayable")
    protected BigDecimal totalLeasePremiumPayable;
    @SdltXmlValue("SDLT_NetPresentValue")
    protected BigDecimal netPresentValue;
    @SdltXmlValue("SDLT_TotalLeasePremiumTaxPayable")
    protected BigDecimal totalLeasePremiumTaxPayable;
    @SdltXmlValue("SDLT_TotalLeaseNPVTaxPayable")
    protected BigDecimal totalLeaseNpvTaxPayable;
    @SdltXmlValue("SDLT_NumberOfPropertiesIncluded")
    protected Integer numberOfPropertiesIncluded;
    @SdltXmlValue("SDLT_PropertyAddressPostcode")
    protected String propertyPostcode;
    @SdltXmlValue("SDLT_PropertyAddressBuildingNo")
    protected String propertyProperty;
    @SdltXmlValue("SDLT_PropertyAddress1")
    protected String propertyAddress1;
    @SdltXmlValue("SDLT_PropertyAddress2")
    protected String propertyAddress2;
    @SdltXmlValue("SDLT_PropertyAddress3")
    protected String propertyAddress3;
    @SdltXmlValue("SDLT_PropertyAddress4")
    protected String propertyAddress4;
    @SdltXmlValue("SDLT_PropertyLocalAuthorityCode")
    protected LocalAuthority localAuthorityCode;
    @SdltXmlValue("SDLT_PropertyTitleNumber")
    protected String titleNumber;
    @SdltXmlValue("SDLT_PropertyNLPGUPRN")
    protected String propertyNlpgUprn;
    @SdltXmlValue("SDLT_PropertyUnitsHectareMetres")
    protected String propertyUnitsHectareMetres;
    @SdltXmlValue("SDLT_PropertyAreaSize")
    protected String propertyAreaSize;
    @SdltXmlValue("SDLT_PropertyPlanAttachedYesNo")
    protected Boolean propertyPlanAttached;
    @SdltXmlValue("SDLT_TotalNumberOfVendors")
    protected Integer numberOfVendors;
    @SdltXmlValue("SDLT_Vendor1Title")
    protected String vendor1Title;
    @SdltXmlValue("SDLT_Vendor1Surname")
    protected String vendor1Surname;
    @SdltXmlValue("SDLT_Vendor1FirstName1")
    protected String vendor1FirstName;
    @SdltXmlValue("SDLT_Vendor1FirstName2")
    protected String vendor1SecondName;
    @SdltXmlValue("SDLT_Vendor1AddressPostcode")
    protected String vendor1AddressPostcode;
    @SdltXmlValue("SDLT_Vendor1AddressBuildingNo")
    protected String vendor1AddressProperty;
    @SdltXmlValue("SDLT_Vendor1Address1")
    protected String vendor1Address1;
    @SdltXmlValue("SDLT_Vendor1Address2")
    protected String vendor1Address2;
    @SdltXmlValue("SDLT_Vendor1Address3")
    protected String vendor1Address3;
    @SdltXmlValue("SDLT_Vendor1Address4")
    protected String vendor1Address4;
    @SdltXmlValue("SDLT_Vendor2Title")
    protected String vendor2Title;
    @SdltXmlValue("SDLT_Vendor2Surname")
    protected String vendor2Surname;
    @SdltXmlValue("SDLT_Vendor2FirstName1")
    protected String vendor2FirstName;
    @SdltXmlValue("SDLT_Vendor2FirstName2")
    protected String vendor2SecondName;
    @SdltXmlValue("SDLT_Vender2AddressSameYesNo")
    protected Boolean vendor2SameAddress;
    @SdltXmlValue("SDLT_Vendor2AddressPostcode")
    protected String vendor2AddressPostcode;
    @SdltXmlValue("SDLT_Vendor2AddressBuildingNo")
    protected String vendor2AddressProperty;
    @SdltXmlValue("SDLT_Vendor2Address1")
    protected String vendor2Address1;
    @SdltXmlValue("SDLT_Vendor2Address2")
    protected String vendor2Address2;
    @SdltXmlValue("SDLT_Vendor2Address3")
    protected String vendor2Address3;
    @SdltXmlValue("SDLT_Vendor2Address4")
    protected String vendor2Address4;
    @SdltXmlValue("SDLT_VendorsAgentFirmName")
    protected String vendorsAgentFirmName;
    @SdltXmlValue("SDLT_VendorsAgentAddressPostcode")
    protected String vendorsAgentPostcode;
    @SdltXmlValue("SDLT_VendorsAgentAddressBuildingNo")
    protected String vendorsAgentProperty;
    @SdltXmlValue("SDLT_VendorsAgentAddress1")
    protected String vendorsAgentAddress1;
    @SdltXmlValue("SDLT_VendorsAgentAddress2")
    protected String vendorsAgentAddress2;
    @SdltXmlValue("SDLT_VendorsAgentAddress3")
    protected String vendorsAgentAddress3;
    @SdltXmlValue("SDLT_VendorsAgentAddress4")
    protected String vendorsAgentAddress4;
    @SdltXmlValue("SDLT_VendorsAgentDXNo")
    protected String vendorsAgentDxNo;
    @SdltXmlValue("SDLT_VendorsAgentDXExchange")
    protected String vendorsAgentDxExchange;
    @SdltXmlValue("SDLT_VendorsAgentEmail")
    protected String vendorsAgentEmail;
    @SdltXmlValue("SDLT_VendorsAgentReference")
    protected String vendorsAgentReference;
    @SdltXmlValue("SDLT_VendorsAgentTelNo")
    protected String vendorsAgentTelNumber;
    @SdltXmlValue("SDLT_Purchaser1NINumber")
    protected String purchaser1NINumber;
    @SdltXmlValue("SDLT_Purchaser1DoB")
    protected LocalDate purchaser1DoB;
    @SdltXmlValue("SDLT_Purchaser1VATRegNo")
    protected String purchaser1VatRegNumber;
    @SdltXmlValue("SDLT_Purchaser1TaxRef")
    protected String purchaser1TaxRef;
    @SdltXmlValue("SDLT_Purchaser1CompanyNumber")
    protected String purchaser1CompanyNumber;
    @SdltXmlValue("SDLT_Purchaser1PlaceOfIssue")
    protected String purchaser1PlaceOfIssue;
    @SdltXmlValue("SDLT_TotalNumberOfPurchasers")
    protected Integer totalNumberOfPurchasers;
    @SdltXmlValue("SDLT_Purchaser1Title")
    protected String purchaser1Title;
    @SdltXmlValue("SDLT_Purchaser1Surname")
    protected String purchaser1Surname;
    @SdltXmlValue("SDLT_Purchaser1FirstName1")
    protected String purchaser1FirstName1;
    @SdltXmlValue("SDLT_Purchaser1FirstName2")
    protected String purchaser1FirstName2;
    @SdltXmlValue("SDLT_Purchaser1AddressSameQ28YesNo")
    protected Boolean purchaser1AddressSame;
    @SdltXmlValue("SDLT_Purchaser1AddressPostcode")
    protected String purchaser1AddressPostcode;
    @SdltXmlValue("SDLT_Purchaser1AddressBuildingNo")
    protected String purchaser1AddressProperty;
    @SdltXmlValue("SDLT_Purchaser1Address1")
    protected String purchaser1Address1;
    @SdltXmlValue("SDLT_Purchaser1Address2")
    protected String purchaser1Address2;
    @SdltXmlValue("SDLT_Purchaser1Address3")
    protected String purchaser1Address3;
    @SdltXmlValue("SDLT_Purchaser1Address4")
    protected String purchaser1Address4;
    @SdltXmlValue("SDLT_Purchaser1ActingAsTrusteeYesNo")
    protected Boolean purchase1ActingAsTrustee;
    @SdltXmlValue("SDLT_Purchaser1TelNo")
    protected String purchaser1Telephone;
    @SdltXmlValue("SDLT_PurchaserVendorConnectedYesNo")
    protected Boolean purchaserVendorConnected;
    @SdltXmlValue("SDLT_Purchaser1CorrespondenceToYesNo")
    protected Boolean purchaser1CorrespondenceTo;
    @SdltXmlValue("SDLT_PurchaserAgentFirmName")
    protected String purchaserAgentFirm;
    @SdltXmlValue("SDLT_PurchaserAgentAddressPostcode")
    protected String purchaserAgentAddressPostcode;
    @SdltXmlValue("SDLT_PurchaserAgentAddressBuildingNo")
    protected String purchaserAgentAddressProperty;
    @SdltXmlValue("SDLT_PurchaserAgentAddress1")
    protected String purchaserAgentAddress1;
    @SdltXmlValue("SDLT_PurchaserAgentAddress2")
    protected String purchaserAgentAddress2;
    @SdltXmlValue("SDLT_PurchaserAgentAddress3")
    protected String purchaserAgentAddress3;
    @SdltXmlValue("SDLT_PurchaserAgentAddress4")
    protected String purchaserAgentAddress4;
    @SdltXmlValue("SDLT_PurchaserAgentDXNo")
    protected String purchaserAgentDxNo;
    @SdltXmlValue("SDLT_PurchaserAgentDXExchange")
    protected String purchaserAgentDxExchange;
    @SdltXmlValue("SDLT_PurchaserAgentReference")
    protected String purchaserAgentReference;
    @SdltXmlValue("SDLT_PurchaserAgentTelNo")
    protected String purchaserAgentTel;
    @SdltXmlValue("SDLT_PurchaserAgentEmail")
    protected String purchaserAgentEmail;
    @SdltXmlValue("SDLT_Purchaser2Title")
    protected String purchaser2Title;
    @SdltXmlValue("SDLT_Purchaser2Surname")
    protected String purchaser2Surname;
    @SdltXmlValue("SDLT_Purchaser2FirstName1")
    protected String purchaser2FirstName1;
    @SdltXmlValue("SDLT_Purchaser2FirstName2")
    protected String purchaser2FirstName2;
    @SdltXmlValue("SDLT_Purchaser2AddressSameYesNo")
    protected Boolean purchaser2AddressSame;
    @SdltXmlValue("SDLT_Purchaser2AddressPostcode")
    protected String purchaser2AddressPostcode;
    @SdltXmlValue("SDLT_Purchaser2AddressBuildingNo")
    protected String purchaser2AddressProperty;
    @SdltXmlValue("SDLT_Purchaser2Address1")
    protected String purchaser2Address1;
    @SdltXmlValue("SDLT_Purchaser2Address2")
    protected String purchaser2Address2;
    @SdltXmlValue("SDLT_Purchaser2Address3")
    protected String purchaser2Address3;
    @SdltXmlValue("SDLT_Purchaser2Address4")
    protected String purchaser2Address4;
    @SdltXmlValue("SDLT_Purchaser2ActingAsTrusteeYesNo")
    protected Boolean purchaser2ActingAsTrustee;
    @SdltXmlValue("LTT_Purchaser1Certificate")
    protected String purchaser1Certificate;
    @SdltXmlValue("SDLT2")
    protected List<Sdlt2> sdlt2s = new ArrayList<>();
    @SdltXmlValue("SDLT3")
    protected List<Sdlt3> sdlt3s = new ArrayList<>();
    @SdltXmlValue("SDLT4")
    protected List<Sdlt4> sdlt4s = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(String userNotes) {
        this.userNotes = userNotes;
    }

    public Boolean getFirstTimeBuyer() {
        return firstTimeBuyer;
    }

    public void setFirstTimeBuyer(Boolean firstTimeBuyer) {
        this.firstTimeBuyer = firstTimeBuyer;
    }

    public Boolean getClosedOff() {
        return closedOff;
    }

    public void setClosedOff(Boolean closedOff) {
        this.closedOff = closedOff;
    }

    public Boolean getStampDutyPaid() {
        return stampDutyPaid;
    }

    public void setStampDutyPaid(Boolean stampDutyPaid) {
        this.stampDutyPaid = stampDutyPaid;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public TransactionDescriptionType getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(TransactionDescriptionType transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public InterestCreatedType getInterestCreated() {
        return interestCreated;
    }

    public void setInterestCreated(InterestCreatedType interestCreated) {
        this.interestCreated = interestCreated;
    }

    public String getInterestCreatedDetailed() {
        return interestCreatedDetailed;
    }

    public void setInterestCreatedDetailed(String interestCreatedDetailed) {
        this.interestCreatedDetailed = interestCreatedDetailed;
    }

    public LocalDate getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public Boolean getAnyRestrictions() {
        return anyRestrictions;
    }

    public void setAnyRestrictions(Boolean anyRestrictions) {
        this.anyRestrictions = anyRestrictions;
    }

    public String getRestrictionDetails() {
        return restrictionDetails;
    }

    public void setRestrictionDetails(String restrictionDetails) {
        this.restrictionDetails = restrictionDetails;
    }

    public LocalDate getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(LocalDate dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public Boolean getAnyLandExchanged() {
        return anyLandExchanged;
    }

    public void setAnyLandExchanged(Boolean anyLandExchanged) {
        this.anyLandExchanged = anyLandExchanged;
    }

    public String getExchangedPostcode() {
        return exchangedPostcode;
    }

    public void setExchangedPostcode(String exchangedPostcode) {
        this.exchangedPostcode = exchangedPostcode;
    }

    public String getExchangedProperty() {
        return exchangedProperty;
    }

    public void setExchangedProperty(String exchangedProperty) {
        this.exchangedProperty = exchangedProperty;
    }

    public String getExchangedAddress1() {
        return exchangedAddress1;
    }

    public void setExchangedAddress1(String exchangedAddress1) {
        this.exchangedAddress1 = exchangedAddress1;
    }

    public String getExchangedAddress2() {
        return exchangedAddress2;
    }

    public void setExchangedAddress2(String exchangedAddress2) {
        this.exchangedAddress2 = exchangedAddress2;
    }

    public String getExchangedAddress3() {
        return exchangedAddress3;
    }

    public void setExchangedAddress3(String exchangedAddress3) {
        this.exchangedAddress3 = exchangedAddress3;
    }

    public String getExchangedAddress4() {
        return exchangedAddress4;
    }

    public void setExchangedAddress4(String exchangedAddress4) {
        this.exchangedAddress4 = exchangedAddress4;
    }

    public Boolean getPursantToPreviousAgreement() {
        return pursantToPreviousAgreement;
    }

    public void setPursantToPreviousAgreement(Boolean pursantToPreviousAgreement) {
        this.pursantToPreviousAgreement = pursantToPreviousAgreement;
    }

    public Boolean getClaimingTaxRelief() {
        return claimingTaxRelief;
    }

    public void setClaimingTaxRelief(Boolean claimingTaxRelief) {
        this.claimingTaxRelief = claimingTaxRelief;
    }

    public TaxReliefType getTaxReliefReason() {
        return taxReliefReason;
    }

    public void setTaxReliefReason(TaxReliefType taxReliefReason) {
        this.taxReliefReason = taxReliefReason;
    }

    public String getTaxReliefCharityNumber() {
        return taxReliefCharityNumber;
    }

    public void setTaxReliefCharityNumber(String taxReliefCharityNumber) {
        this.taxReliefCharityNumber = taxReliefCharityNumber;
    }

    public BigDecimal getTaxReliefAmount() {
        return taxReliefAmount;
    }

    public void setTaxReliefAmount(BigDecimal taxReliefAmount) {
        this.taxReliefAmount = taxReliefAmount;
    }

    public BigDecimal getTotalConsiderationIncVat() {
        return totalConsiderationIncVat;
    }

    public void setTotalConsiderationIncVat(BigDecimal totalConsiderationIncVat) {
        this.totalConsiderationIncVat = totalConsiderationIncVat;
    }

    public PurchaserType getPurchaserTypeCode() {
        return purchaserTypeCode;
    }

    public void setPurchaserTypeCode(PurchaserType purchaserTypeCode) {
        this.purchaserTypeCode = purchaserTypeCode;
    }

    public BigDecimal getTotalConsiderationVat() {
        return totalConsiderationVat;
    }

    public void setTotalConsiderationVat(BigDecimal totalConsiderationVat) {
        this.totalConsiderationVat = totalConsiderationVat;
    }

    public ConsiderationType getConsiderationFormCode1() {
        return considerationFormCode1;
    }

    public void setConsiderationFormCode1(ConsiderationType considerationFormCode1) {
        this.considerationFormCode1 = considerationFormCode1;
    }

    public ConsiderationType getConsiderationFormCode2() {
        return considerationFormCode2;
    }

    public void setConsiderationFormCode2(ConsiderationType considerationFormCode2) {
        this.considerationFormCode2 = considerationFormCode2;
    }

    public ConsiderationType getConsiderationFormCode3() {
        return considerationFormCode3;
    }

    public void setConsiderationFormCode3(ConsiderationType considerationFormCode3) {
        this.considerationFormCode3 = considerationFormCode3;
    }

    public ConsiderationType getConsiderationFormCode4() {
        return considerationFormCode4;
    }

    public void setConsiderationFormCode4(ConsiderationType considerationFormCode4) {
        this.considerationFormCode4 = considerationFormCode4;
    }

    public Boolean getTransactionLinked() {
        return transactionLinked;
    }

    public void setTransactionLinked(Boolean transactionLinked) {
        this.transactionLinked = transactionLinked;
    }

    public BigDecimal getTotalLinkedConsiderationIncVat() {
        return totalLinkedConsiderationIncVat;
    }

    public void setTotalLinkedConsiderationIncVat(BigDecimal totalLinkedConsiderationIncVat) {
        this.totalLinkedConsiderationIncVat = totalLinkedConsiderationIncVat;
    }

    public BigDecimal getTotalTaxDue() {
        return totalTaxDue;
    }

    public void setTotalTaxDue(BigDecimal totalTaxDue) {
        this.totalTaxDue = totalTaxDue;
    }

    public BigDecimal getTotalTaxPaid() {
        return totalTaxPaid;
    }

    public void setTotalTaxPaid(BigDecimal totalTaxPaid) {
        this.totalTaxPaid = totalTaxPaid;
    }

    public Boolean getTotalTaxPaidIncPenalty() {
        return totalTaxPaidIncPenalty;
    }

    public void setTotalTaxPaidIncPenalty(Boolean totalTaxPaidIncPenalty) {
        this.totalTaxPaidIncPenalty = totalTaxPaidIncPenalty;
    }

    public String getLeaseTypeCode() {
        return leaseTypeCode;
    }

    public void setLeaseTypeCode(String leaseTypeCode) {
        this.leaseTypeCode = leaseTypeCode;
    }

    public LocalDate getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(LocalDate leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public LocalDate getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(LocalDate leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public String getRentFreePeriod() {
        return rentFreePeriod;
    }

    public void setRentFreePeriod(String rentFreePeriod) {
        this.rentFreePeriod = rentFreePeriod;
    }

    public BigDecimal getTotalAnnualRentIncVat() {
        return totalAnnualRentIncVat;
    }

    public void setTotalAnnualRentIncVat(BigDecimal totalAnnualRentIncVat) {
        this.totalAnnualRentIncVat = totalAnnualRentIncVat;
    }

    public LocalDate getEndDateForStartingRent() {
        return endDateForStartingRent;
    }

    public void setEndDateForStartingRent(LocalDate endDateForStartingRent) {
        this.endDateForStartingRent = endDateForStartingRent;
    }

    public Boolean getLaterRentKnown() {
        return laterRentKnown;
    }

    public void setLaterRentKnown(Boolean laterRentKnown) {
        this.laterRentKnown = laterRentKnown;
    }

    public BigDecimal getLeaseAmountVat() {
        return leaseAmountVat;
    }

    public void setLeaseAmountVat(BigDecimal leaseAmountVat) {
        this.leaseAmountVat = leaseAmountVat;
    }

    public BigDecimal getTotalLeasePremiumPayable() {
        return totalLeasePremiumPayable;
    }

    public void setTotalLeasePremiumPayable(BigDecimal totalLeasePremiumPayable) {
        this.totalLeasePremiumPayable = totalLeasePremiumPayable;
    }

    public BigDecimal getNetPresentValue() {
        return netPresentValue;
    }

    public void setNetPresentValue(BigDecimal netPresentValue) {
        this.netPresentValue = netPresentValue;
    }

    public BigDecimal getTotalLeasePremiumTaxPayable() {
        return totalLeasePremiumTaxPayable;
    }

    public void setTotalLeasePremiumTaxPayable(BigDecimal totalLeasePremiumTaxPayable) {
        this.totalLeasePremiumTaxPayable = totalLeasePremiumTaxPayable;
    }

    public BigDecimal getTotalLeaseNpvTaxPayable() {
        return totalLeaseNpvTaxPayable;
    }

    public void setTotalLeaseNpvTaxPayable(BigDecimal totalLeaseNpvTaxPayable) {
        this.totalLeaseNpvTaxPayable = totalLeaseNpvTaxPayable;
    }

    public Integer getNumberOfPropertiesIncluded() {
        return numberOfPropertiesIncluded;
    }

    public void setNumberOfPropertiesIncluded(Integer numberOfPropertiesIncluded) {
        this.numberOfPropertiesIncluded = numberOfPropertiesIncluded;
    }

    public String getPropertyPostcode() {
        return propertyPostcode;
    }

    public void setPropertyPostcode(String propertyPostcode) {
        this.propertyPostcode = propertyPostcode;
    }

    public String getPropertyProperty() {
        return propertyProperty;
    }

    public void setPropertyProperty(String propertyProperty) {
        this.propertyProperty = propertyProperty;
    }

    public String getPropertyAddress1() {
        return propertyAddress1;
    }

    public void setPropertyAddress1(String propertyAddress1) {
        this.propertyAddress1 = propertyAddress1;
    }

    public String getPropertyAddress2() {
        return propertyAddress2;
    }

    public void setPropertyAddress2(String propertyAddress2) {
        this.propertyAddress2 = propertyAddress2;
    }

    public String getPropertyAddress3() {
        return propertyAddress3;
    }

    public void setPropertyAddress3(String propertyAddress3) {
        this.propertyAddress3 = propertyAddress3;
    }

    public String getPropertyAddress4() {
        return propertyAddress4;
    }

    public void setPropertyAddress4(String propertyAddress4) {
        this.propertyAddress4 = propertyAddress4;
    }

    public LocalAuthority getLocalAuthorityCode() {
        return localAuthorityCode;
    }

    public void setLocalAuthorityCode(LocalAuthority localAuthorityCode) {
        this.localAuthorityCode = localAuthorityCode;
    }

    public String getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(String titleNumber) {
        this.titleNumber = titleNumber;
    }

    public String getPropertyNlpgUprn() {
        return propertyNlpgUprn;
    }

    public void setPropertyNlpgUprn(String propertyNlpgUprn) {
        this.propertyNlpgUprn = propertyNlpgUprn;
    }

    public String getPropertyUnitsHectareMetres() {
        return propertyUnitsHectareMetres;
    }

    public void setPropertyUnitsHectareMetres(String propertyUnitsHectareMetres) {
        this.propertyUnitsHectareMetres = propertyUnitsHectareMetres;
    }

    public String getPropertyAreaSize() {
        return propertyAreaSize;
    }

    public void setPropertyAreaSize(String propertyAreaSize) {
        this.propertyAreaSize = propertyAreaSize;
    }

    public Boolean getPropertyPlanAttached() {
        return propertyPlanAttached;
    }

    public void setPropertyPlanAttached(Boolean propertyPlanAttached) {
        this.propertyPlanAttached = propertyPlanAttached;
    }

    public Integer getNumberOfVendors() {
        return numberOfVendors;
    }

    public void setNumberOfVendors(Integer numberOfVendors) {
        this.numberOfVendors = numberOfVendors;
    }

    public String getVendor1Title() {
        return vendor1Title;
    }

    public void setVendor1Title(String vendor1Title) {
        this.vendor1Title = vendor1Title;
    }

    public String getVendor1Surname() {
        return vendor1Surname;
    }

    public void setVendor1Surname(String vendor1Surname) {
        this.vendor1Surname = vendor1Surname;
    }

    public String getVendor1FirstName() {
        return vendor1FirstName;
    }

    public void setVendor1FirstName(String vendor1FirstName) {
        this.vendor1FirstName = vendor1FirstName;
    }

    public String getVendor1SecondName() {
        return vendor1SecondName;
    }

    public void setVendor1SecondName(String vendor1SecondName) {
        this.vendor1SecondName = vendor1SecondName;
    }

    public String getVendor1AddressPostcode() {
        return vendor1AddressPostcode;
    }

    public void setVendor1AddressPostcode(String vendor1AddressPostcode) {
        this.vendor1AddressPostcode = vendor1AddressPostcode;
    }

    public String getVendor1AddressProperty() {
        return vendor1AddressProperty;
    }

    public void setVendor1AddressProperty(String vendor1AddressProperty) {
        this.vendor1AddressProperty = vendor1AddressProperty;
    }

    public String getVendor1Address1() {
        return vendor1Address1;
    }

    public void setVendor1Address1(String vendor1Address1) {
        this.vendor1Address1 = vendor1Address1;
    }

    public String getVendor1Address2() {
        return vendor1Address2;
    }

    public void setVendor1Address2(String vendor1Address2) {
        this.vendor1Address2 = vendor1Address2;
    }

    public String getVendor1Address3() {
        return vendor1Address3;
    }

    public void setVendor1Address3(String vendor1Address3) {
        this.vendor1Address3 = vendor1Address3;
    }

    public String getVendor1Address4() {
        return vendor1Address4;
    }

    public void setVendor1Address4(String vendor1Address4) {
        this.vendor1Address4 = vendor1Address4;
    }

    public String getVendor2Title() {
        return vendor2Title;
    }

    public void setVendor2Title(String vendor2Title) {
        this.vendor2Title = vendor2Title;
    }

    public String getVendor2Surname() {
        return vendor2Surname;
    }

    public void setVendor2Surname(String vendor2Surname) {
        this.vendor2Surname = vendor2Surname;
    }

    public String getVendor2FirstName() {
        return vendor2FirstName;
    }

    public void setVendor2FirstName(String vendor2FirstName) {
        this.vendor2FirstName = vendor2FirstName;
    }

    public String getVendor2SecondName() {
        return vendor2SecondName;
    }

    public void setVendor2SecondName(String vendor2SecondName) {
        this.vendor2SecondName = vendor2SecondName;
    }

    public Boolean getVendor2SameAddress() {
        return vendor2SameAddress;
    }

    public void setVendor2SameAddress(Boolean vendor2SameAddress) {
        this.vendor2SameAddress = vendor2SameAddress;
    }

    public String getVendor2AddressPostcode() {
        return vendor2AddressPostcode;
    }

    public void setVendor2AddressPostcode(String vendor2AddressPostcode) {
        this.vendor2AddressPostcode = vendor2AddressPostcode;
    }

    public String getVendor2AddressProperty() {
        return vendor2AddressProperty;
    }

    public void setVendor2AddressProperty(String vendor2AddressProperty) {
        this.vendor2AddressProperty = vendor2AddressProperty;
    }

    public String getVendor2Address1() {
        return vendor2Address1;
    }

    public void setVendor2Address1(String vendor2Address1) {
        this.vendor2Address1 = vendor2Address1;
    }

    public String getVendor2Address2() {
        return vendor2Address2;
    }

    public void setVendor2Address2(String vendor2Address2) {
        this.vendor2Address2 = vendor2Address2;
    }

    public String getVendor2Address3() {
        return vendor2Address3;
    }

    public void setVendor2Address3(String vendor2Address3) {
        this.vendor2Address3 = vendor2Address3;
    }

    public String getVendor2Address4() {
        return vendor2Address4;
    }

    public void setVendor2Address4(String vendor2Address4) {
        this.vendor2Address4 = vendor2Address4;
    }

    public String getVendorsAgentFirmName() {
        return vendorsAgentFirmName;
    }

    public void setVendorsAgentFirmName(String vendorsAgentFirmName) {
        this.vendorsAgentFirmName = vendorsAgentFirmName;
    }

    public String getVendorsAgentPostcode() {
        return vendorsAgentPostcode;
    }

    public void setVendorsAgentPostcode(String vendorsAgentPostcode) {
        this.vendorsAgentPostcode = vendorsAgentPostcode;
    }

    public String getVendorsAgentProperty() {
        return vendorsAgentProperty;
    }

    public void setVendorsAgentProperty(String vendorsAgentProperty) {
        this.vendorsAgentProperty = vendorsAgentProperty;
    }

    public String getVendorsAgentAddress1() {
        return vendorsAgentAddress1;
    }

    public void setVendorsAgentAddress1(String vendorsAgentAddress1) {
        this.vendorsAgentAddress1 = vendorsAgentAddress1;
    }

    public String getVendorsAgentAddress2() {
        return vendorsAgentAddress2;
    }

    public void setVendorsAgentAddress2(String vendorsAgentAddress2) {
        this.vendorsAgentAddress2 = vendorsAgentAddress2;
    }

    public String getVendorsAgentAddress3() {
        return vendorsAgentAddress3;
    }

    public void setVendorsAgentAddress3(String vendorsAgentAddress3) {
        this.vendorsAgentAddress3 = vendorsAgentAddress3;
    }

    public String getVendorsAgentAddress4() {
        return vendorsAgentAddress4;
    }

    public void setVendorsAgentAddress4(String vendorsAgentAddress4) {
        this.vendorsAgentAddress4 = vendorsAgentAddress4;
    }

    public String getVendorsAgentEmail() {
        return vendorsAgentEmail;
    }

    public void setVendorsAgentEmail(String vendorsAgentEmail) {
        this.vendorsAgentEmail = vendorsAgentEmail;
    }

    public String getVendorsAgentReference() {
        return vendorsAgentReference;
    }

    public void setVendorsAgentReference(String vendorsAgentReference) {
        this.vendorsAgentReference = vendorsAgentReference;
    }

    public String getVendorsAgentTelNumber() {
        return vendorsAgentTelNumber;
    }

    public void setVendorsAgentTelNumber(String vendorsAgentTelNumber) {
        this.vendorsAgentTelNumber = vendorsAgentTelNumber;
    }

    public String getPurchaser1NINumber() {
        return purchaser1NINumber;
    }

    public void setPurchaser1NINumber(String purchaser1NINumber) {
        this.purchaser1NINumber = purchaser1NINumber;
    }

    public String getPurchaser1VatRegNumber() {
        return purchaser1VatRegNumber;
    }

    public void setPurchaser1VatRegNumber(String purchaser1VatRegNumber) {
        this.purchaser1VatRegNumber = purchaser1VatRegNumber;
    }

    public String getPurchaser1TaxRef() {
        return purchaser1TaxRef;
    }

    public void setPurchaser1TaxRef(String purchaser1TaxRef) {
        this.purchaser1TaxRef = purchaser1TaxRef;
    }

    public String getPurchaser1CompanyNumber() {
        return purchaser1CompanyNumber;
    }

    public void setPurchaser1CompanyNumber(String purchaser1CompanyNumber) {
        this.purchaser1CompanyNumber = purchaser1CompanyNumber;
    }

    public String getPurchaser1PlaceOfIssue() {
        return purchaser1PlaceOfIssue;
    }

    public void setPurchaser1PlaceOfIssue(String purchaser1PlaceOfIssue) {
        this.purchaser1PlaceOfIssue = purchaser1PlaceOfIssue;
    }

    public Integer getTotalNumberOfPurchasers() {
        return totalNumberOfPurchasers;
    }

    public void setTotalNumberOfPurchasers(Integer totalNumberOfPurchasers) {
        this.totalNumberOfPurchasers = totalNumberOfPurchasers;
    }

    public String getPurchaser1Title() {
        return purchaser1Title;
    }

    public void setPurchaser1Title(String purchaser1Title) {
        this.purchaser1Title = purchaser1Title;
    }

    public String getPurchaser1Surname() {
        return purchaser1Surname;
    }

    public void setPurchaser1Surname(String purchaser1Surname) {
        this.purchaser1Surname = purchaser1Surname;
    }

    public String getPurchaser1FirstName1() {
        return purchaser1FirstName1;
    }

    public void setPurchaser1FirstName1(String purchaser1FirstName1) {
        this.purchaser1FirstName1 = purchaser1FirstName1;
    }

    public String getPurchaser1FirstName2() {
        return purchaser1FirstName2;
    }

    public void setPurchaser1FirstName2(String purchaser1FirstName2) {
        this.purchaser1FirstName2 = purchaser1FirstName2;
    }

    public Boolean getPurchaser1AddressSame() {
        return purchaser1AddressSame;
    }

    public void setPurchaser1AddressSame(Boolean purchaser1AddressSame) {
        this.purchaser1AddressSame = purchaser1AddressSame;
    }

    public String getPurchaser1AddressPostcode() {
        return purchaser1AddressPostcode;
    }

    public void setPurchaser1AddressPostcode(String purchaser1AddressPostcode) {
        this.purchaser1AddressPostcode = purchaser1AddressPostcode;
    }

    public String getPurchaser1AddressProperty() {
        return purchaser1AddressProperty;
    }

    public void setPurchaser1AddressProperty(String purchaser1AddressProperty) {
        this.purchaser1AddressProperty = purchaser1AddressProperty;
    }

    public String getPurchaser1Address1() {
        return purchaser1Address1;
    }

    public void setPurchaser1Address1(String purchaser1Address1) {
        this.purchaser1Address1 = purchaser1Address1;
    }

    public String getPurchaser1Address2() {
        return purchaser1Address2;
    }

    public void setPurchaser1Address2(String purchaser1Address2) {
        this.purchaser1Address2 = purchaser1Address2;
    }

    public String getPurchaser1Address3() {
        return purchaser1Address3;
    }

    public void setPurchaser1Address3(String purchaser1Address3) {
        this.purchaser1Address3 = purchaser1Address3;
    }

    public String getPurchaser1Address4() {
        return purchaser1Address4;
    }

    public void setPurchaser1Address4(String purchaser1Address4) {
        this.purchaser1Address4 = purchaser1Address4;
    }

    public Boolean getPurchase1ActingAsTrustee() {
        return purchase1ActingAsTrustee;
    }

    public void setPurchase1ActingAsTrustee(Boolean purchase1ActingAsTrustee) {
        this.purchase1ActingAsTrustee = purchase1ActingAsTrustee;
    }

    public String getPurchaser1Telephone() {
        return purchaser1Telephone;
    }

    public void setPurchaser1Telephone(String purchaser1Telephone) {
        this.purchaser1Telephone = purchaser1Telephone;
    }

    public Boolean getPurchaserVendorConnected() {
        return purchaserVendorConnected;
    }

    public void setPurchaserVendorConnected(Boolean purchaserVendorConnected) {
        this.purchaserVendorConnected = purchaserVendorConnected;
    }

    public Boolean getPurchaser1CorrespondenceTo() {
        return purchaser1CorrespondenceTo;
    }

    public void setPurchaser1CorrespondenceTo(Boolean purchaser1CorrespondenceTo) {
        this.purchaser1CorrespondenceTo = purchaser1CorrespondenceTo;
    }

    public String getPurchaserAgentFirm() {
        return purchaserAgentFirm;
    }

    public void setPurchaserAgentFirm(String purchaserAgentFirm) {
        this.purchaserAgentFirm = purchaserAgentFirm;
    }

    public String getPurchaserAgentAddressPostcode() {
        return purchaserAgentAddressPostcode;
    }

    public void setPurchaserAgentAddressPostcode(String purchaserAgentAddressPostcode) {
        this.purchaserAgentAddressPostcode = purchaserAgentAddressPostcode;
    }

    public String getPurchaserAgentAddressProperty() {
        return purchaserAgentAddressProperty;
    }

    public void setPurchaserAgentAddressProperty(String purchaserAgentAddressProperty) {
        this.purchaserAgentAddressProperty = purchaserAgentAddressProperty;
    }

    public String getPurchaserAgentAddress1() {
        return purchaserAgentAddress1;
    }

    public void setPurchaserAgentAddress1(String purchaserAgentAddress1) {
        this.purchaserAgentAddress1 = purchaserAgentAddress1;
    }

    public String getPurchaserAgentAddress2() {
        return purchaserAgentAddress2;
    }

    public void setPurchaserAgentAddress2(String purchaserAgentAddress2) {
        this.purchaserAgentAddress2 = purchaserAgentAddress2;
    }

    public String getPurchaserAgentAddress3() {
        return purchaserAgentAddress3;
    }

    public void setPurchaserAgentAddress3(String purchaserAgentAddress3) {
        this.purchaserAgentAddress3 = purchaserAgentAddress3;
    }

    public String getPurchaserAgentAddress4() {
        return purchaserAgentAddress4;
    }

    public void setPurchaserAgentAddress4(String purchaserAgentAddress4) {
        this.purchaserAgentAddress4 = purchaserAgentAddress4;
    }

    public String getPurchaserAgentReference() {
        return purchaserAgentReference;
    }

    public void setPurchaserAgentReference(String purchaserAgentReference) {
        this.purchaserAgentReference = purchaserAgentReference;
    }

    public String getPurchaserAgentTel() {
        return purchaserAgentTel;
    }

    public void setPurchaserAgentTel(String purchaserAgentTel) {
        this.purchaserAgentTel = purchaserAgentTel;
    }

    public String getPurchaserAgentEmail() {
        return purchaserAgentEmail;
    }

    public void setPurchaserAgentEmail(String purchaserAgentEmail) {
        this.purchaserAgentEmail = purchaserAgentEmail;
    }

    public String getPurchaser2Title() {
        return purchaser2Title;
    }

    public void setPurchaser2Title(String purchaser2Title) {
        this.purchaser2Title = purchaser2Title;
    }

    public String getPurchaser2Surname() {
        return purchaser2Surname;
    }

    public void setPurchaser2Surname(String purchaser2Surname) {
        this.purchaser2Surname = purchaser2Surname;
    }

    public String getPurchaser2FirstName1() {
        return purchaser2FirstName1;
    }

    public void setPurchaser2FirstName1(String purchaser2FirstName1) {
        this.purchaser2FirstName1 = purchaser2FirstName1;
    }

    public String getPurchaser2FirstName2() {
        return purchaser2FirstName2;
    }

    public void setPurchaser2FirstName2(String purchaser2FirstName2) {
        this.purchaser2FirstName2 = purchaser2FirstName2;
    }

    public Boolean getPurchaser2AddressSame() {
        return purchaser2AddressSame;
    }

    public void setPurchaser2AddressSame(Boolean purchaser2AddressSame) {
        this.purchaser2AddressSame = purchaser2AddressSame;
    }

    public String getPurchaser2AddressPostcode() {
        return purchaser2AddressPostcode;
    }

    public void setPurchaser2AddressPostcode(String purchaser2AddressPostcode) {
        this.purchaser2AddressPostcode = purchaser2AddressPostcode;
    }

    public String getPurchaser2AddressProperty() {
        return purchaser2AddressProperty;
    }

    public void setPurchaser2AddressProperty(String purchaser2AddressProperty) {
        this.purchaser2AddressProperty = purchaser2AddressProperty;
    }

    public String getPurchaser2Address1() {
        return purchaser2Address1;
    }

    public void setPurchaser2Address1(String purchaser2Address1) {
        this.purchaser2Address1 = purchaser2Address1;
    }

    public String getPurchaser2Address2() {
        return purchaser2Address2;
    }

    public void setPurchaser2Address2(String purchaser2Address2) {
        this.purchaser2Address2 = purchaser2Address2;
    }

    public String getPurchaser2Address3() {
        return purchaser2Address3;
    }

    public void setPurchaser2Address3(String purchaser2Address3) {
        this.purchaser2Address3 = purchaser2Address3;
    }

    public String getPurchaser2Address4() {
        return purchaser2Address4;
    }

    public void setPurchaser2Address4(String purchaser2Address4) {
        this.purchaser2Address4 = purchaser2Address4;
    }

    public Boolean getPurchaser2ActingAsTrustee() {
        return purchaser2ActingAsTrustee;
    }

    public void setPurchaser2ActingAsTrustee(Boolean purchaser2ActingAsTrustee) {
        this.purchaser2ActingAsTrustee = purchaser2ActingAsTrustee;
    }

    public String getVendorsAgentDxNo() {
        return vendorsAgentDxNo;
    }

    public void setVendorsAgentDxNo(String vendorsAgentDxNo) {
        this.vendorsAgentDxNo = vendorsAgentDxNo;
    }

    public String getVendorsAgentDxExchange() {
        return vendorsAgentDxExchange;
    }

    public void setVendorsAgentDxExchange(String vendorsAgentDxExchange) {
        this.vendorsAgentDxExchange = vendorsAgentDxExchange;
    }

    public List<Sdlt2> getSdlt2s() {
        return sdlt2s;
    }

    public void setSdlt2s(List<Sdlt2> sdlt2s) {
        this.sdlt2s = sdlt2s;
    }

    public List<Sdlt3> getSdlt3s() {
        return sdlt3s;
    }

    public void setSdlt3s(List<Sdlt3> sdlt3s) {
        this.sdlt3s = sdlt3s;
    }

    public List<Sdlt4> getSdlt4s() {
        return sdlt4s;
    }

    public void setSdlt4s(List<Sdlt4> sdlt4s) {
        this.sdlt4s = sdlt4s;
    }

    public LocalDate getPurchaser1DoB() {
        return purchaser1DoB;
    }

    public void setPurchaser1DoB(LocalDate purchaser1DoB) {
        this.purchaser1DoB = purchaser1DoB;
    }

    public String getPurchaserAgentDxNo() {
        return purchaserAgentDxNo;
    }

    public void setPurchaserAgentDxNo(String purchaserAgentDxNo) {
        this.purchaserAgentDxNo = purchaserAgentDxNo;
    }

    public String getPurchaserAgentDxExchange() {
        return purchaserAgentDxExchange;
    }

    public void setPurchaserAgentDxExchange(String purchaserAgentDxExchange) {
        this.purchaserAgentDxExchange = purchaserAgentDxExchange;
    }
    public void setPurchaser1Certificate(String purchaser1Certificate){
        this.purchaser1Certificate = purchaser1Certificate;
    }
    public String getPurchaser1Certificate(){
        return purchaser1Certificate;
    }
}
