
package com.ebay.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ebay.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoAuthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoAuthorizationResponse");
    private final static QName _SetAuthFlowParamResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamResponse");
    private final static QName _RefundInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RefundInfo");
    private final static QName _StoreOwner_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StoreOwner");
    private final static QName _StateOrProvince_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StateOrProvince");
    private final static QName _AddressVerifyRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "AddressVerifyRequest");
    private final static QName _Currency_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Currency");
    private final static QName _SetCustomerBillingAgreementRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetCustomerBillingAgreementRequestDetails");
    private final static QName _EnterBoardingRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "EnterBoardingRequest");
    private final static QName _ExecuteCheckoutOperationsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsResponseDetails");
    private final static QName _ManageRecurringPaymentsProfileStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusRequest");
    private final static QName _DoNonReferencedCreditRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditRequestDetails");
    private final static QName _GetBoardingDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsRequest");
    private final static QName _DoCancelRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoCancelRequest");
    private final static QName _GetMobileStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetMobileStatusRequest");
    private final static QName _ExecuteCheckoutOperationsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsRequest");
    private final static QName _BMGetButtonDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsResponse");
    private final static QName _RegistrationAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RegistrationAddress");
    private final static QName _BMButtonSearchRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMButtonSearchRequest");
    private final static QName _MerchantData_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "MerchantData");
    private final static QName _GetRecurringPaymentsProfileDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetRecurringPaymentsProfileDetailsResponseDetails");
    private final static QName _DoUATPExpressCheckoutPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentRequest");
    private final static QName _DoCaptureResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoCaptureResponse");
    private final static QName _CreateBillingAgreementRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementRequest");
    private final static QName _GetBillingAgreementCustomerDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsResponse");
    private final static QName _ManageRecurringPaymentsProfileStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusResponse");
    private final static QName _BillUserRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillUserRequest");
    private final static QName _BillOutstandingAmountResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountResponse");
    private final static QName _Transactions_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Transactions");
    private final static QName _ShippingInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingInfo");
    private final static QName _SellerPaymentAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentAddress");
    private final static QName _EnhancedData_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "EnhancedData");
    private final static QName _ExternalRememberMeOptOutRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutRequest");
    private final static QName _UpdateAccessPermissionsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsRequest");
    private final static QName _ShipToAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShipToAddress");
    private final static QName _EnhancedCompleteRecoupRequestDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupRequestDetails");
    private final static QName _ManageRecurringPaymentsProfileStatusResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusResponseDetails");
    private final static QName _ExecuteCheckoutOperationsRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsRequestDetails");
    private final static QName _DoMobileCheckoutPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentRequest");
    private final static QName _ShippingService_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingService");
    private final static QName _SetMobileCheckoutResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutResponse");
    private final static QName _OfferDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "OfferDetails");
    private final static QName _RefundItemDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RefundItemDetails");
    private final static QName _DoReauthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReauthorizationResponse");
    private final static QName _EnterBoardingResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "EnterBoardingResponse");
    private final static QName _GetAuthDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsRequest");
    private final static QName _DoExpressCheckoutPaymentResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentResponseDetails");
    private final static QName _UpdateRecurringPaymentsProfileResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileResponse");
    private final static QName _GetBoardingDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetBoardingDetailsResponseDetails");
    private final static QName _DoNonReferencedCreditResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditResponseDetails");
    private final static QName _BillOutstandingAmountRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountRequestDetails");
    private final static QName _EnhancedCompleteRecoupResponseDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupResponseDetails");
    private final static QName _CreateBillingAgreementResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementResponse");
    private final static QName _GetIncentiveEvaluationResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationResponseDetails");
    private final static QName _GetRecurringPaymentsProfileDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsRequest");
    private final static QName _TaxInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "TaxInfo");
    private final static QName _GetAccessPermissionDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsRequest");
    private final static QName _CategoryArray_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CategoryArray");
    private final static QName _MerchantStoreDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "MerchantStoreDetails");
    private final static QName _MerchantDataMap_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "MerchantDataMap");
    private final static QName _AccountSummary_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AccountSummary");
    private final static QName _CreateRecurringPaymentsProfileResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileResponse");
    private final static QName _CreateRecurringPaymentsProfileRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileRequestDetails");
    private final static QName _TransactionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "TransactionID");
    private final static QName _BMSetInventoryResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMSetInventoryResponse");
    private final static QName _DoReferenceTransactionResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionResponseDetails");
    private final static QName _ReceiptID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReceiptID");
    private final static QName _BillOutstandingAmountResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountResponseDetails");
    private final static QName _PaymentTransactionDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionDetails");
    private final static QName _TransactionSearchResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "TransactionSearchResponse");
    private final static QName _BMButtonSearchResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMButtonSearchResponse");
    private final static QName _GetBoardingDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsResponse");
    private final static QName _UpdateAuthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationResponse");
    private final static QName _CheckoutEnabled_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CheckoutEnabled");
    private final static QName _BillOutstandingAmountRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountRequest");
    private final static QName _ExternalRememberMeOptOutResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutResponse");
    private final static QName _DoCancelResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoCancelResponse");
    private final static QName _GetAuthDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsResponse");
    private final static QName _DoReferenceTransactionResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionResponse");
    private final static QName _GetBillingAgreementCustomerDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsRequest");
    private final static QName _BMCreateButtonRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMCreateButtonRequest");
    private final static QName _UpdateRecurringPaymentsProfileResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileResponseDetails");
    private final static QName _DoVoidResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoVoidResponse");
    private final static QName _BMGetButtonDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsRequest");
    private final static QName _PaymentDetailsItem_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItem");
    private final static QName _SetExpressCheckoutRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutRequest");
    private final static QName _SetAuthFlowParamRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetAuthFlowParamRequestDetails");
    private final static QName _ManagePendingTransactionStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusResponse");
    private final static QName _GetMobileStatusRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetMobileStatusRequestDetails");
    private final static QName _BMUpdateButtonResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonResponse");
    private final static QName _GetAccessPermissionDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetAccessPermissionDetailsResponseDetails");
    private final static QName _StoreCategoryID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StoreCategoryID");
    private final static QName _DoUATPAuthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationRequest");
    private final static QName _BMManageButtonStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusResponse");
    private final static QName _BMGetInventoryResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetInventoryResponse");
    private final static QName _UpdateAuthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationRequest");
    private final static QName _GetRecurringPaymentsProfileDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsResponse");
    private final static QName _DoUATPAuthorizationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationResponse");
    private final static QName _SetCustomerBillingAgreementRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementRequest");
    private final static QName _ManagePendingTransactionStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusRequest");
    private final static QName _ItemTrackingDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ItemTrackingDetails");
    private final static QName _DoUATPExpressCheckoutPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentResponse");
    private final static QName _SetAuthFlowParamRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamRequest");
    private final static QName _CreateRecurringPaymentsProfileResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileResponseDetails");
    private final static QName _RegionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RegionID");
    private final static QName _UpdateRecurringPaymentsProfileRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileRequestDetails");
    private final static QName _GetAuthDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetAuthDetailsResponseDetails");
    private final static QName _PaymentMethods_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethods");
    private final static QName _BAUpdateResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BAUpdateResponse");
    private final static QName _AuthorizationInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfo");
    private final static QName _SellerLevel_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SellerLevel");
    private final static QName _GetIncentiveEvaluationResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationResponse");
    private final static QName _GetIncentiveEvaluationRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationRequestDetails");
    private final static QName _ReverseTransactionResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionResponseDetails");
    private final static QName _AddressVerifyResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "AddressVerifyResponse");
    private final static QName _AmountPaid_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AmountPaid");
    private final static QName _BMSetInventoryRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMSetInventoryRequest");
    private final static QName _GetPalDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetPalDetailsResponse");
    private final static QName _EnterBoardingRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "EnterBoardingRequestDetails");
    private final static QName _ListingDuration_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ListingDuration");
    private final static QName _CreateMobilePaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentResponse");
    private final static QName _RequesterCredentials_QNAME = new QName("urn:ebay:api:PayPalAPI", "RequesterCredentials");
    private final static QName _BillUserResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BillUserResponse");
    private final static QName _DoExpressCheckoutPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentResponse");
    private final static QName _SetMobileCheckoutRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetMobileCheckoutRequestDetails");
    private final static QName _User_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "User");
    private final static QName _CreateRecurringPaymentsProfileRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileRequest");
    private final static QName _UpdateRecurringPaymentsProfileRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileRequest");
    private final static QName _DoVoidRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoVoidRequest");
    private final static QName _DoMobileCheckoutPaymentResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoMobileCheckoutPaymentResponseDetails");
    private final static QName _AccountCode_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AccountCode");
    private final static QName _BMGetInventoryRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMGetInventoryRequest");
    private final static QName _SetAccessPermissionsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsResponse");
    private final static QName _CancelRecoupResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CancelRecoupResponse");
    private final static QName _UATPDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UATPDetails");
    private final static QName _ReviseStatus_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReviseStatus");
    private final static QName _InitiateRecoupResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "InitiateRecoupResponse");
    private final static QName _ShippingAddress_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingAddress");
    private final static QName _PaymentMeans_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentMeans");
    private final static QName _Item_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Item");
    private final static QName _GetExpressCheckoutDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsResponse");
    private final static QName _ReverseTransactionRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "ReverseTransactionRequest");
    private final static QName _MassPayResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "MassPayResponse");
    private final static QName _Country_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Country");
    private final static QName _ThreeDSecureRequest_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequest");
    private final static QName _MerchantPullPaymentDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentDetails");
    private final static QName _RefundTransactionResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "RefundTransactionResponse");
    private final static QName _Pagination_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Pagination");
    private final static QName _CreditCardInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreditCardInfo");
    private final static QName _GetExpressCheckoutDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetExpressCheckoutDetailsResponseDetails");
    private final static QName _ButtonSearchResult_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ButtonSearchResult");
    private final static QName _InsuranceFee_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "InsuranceFee");
    private final static QName _CompleteRecoupRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CompleteRecoupRequest");
    private final static QName _DoAuthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoAuthorizationRequest");
    private final static QName _GetIncentiveEvaluationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationRequest");
    private final static QName _PaginationResult_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaginationResult");
    private final static QName _CurrentBalance_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CurrentBalance");
    private final static QName _Email_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Email");
    private final static QName _CompleteRecoupResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "CompleteRecoupResponse");
    private final static QName _UserID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UserID");
    private final static QName _AirlineItinerary_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AirlineItinerary");
    private final static QName _DoDirectPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentRequest");
    private final static QName _EnhancedInitiateRecoupRequestDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedInitiateRecoupRequestDetails");
    private final static QName _ThreeDSecureDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureDetails");
    private final static QName _GetMobileStatusResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetMobileStatusResponse");
    private final static QName _PaymentTransactions_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactions");
    private final static QName _ManageRecurringPaymentsProfileStatusRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusRequestDetails");
    private final static QName _SetCustomerBillingAgreementResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementResponse");
    private final static QName _AuthorizationID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationID");
    private final static QName _StoreURL_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "StoreURL");
    private final static QName _DoCaptureResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoCaptureResponseDetails");
    private final static QName _SetAccessPermissionsRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetAccessPermissionsRequestDetails");
    private final static QName _GetBalanceResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBalanceResponse");
    private final static QName _DoNonReferencedCreditRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditRequest");
    private final static QName _ShippingDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetails");
    private final static QName _DoMobileCheckoutPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentResponse");
    private final static QName _SetAccessPermissionsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsRequest");
    private final static QName _SetMobileCheckoutRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutRequest");
    private final static QName _DoCaptureRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoCaptureRequest");
    private final static QName _SetExpressCheckoutResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutResponse");
    private final static QName _DoNonReferencedCreditResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditResponse");
    private final static QName _UUID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "UUID");
    private final static QName _CountryName_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CountryName");
    private final static QName _GetTransactionDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsRequest");
    private final static QName _BMUpdateButtonRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonRequest");
    private final static QName _OptionTrackingDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "OptionTrackingDetails");
    private final static QName _SellingStatus_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SellingStatus");
    private final static QName _ShippingTerm_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingTerm");
    private final static QName _ReverseTransactionRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionRequestDetails");
    private final static QName _BillUserResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillUserResponseDetails");
    private final static QName _Balance_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Balance");
    private final static QName _DoReferenceTransactionRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionRequest");
    private final static QName _TransactionSearchRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "TransactionSearchRequest");
    private final static QName _HighBidder_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "HighBidder");
    private final static QName _SubscriptionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SubscriptionID");
    private final static QName _ItemArray_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ItemArray");
    private final static QName _FeedbackScore_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "FeedbackScore");
    private final static QName _EbayTransactionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "EbayTransactionID");
    private final static QName _Seller_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Seller");
    private final static QName _GetTransactionDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsResponse");
    private final static QName _Site_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Site");
    private final static QName _GetBalanceRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetBalanceRequest");
    private final static QName _BMCreateButtonResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMCreateButtonResponse");
    private final static QName _RefundTransactionRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "RefundTransactionRequest");
    private final static QName _CreateMobilePaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentRequest");
    private final static QName _Buyer_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Buyer");
    private final static QName _BMManageButtonStatusRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusRequest");
    private final static QName _APIType_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "APIType");
    private final static QName _BAUpdateResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BAUpdateResponseDetails");
    private final static QName _AmountPastDue_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AmountPastDue");
    private final static QName _InstrumentDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "InstrumentDetails");
    private final static QName _DoReauthorizationRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoReauthorizationRequest");
    private final static QName _PaymentType_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentType");
    private final static QName _CreateMobilePaymentRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CreateMobilePaymentRequestDetails");
    private final static QName _ExecuteCheckoutOperationsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsResponse");
    private final static QName _DoExpressCheckoutPaymentRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentRequestDetails");
    private final static QName _ItemID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ItemID");
    private final static QName _EnhancedCancelRecoupRequestDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCancelRecoupRequestDetails");
    private final static QName _UpdateAccessPermissionsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsResponse");
    private final static QName _DoDirectPaymentRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoDirectPaymentRequestDetails");
    private final static QName _GetAccessPermissionDetailsResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsResponse");
    private final static QName _RefundType_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "RefundType");
    private final static QName _ShippingRegions_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ShippingRegions");
    private final static QName _DoDirectPaymentResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentResponse");
    private final static QName _Region_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Region");
    private final static QName _Fees_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Fees");
    private final static QName _CancelRecoupRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "CancelRecoupRequest");
    private final static QName _DoReferenceTransactionRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionRequestDetails");
    private final static QName _SetExpressCheckoutRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetExpressCheckoutRequestDetails");
    private final static QName _DoExpressCheckoutPaymentRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentRequest");
    private final static QName _InitiateRecoupRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "InitiateRecoupRequest");
    private final static QName _Error_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Error");
    private final static QName _BAUpdateRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "BAUpdateRequest");
    private final static QName _Transaction_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Transaction");
    private final static QName _InsuranceOption_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOption");
    private final static QName _SetEbayMobileCheckoutRequestDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "SetEbayMobileCheckoutRequestDetails");
    private final static QName _MassPayRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "MassPayRequest");
    private final static QName _Category_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "Category");
    private final static QName _GetExpressCheckoutDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsRequest");
    private final static QName _GetBillingAgreementCustomerDetailsResponseDetails_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "GetBillingAgreementCustomerDetailsResponseDetails");
    private final static QName _ReverseTransactionResponse_QNAME = new QName("urn:ebay:api:PayPalAPI", "ReverseTransactionResponse");
    private final static QName _GetPalDetailsRequest_QNAME = new QName("urn:ebay:api:PayPalAPI", "GetPalDetailsRequest");
    private final static QName _RefundTransactionResponseTypeRefundTransactionID_QNAME = new QName("urn:ebay:api:PayPalAPI", "RefundTransactionID");
    private final static QName _DoUATPAuthorizationResponseTypeMsgSubID_QNAME = new QName("urn:ebay:api:PayPalAPI", "MsgSubID");
    private final static QName _DoUATPAuthorizationResponseTypeInvoiceID_QNAME = new QName("urn:ebay:api:PayPalAPI", "InvoiceID");
    private final static QName _DoUATPAuthorizationResponseTypeAuthorizationCode_QNAME = new QName("urn:ebay:api:PayPalAPI", "AuthorizationCode");
    private final static QName _AccountSummaryTypePaymentMethod_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethod");
    private final static QName _AccountSummaryTypeAdditionalAccount_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccount");
    private final static QName _AccountSummaryTypeCCExp_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CCExp");
    private final static QName _AccountSummaryTypePastDue_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "PastDue");
    private final static QName _AccountSummaryTypeAdditionalAccountsCount_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccountsCount");
    private final static QName _AccountSummaryTypeCCModifyDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CCModifyDate");
    private final static QName _AccountSummaryTypeLastInvoiceAmount_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastInvoiceAmount");
    private final static QName _AccountSummaryTypeBillingCycleDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BillingCycleDate");
    private final static QName _AccountSummaryTypeBankModifyDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BankModifyDate");
    private final static QName _AccountSummaryTypeCCInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "CCInfo");
    private final static QName _AccountSummaryTypeAccountState_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "AccountState");
    private final static QName _AccountSummaryTypeLastAmountPaid_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastAmountPaid");
    private final static QName _AccountSummaryTypeBankAccountInfo_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "BankAccountInfo");
    private final static QName _AccountSummaryTypeLastInvoiceDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastInvoiceDate");
    private final static QName _AccountSummaryTypeLastPaymentDate_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "LastPaymentDate");
    private final static QName _ReverseTransactionResponseDetailsTypeReverseTransactionID_QNAME = new QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ebay.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoDirectPaymentRequestType }
     * 
     */
    public DoDirectPaymentRequestType createDoDirectPaymentRequestType() {
        return new DoDirectPaymentRequestType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOptOutRequestType }
     * 
     */
    public ExternalRememberMeOptOutRequestType createExternalRememberMeOptOutRequestType() {
        return new ExternalRememberMeOptOutRequestType();
    }

    /**
     * Create an instance of {@link CompleteRecoupResponseType }
     * 
     */
    public CompleteRecoupResponseType createCompleteRecoupResponseType() {
        return new CompleteRecoupResponseType();
    }

    /**
     * Create an instance of {@link UpdateAccessPermissionsReq }
     * 
     */
    public UpdateAccessPermissionsReq createUpdateAccessPermissionsReq() {
        return new UpdateAccessPermissionsReq();
    }

    /**
     * Create an instance of {@link UpdateAccessPermissionsRequestType }
     * 
     */
    public UpdateAccessPermissionsRequestType createUpdateAccessPermissionsRequestType() {
        return new UpdateAccessPermissionsRequestType();
    }

    /**
     * Create an instance of {@link BMSetInventoryReq }
     * 
     */
    public BMSetInventoryReq createBMSetInventoryReq() {
        return new BMSetInventoryReq();
    }

    /**
     * Create an instance of {@link BMSetInventoryRequestType }
     * 
     */
    public BMSetInventoryRequestType createBMSetInventoryRequestType() {
        return new BMSetInventoryRequestType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountResponseType }
     * 
     */
    public BillOutstandingAmountResponseType createBillOutstandingAmountResponseType() {
        return new BillOutstandingAmountResponseType();
    }

    /**
     * Create an instance of {@link DoUATPAuthorizationReq }
     * 
     */
    public DoUATPAuthorizationReq createDoUATPAuthorizationReq() {
        return new DoUATPAuthorizationReq();
    }

    /**
     * Create an instance of {@link DoUATPAuthorizationRequestType }
     * 
     */
    public DoUATPAuthorizationRequestType createDoUATPAuthorizationRequestType() {
        return new DoUATPAuthorizationRequestType();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementResponseType }
     * 
     */
    public SetCustomerBillingAgreementResponseType createSetCustomerBillingAgreementResponseType() {
        return new SetCustomerBillingAgreementResponseType();
    }

    /**
     * Create an instance of {@link GetMobileStatusResponseType }
     * 
     */
    public GetMobileStatusResponseType createGetMobileStatusResponseType() {
        return new GetMobileStatusResponseType();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutReq }
     * 
     */
    public SetExpressCheckoutReq createSetExpressCheckoutReq() {
        return new SetExpressCheckoutReq();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutRequestType }
     * 
     */
    public SetExpressCheckoutRequestType createSetExpressCheckoutRequestType() {
        return new SetExpressCheckoutRequestType();
    }

    /**
     * Create an instance of {@link DoUATPExpressCheckoutPaymentReq }
     * 
     */
    public DoUATPExpressCheckoutPaymentReq createDoUATPExpressCheckoutPaymentReq() {
        return new DoUATPExpressCheckoutPaymentReq();
    }

    /**
     * Create an instance of {@link DoUATPExpressCheckoutPaymentRequestType }
     * 
     */
    public DoUATPExpressCheckoutPaymentRequestType createDoUATPExpressCheckoutPaymentRequestType() {
        return new DoUATPExpressCheckoutPaymentRequestType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditReq }
     * 
     */
    public DoNonReferencedCreditReq createDoNonReferencedCreditReq() {
        return new DoNonReferencedCreditReq();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditRequestType }
     * 
     */
    public DoNonReferencedCreditRequestType createDoNonReferencedCreditRequestType() {
        return new DoNonReferencedCreditRequestType();
    }

    /**
     * Create an instance of {@link DoReauthorizationResponseType }
     * 
     */
    public DoReauthorizationResponseType createDoReauthorizationResponseType() {
        return new DoReauthorizationResponseType();
    }

    /**
     * Create an instance of {@link DoCaptureReq }
     * 
     */
    public DoCaptureReq createDoCaptureReq() {
        return new DoCaptureReq();
    }

    /**
     * Create an instance of {@link DoCaptureRequestType }
     * 
     */
    public DoCaptureRequestType createDoCaptureRequestType() {
        return new DoCaptureRequestType();
    }

    /**
     * Create an instance of {@link GetBalanceResponseType }
     * 
     */
    public GetBalanceResponseType createGetBalanceResponseType() {
        return new GetBalanceResponseType();
    }

    /**
     * Create an instance of {@link EnterBoardingResponseType }
     * 
     */
    public EnterBoardingResponseType createEnterBoardingResponseType() {
        return new EnterBoardingResponseType();
    }

    /**
     * Create an instance of {@link GetAuthDetailsRequestType }
     * 
     */
    public GetAuthDetailsRequestType createGetAuthDetailsRequestType() {
        return new GetAuthDetailsRequestType();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentRequestType }
     * 
     */
    public DoMobileCheckoutPaymentRequestType createDoMobileCheckoutPaymentRequestType() {
        return new DoMobileCheckoutPaymentRequestType();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutResponseType }
     * 
     */
    public SetMobileCheckoutResponseType createSetMobileCheckoutResponseType() {
        return new SetMobileCheckoutResponseType();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileReq }
     * 
     */
    public UpdateRecurringPaymentsProfileReq createUpdateRecurringPaymentsProfileReq() {
        return new UpdateRecurringPaymentsProfileReq();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileRequestType }
     * 
     */
    public UpdateRecurringPaymentsProfileRequestType createUpdateRecurringPaymentsProfileRequestType() {
        return new UpdateRecurringPaymentsProfileRequestType();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutRequestType }
     * 
     */
    public SetMobileCheckoutRequestType createSetMobileCheckoutRequestType() {
        return new SetMobileCheckoutRequestType();
    }

    /**
     * Create an instance of {@link InitiateRecoupReq }
     * 
     */
    public InitiateRecoupReq createInitiateRecoupReq() {
        return new InitiateRecoupReq();
    }

    /**
     * Create an instance of {@link InitiateRecoupRequestType }
     * 
     */
    public InitiateRecoupRequestType createInitiateRecoupRequestType() {
        return new InitiateRecoupRequestType();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentReq }
     * 
     */
    public CreateMobilePaymentReq createCreateMobilePaymentReq() {
        return new CreateMobilePaymentReq();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentRequestType }
     * 
     */
    public CreateMobilePaymentRequestType createCreateMobilePaymentRequestType() {
        return new CreateMobilePaymentRequestType();
    }

    /**
     * Create an instance of {@link BillAgreementUpdateReq }
     * 
     */
    public BillAgreementUpdateReq createBillAgreementUpdateReq() {
        return new BillAgreementUpdateReq();
    }

    /**
     * Create an instance of {@link BAUpdateRequestType }
     * 
     */
    public BAUpdateRequestType createBAUpdateRequestType() {
        return new BAUpdateRequestType();
    }

    /**
     * Create an instance of {@link CreateBillingAgreementResponseType }
     * 
     */
    public CreateBillingAgreementResponseType createCreateBillingAgreementResponseType() {
        return new CreateBillingAgreementResponseType();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutResponseType }
     * 
     */
    public SetExpressCheckoutResponseType createSetExpressCheckoutResponseType() {
        return new SetExpressCheckoutResponseType();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentResponseType }
     * 
     */
    public DoMobileCheckoutPaymentResponseType createDoMobileCheckoutPaymentResponseType() {
        return new DoMobileCheckoutPaymentResponseType();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsRequestType }
     * 
     */
    public SetAccessPermissionsRequestType createSetAccessPermissionsRequestType() {
        return new SetAccessPermissionsRequestType();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileResponseType }
     * 
     */
    public UpdateRecurringPaymentsProfileResponseType createUpdateRecurringPaymentsProfileResponseType() {
        return new UpdateRecurringPaymentsProfileResponseType();
    }

    /**
     * Create an instance of {@link BillUserResponseType }
     * 
     */
    public BillUserResponseType createBillUserResponseType() {
        return new BillUserResponseType();
    }

    /**
     * Create an instance of {@link BMGetButtonDetailsReq }
     * 
     */
    public BMGetButtonDetailsReq createBMGetButtonDetailsReq() {
        return new BMGetButtonDetailsReq();
    }

    /**
     * Create an instance of {@link BMGetButtonDetailsRequestType }
     * 
     */
    public BMGetButtonDetailsRequestType createBMGetButtonDetailsRequestType() {
        return new BMGetButtonDetailsRequestType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentResponseType }
     * 
     */
    public DoExpressCheckoutPaymentResponseType createDoExpressCheckoutPaymentResponseType() {
        return new DoExpressCheckoutPaymentResponseType();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamResponseType }
     * 
     */
    public SetAuthFlowParamResponseType createSetAuthFlowParamResponseType() {
        return new SetAuthFlowParamResponseType();
    }

    /**
     * Create an instance of {@link ManagePendingTransactionStatusReq }
     * 
     */
    public ManagePendingTransactionStatusReq createManagePendingTransactionStatusReq() {
        return new ManagePendingTransactionStatusReq();
    }

    /**
     * Create an instance of {@link ManagePendingTransactionStatusRequestType }
     * 
     */
    public ManagePendingTransactionStatusRequestType createManagePendingTransactionStatusRequestType() {
        return new ManagePendingTransactionStatusRequestType();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentReq }
     * 
     */
    public DoMobileCheckoutPaymentReq createDoMobileCheckoutPaymentReq() {
        return new DoMobileCheckoutPaymentReq();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutReq }
     * 
     */
    public SetMobileCheckoutReq createSetMobileCheckoutReq() {
        return new SetMobileCheckoutReq();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsReq }
     * 
     */
    public SetAccessPermissionsReq createSetAccessPermissionsReq() {
        return new SetAccessPermissionsReq();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentResponseType }
     * 
     */
    public CreateMobilePaymentResponseType createCreateMobilePaymentResponseType() {
        return new CreateMobilePaymentResponseType();
    }

    /**
     * Create an instance of {@link DoAuthorizationResponseType }
     * 
     */
    public DoAuthorizationResponseType createDoAuthorizationResponseType() {
        return new DoAuthorizationResponseType();
    }

    /**
     * Create an instance of {@link CustomSecurityHeaderType }
     * 
     */
    public CustomSecurityHeaderType createCustomSecurityHeaderType() {
        return new CustomSecurityHeaderType();
    }

    /**
     * Create an instance of {@link EnterBoardingReq }
     * 
     */
    public EnterBoardingReq createEnterBoardingReq() {
        return new EnterBoardingReq();
    }

    /**
     * Create an instance of {@link EnterBoardingRequestType }
     * 
     */
    public EnterBoardingRequestType createEnterBoardingRequestType() {
        return new EnterBoardingRequestType();
    }

    /**
     * Create an instance of {@link DoCancelReq }
     * 
     */
    public DoCancelReq createDoCancelReq() {
        return new DoCancelReq();
    }

    /**
     * Create an instance of {@link DoCancelRequestType }
     * 
     */
    public DoCancelRequestType createDoCancelRequestType() {
        return new DoCancelRequestType();
    }

    /**
     * Create an instance of {@link InitiateRecoupResponseType }
     * 
     */
    public InitiateRecoupResponseType createInitiateRecoupResponseType() {
        return new InitiateRecoupResponseType();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusRequestType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusRequestType createManageRecurringPaymentsProfileStatusRequestType() {
        return new ManageRecurringPaymentsProfileStatusRequestType();
    }

    /**
     * Create an instance of {@link CreateBillingAgreementReq }
     * 
     */
    public CreateBillingAgreementReq createCreateBillingAgreementReq() {
        return new CreateBillingAgreementReq();
    }

    /**
     * Create an instance of {@link CreateBillingAgreementRequestType }
     * 
     */
    public CreateBillingAgreementRequestType createCreateBillingAgreementRequestType() {
        return new CreateBillingAgreementRequestType();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsResponseType }
     * 
     */
    public GetExpressCheckoutDetailsResponseType createGetExpressCheckoutDetailsResponseType() {
        return new GetExpressCheckoutDetailsResponseType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileRequestType }
     * 
     */
    public CreateRecurringPaymentsProfileRequestType createCreateRecurringPaymentsProfileRequestType() {
        return new CreateRecurringPaymentsProfileRequestType();
    }

    /**
     * Create an instance of {@link DoVoidRequestType }
     * 
     */
    public DoVoidRequestType createDoVoidRequestType() {
        return new DoVoidRequestType();
    }

    /**
     * Create an instance of {@link BMGetInventoryRequestType }
     * 
     */
    public BMGetInventoryRequestType createBMGetInventoryRequestType() {
        return new BMGetInventoryRequestType();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamReq }
     * 
     */
    public SetAuthFlowParamReq createSetAuthFlowParamReq() {
        return new SetAuthFlowParamReq();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamRequestType }
     * 
     */
    public SetAuthFlowParamRequestType createSetAuthFlowParamRequestType() {
        return new SetAuthFlowParamRequestType();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsResponseType }
     * 
     */
    public SetAccessPermissionsResponseType createSetAccessPermissionsResponseType() {
        return new SetAccessPermissionsResponseType();
    }

    /**
     * Create an instance of {@link CancelRecoupResponseType }
     * 
     */
    public CancelRecoupResponseType createCancelRecoupResponseType() {
        return new CancelRecoupResponseType();
    }

    /**
     * Create an instance of {@link AddressVerifyRequestType }
     * 
     */
    public AddressVerifyRequestType createAddressVerifyRequestType() {
        return new AddressVerifyRequestType();
    }

    /**
     * Create an instance of {@link RefundTransactionResponseType }
     * 
     */
    public RefundTransactionResponseType createRefundTransactionResponseType() {
        return new RefundTransactionResponseType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsRequestType }
     * 
     */
    public ExecuteCheckoutOperationsRequestType createExecuteCheckoutOperationsRequestType() {
        return new ExecuteCheckoutOperationsRequestType();
    }

    /**
     * Create an instance of {@link BMGetButtonDetailsResponseType }
     * 
     */
    public BMGetButtonDetailsResponseType createBMGetButtonDetailsResponseType() {
        return new BMGetButtonDetailsResponseType();
    }

    /**
     * Create an instance of {@link BMButtonSearchRequestType }
     * 
     */
    public BMButtonSearchRequestType createBMButtonSearchRequestType() {
        return new BMButtonSearchRequestType();
    }

    /**
     * Create an instance of {@link GetBalanceReq }
     * 
     */
    public GetBalanceReq createGetBalanceReq() {
        return new GetBalanceReq();
    }

    /**
     * Create an instance of {@link GetBalanceRequestType }
     * 
     */
    public GetBalanceRequestType createGetBalanceRequestType() {
        return new GetBalanceRequestType();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsRequestType }
     * 
     */
    public GetBoardingDetailsRequestType createGetBoardingDetailsRequestType() {
        return new GetBoardingDetailsRequestType();
    }

    /**
     * Create an instance of {@link ReverseTransactionRequestType }
     * 
     */
    public ReverseTransactionRequestType createReverseTransactionRequestType() {
        return new ReverseTransactionRequestType();
    }

    /**
     * Create an instance of {@link AddressVerifyReq }
     * 
     */
    public AddressVerifyReq createAddressVerifyReq() {
        return new AddressVerifyReq();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsReq }
     * 
     */
    public GetBoardingDetailsReq createGetBoardingDetailsReq() {
        return new GetBoardingDetailsReq();
    }

    /**
     * Create an instance of {@link GetMobileStatusRequestType }
     * 
     */
    public GetMobileStatusRequestType createGetMobileStatusRequestType() {
        return new GetMobileStatusRequestType();
    }

    /**
     * Create an instance of {@link MassPayResponseType }
     * 
     */
    public MassPayResponseType createMassPayResponseType() {
        return new MassPayResponseType();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsResponseType }
     * 
     */
    public GetBillingAgreementCustomerDetailsResponseType createGetBillingAgreementCustomerDetailsResponseType() {
        return new GetBillingAgreementCustomerDetailsResponseType();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementReq }
     * 
     */
    public SetCustomerBillingAgreementReq createSetCustomerBillingAgreementReq() {
        return new SetCustomerBillingAgreementReq();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementRequestType }
     * 
     */
    public SetCustomerBillingAgreementRequestType createSetCustomerBillingAgreementRequestType() {
        return new SetCustomerBillingAgreementRequestType();
    }

    /**
     * Create an instance of {@link TransactionSearchReq }
     * 
     */
    public TransactionSearchReq createTransactionSearchReq() {
        return new TransactionSearchReq();
    }

    /**
     * Create an instance of {@link TransactionSearchRequestType }
     * 
     */
    public TransactionSearchRequestType createTransactionSearchRequestType() {
        return new TransactionSearchRequestType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationRequestType }
     * 
     */
    public GetIncentiveEvaluationRequestType createGetIncentiveEvaluationRequestType() {
        return new GetIncentiveEvaluationRequestType();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusResponseType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusResponseType createManageRecurringPaymentsProfileStatusResponseType() {
        return new ManageRecurringPaymentsProfileStatusResponseType();
    }

    /**
     * Create an instance of {@link BillUserRequestType }
     * 
     */
    public BillUserRequestType createBillUserRequestType() {
        return new BillUserRequestType();
    }

    /**
     * Create an instance of {@link GetTransactionDetailsReq }
     * 
     */
    public GetTransactionDetailsReq createGetTransactionDetailsReq() {
        return new GetTransactionDetailsReq();
    }

    /**
     * Create an instance of {@link GetTransactionDetailsRequestType }
     * 
     */
    public GetTransactionDetailsRequestType createGetTransactionDetailsRequestType() {
        return new GetTransactionDetailsRequestType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsReq }
     * 
     */
    public ExecuteCheckoutOperationsReq createExecuteCheckoutOperationsReq() {
        return new ExecuteCheckoutOperationsReq();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationReq }
     * 
     */
    public GetIncentiveEvaluationReq createGetIncentiveEvaluationReq() {
        return new GetIncentiveEvaluationReq();
    }

    /**
     * Create an instance of {@link GetPalDetailsReq }
     * 
     */
    public GetPalDetailsReq createGetPalDetailsReq() {
        return new GetPalDetailsReq();
    }

    /**
     * Create an instance of {@link GetPalDetailsRequestType }
     * 
     */
    public GetPalDetailsRequestType createGetPalDetailsRequestType() {
        return new GetPalDetailsRequestType();
    }

    /**
     * Create an instance of {@link BMManageButtonStatusReq }
     * 
     */
    public BMManageButtonStatusReq createBMManageButtonStatusReq() {
        return new BMManageButtonStatusReq();
    }

    /**
     * Create an instance of {@link BMManageButtonStatusRequestType }
     * 
     */
    public BMManageButtonStatusRequestType createBMManageButtonStatusRequestType() {
        return new BMManageButtonStatusRequestType();
    }

    /**
     * Create an instance of {@link DoCaptureResponseType }
     * 
     */
    public DoCaptureResponseType createDoCaptureResponseType() {
        return new DoCaptureResponseType();
    }

    /**
     * Create an instance of {@link CompleteRecoupRequestType }
     * 
     */
    public CompleteRecoupRequestType createCompleteRecoupRequestType() {
        return new CompleteRecoupRequestType();
    }

    /**
     * Create an instance of {@link BMButtonSearchReq }
     * 
     */
    public BMButtonSearchReq createBMButtonSearchReq() {
        return new BMButtonSearchReq();
    }

    /**
     * Create an instance of {@link DoAuthorizationRequestType }
     * 
     */
    public DoAuthorizationRequestType createDoAuthorizationRequestType() {
        return new DoAuthorizationRequestType();
    }

    /**
     * Create an instance of {@link BMManageButtonStatusResponseType }
     * 
     */
    public BMManageButtonStatusResponseType createBMManageButtonStatusResponseType() {
        return new BMManageButtonStatusResponseType();
    }

    /**
     * Create an instance of {@link BMGetInventoryResponseType }
     * 
     */
    public BMGetInventoryResponseType createBMGetInventoryResponseType() {
        return new BMGetInventoryResponseType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsResponseType }
     * 
     */
    public GetRecurringPaymentsProfileDetailsResponseType createGetRecurringPaymentsProfileDetailsResponseType() {
        return new GetRecurringPaymentsProfileDetailsResponseType();
    }

    /**
     * Create an instance of {@link UpdateAuthorizationRequestType }
     * 
     */
    public UpdateAuthorizationRequestType createUpdateAuthorizationRequestType() {
        return new UpdateAuthorizationRequestType();
    }

    /**
     * Create an instance of {@link UpdateAccessPermissionsResponseType }
     * 
     */
    public UpdateAccessPermissionsResponseType createUpdateAccessPermissionsResponseType() {
        return new UpdateAccessPermissionsResponseType();
    }

    /**
     * Create an instance of {@link DoUATPAuthorizationResponseType }
     * 
     */
    public DoUATPAuthorizationResponseType createDoUATPAuthorizationResponseType() {
        return new DoUATPAuthorizationResponseType();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsResponseType }
     * 
     */
    public GetAccessPermissionDetailsResponseType createGetAccessPermissionDetailsResponseType() {
        return new GetAccessPermissionDetailsResponseType();
    }

    /**
     * Create an instance of {@link BMUpdateButtonResponseType }
     * 
     */
    public BMUpdateButtonResponseType createBMUpdateButtonResponseType() {
        return new BMUpdateButtonResponseType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsResponseType }
     * 
     */
    public ExecuteCheckoutOperationsResponseType createExecuteCheckoutOperationsResponseType() {
        return new ExecuteCheckoutOperationsResponseType();
    }

    /**
     * Create an instance of {@link DoAuthorizationReq }
     * 
     */
    public DoAuthorizationReq createDoAuthorizationReq() {
        return new DoAuthorizationReq();
    }

    /**
     * Create an instance of {@link DoDirectPaymentResponseType }
     * 
     */
    public DoDirectPaymentResponseType createDoDirectPaymentResponseType() {
        return new DoDirectPaymentResponseType();
    }

    /**
     * Create an instance of {@link GetMobileStatusReq }
     * 
     */
    public GetMobileStatusReq createGetMobileStatusReq() {
        return new GetMobileStatusReq();
    }

    /**
     * Create an instance of {@link UpdateAuthorizationReq }
     * 
     */
    public UpdateAuthorizationReq createUpdateAuthorizationReq() {
        return new UpdateAuthorizationReq();
    }

    /**
     * Create an instance of {@link CancelRecoupRequestType }
     * 
     */
    public CancelRecoupRequestType createCancelRecoupRequestType() {
        return new CancelRecoupRequestType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsReq }
     * 
     */
    public GetRecurringPaymentsProfileDetailsReq createGetRecurringPaymentsProfileDetailsReq() {
        return new GetRecurringPaymentsProfileDetailsReq();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsRequestType }
     * 
     */
    public GetRecurringPaymentsProfileDetailsRequestType createGetRecurringPaymentsProfileDetailsRequestType() {
        return new GetRecurringPaymentsProfileDetailsRequestType();
    }

    /**
     * Create an instance of {@link DoUATPExpressCheckoutPaymentResponseType }
     * 
     */
    public DoUATPExpressCheckoutPaymentResponseType createDoUATPExpressCheckoutPaymentResponseType() {
        return new DoUATPExpressCheckoutPaymentResponseType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountReq }
     * 
     */
    public BillOutstandingAmountReq createBillOutstandingAmountReq() {
        return new BillOutstandingAmountReq();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountRequestType }
     * 
     */
    public BillOutstandingAmountRequestType createBillOutstandingAmountRequestType() {
        return new BillOutstandingAmountRequestType();
    }

    /**
     * Create an instance of {@link CompleteRecoupReq }
     * 
     */
    public CompleteRecoupReq createCompleteRecoupReq() {
        return new CompleteRecoupReq();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationResponseType }
     * 
     */
    public GetIncentiveEvaluationResponseType createGetIncentiveEvaluationResponseType() {
        return new GetIncentiveEvaluationResponseType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentReq }
     * 
     */
    public DoExpressCheckoutPaymentReq createDoExpressCheckoutPaymentReq() {
        return new DoExpressCheckoutPaymentReq();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentRequestType }
     * 
     */
    public DoExpressCheckoutPaymentRequestType createDoExpressCheckoutPaymentRequestType() {
        return new DoExpressCheckoutPaymentRequestType();
    }

    /**
     * Create an instance of {@link BAUpdateResponseType }
     * 
     */
    public BAUpdateResponseType createBAUpdateResponseType() {
        return new BAUpdateResponseType();
    }

    /**
     * Create an instance of {@link DoDirectPaymentReq }
     * 
     */
    public DoDirectPaymentReq createDoDirectPaymentReq() {
        return new DoDirectPaymentReq();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsRequestType }
     * 
     */
    public GetExpressCheckoutDetailsRequestType createGetExpressCheckoutDetailsRequestType() {
        return new GetExpressCheckoutDetailsRequestType();
    }

    /**
     * Create an instance of {@link GetPalDetailsResponseType }
     * 
     */
    public GetPalDetailsResponseType createGetPalDetailsResponseType() {
        return new GetPalDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsReq }
     * 
     */
    public GetAccessPermissionDetailsReq createGetAccessPermissionDetailsReq() {
        return new GetAccessPermissionDetailsReq();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsRequestType }
     * 
     */
    public GetAccessPermissionDetailsRequestType createGetAccessPermissionDetailsRequestType() {
        return new GetAccessPermissionDetailsRequestType();
    }

    /**
     * Create an instance of {@link ReverseTransactionResponseType }
     * 
     */
    public ReverseTransactionResponseType createReverseTransactionResponseType() {
        return new ReverseTransactionResponseType();
    }

    /**
     * Create an instance of {@link AddressVerifyResponseType }
     * 
     */
    public AddressVerifyResponseType createAddressVerifyResponseType() {
        return new AddressVerifyResponseType();
    }

    /**
     * Create an instance of {@link MassPayRequestType }
     * 
     */
    public MassPayRequestType createMassPayRequestType() {
        return new MassPayRequestType();
    }

    /**
     * Create an instance of {@link BMGetInventoryReq }
     * 
     */
    public BMGetInventoryReq createBMGetInventoryReq() {
        return new BMGetInventoryReq();
    }

    /**
     * Create an instance of {@link CancelRecoupReq }
     * 
     */
    public CancelRecoupReq createCancelRecoupReq() {
        return new CancelRecoupReq();
    }

    /**
     * Create an instance of {@link BMUpdateButtonRequestType }
     * 
     */
    public BMUpdateButtonRequestType createBMUpdateButtonRequestType() {
        return new BMUpdateButtonRequestType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditResponseType }
     * 
     */
    public DoNonReferencedCreditResponseType createDoNonReferencedCreditResponseType() {
        return new DoNonReferencedCreditResponseType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOptOutReq }
     * 
     */
    public ExternalRememberMeOptOutReq createExternalRememberMeOptOutReq() {
        return new ExternalRememberMeOptOutReq();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusReq }
     * 
     */
    public ManageRecurringPaymentsProfileStatusReq createManageRecurringPaymentsProfileStatusReq() {
        return new ManageRecurringPaymentsProfileStatusReq();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionRequestType }
     * 
     */
    public DoReferenceTransactionRequestType createDoReferenceTransactionRequestType() {
        return new DoReferenceTransactionRequestType();
    }

    /**
     * Create an instance of {@link BMUpdateButtonReq }
     * 
     */
    public BMUpdateButtonReq createBMUpdateButtonReq() {
        return new BMUpdateButtonReq();
    }

    /**
     * Create an instance of {@link BMSetInventoryResponseType }
     * 
     */
    public BMSetInventoryResponseType createBMSetInventoryResponseType() {
        return new BMSetInventoryResponseType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileResponseType }
     * 
     */
    public CreateRecurringPaymentsProfileResponseType createCreateRecurringPaymentsProfileResponseType() {
        return new CreateRecurringPaymentsProfileResponseType();
    }

    /**
     * Create an instance of {@link DoReauthorizationReq }
     * 
     */
    public DoReauthorizationReq createDoReauthorizationReq() {
        return new DoReauthorizationReq();
    }

    /**
     * Create an instance of {@link DoReauthorizationRequestType }
     * 
     */
    public DoReauthorizationRequestType createDoReauthorizationRequestType() {
        return new DoReauthorizationRequestType();
    }

    /**
     * Create an instance of {@link BMCreateButtonReq }
     * 
     */
    public BMCreateButtonReq createBMCreateButtonReq() {
        return new BMCreateButtonReq();
    }

    /**
     * Create an instance of {@link BMCreateButtonRequestType }
     * 
     */
    public BMCreateButtonRequestType createBMCreateButtonRequestType() {
        return new BMCreateButtonRequestType();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsReq }
     * 
     */
    public GetExpressCheckoutDetailsReq createGetExpressCheckoutDetailsReq() {
        return new GetExpressCheckoutDetailsReq();
    }

    /**
     * Create an instance of {@link GetTransactionDetailsResponseType }
     * 
     */
    public GetTransactionDetailsResponseType createGetTransactionDetailsResponseType() {
        return new GetTransactionDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsResponseType }
     * 
     */
    public GetBoardingDetailsResponseType createGetBoardingDetailsResponseType() {
        return new GetBoardingDetailsResponseType();
    }

    /**
     * Create an instance of {@link UpdateAuthorizationResponseType }
     * 
     */
    public UpdateAuthorizationResponseType createUpdateAuthorizationResponseType() {
        return new UpdateAuthorizationResponseType();
    }

    /**
     * Create an instance of {@link BMCreateButtonResponseType }
     * 
     */
    public BMCreateButtonResponseType createBMCreateButtonResponseType() {
        return new BMCreateButtonResponseType();
    }

    /**
     * Create an instance of {@link RefundTransactionRequestType }
     * 
     */
    public RefundTransactionRequestType createRefundTransactionRequestType() {
        return new RefundTransactionRequestType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOptOutResponseType }
     * 
     */
    public ExternalRememberMeOptOutResponseType createExternalRememberMeOptOutResponseType() {
        return new ExternalRememberMeOptOutResponseType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileReq }
     * 
     */
    public CreateRecurringPaymentsProfileReq createCreateRecurringPaymentsProfileReq() {
        return new CreateRecurringPaymentsProfileReq();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsReq }
     * 
     */
    public GetBillingAgreementCustomerDetailsReq createGetBillingAgreementCustomerDetailsReq() {
        return new GetBillingAgreementCustomerDetailsReq();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsRequestType }
     * 
     */
    public GetBillingAgreementCustomerDetailsRequestType createGetBillingAgreementCustomerDetailsRequestType() {
        return new GetBillingAgreementCustomerDetailsRequestType();
    }

    /**
     * Create an instance of {@link TransactionSearchResponseType }
     * 
     */
    public TransactionSearchResponseType createTransactionSearchResponseType() {
        return new TransactionSearchResponseType();
    }

    /**
     * Create an instance of {@link BMButtonSearchResponseType }
     * 
     */
    public BMButtonSearchResponseType createBMButtonSearchResponseType() {
        return new BMButtonSearchResponseType();
    }

    /**
     * Create an instance of {@link BillUserReq }
     * 
     */
    public BillUserReq createBillUserReq() {
        return new BillUserReq();
    }

    /**
     * Create an instance of {@link GetAuthDetailsReq }
     * 
     */
    public GetAuthDetailsReq createGetAuthDetailsReq() {
        return new GetAuthDetailsReq();
    }

    /**
     * Create an instance of {@link RefundTransactionReq }
     * 
     */
    public RefundTransactionReq createRefundTransactionReq() {
        return new RefundTransactionReq();
    }

    /**
     * Create an instance of {@link ManagePendingTransactionStatusResponseType }
     * 
     */
    public ManagePendingTransactionStatusResponseType createManagePendingTransactionStatusResponseType() {
        return new ManagePendingTransactionStatusResponseType();
    }

    /**
     * Create an instance of {@link DoCancelResponseType }
     * 
     */
    public DoCancelResponseType createDoCancelResponseType() {
        return new DoCancelResponseType();
    }

    /**
     * Create an instance of {@link GetAuthDetailsResponseType }
     * 
     */
    public GetAuthDetailsResponseType createGetAuthDetailsResponseType() {
        return new GetAuthDetailsResponseType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionReq }
     * 
     */
    public DoReferenceTransactionReq createDoReferenceTransactionReq() {
        return new DoReferenceTransactionReq();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionResponseType }
     * 
     */
    public DoReferenceTransactionResponseType createDoReferenceTransactionResponseType() {
        return new DoReferenceTransactionResponseType();
    }

    /**
     * Create an instance of {@link DoVoidReq }
     * 
     */
    public DoVoidReq createDoVoidReq() {
        return new DoVoidReq();
    }

    /**
     * Create an instance of {@link MassPayReq }
     * 
     */
    public MassPayReq createMassPayReq() {
        return new MassPayReq();
    }

    /**
     * Create an instance of {@link ReverseTransactionReq }
     * 
     */
    public ReverseTransactionReq createReverseTransactionReq() {
        return new ReverseTransactionReq();
    }

    /**
     * Create an instance of {@link DoVoidResponseType }
     * 
     */
    public DoVoidResponseType createDoVoidResponseType() {
        return new DoVoidResponseType();
    }

    /**
     * Create an instance of {@link MassPayRequestItemType }
     * 
     */
    public MassPayRequestItemType createMassPayRequestItemType() {
        return new MassPayRequestItemType();
    }

    /**
     * Create an instance of {@link InstallmentDetailsType }
     * 
     */
    public InstallmentDetailsType createInstallmentDetailsType() {
        return new InstallmentDetailsType();
    }

    /**
     * Create an instance of {@link OptionSelectionDetailsType }
     * 
     */
    public OptionSelectionDetailsType createOptionSelectionDetailsType() {
        return new OptionSelectionDetailsType();
    }

    /**
     * Create an instance of {@link OptionDetailsType }
     * 
     */
    public OptionDetailsType createOptionDetailsType() {
        return new OptionDetailsType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link BasicAmountType }
     * 
     */
    public BasicAmountType createBasicAmountType() {
        return new BasicAmountType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link SetMobileCheckoutRequestDetailsType }
     * 
     */
    public SetMobileCheckoutRequestDetailsType createSetMobileCheckoutRequestDetailsType() {
        return new SetMobileCheckoutRequestDetailsType();
    }

    /**
     * Create an instance of {@link RefundInfoType }
     * 
     */
    public RefundInfoType createRefundInfoType() {
        return new RefundInfoType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsResponseDetailsType }
     * 
     */
    public ExecuteCheckoutOperationsResponseDetailsType createExecuteCheckoutOperationsResponseDetailsType() {
        return new ExecuteCheckoutOperationsResponseDetailsType();
    }

    /**
     * Create an instance of {@link ReviseStatusType }
     * 
     */
    public ReviseStatusType createReviseStatusType() {
        return new ReviseStatusType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PaymentMeansType }
     * 
     */
    public PaymentMeansType createPaymentMeansType() {
        return new PaymentMeansType();
    }

    /**
     * Create an instance of {@link DoMobileCheckoutPaymentResponseDetailsType }
     * 
     */
    public DoMobileCheckoutPaymentResponseDetailsType createDoMobileCheckoutPaymentResponseDetailsType() {
        return new DoMobileCheckoutPaymentResponseDetailsType();
    }

    /**
     * Create an instance of {@link SetCustomerBillingAgreementRequestDetailsType }
     * 
     */
    public SetCustomerBillingAgreementRequestDetailsType createSetCustomerBillingAgreementRequestDetailsType() {
        return new SetCustomerBillingAgreementRequestDetailsType();
    }

    /**
     * Create an instance of {@link UATPDetailsType }
     * 
     */
    public UATPDetailsType createUATPDetailsType() {
        return new UATPDetailsType();
    }

    /**
     * Create an instance of {@link PaginationType }
     * 
     */
    public PaginationType createPaginationType() {
        return new PaginationType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditRequestDetailsType }
     * 
     */
    public DoNonReferencedCreditRequestDetailsType createDoNonReferencedCreditRequestDetailsType() {
        return new DoNonReferencedCreditRequestDetailsType();
    }

    /**
     * Create an instance of {@link ThreeDSecureRequestType }
     * 
     */
    public ThreeDSecureRequestType createThreeDSecureRequestType() {
        return new ThreeDSecureRequestType();
    }

    /**
     * Create an instance of {@link MerchantPullPaymentType }
     * 
     */
    public MerchantPullPaymentType createMerchantPullPaymentType() {
        return new MerchantPullPaymentType();
    }

    /**
     * Create an instance of {@link PaginationResultType }
     * 
     */
    public PaginationResultType createPaginationResultType() {
        return new PaginationResultType();
    }

    /**
     * Create an instance of {@link ButtonSearchResultType }
     * 
     */
    public ButtonSearchResultType createButtonSearchResultType() {
        return new ButtonSearchResultType();
    }

    /**
     * Create an instance of {@link GetRecurringPaymentsProfileDetailsResponseDetailsType }
     * 
     */
    public GetRecurringPaymentsProfileDetailsResponseDetailsType createGetRecurringPaymentsProfileDetailsResponseDetailsType() {
        return new GetRecurringPaymentsProfileDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link MerchantDataType }
     * 
     */
    public MerchantDataType createMerchantDataType() {
        return new MerchantDataType();
    }

    /**
     * Create an instance of {@link CreditCardDetailsType }
     * 
     */
    public CreditCardDetailsType createCreditCardDetailsType() {
        return new CreditCardDetailsType();
    }

    /**
     * Create an instance of {@link GetExpressCheckoutDetailsResponseDetailsType }
     * 
     */
    public GetExpressCheckoutDetailsResponseDetailsType createGetExpressCheckoutDetailsResponseDetailsType() {
        return new GetExpressCheckoutDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link ShippingInfoType }
     * 
     */
    public ShippingInfoType createShippingInfoType() {
        return new ShippingInfoType();
    }

    /**
     * Create an instance of {@link EnhancedDataType }
     * 
     */
    public EnhancedDataType createEnhancedDataType() {
        return new EnhancedDataType();
    }

    /**
     * Create an instance of {@link ThreeDSecureInfoType }
     * 
     */
    public ThreeDSecureInfoType createThreeDSecureInfoType() {
        return new ThreeDSecureInfoType();
    }

    /**
     * Create an instance of {@link AirlineItineraryType }
     * 
     */
    public AirlineItineraryType createAirlineItineraryType() {
        return new AirlineItineraryType();
    }

    /**
     * Create an instance of {@link TransactionsType }
     * 
     */
    public TransactionsType createTransactionsType() {
        return new TransactionsType();
    }

    /**
     * Create an instance of {@link SetAccessPermissionsRequestDetailsType }
     * 
     */
    public SetAccessPermissionsRequestDetailsType createSetAccessPermissionsRequestDetailsType() {
        return new SetAccessPermissionsRequestDetailsType();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusResponseDetailsType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusResponseDetailsType createManageRecurringPaymentsProfileStatusResponseDetailsType() {
        return new ManageRecurringPaymentsProfileStatusResponseDetailsType();
    }

    /**
     * Create an instance of {@link ExecuteCheckoutOperationsRequestDetailsType }
     * 
     */
    public ExecuteCheckoutOperationsRequestDetailsType createExecuteCheckoutOperationsRequestDetailsType() {
        return new ExecuteCheckoutOperationsRequestDetailsType();
    }

    /**
     * Create an instance of {@link DoCaptureResponseDetailsType }
     * 
     */
    public DoCaptureResponseDetailsType createDoCaptureResponseDetailsType() {
        return new DoCaptureResponseDetailsType();
    }

    /**
     * Create an instance of {@link PaymentTransactionSearchResultType }
     * 
     */
    public PaymentTransactionSearchResultType createPaymentTransactionSearchResultType() {
        return new PaymentTransactionSearchResultType();
    }

    /**
     * Create an instance of {@link ManageRecurringPaymentsProfileStatusRequestDetailsType }
     * 
     */
    public ManageRecurringPaymentsProfileStatusRequestDetailsType createManageRecurringPaymentsProfileStatusRequestDetailsType() {
        return new ManageRecurringPaymentsProfileStatusRequestDetailsType();
    }

    /**
     * Create an instance of {@link OfferDetailsType }
     * 
     */
    public OfferDetailsType createOfferDetailsType() {
        return new OfferDetailsType();
    }

    /**
     * Create an instance of {@link InvoiceItemType }
     * 
     */
    public InvoiceItemType createInvoiceItemType() {
        return new InvoiceItemType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationResponseDetailsType }
     * 
     */
    public GetIncentiveEvaluationResponseDetailsType createGetIncentiveEvaluationResponseDetailsType() {
        return new GetIncentiveEvaluationResponseDetailsType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentResponseDetailsType }
     * 
     */
    public DoExpressCheckoutPaymentResponseDetailsType createDoExpressCheckoutPaymentResponseDetailsType() {
        return new DoExpressCheckoutPaymentResponseDetailsType();
    }

    /**
     * Create an instance of {@link ShippingDetailsType }
     * 
     */
    public ShippingDetailsType createShippingDetailsType() {
        return new ShippingDetailsType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountRequestDetailsType }
     * 
     */
    public BillOutstandingAmountRequestDetailsType createBillOutstandingAmountRequestDetailsType() {
        return new BillOutstandingAmountRequestDetailsType();
    }

    /**
     * Create an instance of {@link GetBoardingDetailsResponseDetailsType }
     * 
     */
    public GetBoardingDetailsResponseDetailsType createGetBoardingDetailsResponseDetailsType() {
        return new GetBoardingDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link DoNonReferencedCreditResponseDetailsType }
     * 
     */
    public DoNonReferencedCreditResponseDetailsType createDoNonReferencedCreditResponseDetailsType() {
        return new DoNonReferencedCreditResponseDetailsType();
    }

    /**
     * Create an instance of {@link CategoryArrayType }
     * 
     */
    public CategoryArrayType createCategoryArrayType() {
        return new CategoryArrayType();
    }

    /**
     * Create an instance of {@link MerchantStoreDetailsType }
     * 
     */
    public MerchantStoreDetailsType createMerchantStoreDetailsType() {
        return new MerchantStoreDetailsType();
    }

    /**
     * Create an instance of {@link OptionTrackingDetailsType }
     * 
     */
    public OptionTrackingDetailsType createOptionTrackingDetailsType() {
        return new OptionTrackingDetailsType();
    }

    /**
     * Create an instance of {@link TaxInfoType }
     * 
     */
    public TaxInfoType createTaxInfoType() {
        return new TaxInfoType();
    }

    /**
     * Create an instance of {@link BillOutstandingAmountResponseDetailsType }
     * 
     */
    public BillOutstandingAmountResponseDetailsType createBillOutstandingAmountResponseDetailsType() {
        return new BillOutstandingAmountResponseDetailsType();
    }

    /**
     * Create an instance of {@link PaymentTransactionType }
     * 
     */
    public PaymentTransactionType createPaymentTransactionType() {
        return new PaymentTransactionType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionResponseDetailsType }
     * 
     */
    public DoReferenceTransactionResponseDetailsType createDoReferenceTransactionResponseDetailsType() {
        return new DoReferenceTransactionResponseDetailsType();
    }

    /**
     * Create an instance of {@link SellingStatusType }
     * 
     */
    public SellingStatusType createSellingStatusType() {
        return new SellingStatusType();
    }

    /**
     * Create an instance of {@link AccountSummaryType }
     * 
     */
    public AccountSummaryType createAccountSummaryType() {
        return new AccountSummaryType();
    }

    /**
     * Create an instance of {@link TupleType }
     * 
     */
    public TupleType createTupleType() {
        return new TupleType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileRequestDetailsType }
     * 
     */
    public CreateRecurringPaymentsProfileRequestDetailsType createCreateRecurringPaymentsProfileRequestDetailsType() {
        return new CreateRecurringPaymentsProfileRequestDetailsType();
    }

    /**
     * Create an instance of {@link ReverseTransactionRequestDetailsType }
     * 
     */
    public ReverseTransactionRequestDetailsType createReverseTransactionRequestDetailsType() {
        return new ReverseTransactionRequestDetailsType();
    }

    /**
     * Create an instance of {@link MerchantPullPaymentResponseType }
     * 
     */
    public MerchantPullPaymentResponseType createMerchantPullPaymentResponseType() {
        return new MerchantPullPaymentResponseType();
    }

    /**
     * Create an instance of {@link ItemArrayType }
     * 
     */
    public ItemArrayType createItemArrayType() {
        return new ItemArrayType();
    }

    /**
     * Create an instance of {@link PaymentDetailsItemType }
     * 
     */
    public PaymentDetailsItemType createPaymentDetailsItemType() {
        return new PaymentDetailsItemType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link SetAuthFlowParamRequestDetailsType }
     * 
     */
    public SetAuthFlowParamRequestDetailsType createSetAuthFlowParamRequestDetailsType() {
        return new SetAuthFlowParamRequestDetailsType();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileResponseDetailsType }
     * 
     */
    public UpdateRecurringPaymentsProfileResponseDetailsType createUpdateRecurringPaymentsProfileResponseDetailsType() {
        return new UpdateRecurringPaymentsProfileResponseDetailsType();
    }

    /**
     * Create an instance of {@link BAUpdateResponseDetailsType }
     * 
     */
    public BAUpdateResponseDetailsType createBAUpdateResponseDetailsType() {
        return new BAUpdateResponseDetailsType();
    }

    /**
     * Create an instance of {@link InstrumentDetailsType }
     * 
     */
    public InstrumentDetailsType createInstrumentDetailsType() {
        return new InstrumentDetailsType();
    }

    /**
     * Create an instance of {@link DoDirectPaymentRequestDetailsType }
     * 
     */
    public DoDirectPaymentRequestDetailsType createDoDirectPaymentRequestDetailsType() {
        return new DoDirectPaymentRequestDetailsType();
    }

    /**
     * Create an instance of {@link GetMobileStatusRequestDetailsType }
     * 
     */
    public GetMobileStatusRequestDetailsType createGetMobileStatusRequestDetailsType() {
        return new GetMobileStatusRequestDetailsType();
    }

    /**
     * Create an instance of {@link GetAccessPermissionDetailsResponseDetailsType }
     * 
     */
    public GetAccessPermissionDetailsResponseDetailsType createGetAccessPermissionDetailsResponseDetailsType() {
        return new GetAccessPermissionDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link CreateMobilePaymentRequestDetailsType }
     * 
     */
    public CreateMobilePaymentRequestDetailsType createCreateMobilePaymentRequestDetailsType() {
        return new CreateMobilePaymentRequestDetailsType();
    }

    /**
     * Create an instance of {@link DoExpressCheckoutPaymentRequestDetailsType }
     * 
     */
    public DoExpressCheckoutPaymentRequestDetailsType createDoExpressCheckoutPaymentRequestDetailsType() {
        return new DoExpressCheckoutPaymentRequestDetailsType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link GetAuthDetailsResponseDetailsType }
     * 
     */
    public GetAuthDetailsResponseDetailsType createGetAuthDetailsResponseDetailsType() {
        return new GetAuthDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link UpdateRecurringPaymentsProfileRequestDetailsType }
     * 
     */
    public UpdateRecurringPaymentsProfileRequestDetailsType createUpdateRecurringPaymentsProfileRequestDetailsType() {
        return new UpdateRecurringPaymentsProfileRequestDetailsType();
    }

    /**
     * Create an instance of {@link ItemTrackingDetailsType }
     * 
     */
    public ItemTrackingDetailsType createItemTrackingDetailsType() {
        return new ItemTrackingDetailsType();
    }

    /**
     * Create an instance of {@link CreateRecurringPaymentsProfileResponseDetailsType }
     * 
     */
    public CreateRecurringPaymentsProfileResponseDetailsType createCreateRecurringPaymentsProfileResponseDetailsType() {
        return new CreateRecurringPaymentsProfileResponseDetailsType();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link ReverseTransactionResponseDetailsType }
     * 
     */
    public ReverseTransactionResponseDetailsType createReverseTransactionResponseDetailsType() {
        return new ReverseTransactionResponseDetailsType();
    }

    /**
     * Create an instance of {@link GetIncentiveEvaluationRequestDetailsType }
     * 
     */
    public GetIncentiveEvaluationRequestDetailsType createGetIncentiveEvaluationRequestDetailsType() {
        return new GetIncentiveEvaluationRequestDetailsType();
    }

    /**
     * Create an instance of {@link SetExpressCheckoutRequestDetailsType }
     * 
     */
    public SetExpressCheckoutRequestDetailsType createSetExpressCheckoutRequestDetailsType() {
        return new SetExpressCheckoutRequestDetailsType();
    }

    /**
     * Create an instance of {@link DoReferenceTransactionRequestDetailsType }
     * 
     */
    public DoReferenceTransactionRequestDetailsType createDoReferenceTransactionRequestDetailsType() {
        return new DoReferenceTransactionRequestDetailsType();
    }

    /**
     * Create an instance of {@link AuthorizationInfoType }
     * 
     */
    public AuthorizationInfoType createAuthorizationInfoType() {
        return new AuthorizationInfoType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link GetBillingAgreementCustomerDetailsResponseDetailsType }
     * 
     */
    public GetBillingAgreementCustomerDetailsResponseDetailsType createGetBillingAgreementCustomerDetailsResponseDetailsType() {
        return new GetBillingAgreementCustomerDetailsResponseDetailsType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link EnterBoardingRequestDetailsType }
     * 
     */
    public EnterBoardingRequestDetailsType createEnterBoardingRequestDetailsType() {
        return new EnterBoardingRequestDetailsType();
    }

    /**
     * Create an instance of {@link SetEbayMobileCheckoutRequestDetailsType }
     * 
     */
    public SetEbayMobileCheckoutRequestDetailsType createSetEbayMobileCheckoutRequestDetailsType() {
        return new SetEbayMobileCheckoutRequestDetailsType();
    }

    /**
     * Create an instance of {@link BillingApprovalDetailsType }
     * 
     */
    public BillingApprovalDetailsType createBillingApprovalDetailsType() {
        return new BillingApprovalDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveApplyIndicationType }
     * 
     */
    public IncentiveApplyIndicationType createIncentiveApplyIndicationType() {
        return new IncentiveApplyIndicationType();
    }

    /**
     * Create an instance of {@link FMFDetailsType }
     * 
     */
    public FMFDetailsType createFMFDetailsType() {
        return new FMFDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveAppliedDetailsType }
     * 
     */
    public IncentiveAppliedDetailsType createIncentiveAppliedDetailsType() {
        return new IncentiveAppliedDetailsType();
    }

    /**
     * Create an instance of {@link ShippingOptionType }
     * 
     */
    public ShippingOptionType createShippingOptionType() {
        return new ShippingOptionType();
    }

    /**
     * Create an instance of {@link PaymentInfoType }
     * 
     */
    public PaymentInfoType createPaymentInfoType() {
        return new PaymentInfoType();
    }

    /**
     * Create an instance of {@link RefreshTokenStatusDetailsType }
     * 
     */
    public RefreshTokenStatusDetailsType createRefreshTokenStatusDetailsType() {
        return new RefreshTokenStatusDetailsType();
    }

    /**
     * Create an instance of {@link EbayItemPaymentDetailsItemType }
     * 
     */
    public EbayItemPaymentDetailsItemType createEbayItemPaymentDetailsItemType() {
        return new EbayItemPaymentDetailsItemType();
    }

    /**
     * Create an instance of {@link ReceiverInfoType }
     * 
     */
    public ReceiverInfoType createReceiverInfoType() {
        return new ReceiverInfoType();
    }

    /**
     * Create an instance of {@link ThreeDSecureResponseType }
     * 
     */
    public ThreeDSecureResponseType createThreeDSecureResponseType() {
        return new ThreeDSecureResponseType();
    }

    /**
     * Create an instance of {@link CreditCardNumberTypeType }
     * 
     */
    public CreditCardNumberTypeType createCreditCardNumberTypeType() {
        return new CreditCardNumberTypeType();
    }

    /**
     * Create an instance of {@link CalculatedShippingRateType }
     * 
     */
    public CalculatedShippingRateType createCalculatedShippingRateType() {
        return new CalculatedShippingRateType();
    }

    /**
     * Create an instance of {@link DiscountInfoType }
     * 
     */
    public DiscountInfoType createDiscountInfoType() {
        return new DiscountInfoType();
    }

    /**
     * Create an instance of {@link IncentiveInfoType }
     * 
     */
    public IncentiveInfoType createIncentiveInfoType() {
        return new IncentiveInfoType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link ListingDetailsType }
     * 
     */
    public ListingDetailsType createListingDetailsType() {
        return new ListingDetailsType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOptInDetailsType }
     * 
     */
    public ExternalRememberMeOptInDetailsType createExternalRememberMeOptInDetailsType() {
        return new ExternalRememberMeOptInDetailsType();
    }

    /**
     * Create an instance of {@link SiteHostedPictureType }
     * 
     */
    public SiteHostedPictureType createSiteHostedPictureType() {
        return new SiteHostedPictureType();
    }

    /**
     * Create an instance of {@link APICredentialsType }
     * 
     */
    public APICredentialsType createAPICredentialsType() {
        return new APICredentialsType();
    }

    /**
     * Create an instance of {@link PaymentRequestInfoType }
     * 
     */
    public PaymentRequestInfoType createPaymentRequestInfoType() {
        return new PaymentRequestInfoType();
    }

    /**
     * Create an instance of {@link IncentiveAppliedToType }
     * 
     */
    public IncentiveAppliedToType createIncentiveAppliedToType() {
        return new IncentiveAppliedToType();
    }

    /**
     * Create an instance of {@link ValType }
     * 
     */
    public ValType createValType() {
        return new ValType();
    }

    /**
     * Create an instance of {@link BillingPeriodDetailsTypeUpdate }
     * 
     */
    public BillingPeriodDetailsTypeUpdate createBillingPeriodDetailsTypeUpdate() {
        return new BillingPeriodDetailsTypeUpdate();
    }

    /**
     * Create an instance of {@link UserSelectedOptionType }
     * 
     */
    public UserSelectedOptionType createUserSelectedOptionType() {
        return new UserSelectedOptionType();
    }

    /**
     * Create an instance of {@link BillingPeriodDetailsType }
     * 
     */
    public BillingPeriodDetailsType createBillingPeriodDetailsType() {
        return new BillingPeriodDetailsType();
    }

    /**
     * Create an instance of {@link RecurringPaymentsProfileDetailsType }
     * 
     */
    public RecurringPaymentsProfileDetailsType createRecurringPaymentsProfileDetailsType() {
        return new RecurringPaymentsProfileDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveRequestDetailsType }
     * 
     */
    public IncentiveRequestDetailsType createIncentiveRequestDetailsType() {
        return new IncentiveRequestDetailsType();
    }

    /**
     * Create an instance of {@link RememberMeIDInfoType }
     * 
     */
    public RememberMeIDInfoType createRememberMeIDInfoType() {
        return new RememberMeIDInfoType();
    }

    /**
     * Create an instance of {@link OrderDetailsType }
     * 
     */
    public OrderDetailsType createOrderDetailsType() {
        return new OrderDetailsType();
    }

    /**
     * Create an instance of {@link PhoneNumberType }
     * 
     */
    public PhoneNumberType createPhoneNumberType() {
        return new PhoneNumberType();
    }

    /**
     * Create an instance of {@link CoupledBucketsType }
     * 
     */
    public CoupledBucketsType createCoupledBucketsType() {
        return new CoupledBucketsType();
    }

    /**
     * Create an instance of {@link ModifiedFieldType }
     * 
     */
    public ModifiedFieldType createModifiedFieldType() {
        return new ModifiedFieldType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeOwnerDetailsType }
     * 
     */
    public ExternalRememberMeOwnerDetailsType createExternalRememberMeOwnerDetailsType() {
        return new ExternalRememberMeOwnerDetailsType();
    }

    /**
     * Create an instance of {@link OtherPaymentMethodDetailsType }
     * 
     */
    public OtherPaymentMethodDetailsType createOtherPaymentMethodDetailsType() {
        return new OtherPaymentMethodDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationInfoType }
     * 
     */
    public IdentificationInfoType createIdentificationInfoType() {
        return new IdentificationInfoType();
    }

    /**
     * Create an instance of {@link SetDataRequestType }
     * 
     */
    public SetDataRequestType createSetDataRequestType() {
        return new SetDataRequestType();
    }

    /**
     * Create an instance of {@link CrossPromotionsType }
     * 
     */
    public CrossPromotionsType createCrossPromotionsType() {
        return new CrossPromotionsType();
    }

    /**
     * Create an instance of {@link SetDataResponseType }
     * 
     */
    public SetDataResponseType createSetDataResponseType() {
        return new SetDataResponseType();
    }

    /**
     * Create an instance of {@link PaymentItemInfoType }
     * 
     */
    public PaymentItemInfoType createPaymentItemInfoType() {
        return new PaymentItemInfoType();
    }

    /**
     * Create an instance of {@link AuthorizationRequestType }
     * 
     */
    public AuthorizationRequestType createAuthorizationRequestType() {
        return new AuthorizationRequestType();
    }

    /**
     * Create an instance of {@link BusinessInfoType }
     * 
     */
    public BusinessInfoType createBusinessInfoType() {
        return new BusinessInfoType();
    }

    /**
     * Create an instance of {@link OfferCouponInfoType }
     * 
     */
    public OfferCouponInfoType createOfferCouponInfoType() {
        return new OfferCouponInfoType();
    }

    /**
     * Create an instance of {@link ExternalRememberMeStatusDetailsType }
     * 
     */
    public ExternalRememberMeStatusDetailsType createExternalRememberMeStatusDetailsType() {
        return new ExternalRememberMeStatusDetailsType();
    }

    /**
     * Create an instance of {@link AccountEntryType }
     * 
     */
    public AccountEntryType createAccountEntryType() {
        return new AccountEntryType();
    }

    /**
     * Create an instance of {@link PaymentItemType }
     * 
     */
    public PaymentItemType createPaymentItemType() {
        return new PaymentItemType();
    }

    /**
     * Create an instance of {@link CharityType }
     * 
     */
    public CharityType createCharityType() {
        return new CharityType();
    }

    /**
     * Create an instance of {@link AttributeSetType }
     * 
     */
    public AttributeSetType createAttributeSetType() {
        return new AttributeSetType();
    }

    /**
     * Create an instance of {@link RiskFilterDetailsType }
     * 
     */
    public RiskFilterDetailsType createRiskFilterDetailsType() {
        return new RiskFilterDetailsType();
    }

    /**
     * Create an instance of {@link FlatShippingRateType }
     * 
     */
    public FlatShippingRateType createFlatShippingRateType() {
        return new FlatShippingRateType();
    }

    /**
     * Create an instance of {@link FlowControlDetailsType }
     * 
     */
    public FlowControlDetailsType createFlowControlDetailsType() {
        return new FlowControlDetailsType();
    }

    /**
     * Create an instance of {@link WalletItemsType }
     * 
     */
    public WalletItemsType createWalletItemsType() {
        return new WalletItemsType();
    }

    /**
     * Create an instance of {@link StorefrontType }
     * 
     */
    public StorefrontType createStorefrontType() {
        return new StorefrontType();
    }

    /**
     * Create an instance of {@link MerchantPullInfoType }
     * 
     */
    public MerchantPullInfoType createMerchantPullInfoType() {
        return new MerchantPullInfoType();
    }

    /**
     * Create an instance of {@link SalesTaxType }
     * 
     */
    public SalesTaxType createSalesTaxType() {
        return new SalesTaxType();
    }

    /**
     * Create an instance of {@link ExternalPartnerTrackingDetailsType }
     * 
     */
    public ExternalPartnerTrackingDetailsType createExternalPartnerTrackingDetailsType() {
        return new ExternalPartnerTrackingDetailsType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link FlightDetailsType }
     * 
     */
    public FlightDetailsType createFlightDetailsType() {
        return new FlightDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveBucketType }
     * 
     */
    public IncentiveBucketType createIncentiveBucketType() {
        return new IncentiveBucketType();
    }

    /**
     * Create an instance of {@link BMLOfferInfoType }
     * 
     */
    public BMLOfferInfoType createBMLOfferInfoType() {
        return new BMLOfferInfoType();
    }

    /**
     * Create an instance of {@link SellerDetailsType }
     * 
     */
    public SellerDetailsType createSellerDetailsType() {
        return new SellerDetailsType();
    }

    /**
     * Create an instance of {@link ActivationDetailsType }
     * 
     */
    public ActivationDetailsType createActivationDetailsType() {
        return new ActivationDetailsType();
    }

    /**
     * Create an instance of {@link BusinessOwnerInfoType }
     * 
     */
    public BusinessOwnerInfoType createBusinessOwnerInfoType() {
        return new BusinessOwnerInfoType();
    }

    /**
     * Create an instance of {@link ListOfAttributeSetType }
     * 
     */
    public ListOfAttributeSetType createListOfAttributeSetType() {
        return new ListOfAttributeSetType();
    }

    /**
     * Create an instance of {@link TaxIdDetailsType }
     * 
     */
    public TaxIdDetailsType createTaxIdDetailsType() {
        return new TaxIdDetailsType();
    }

    /**
     * Create an instance of {@link PaymentDetailsType }
     * 
     */
    public PaymentDetailsType createPaymentDetailsType() {
        return new PaymentDetailsType();
    }

    /**
     * Create an instance of {@link SenderDetailsType }
     * 
     */
    public SenderDetailsType createSenderDetailsType() {
        return new SenderDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveDetailType }
     * 
     */
    public IncentiveDetailType createIncentiveDetailType() {
        return new IncentiveDetailType();
    }

    /**
     * Create an instance of {@link InfoSharingDirectivesType }
     * 
     */
    public InfoSharingDirectivesType createInfoSharingDirectivesType() {
        return new InfoSharingDirectivesType();
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link DisplayControlDetailsType }
     * 
     */
    public DisplayControlDetailsType createDisplayControlDetailsType() {
        return new DisplayControlDetailsType();
    }

    /**
     * Create an instance of {@link AuthorizationResponseType }
     * 
     */
    public AuthorizationResponseType createAuthorizationResponseType() {
        return new AuthorizationResponseType();
    }

    /**
     * Create an instance of {@link SchedulingInfoType }
     * 
     */
    public SchedulingInfoType createSchedulingInfoType() {
        return new SchedulingInfoType();
    }

    /**
     * Create an instance of {@link SubscriptionTermsType }
     * 
     */
    public SubscriptionTermsType createSubscriptionTermsType() {
        return new SubscriptionTermsType();
    }

    /**
     * Create an instance of {@link BuyerDetailType }
     * 
     */
    public BuyerDetailType createBuyerDetailType() {
        return new BuyerDetailType();
    }

    /**
     * Create an instance of {@link ShippingCarrierDetailsType }
     * 
     */
    public ShippingCarrierDetailsType createShippingCarrierDetailsType() {
        return new ShippingCarrierDetailsType();
    }

    /**
     * Create an instance of {@link TransactionStatusType }
     * 
     */
    public TransactionStatusType createTransactionStatusType() {
        return new TransactionStatusType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link ListingDesignerType }
     * 
     */
    public ListingDesignerType createListingDesignerType() {
        return new ListingDesignerType();
    }

    /**
     * Create an instance of {@link DeviceDetailsType }
     * 
     */
    public DeviceDetailsType createDeviceDetailsType() {
        return new DeviceDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveItemType }
     * 
     */
    public IncentiveItemType createIncentiveItemType() {
        return new IncentiveItemType();
    }

    /**
     * Create an instance of {@link RiskFilterListType }
     * 
     */
    public RiskFilterListType createRiskFilterListType() {
        return new RiskFilterListType();
    }

    /**
     * Create an instance of {@link VATDetailsType }
     * 
     */
    public VATDetailsType createVATDetailsType() {
        return new VATDetailsType();
    }

    /**
     * Create an instance of {@link IdentityTokenInfoType }
     * 
     */
    public IdentityTokenInfoType createIdentityTokenInfoType() {
        return new IdentityTokenInfoType();
    }

    /**
     * Create an instance of {@link FaultDetailsType }
     * 
     */
    public FaultDetailsType createFaultDetailsType() {
        return new FaultDetailsType();
    }

    /**
     * Create an instance of {@link AdditionalFeeType }
     * 
     */
    public AdditionalFeeType createAdditionalFeeType() {
        return new AdditionalFeeType();
    }

    /**
     * Create an instance of {@link RecurringPaymentsSummaryType }
     * 
     */
    public RecurringPaymentsSummaryType createRecurringPaymentsSummaryType() {
        return new RecurringPaymentsSummaryType();
    }

    /**
     * Create an instance of {@link OptionType }
     * 
     */
    public OptionType createOptionType() {
        return new OptionType();
    }

    /**
     * Create an instance of {@link PromotedItemType }
     * 
     */
    public PromotedItemType createPromotedItemType() {
        return new PromotedItemType();
    }

    /**
     * Create an instance of {@link SubscriptionInfoType }
     * 
     */
    public SubscriptionInfoType createSubscriptionInfoType() {
        return new SubscriptionInfoType();
    }

    /**
     * Create an instance of {@link ScheduleDetailsType }
     * 
     */
    public ScheduleDetailsType createScheduleDetailsType() {
        return new ScheduleDetailsType();
    }

    /**
     * Create an instance of {@link BillingAgreementDetailsType }
     * 
     */
    public BillingAgreementDetailsType createBillingAgreementDetailsType() {
        return new BillingAgreementDetailsType();
    }

    /**
     * Create an instance of {@link AuctionInfoType }
     * 
     */
    public AuctionInfoType createAuctionInfoType() {
        return new AuctionInfoType();
    }

    /**
     * Create an instance of {@link PaymentDirectivesType }
     * 
     */
    public PaymentDirectivesType createPaymentDirectivesType() {
        return new PaymentDirectivesType();
    }

    /**
     * Create an instance of {@link UserIdPasswordType }
     * 
     */
    public UserIdPasswordType createUserIdPasswordType() {
        return new UserIdPasswordType();
    }

    /**
     * Create an instance of {@link ReferenceCreditCardDetailsType }
     * 
     */
    public ReferenceCreditCardDetailsType createReferenceCreditCardDetailsType() {
        return new ReferenceCreditCardDetailsType();
    }

    /**
     * Create an instance of {@link IncentiveDetailsType }
     * 
     */
    public IncentiveDetailsType createIncentiveDetailsType() {
        return new IncentiveDetailsType();
    }

    /**
     * Create an instance of {@link ErrorParameterType }
     * 
     */
    public ErrorParameterType createErrorParameterType() {
        return new ErrorParameterType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link BankAccountDetailsType }
     * 
     */
    public BankAccountDetailsType createBankAccountDetailsType() {
        return new BankAccountDetailsType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link FundingSourceDetailsType }
     * 
     */
    public FundingSourceDetailsType createFundingSourceDetailsType() {
        return new FundingSourceDetailsType();
    }

    /**
     * Create an instance of {@link AdditionalAccountType }
     * 
     */
    public AdditionalAccountType createAdditionalAccountType() {
        return new AdditionalAccountType();
    }

    /**
     * Create an instance of {@link PayerInfoType }
     * 
     */
    public PayerInfoType createPayerInfoType() {
        return new PayerInfoType();
    }

    /**
     * Create an instance of {@link BuyerDetailsType }
     * 
     */
    public BuyerDetailsType createBuyerDetailsType() {
        return new BuyerDetailsType();
    }

    /**
     * Create an instance of {@link MobileIDInfoType }
     * 
     */
    public MobileIDInfoType createMobileIDInfoType() {
        return new MobileIDInfoType();
    }

    /**
     * Create an instance of {@link CoupledPaymentInfoType }
     * 
     */
    public CoupledPaymentInfoType createCoupledPaymentInfoType() {
        return new CoupledPaymentInfoType();
    }

    /**
     * Create an instance of {@link VendorHostedPictureType }
     * 
     */
    public VendorHostedPictureType createVendorHostedPictureType() {
        return new VendorHostedPictureType();
    }

    /**
     * Create an instance of {@link EnhancedInitiateRecoupRequestDetailsType }
     * 
     */
    public EnhancedInitiateRecoupRequestDetailsType createEnhancedInitiateRecoupRequestDetailsType() {
        return new EnhancedInitiateRecoupRequestDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedCompleteRecoupRequestDetailsType }
     * 
     */
    public EnhancedCompleteRecoupRequestDetailsType createEnhancedCompleteRecoupRequestDetailsType() {
        return new EnhancedCompleteRecoupRequestDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedCancelRecoupRequestDetailsType }
     * 
     */
    public EnhancedCancelRecoupRequestDetailsType createEnhancedCancelRecoupRequestDetailsType() {
        return new EnhancedCancelRecoupRequestDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedCompleteRecoupResponseDetailsType }
     * 
     */
    public EnhancedCompleteRecoupResponseDetailsType createEnhancedCompleteRecoupResponseDetailsType() {
        return new EnhancedCompleteRecoupResponseDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedPaymentDataType }
     * 
     */
    public EnhancedPaymentDataType createEnhancedPaymentDataType() {
        return new EnhancedPaymentDataType();
    }

    /**
     * Create an instance of {@link EnhancedCheckoutDataType }
     * 
     */
    public EnhancedCheckoutDataType createEnhancedCheckoutDataType() {
        return new EnhancedCheckoutDataType();
    }

    /**
     * Create an instance of {@link EnhancedPayerInfoType }
     * 
     */
    public EnhancedPayerInfoType createEnhancedPayerInfoType() {
        return new EnhancedPayerInfoType();
    }

    /**
     * Create an instance of {@link EnhancedPaymentInfoType }
     * 
     */
    public EnhancedPaymentInfoType createEnhancedPaymentInfoType() {
        return new EnhancedPaymentInfoType();
    }

    /**
     * Create an instance of {@link EnhancedItemDataType }
     * 
     */
    public EnhancedItemDataType createEnhancedItemDataType() {
        return new EnhancedItemDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAuthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoAuthorizationResponse")
    public JAXBElement<DoAuthorizationResponseType> createDoAuthorizationResponse(DoAuthorizationResponseType value) {
        return new JAXBElement<DoAuthorizationResponseType>(_DoAuthorizationResponse_QNAME, DoAuthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuthFlowParamResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAuthFlowParamResponse")
    public JAXBElement<SetAuthFlowParamResponseType> createSetAuthFlowParamResponse(SetAuthFlowParamResponseType value) {
        return new JAXBElement<SetAuthFlowParamResponseType>(_SetAuthFlowParamResponse_QNAME, SetAuthFlowParamResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RefundInfo")
    public JAXBElement<RefundInfoType> createRefundInfo(RefundInfoType value) {
        return new JAXBElement<RefundInfoType>(_RefundInfo_QNAME, RefundInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StoreOwner")
    public JAXBElement<Boolean> createStoreOwner(Boolean value) {
        return new JAXBElement<Boolean>(_StoreOwner_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StateOrProvince")
    public JAXBElement<String> createStateOrProvince(String value) {
        return new JAXBElement<String>(_StateOrProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressVerifyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "AddressVerifyRequest")
    public JAXBElement<AddressVerifyRequestType> createAddressVerifyRequest(AddressVerifyRequestType value) {
        return new JAXBElement<AddressVerifyRequestType>(_AddressVerifyRequest_QNAME, AddressVerifyRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Currency")
    public JAXBElement<CurrencyCodeType> createCurrency(CurrencyCodeType value) {
        return new JAXBElement<CurrencyCodeType>(_Currency_QNAME, CurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBillingAgreementRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetCustomerBillingAgreementRequestDetails")
    public JAXBElement<SetCustomerBillingAgreementRequestDetailsType> createSetCustomerBillingAgreementRequestDetails(SetCustomerBillingAgreementRequestDetailsType value) {
        return new JAXBElement<SetCustomerBillingAgreementRequestDetailsType>(_SetCustomerBillingAgreementRequestDetails_QNAME, SetCustomerBillingAgreementRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterBoardingRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "EnterBoardingRequest")
    public JAXBElement<EnterBoardingRequestType> createEnterBoardingRequest(EnterBoardingRequestType value) {
        return new JAXBElement<EnterBoardingRequestType>(_EnterBoardingRequest_QNAME, EnterBoardingRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCheckoutOperationsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ExecuteCheckoutOperationsResponseDetails")
    public JAXBElement<ExecuteCheckoutOperationsResponseDetailsType> createExecuteCheckoutOperationsResponseDetails(ExecuteCheckoutOperationsResponseDetailsType value) {
        return new JAXBElement<ExecuteCheckoutOperationsResponseDetailsType>(_ExecuteCheckoutOperationsResponseDetails_QNAME, ExecuteCheckoutOperationsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManageRecurringPaymentsProfileStatusRequest")
    public JAXBElement<ManageRecurringPaymentsProfileStatusRequestType> createManageRecurringPaymentsProfileStatusRequest(ManageRecurringPaymentsProfileStatusRequestType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusRequestType>(_ManageRecurringPaymentsProfileStatusRequest_QNAME, ManageRecurringPaymentsProfileStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoNonReferencedCreditRequestDetails")
    public JAXBElement<DoNonReferencedCreditRequestDetailsType> createDoNonReferencedCreditRequestDetails(DoNonReferencedCreditRequestDetailsType value) {
        return new JAXBElement<DoNonReferencedCreditRequestDetailsType>(_DoNonReferencedCreditRequestDetails_QNAME, DoNonReferencedCreditRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardingDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBoardingDetailsRequest")
    public JAXBElement<GetBoardingDetailsRequestType> createGetBoardingDetailsRequest(GetBoardingDetailsRequestType value) {
        return new JAXBElement<GetBoardingDetailsRequestType>(_GetBoardingDetailsRequest_QNAME, GetBoardingDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCancelRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoCancelRequest")
    public JAXBElement<DoCancelRequestType> createDoCancelRequest(DoCancelRequestType value) {
        return new JAXBElement<DoCancelRequestType>(_DoCancelRequest_QNAME, DoCancelRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetMobileStatusRequest")
    public JAXBElement<GetMobileStatusRequestType> createGetMobileStatusRequest(GetMobileStatusRequestType value) {
        return new JAXBElement<GetMobileStatusRequestType>(_GetMobileStatusRequest_QNAME, GetMobileStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCheckoutOperationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ExecuteCheckoutOperationsRequest")
    public JAXBElement<ExecuteCheckoutOperationsRequestType> createExecuteCheckoutOperationsRequest(ExecuteCheckoutOperationsRequestType value) {
        return new JAXBElement<ExecuteCheckoutOperationsRequestType>(_ExecuteCheckoutOperationsRequest_QNAME, ExecuteCheckoutOperationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetButtonDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetButtonDetailsResponse")
    public JAXBElement<BMGetButtonDetailsResponseType> createBMGetButtonDetailsResponse(BMGetButtonDetailsResponseType value) {
        return new JAXBElement<BMGetButtonDetailsResponseType>(_BMGetButtonDetailsResponse_QNAME, BMGetButtonDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RegistrationAddress")
    public JAXBElement<AddressType> createRegistrationAddress(AddressType value) {
        return new JAXBElement<AddressType>(_RegistrationAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMButtonSearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMButtonSearchRequest")
    public JAXBElement<BMButtonSearchRequestType> createBMButtonSearchRequest(BMButtonSearchRequestType value) {
        return new JAXBElement<BMButtonSearchRequestType>(_BMButtonSearchRequest_QNAME, BMButtonSearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "MerchantData")
    public JAXBElement<MerchantDataType> createMerchantData(MerchantDataType value) {
        return new JAXBElement<MerchantDataType>(_MerchantData_QNAME, MerchantDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecurringPaymentsProfileDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetRecurringPaymentsProfileDetailsResponseDetails")
    public JAXBElement<GetRecurringPaymentsProfileDetailsResponseDetailsType> createGetRecurringPaymentsProfileDetailsResponseDetails(GetRecurringPaymentsProfileDetailsResponseDetailsType value) {
        return new JAXBElement<GetRecurringPaymentsProfileDetailsResponseDetailsType>(_GetRecurringPaymentsProfileDetailsResponseDetails_QNAME, GetRecurringPaymentsProfileDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPExpressCheckoutPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPExpressCheckoutPaymentRequest")
    public JAXBElement<DoUATPExpressCheckoutPaymentRequestType> createDoUATPExpressCheckoutPaymentRequest(DoUATPExpressCheckoutPaymentRequestType value) {
        return new JAXBElement<DoUATPExpressCheckoutPaymentRequestType>(_DoUATPExpressCheckoutPaymentRequest_QNAME, DoUATPExpressCheckoutPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCaptureResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoCaptureResponse")
    public JAXBElement<DoCaptureResponseType> createDoCaptureResponse(DoCaptureResponseType value) {
        return new JAXBElement<DoCaptureResponseType>(_DoCaptureResponse_QNAME, DoCaptureResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBillingAgreementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateBillingAgreementRequest")
    public JAXBElement<CreateBillingAgreementRequestType> createCreateBillingAgreementRequest(CreateBillingAgreementRequestType value) {
        return new JAXBElement<CreateBillingAgreementRequestType>(_CreateBillingAgreementRequest_QNAME, CreateBillingAgreementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingAgreementCustomerDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBillingAgreementCustomerDetailsResponse")
    public JAXBElement<GetBillingAgreementCustomerDetailsResponseType> createGetBillingAgreementCustomerDetailsResponse(GetBillingAgreementCustomerDetailsResponseType value) {
        return new JAXBElement<GetBillingAgreementCustomerDetailsResponseType>(_GetBillingAgreementCustomerDetailsResponse_QNAME, GetBillingAgreementCustomerDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManageRecurringPaymentsProfileStatusResponse")
    public JAXBElement<ManageRecurringPaymentsProfileStatusResponseType> createManageRecurringPaymentsProfileStatusResponse(ManageRecurringPaymentsProfileStatusResponseType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusResponseType>(_ManageRecurringPaymentsProfileStatusResponse_QNAME, ManageRecurringPaymentsProfileStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillUserRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillUserRequest")
    public JAXBElement<BillUserRequestType> createBillUserRequest(BillUserRequestType value) {
        return new JAXBElement<BillUserRequestType>(_BillUserRequest_QNAME, BillUserRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillOutstandingAmountResponse")
    public JAXBElement<BillOutstandingAmountResponseType> createBillOutstandingAmountResponse(BillOutstandingAmountResponseType value) {
        return new JAXBElement<BillOutstandingAmountResponseType>(_BillOutstandingAmountResponse_QNAME, BillOutstandingAmountResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Transactions")
    public JAXBElement<TransactionsType> createTransactions(TransactionsType value) {
        return new JAXBElement<TransactionsType>(_Transactions_QNAME, TransactionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingInfo")
    public JAXBElement<ShippingInfoType> createShippingInfo(ShippingInfoType value) {
        return new JAXBElement<ShippingInfoType>(_ShippingInfo_QNAME, ShippingInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SellerPaymentAddress")
    public JAXBElement<AddressType> createSellerPaymentAddress(AddressType value) {
        return new JAXBElement<AddressType>(_SellerPaymentAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "EnhancedData")
    public JAXBElement<EnhancedDataType> createEnhancedData(EnhancedDataType value) {
        return new JAXBElement<EnhancedDataType>(_EnhancedData_QNAME, EnhancedDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalRememberMeOptOutRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ExternalRememberMeOptOutRequest")
    public JAXBElement<ExternalRememberMeOptOutRequestType> createExternalRememberMeOptOutRequest(ExternalRememberMeOptOutRequestType value) {
        return new JAXBElement<ExternalRememberMeOptOutRequestType>(_ExternalRememberMeOptOutRequest_QNAME, ExternalRememberMeOptOutRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccessPermissionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateAccessPermissionsRequest")
    public JAXBElement<UpdateAccessPermissionsRequestType> createUpdateAccessPermissionsRequest(UpdateAccessPermissionsRequestType value) {
        return new JAXBElement<UpdateAccessPermissionsRequestType>(_UpdateAccessPermissionsRequest_QNAME, UpdateAccessPermissionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShipToAddress")
    public JAXBElement<AddressType> createShipToAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ShipToAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCompleteRecoupRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedCompleteRecoupRequestDetails")
    public JAXBElement<EnhancedCompleteRecoupRequestDetailsType> createEnhancedCompleteRecoupRequestDetails(EnhancedCompleteRecoupRequestDetailsType value) {
        return new JAXBElement<EnhancedCompleteRecoupRequestDetailsType>(_EnhancedCompleteRecoupRequestDetails_QNAME, EnhancedCompleteRecoupRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ManageRecurringPaymentsProfileStatusResponseDetails")
    public JAXBElement<ManageRecurringPaymentsProfileStatusResponseDetailsType> createManageRecurringPaymentsProfileStatusResponseDetails(ManageRecurringPaymentsProfileStatusResponseDetailsType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusResponseDetailsType>(_ManageRecurringPaymentsProfileStatusResponseDetails_QNAME, ManageRecurringPaymentsProfileStatusResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCheckoutOperationsRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ExecuteCheckoutOperationsRequestDetails")
    public JAXBElement<ExecuteCheckoutOperationsRequestDetailsType> createExecuteCheckoutOperationsRequestDetails(ExecuteCheckoutOperationsRequestDetailsType value) {
        return new JAXBElement<ExecuteCheckoutOperationsRequestDetailsType>(_ExecuteCheckoutOperationsRequestDetails_QNAME, ExecuteCheckoutOperationsRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMobileCheckoutPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoMobileCheckoutPaymentRequest")
    public JAXBElement<DoMobileCheckoutPaymentRequestType> createDoMobileCheckoutPaymentRequest(DoMobileCheckoutPaymentRequestType value) {
        return new JAXBElement<DoMobileCheckoutPaymentRequestType>(_DoMobileCheckoutPaymentRequest_QNAME, DoMobileCheckoutPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingServiceCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingService")
    public JAXBElement<ShippingServiceCodeType> createShippingService(ShippingServiceCodeType value) {
        return new JAXBElement<ShippingServiceCodeType>(_ShippingService_QNAME, ShippingServiceCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMobileCheckoutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetMobileCheckoutResponse")
    public JAXBElement<SetMobileCheckoutResponseType> createSetMobileCheckoutResponse(SetMobileCheckoutResponseType value) {
        return new JAXBElement<SetMobileCheckoutResponseType>(_SetMobileCheckoutResponse_QNAME, SetMobileCheckoutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "OfferDetails")
    public JAXBElement<OfferDetailsType> createOfferDetails(OfferDetailsType value) {
        return new JAXBElement<OfferDetailsType>(_OfferDetails_QNAME, OfferDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RefundItemDetails")
    public JAXBElement<InvoiceItemType> createRefundItemDetails(InvoiceItemType value) {
        return new JAXBElement<InvoiceItemType>(_RefundItemDetails_QNAME, InvoiceItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReauthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReauthorizationResponse")
    public JAXBElement<DoReauthorizationResponseType> createDoReauthorizationResponse(DoReauthorizationResponseType value) {
        return new JAXBElement<DoReauthorizationResponseType>(_DoReauthorizationResponse_QNAME, DoReauthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterBoardingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "EnterBoardingResponse")
    public JAXBElement<EnterBoardingResponseType> createEnterBoardingResponse(EnterBoardingResponseType value) {
        return new JAXBElement<EnterBoardingResponseType>(_EnterBoardingResponse_QNAME, EnterBoardingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAuthDetailsRequest")
    public JAXBElement<GetAuthDetailsRequestType> createGetAuthDetailsRequest(GetAuthDetailsRequestType value) {
        return new JAXBElement<GetAuthDetailsRequestType>(_GetAuthDetailsRequest_QNAME, GetAuthDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoExpressCheckoutPaymentResponseDetails")
    public JAXBElement<DoExpressCheckoutPaymentResponseDetailsType> createDoExpressCheckoutPaymentResponseDetails(DoExpressCheckoutPaymentResponseDetailsType value) {
        return new JAXBElement<DoExpressCheckoutPaymentResponseDetailsType>(_DoExpressCheckoutPaymentResponseDetails_QNAME, DoExpressCheckoutPaymentResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateRecurringPaymentsProfileResponse")
    public JAXBElement<UpdateRecurringPaymentsProfileResponseType> createUpdateRecurringPaymentsProfileResponse(UpdateRecurringPaymentsProfileResponseType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileResponseType>(_UpdateRecurringPaymentsProfileResponse_QNAME, UpdateRecurringPaymentsProfileResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardingDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetBoardingDetailsResponseDetails")
    public JAXBElement<GetBoardingDetailsResponseDetailsType> createGetBoardingDetailsResponseDetails(GetBoardingDetailsResponseDetailsType value) {
        return new JAXBElement<GetBoardingDetailsResponseDetailsType>(_GetBoardingDetailsResponseDetails_QNAME, GetBoardingDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoNonReferencedCreditResponseDetails")
    public JAXBElement<DoNonReferencedCreditResponseDetailsType> createDoNonReferencedCreditResponseDetails(DoNonReferencedCreditResponseDetailsType value) {
        return new JAXBElement<DoNonReferencedCreditResponseDetailsType>(_DoNonReferencedCreditResponseDetails_QNAME, DoNonReferencedCreditResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillOutstandingAmountRequestDetails")
    public JAXBElement<BillOutstandingAmountRequestDetailsType> createBillOutstandingAmountRequestDetails(BillOutstandingAmountRequestDetailsType value) {
        return new JAXBElement<BillOutstandingAmountRequestDetailsType>(_BillOutstandingAmountRequestDetails_QNAME, BillOutstandingAmountRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCompleteRecoupResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedCompleteRecoupResponseDetails")
    public JAXBElement<EnhancedCompleteRecoupResponseDetailsType> createEnhancedCompleteRecoupResponseDetails(EnhancedCompleteRecoupResponseDetailsType value) {
        return new JAXBElement<EnhancedCompleteRecoupResponseDetailsType>(_EnhancedCompleteRecoupResponseDetails_QNAME, EnhancedCompleteRecoupResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBillingAgreementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateBillingAgreementResponse")
    public JAXBElement<CreateBillingAgreementResponseType> createCreateBillingAgreementResponse(CreateBillingAgreementResponseType value) {
        return new JAXBElement<CreateBillingAgreementResponseType>(_CreateBillingAgreementResponse_QNAME, CreateBillingAgreementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetIncentiveEvaluationResponseDetails")
    public JAXBElement<GetIncentiveEvaluationResponseDetailsType> createGetIncentiveEvaluationResponseDetails(GetIncentiveEvaluationResponseDetailsType value) {
        return new JAXBElement<GetIncentiveEvaluationResponseDetailsType>(_GetIncentiveEvaluationResponseDetails_QNAME, GetIncentiveEvaluationResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecurringPaymentsProfileDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetRecurringPaymentsProfileDetailsRequest")
    public JAXBElement<GetRecurringPaymentsProfileDetailsRequestType> createGetRecurringPaymentsProfileDetailsRequest(GetRecurringPaymentsProfileDetailsRequestType value) {
        return new JAXBElement<GetRecurringPaymentsProfileDetailsRequestType>(_GetRecurringPaymentsProfileDetailsRequest_QNAME, GetRecurringPaymentsProfileDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "TaxInfo")
    public JAXBElement<TaxInfoType> createTaxInfo(TaxInfoType value) {
        return new JAXBElement<TaxInfoType>(_TaxInfo_QNAME, TaxInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPermissionDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAccessPermissionDetailsRequest")
    public JAXBElement<GetAccessPermissionDetailsRequestType> createGetAccessPermissionDetailsRequest(GetAccessPermissionDetailsRequestType value) {
        return new JAXBElement<GetAccessPermissionDetailsRequestType>(_GetAccessPermissionDetailsRequest_QNAME, GetAccessPermissionDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CategoryArray")
    public JAXBElement<CategoryArrayType> createCategoryArray(CategoryArrayType value) {
        return new JAXBElement<CategoryArrayType>(_CategoryArray_QNAME, CategoryArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantStoreDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "MerchantStoreDetails")
    public JAXBElement<MerchantStoreDetailsType> createMerchantStoreDetails(MerchantStoreDetailsType value) {
        return new JAXBElement<MerchantStoreDetailsType>(_MerchantStoreDetails_QNAME, MerchantStoreDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TupleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "MerchantDataMap")
    public JAXBElement<TupleType> createMerchantDataMap(TupleType value) {
        return new JAXBElement<TupleType>(_MerchantDataMap_QNAME, TupleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AccountSummary")
    public JAXBElement<AccountSummaryType> createAccountSummary(AccountSummaryType value) {
        return new JAXBElement<AccountSummaryType>(_AccountSummary_QNAME, AccountSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateRecurringPaymentsProfileResponse")
    public JAXBElement<CreateRecurringPaymentsProfileResponseType> createCreateRecurringPaymentsProfileResponse(CreateRecurringPaymentsProfileResponseType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileResponseType>(_CreateRecurringPaymentsProfileResponse_QNAME, CreateRecurringPaymentsProfileResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreateRecurringPaymentsProfileRequestDetails")
    public JAXBElement<CreateRecurringPaymentsProfileRequestDetailsType> createCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileRequestDetailsType>(_CreateRecurringPaymentsProfileRequestDetails_QNAME, CreateRecurringPaymentsProfileRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "TransactionID")
    public JAXBElement<String> createTransactionID(String value) {
        return new JAXBElement<String>(_TransactionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMSetInventoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMSetInventoryResponse")
    public JAXBElement<BMSetInventoryResponseType> createBMSetInventoryResponse(BMSetInventoryResponseType value) {
        return new JAXBElement<BMSetInventoryResponseType>(_BMSetInventoryResponse_QNAME, BMSetInventoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoReferenceTransactionResponseDetails")
    public JAXBElement<DoReferenceTransactionResponseDetailsType> createDoReferenceTransactionResponseDetails(DoReferenceTransactionResponseDetailsType value) {
        return new JAXBElement<DoReferenceTransactionResponseDetailsType>(_DoReferenceTransactionResponseDetails_QNAME, DoReferenceTransactionResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReceiptID")
    public JAXBElement<String> createReceiptID(String value) {
        return new JAXBElement<String>(_ReceiptID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillOutstandingAmountResponseDetails")
    public JAXBElement<BillOutstandingAmountResponseDetailsType> createBillOutstandingAmountResponseDetails(BillOutstandingAmountResponseDetailsType value) {
        return new JAXBElement<BillOutstandingAmountResponseDetailsType>(_BillOutstandingAmountResponseDetails_QNAME, BillOutstandingAmountResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentTransactionDetails")
    public JAXBElement<PaymentTransactionType> createPaymentTransactionDetails(PaymentTransactionType value) {
        return new JAXBElement<PaymentTransactionType>(_PaymentTransactionDetails_QNAME, PaymentTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "TransactionSearchResponse")
    public JAXBElement<TransactionSearchResponseType> createTransactionSearchResponse(TransactionSearchResponseType value) {
        return new JAXBElement<TransactionSearchResponseType>(_TransactionSearchResponse_QNAME, TransactionSearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMButtonSearchResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMButtonSearchResponse")
    public JAXBElement<BMButtonSearchResponseType> createBMButtonSearchResponse(BMButtonSearchResponseType value) {
        return new JAXBElement<BMButtonSearchResponseType>(_BMButtonSearchResponse_QNAME, BMButtonSearchResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardingDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBoardingDetailsResponse")
    public JAXBElement<GetBoardingDetailsResponseType> createGetBoardingDetailsResponse(GetBoardingDetailsResponseType value) {
        return new JAXBElement<GetBoardingDetailsResponseType>(_GetBoardingDetailsResponse_QNAME, GetBoardingDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateAuthorizationResponse")
    public JAXBElement<UpdateAuthorizationResponseType> createUpdateAuthorizationResponse(UpdateAuthorizationResponseType value) {
        return new JAXBElement<UpdateAuthorizationResponseType>(_UpdateAuthorizationResponse_QNAME, UpdateAuthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CheckoutEnabled")
    public JAXBElement<Boolean> createCheckoutEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_CheckoutEnabled_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillOutstandingAmountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillOutstandingAmountRequest")
    public JAXBElement<BillOutstandingAmountRequestType> createBillOutstandingAmountRequest(BillOutstandingAmountRequestType value) {
        return new JAXBElement<BillOutstandingAmountRequestType>(_BillOutstandingAmountRequest_QNAME, BillOutstandingAmountRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalRememberMeOptOutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ExternalRememberMeOptOutResponse")
    public JAXBElement<ExternalRememberMeOptOutResponseType> createExternalRememberMeOptOutResponse(ExternalRememberMeOptOutResponseType value) {
        return new JAXBElement<ExternalRememberMeOptOutResponseType>(_ExternalRememberMeOptOutResponse_QNAME, ExternalRememberMeOptOutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCancelResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoCancelResponse")
    public JAXBElement<DoCancelResponseType> createDoCancelResponse(DoCancelResponseType value) {
        return new JAXBElement<DoCancelResponseType>(_DoCancelResponse_QNAME, DoCancelResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAuthDetailsResponse")
    public JAXBElement<GetAuthDetailsResponseType> createGetAuthDetailsResponse(GetAuthDetailsResponseType value) {
        return new JAXBElement<GetAuthDetailsResponseType>(_GetAuthDetailsResponse_QNAME, GetAuthDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReferenceTransactionResponse")
    public JAXBElement<DoReferenceTransactionResponseType> createDoReferenceTransactionResponse(DoReferenceTransactionResponseType value) {
        return new JAXBElement<DoReferenceTransactionResponseType>(_DoReferenceTransactionResponse_QNAME, DoReferenceTransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingAgreementCustomerDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBillingAgreementCustomerDetailsRequest")
    public JAXBElement<GetBillingAgreementCustomerDetailsRequestType> createGetBillingAgreementCustomerDetailsRequest(GetBillingAgreementCustomerDetailsRequestType value) {
        return new JAXBElement<GetBillingAgreementCustomerDetailsRequestType>(_GetBillingAgreementCustomerDetailsRequest_QNAME, GetBillingAgreementCustomerDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCreateButtonRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMCreateButtonRequest")
    public JAXBElement<BMCreateButtonRequestType> createBMCreateButtonRequest(BMCreateButtonRequestType value) {
        return new JAXBElement<BMCreateButtonRequestType>(_BMCreateButtonRequest_QNAME, BMCreateButtonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UpdateRecurringPaymentsProfileResponseDetails")
    public JAXBElement<UpdateRecurringPaymentsProfileResponseDetailsType> createUpdateRecurringPaymentsProfileResponseDetails(UpdateRecurringPaymentsProfileResponseDetailsType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileResponseDetailsType>(_UpdateRecurringPaymentsProfileResponseDetails_QNAME, UpdateRecurringPaymentsProfileResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoVoidResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoVoidResponse")
    public JAXBElement<DoVoidResponseType> createDoVoidResponse(DoVoidResponseType value) {
        return new JAXBElement<DoVoidResponseType>(_DoVoidResponse_QNAME, DoVoidResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetButtonDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetButtonDetailsRequest")
    public JAXBElement<BMGetButtonDetailsRequestType> createBMGetButtonDetailsRequest(BMGetButtonDetailsRequestType value) {
        return new JAXBElement<BMGetButtonDetailsRequestType>(_BMGetButtonDetailsRequest_QNAME, BMGetButtonDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailsItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentDetailsItem")
    public JAXBElement<PaymentDetailsItemType> createPaymentDetailsItem(PaymentDetailsItemType value) {
        return new JAXBElement<PaymentDetailsItemType>(_PaymentDetailsItem_QNAME, PaymentDetailsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetExpressCheckoutRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetExpressCheckoutRequest")
    public JAXBElement<SetExpressCheckoutRequestType> createSetExpressCheckoutRequest(SetExpressCheckoutRequestType value) {
        return new JAXBElement<SetExpressCheckoutRequestType>(_SetExpressCheckoutRequest_QNAME, SetExpressCheckoutRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuthFlowParamRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetAuthFlowParamRequestDetails")
    public JAXBElement<SetAuthFlowParamRequestDetailsType> createSetAuthFlowParamRequestDetails(SetAuthFlowParamRequestDetailsType value) {
        return new JAXBElement<SetAuthFlowParamRequestDetailsType>(_SetAuthFlowParamRequestDetails_QNAME, SetAuthFlowParamRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingTransactionStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManagePendingTransactionStatusResponse")
    public JAXBElement<ManagePendingTransactionStatusResponseType> createManagePendingTransactionStatusResponse(ManagePendingTransactionStatusResponseType value) {
        return new JAXBElement<ManagePendingTransactionStatusResponseType>(_ManagePendingTransactionStatusResponse_QNAME, ManagePendingTransactionStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileStatusRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetMobileStatusRequestDetails")
    public JAXBElement<GetMobileStatusRequestDetailsType> createGetMobileStatusRequestDetails(GetMobileStatusRequestDetailsType value) {
        return new JAXBElement<GetMobileStatusRequestDetailsType>(_GetMobileStatusRequestDetails_QNAME, GetMobileStatusRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMUpdateButtonResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMUpdateButtonResponse")
    public JAXBElement<BMUpdateButtonResponseType> createBMUpdateButtonResponse(BMUpdateButtonResponseType value) {
        return new JAXBElement<BMUpdateButtonResponseType>(_BMUpdateButtonResponse_QNAME, BMUpdateButtonResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPermissionDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetAccessPermissionDetailsResponseDetails")
    public JAXBElement<GetAccessPermissionDetailsResponseDetailsType> createGetAccessPermissionDetailsResponseDetails(GetAccessPermissionDetailsResponseDetailsType value) {
        return new JAXBElement<GetAccessPermissionDetailsResponseDetailsType>(_GetAccessPermissionDetailsResponseDetails_QNAME, GetAccessPermissionDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StoreCategoryID")
    public JAXBElement<Integer> createStoreCategoryID(Integer value) {
        return new JAXBElement<Integer>(_StoreCategoryID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPAuthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPAuthorizationRequest")
    public JAXBElement<DoUATPAuthorizationRequestType> createDoUATPAuthorizationRequest(DoUATPAuthorizationRequestType value) {
        return new JAXBElement<DoUATPAuthorizationRequestType>(_DoUATPAuthorizationRequest_QNAME, DoUATPAuthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMManageButtonStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMManageButtonStatusResponse")
    public JAXBElement<BMManageButtonStatusResponseType> createBMManageButtonStatusResponse(BMManageButtonStatusResponseType value) {
        return new JAXBElement<BMManageButtonStatusResponseType>(_BMManageButtonStatusResponse_QNAME, BMManageButtonStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetInventoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetInventoryResponse")
    public JAXBElement<BMGetInventoryResponseType> createBMGetInventoryResponse(BMGetInventoryResponseType value) {
        return new JAXBElement<BMGetInventoryResponseType>(_BMGetInventoryResponse_QNAME, BMGetInventoryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateAuthorizationRequest")
    public JAXBElement<UpdateAuthorizationRequestType> createUpdateAuthorizationRequest(UpdateAuthorizationRequestType value) {
        return new JAXBElement<UpdateAuthorizationRequestType>(_UpdateAuthorizationRequest_QNAME, UpdateAuthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecurringPaymentsProfileDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetRecurringPaymentsProfileDetailsResponse")
    public JAXBElement<GetRecurringPaymentsProfileDetailsResponseType> createGetRecurringPaymentsProfileDetailsResponse(GetRecurringPaymentsProfileDetailsResponseType value) {
        return new JAXBElement<GetRecurringPaymentsProfileDetailsResponseType>(_GetRecurringPaymentsProfileDetailsResponse_QNAME, GetRecurringPaymentsProfileDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPAuthorizationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPAuthorizationResponse")
    public JAXBElement<DoUATPAuthorizationResponseType> createDoUATPAuthorizationResponse(DoUATPAuthorizationResponseType value) {
        return new JAXBElement<DoUATPAuthorizationResponseType>(_DoUATPAuthorizationResponse_QNAME, DoUATPAuthorizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBillingAgreementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetCustomerBillingAgreementRequest")
    public JAXBElement<SetCustomerBillingAgreementRequestType> createSetCustomerBillingAgreementRequest(SetCustomerBillingAgreementRequestType value) {
        return new JAXBElement<SetCustomerBillingAgreementRequestType>(_SetCustomerBillingAgreementRequest_QNAME, SetCustomerBillingAgreementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePendingTransactionStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ManagePendingTransactionStatusRequest")
    public JAXBElement<ManagePendingTransactionStatusRequestType> createManagePendingTransactionStatusRequest(ManagePendingTransactionStatusRequestType value) {
        return new JAXBElement<ManagePendingTransactionStatusRequestType>(_ManagePendingTransactionStatusRequest_QNAME, ManagePendingTransactionStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemTrackingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ItemTrackingDetails")
    public JAXBElement<ItemTrackingDetailsType> createItemTrackingDetails(ItemTrackingDetailsType value) {
        return new JAXBElement<ItemTrackingDetailsType>(_ItemTrackingDetails_QNAME, ItemTrackingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoUATPExpressCheckoutPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoUATPExpressCheckoutPaymentResponse")
    public JAXBElement<DoUATPExpressCheckoutPaymentResponseType> createDoUATPExpressCheckoutPaymentResponse(DoUATPExpressCheckoutPaymentResponseType value) {
        return new JAXBElement<DoUATPExpressCheckoutPaymentResponseType>(_DoUATPExpressCheckoutPaymentResponse_QNAME, DoUATPExpressCheckoutPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAuthFlowParamRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAuthFlowParamRequest")
    public JAXBElement<SetAuthFlowParamRequestType> createSetAuthFlowParamRequest(SetAuthFlowParamRequestType value) {
        return new JAXBElement<SetAuthFlowParamRequestType>(_SetAuthFlowParamRequest_QNAME, SetAuthFlowParamRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreateRecurringPaymentsProfileResponseDetails")
    public JAXBElement<CreateRecurringPaymentsProfileResponseDetailsType> createCreateRecurringPaymentsProfileResponseDetails(CreateRecurringPaymentsProfileResponseDetailsType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileResponseDetailsType>(_CreateRecurringPaymentsProfileResponseDetails_QNAME, CreateRecurringPaymentsProfileResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RegionID")
    public JAXBElement<String> createRegionID(String value) {
        return new JAXBElement<String>(_RegionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UpdateRecurringPaymentsProfileRequestDetails")
    public JAXBElement<UpdateRecurringPaymentsProfileRequestDetailsType> createUpdateRecurringPaymentsProfileRequestDetails(UpdateRecurringPaymentsProfileRequestDetailsType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileRequestDetailsType>(_UpdateRecurringPaymentsProfileRequestDetails_QNAME, UpdateRecurringPaymentsProfileRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetAuthDetailsResponseDetails")
    public JAXBElement<GetAuthDetailsResponseDetailsType> createGetAuthDetailsResponseDetails(GetAuthDetailsResponseDetailsType value) {
        return new JAXBElement<GetAuthDetailsResponseDetailsType>(_GetAuthDetailsResponseDetails_QNAME, GetAuthDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerPaymentMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentMethods")
    public JAXBElement<BuyerPaymentMethodCodeType> createPaymentMethods(BuyerPaymentMethodCodeType value) {
        return new JAXBElement<BuyerPaymentMethodCodeType>(_PaymentMethods_QNAME, BuyerPaymentMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAUpdateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BAUpdateResponse")
    public JAXBElement<BAUpdateResponseType> createBAUpdateResponse(BAUpdateResponseType value) {
        return new JAXBElement<BAUpdateResponseType>(_BAUpdateResponse_QNAME, BAUpdateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AuthorizationInfo")
    public JAXBElement<AuthorizationInfoType> createAuthorizationInfo(AuthorizationInfoType value) {
        return new JAXBElement<AuthorizationInfoType>(_AuthorizationInfo_QNAME, AuthorizationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerLevelCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SellerLevel")
    public JAXBElement<SellerLevelCodeType> createSellerLevel(SellerLevelCodeType value) {
        return new JAXBElement<SellerLevelCodeType>(_SellerLevel_QNAME, SellerLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetIncentiveEvaluationResponse")
    public JAXBElement<GetIncentiveEvaluationResponseType> createGetIncentiveEvaluationResponse(GetIncentiveEvaluationResponseType value) {
        return new JAXBElement<GetIncentiveEvaluationResponseType>(_GetIncentiveEvaluationResponse_QNAME, GetIncentiveEvaluationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetIncentiveEvaluationRequestDetails")
    public JAXBElement<GetIncentiveEvaluationRequestDetailsType> createGetIncentiveEvaluationRequestDetails(GetIncentiveEvaluationRequestDetailsType value) {
        return new JAXBElement<GetIncentiveEvaluationRequestDetailsType>(_GetIncentiveEvaluationRequestDetails_QNAME, GetIncentiveEvaluationRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReverseTransactionResponseDetails")
    public JAXBElement<ReverseTransactionResponseDetailsType> createReverseTransactionResponseDetails(ReverseTransactionResponseDetailsType value) {
        return new JAXBElement<ReverseTransactionResponseDetailsType>(_ReverseTransactionResponseDetails_QNAME, ReverseTransactionResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressVerifyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "AddressVerifyResponse")
    public JAXBElement<AddressVerifyResponseType> createAddressVerifyResponse(AddressVerifyResponseType value) {
        return new JAXBElement<AddressVerifyResponseType>(_AddressVerifyResponse_QNAME, AddressVerifyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AmountPaid")
    public JAXBElement<AmountType> createAmountPaid(AmountType value) {
        return new JAXBElement<AmountType>(_AmountPaid_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMSetInventoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMSetInventoryRequest")
    public JAXBElement<BMSetInventoryRequestType> createBMSetInventoryRequest(BMSetInventoryRequestType value) {
        return new JAXBElement<BMSetInventoryRequestType>(_BMSetInventoryRequest_QNAME, BMSetInventoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPalDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetPalDetailsResponse")
    public JAXBElement<GetPalDetailsResponseType> createGetPalDetailsResponse(GetPalDetailsResponseType value) {
        return new JAXBElement<GetPalDetailsResponseType>(_GetPalDetailsResponse_QNAME, GetPalDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterBoardingRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "EnterBoardingRequestDetails")
    public JAXBElement<EnterBoardingRequestDetailsType> createEnterBoardingRequestDetails(EnterBoardingRequestDetailsType value) {
        return new JAXBElement<EnterBoardingRequestDetailsType>(_EnterBoardingRequestDetails_QNAME, EnterBoardingRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListingDurationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ListingDuration")
    public JAXBElement<ListingDurationCodeType> createListingDuration(ListingDurationCodeType value) {
        return new JAXBElement<ListingDurationCodeType>(_ListingDuration_QNAME, ListingDurationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMobilePaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateMobilePaymentResponse")
    public JAXBElement<CreateMobilePaymentResponseType> createCreateMobilePaymentResponse(CreateMobilePaymentResponseType value) {
        return new JAXBElement<CreateMobilePaymentResponseType>(_CreateMobilePaymentResponse_QNAME, CreateMobilePaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomSecurityHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RequesterCredentials")
    public JAXBElement<CustomSecurityHeaderType> createRequesterCredentials(CustomSecurityHeaderType value) {
        return new JAXBElement<CustomSecurityHeaderType>(_RequesterCredentials_QNAME, CustomSecurityHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillUserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BillUserResponse")
    public JAXBElement<BillUserResponseType> createBillUserResponse(BillUserResponseType value) {
        return new JAXBElement<BillUserResponseType>(_BillUserResponse_QNAME, BillUserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoExpressCheckoutPaymentResponse")
    public JAXBElement<DoExpressCheckoutPaymentResponseType> createDoExpressCheckoutPaymentResponse(DoExpressCheckoutPaymentResponseType value) {
        return new JAXBElement<DoExpressCheckoutPaymentResponseType>(_DoExpressCheckoutPaymentResponse_QNAME, DoExpressCheckoutPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMobileCheckoutRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetMobileCheckoutRequestDetails")
    public JAXBElement<SetMobileCheckoutRequestDetailsType> createSetMobileCheckoutRequestDetails(SetMobileCheckoutRequestDetailsType value) {
        return new JAXBElement<SetMobileCheckoutRequestDetailsType>(_SetMobileCheckoutRequestDetails_QNAME, SetMobileCheckoutRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "User")
    public JAXBElement<UserType> createUser(UserType value) {
        return new JAXBElement<UserType>(_User_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecurringPaymentsProfileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateRecurringPaymentsProfileRequest")
    public JAXBElement<CreateRecurringPaymentsProfileRequestType> createCreateRecurringPaymentsProfileRequest(CreateRecurringPaymentsProfileRequestType value) {
        return new JAXBElement<CreateRecurringPaymentsProfileRequestType>(_CreateRecurringPaymentsProfileRequest_QNAME, CreateRecurringPaymentsProfileRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRecurringPaymentsProfileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateRecurringPaymentsProfileRequest")
    public JAXBElement<UpdateRecurringPaymentsProfileRequestType> createUpdateRecurringPaymentsProfileRequest(UpdateRecurringPaymentsProfileRequestType value) {
        return new JAXBElement<UpdateRecurringPaymentsProfileRequestType>(_UpdateRecurringPaymentsProfileRequest_QNAME, UpdateRecurringPaymentsProfileRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoVoidRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoVoidRequest")
    public JAXBElement<DoVoidRequestType> createDoVoidRequest(DoVoidRequestType value) {
        return new JAXBElement<DoVoidRequestType>(_DoVoidRequest_QNAME, DoVoidRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMobileCheckoutPaymentResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoMobileCheckoutPaymentResponseDetails")
    public JAXBElement<DoMobileCheckoutPaymentResponseDetailsType> createDoMobileCheckoutPaymentResponseDetails(DoMobileCheckoutPaymentResponseDetailsType value) {
        return new JAXBElement<DoMobileCheckoutPaymentResponseDetailsType>(_DoMobileCheckoutPaymentResponseDetails_QNAME, DoMobileCheckoutPaymentResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AccountCode")
    public JAXBElement<String> createAccountCode(String value) {
        return new JAXBElement<String>(_AccountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMGetInventoryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMGetInventoryRequest")
    public JAXBElement<BMGetInventoryRequestType> createBMGetInventoryRequest(BMGetInventoryRequestType value) {
        return new JAXBElement<BMGetInventoryRequestType>(_BMGetInventoryRequest_QNAME, BMGetInventoryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPermissionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAccessPermissionsResponse")
    public JAXBElement<SetAccessPermissionsResponseType> createSetAccessPermissionsResponse(SetAccessPermissionsResponseType value) {
        return new JAXBElement<SetAccessPermissionsResponseType>(_SetAccessPermissionsResponse_QNAME, SetAccessPermissionsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRecoupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CancelRecoupResponse")
    public JAXBElement<CancelRecoupResponseType> createCancelRecoupResponse(CancelRecoupResponseType value) {
        return new JAXBElement<CancelRecoupResponseType>(_CancelRecoupResponse_QNAME, CancelRecoupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UATPDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UATPDetails")
    public JAXBElement<UATPDetailsType> createUATPDetails(UATPDetailsType value) {
        return new JAXBElement<UATPDetailsType>(_UATPDetails_QNAME, UATPDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReviseStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReviseStatus")
    public JAXBElement<ReviseStatusType> createReviseStatus(ReviseStatusType value) {
        return new JAXBElement<ReviseStatusType>(_ReviseStatus_QNAME, ReviseStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiateRecoupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "InitiateRecoupResponse")
    public JAXBElement<InitiateRecoupResponseType> createInitiateRecoupResponse(InitiateRecoupResponseType value) {
        return new JAXBElement<InitiateRecoupResponseType>(_InitiateRecoupResponse_QNAME, InitiateRecoupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingAddress")
    public JAXBElement<AddressType> createShippingAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ShippingAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMeansType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentMeans")
    public JAXBElement<PaymentMeansType> createPaymentMeans(PaymentMeansType value) {
        return new JAXBElement<PaymentMeansType>(_PaymentMeans_QNAME, PaymentMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpressCheckoutDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetExpressCheckoutDetailsResponse")
    public JAXBElement<GetExpressCheckoutDetailsResponseType> createGetExpressCheckoutDetailsResponse(GetExpressCheckoutDetailsResponseType value) {
        return new JAXBElement<GetExpressCheckoutDetailsResponseType>(_GetExpressCheckoutDetailsResponse_QNAME, GetExpressCheckoutDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ReverseTransactionRequest")
    public JAXBElement<ReverseTransactionRequestType> createReverseTransactionRequest(ReverseTransactionRequestType value) {
        return new JAXBElement<ReverseTransactionRequestType>(_ReverseTransactionRequest_QNAME, ReverseTransactionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MassPayResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "MassPayResponse")
    public JAXBElement<MassPayResponseType> createMassPayResponse(MassPayResponseType value) {
        return new JAXBElement<MassPayResponseType>(_MassPayResponse_QNAME, MassPayResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Country")
    public JAXBElement<CountryCodeType> createCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_Country_QNAME, CountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreeDSecureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ThreeDSecureRequest")
    public JAXBElement<ThreeDSecureRequestType> createThreeDSecureRequest(ThreeDSecureRequestType value) {
        return new JAXBElement<ThreeDSecureRequestType>(_ThreeDSecureRequest_QNAME, ThreeDSecureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantPullPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "MerchantPullPaymentDetails")
    public JAXBElement<MerchantPullPaymentType> createMerchantPullPaymentDetails(MerchantPullPaymentType value) {
        return new JAXBElement<MerchantPullPaymentType>(_MerchantPullPaymentDetails_QNAME, MerchantPullPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RefundTransactionResponse")
    public JAXBElement<RefundTransactionResponseType> createRefundTransactionResponse(RefundTransactionResponseType value) {
        return new JAXBElement<RefundTransactionResponseType>(_RefundTransactionResponse_QNAME, RefundTransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Pagination")
    public JAXBElement<PaginationType> createPagination(PaginationType value) {
        return new JAXBElement<PaginationType>(_Pagination_QNAME, PaginationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreditCardInfo")
    public JAXBElement<CreditCardDetailsType> createCreditCardInfo(CreditCardDetailsType value) {
        return new JAXBElement<CreditCardDetailsType>(_CreditCardInfo_QNAME, CreditCardDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpressCheckoutDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetExpressCheckoutDetailsResponseDetails")
    public JAXBElement<GetExpressCheckoutDetailsResponseDetailsType> createGetExpressCheckoutDetailsResponseDetails(GetExpressCheckoutDetailsResponseDetailsType value) {
        return new JAXBElement<GetExpressCheckoutDetailsResponseDetailsType>(_GetExpressCheckoutDetailsResponseDetails_QNAME, GetExpressCheckoutDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ButtonSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ButtonSearchResult")
    public JAXBElement<ButtonSearchResultType> createButtonSearchResult(ButtonSearchResultType value) {
        return new JAXBElement<ButtonSearchResultType>(_ButtonSearchResult_QNAME, ButtonSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "InsuranceFee")
    public JAXBElement<AmountType> createInsuranceFee(AmountType value) {
        return new JAXBElement<AmountType>(_InsuranceFee_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRecoupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CompleteRecoupRequest")
    public JAXBElement<CompleteRecoupRequestType> createCompleteRecoupRequest(CompleteRecoupRequestType value) {
        return new JAXBElement<CompleteRecoupRequestType>(_CompleteRecoupRequest_QNAME, CompleteRecoupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoAuthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoAuthorizationRequest")
    public JAXBElement<DoAuthorizationRequestType> createDoAuthorizationRequest(DoAuthorizationRequestType value) {
        return new JAXBElement<DoAuthorizationRequestType>(_DoAuthorizationRequest_QNAME, DoAuthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIncentiveEvaluationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetIncentiveEvaluationRequest")
    public JAXBElement<GetIncentiveEvaluationRequestType> createGetIncentiveEvaluationRequest(GetIncentiveEvaluationRequestType value) {
        return new JAXBElement<GetIncentiveEvaluationRequestType>(_GetIncentiveEvaluationRequest_QNAME, GetIncentiveEvaluationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaginationResult")
    public JAXBElement<PaginationResultType> createPaginationResult(PaginationResultType value) {
        return new JAXBElement<PaginationResultType>(_PaginationResult_QNAME, PaginationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CurrentBalance")
    public JAXBElement<AmountType> createCurrentBalance(AmountType value) {
        return new JAXBElement<AmountType>(_CurrentBalance_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRecoupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CompleteRecoupResponse")
    public JAXBElement<CompleteRecoupResponseType> createCompleteRecoupResponse(CompleteRecoupResponseType value) {
        return new JAXBElement<CompleteRecoupResponseType>(_CompleteRecoupResponse_QNAME, CompleteRecoupResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UserID")
    public JAXBElement<String> createUserID(String value) {
        return new JAXBElement<String>(_UserID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineItineraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AirlineItinerary")
    public JAXBElement<AirlineItineraryType> createAirlineItinerary(AirlineItineraryType value) {
        return new JAXBElement<AirlineItineraryType>(_AirlineItinerary_QNAME, AirlineItineraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDirectPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoDirectPaymentRequest")
    public JAXBElement<DoDirectPaymentRequestType> createDoDirectPaymentRequest(DoDirectPaymentRequestType value) {
        return new JAXBElement<DoDirectPaymentRequestType>(_DoDirectPaymentRequest_QNAME, DoDirectPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedInitiateRecoupRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedInitiateRecoupRequestDetails")
    public JAXBElement<EnhancedInitiateRecoupRequestDetailsType> createEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType value) {
        return new JAXBElement<EnhancedInitiateRecoupRequestDetailsType>(_EnhancedInitiateRecoupRequestDetails_QNAME, EnhancedInitiateRecoupRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreeDSecureInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ThreeDSecureDetails")
    public JAXBElement<ThreeDSecureInfoType> createThreeDSecureDetails(ThreeDSecureInfoType value) {
        return new JAXBElement<ThreeDSecureInfoType>(_ThreeDSecureDetails_QNAME, ThreeDSecureInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetMobileStatusResponse")
    public JAXBElement<GetMobileStatusResponseType> createGetMobileStatusResponse(GetMobileStatusResponseType value) {
        return new JAXBElement<GetMobileStatusResponseType>(_GetMobileStatusResponse_QNAME, GetMobileStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTransactionSearchResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentTransactions")
    public JAXBElement<PaymentTransactionSearchResultType> createPaymentTransactions(PaymentTransactionSearchResultType value) {
        return new JAXBElement<PaymentTransactionSearchResultType>(_PaymentTransactions_QNAME, PaymentTransactionSearchResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageRecurringPaymentsProfileStatusRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ManageRecurringPaymentsProfileStatusRequestDetails")
    public JAXBElement<ManageRecurringPaymentsProfileStatusRequestDetailsType> createManageRecurringPaymentsProfileStatusRequestDetails(ManageRecurringPaymentsProfileStatusRequestDetailsType value) {
        return new JAXBElement<ManageRecurringPaymentsProfileStatusRequestDetailsType>(_ManageRecurringPaymentsProfileStatusRequestDetails_QNAME, ManageRecurringPaymentsProfileStatusRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBillingAgreementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetCustomerBillingAgreementResponse")
    public JAXBElement<SetCustomerBillingAgreementResponseType> createSetCustomerBillingAgreementResponse(SetCustomerBillingAgreementResponseType value) {
        return new JAXBElement<SetCustomerBillingAgreementResponseType>(_SetCustomerBillingAgreementResponse_QNAME, SetCustomerBillingAgreementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AuthorizationID")
    public JAXBElement<String> createAuthorizationID(String value) {
        return new JAXBElement<String>(_AuthorizationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "StoreURL")
    public JAXBElement<String> createStoreURL(String value) {
        return new JAXBElement<String>(_StoreURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCaptureResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoCaptureResponseDetails")
    public JAXBElement<DoCaptureResponseDetailsType> createDoCaptureResponseDetails(DoCaptureResponseDetailsType value) {
        return new JAXBElement<DoCaptureResponseDetailsType>(_DoCaptureResponseDetails_QNAME, DoCaptureResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPermissionsRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetAccessPermissionsRequestDetails")
    public JAXBElement<SetAccessPermissionsRequestDetailsType> createSetAccessPermissionsRequestDetails(SetAccessPermissionsRequestDetailsType value) {
        return new JAXBElement<SetAccessPermissionsRequestDetailsType>(_SetAccessPermissionsRequestDetails_QNAME, SetAccessPermissionsRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBalanceResponse")
    public JAXBElement<GetBalanceResponseType> createGetBalanceResponse(GetBalanceResponseType value) {
        return new JAXBElement<GetBalanceResponseType>(_GetBalanceResponse_QNAME, GetBalanceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoNonReferencedCreditRequest")
    public JAXBElement<DoNonReferencedCreditRequestType> createDoNonReferencedCreditRequest(DoNonReferencedCreditRequestType value) {
        return new JAXBElement<DoNonReferencedCreditRequestType>(_DoNonReferencedCreditRequest_QNAME, DoNonReferencedCreditRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingDetails")
    public JAXBElement<ShippingDetailsType> createShippingDetails(ShippingDetailsType value) {
        return new JAXBElement<ShippingDetailsType>(_ShippingDetails_QNAME, ShippingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMobileCheckoutPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoMobileCheckoutPaymentResponse")
    public JAXBElement<DoMobileCheckoutPaymentResponseType> createDoMobileCheckoutPaymentResponse(DoMobileCheckoutPaymentResponseType value) {
        return new JAXBElement<DoMobileCheckoutPaymentResponseType>(_DoMobileCheckoutPaymentResponse_QNAME, DoMobileCheckoutPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccessPermissionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetAccessPermissionsRequest")
    public JAXBElement<SetAccessPermissionsRequestType> createSetAccessPermissionsRequest(SetAccessPermissionsRequestType value) {
        return new JAXBElement<SetAccessPermissionsRequestType>(_SetAccessPermissionsRequest_QNAME, SetAccessPermissionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMobileCheckoutRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetMobileCheckoutRequest")
    public JAXBElement<SetMobileCheckoutRequestType> createSetMobileCheckoutRequest(SetMobileCheckoutRequestType value) {
        return new JAXBElement<SetMobileCheckoutRequestType>(_SetMobileCheckoutRequest_QNAME, SetMobileCheckoutRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCaptureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoCaptureRequest")
    public JAXBElement<DoCaptureRequestType> createDoCaptureRequest(DoCaptureRequestType value) {
        return new JAXBElement<DoCaptureRequestType>(_DoCaptureRequest_QNAME, DoCaptureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetExpressCheckoutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "SetExpressCheckoutResponse")
    public JAXBElement<SetExpressCheckoutResponseType> createSetExpressCheckoutResponse(SetExpressCheckoutResponseType value) {
        return new JAXBElement<SetExpressCheckoutResponseType>(_SetExpressCheckoutResponse_QNAME, SetExpressCheckoutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNonReferencedCreditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoNonReferencedCreditResponse")
    public JAXBElement<DoNonReferencedCreditResponseType> createDoNonReferencedCreditResponse(DoNonReferencedCreditResponseType value) {
        return new JAXBElement<DoNonReferencedCreditResponseType>(_DoNonReferencedCreditResponse_QNAME, DoNonReferencedCreditResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "UUID")
    public JAXBElement<String> createUUID(String value) {
        return new JAXBElement<String>(_UUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CountryName")
    public JAXBElement<String> createCountryName(String value) {
        return new JAXBElement<String>(_CountryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetTransactionDetailsRequest")
    public JAXBElement<GetTransactionDetailsRequestType> createGetTransactionDetailsRequest(GetTransactionDetailsRequestType value) {
        return new JAXBElement<GetTransactionDetailsRequestType>(_GetTransactionDetailsRequest_QNAME, GetTransactionDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMUpdateButtonRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMUpdateButtonRequest")
    public JAXBElement<BMUpdateButtonRequestType> createBMUpdateButtonRequest(BMUpdateButtonRequestType value) {
        return new JAXBElement<BMUpdateButtonRequestType>(_BMUpdateButtonRequest_QNAME, BMUpdateButtonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionTrackingDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "OptionTrackingDetails")
    public JAXBElement<OptionTrackingDetailsType> createOptionTrackingDetails(OptionTrackingDetailsType value) {
        return new JAXBElement<OptionTrackingDetailsType>(_OptionTrackingDetails_QNAME, OptionTrackingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SellingStatus")
    public JAXBElement<SellingStatusType> createSellingStatus(SellingStatusType value) {
        return new JAXBElement<SellingStatusType>(_SellingStatus_QNAME, SellingStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingTermsCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingTerm")
    public JAXBElement<ShippingTermsCodeType> createShippingTerm(ShippingTermsCodeType value) {
        return new JAXBElement<ShippingTermsCodeType>(_ShippingTerm_QNAME, ShippingTermsCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReverseTransactionRequestDetails")
    public JAXBElement<ReverseTransactionRequestDetailsType> createReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType value) {
        return new JAXBElement<ReverseTransactionRequestDetailsType>(_ReverseTransactionRequestDetails_QNAME, ReverseTransactionRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantPullPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillUserResponseDetails")
    public JAXBElement<MerchantPullPaymentResponseType> createBillUserResponseDetails(MerchantPullPaymentResponseType value) {
        return new JAXBElement<MerchantPullPaymentResponseType>(_BillUserResponseDetails_QNAME, MerchantPullPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Balance")
    public JAXBElement<AmountType> createBalance(AmountType value) {
        return new JAXBElement<AmountType>(_Balance_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReferenceTransactionRequest")
    public JAXBElement<DoReferenceTransactionRequestType> createDoReferenceTransactionRequest(DoReferenceTransactionRequestType value) {
        return new JAXBElement<DoReferenceTransactionRequestType>(_DoReferenceTransactionRequest_QNAME, DoReferenceTransactionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionSearchRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "TransactionSearchRequest")
    public JAXBElement<TransactionSearchRequestType> createTransactionSearchRequest(TransactionSearchRequestType value) {
        return new JAXBElement<TransactionSearchRequestType>(_TransactionSearchRequest_QNAME, TransactionSearchRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "HighBidder")
    public JAXBElement<UserType> createHighBidder(UserType value) {
        return new JAXBElement<UserType>(_HighBidder_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SubscriptionID")
    public JAXBElement<String> createSubscriptionID(String value) {
        return new JAXBElement<String>(_SubscriptionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ItemArray")
    public JAXBElement<ItemArrayType> createItemArray(ItemArrayType value) {
        return new JAXBElement<ItemArrayType>(_ItemArray_QNAME, ItemArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "FeedbackScore")
    public JAXBElement<Integer> createFeedbackScore(Integer value) {
        return new JAXBElement<Integer>(_FeedbackScore_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "EbayTransactionID")
    public JAXBElement<String> createEbayTransactionID(String value) {
        return new JAXBElement<String>(_EbayTransactionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Seller")
    public JAXBElement<UserType> createSeller(UserType value) {
        return new JAXBElement<UserType>(_Seller_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetTransactionDetailsResponse")
    public JAXBElement<GetTransactionDetailsResponseType> createGetTransactionDetailsResponse(GetTransactionDetailsResponseType value) {
        return new JAXBElement<GetTransactionDetailsResponseType>(_GetTransactionDetailsResponse_QNAME, GetTransactionDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Site")
    public JAXBElement<SiteCodeType> createSite(SiteCodeType value) {
        return new JAXBElement<SiteCodeType>(_Site_QNAME, SiteCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetBalanceRequest")
    public JAXBElement<GetBalanceRequestType> createGetBalanceRequest(GetBalanceRequestType value) {
        return new JAXBElement<GetBalanceRequestType>(_GetBalanceRequest_QNAME, GetBalanceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMCreateButtonResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMCreateButtonResponse")
    public JAXBElement<BMCreateButtonResponseType> createBMCreateButtonResponse(BMCreateButtonResponseType value) {
        return new JAXBElement<BMCreateButtonResponseType>(_BMCreateButtonResponse_QNAME, BMCreateButtonResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundTransactionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RefundTransactionRequest")
    public JAXBElement<RefundTransactionRequestType> createRefundTransactionRequest(RefundTransactionRequestType value) {
        return new JAXBElement<RefundTransactionRequestType>(_RefundTransactionRequest_QNAME, RefundTransactionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMobilePaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CreateMobilePaymentRequest")
    public JAXBElement<CreateMobilePaymentRequestType> createCreateMobilePaymentRequest(CreateMobilePaymentRequestType value) {
        return new JAXBElement<CreateMobilePaymentRequestType>(_CreateMobilePaymentRequest_QNAME, CreateMobilePaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Buyer")
    public JAXBElement<UserType> createBuyer(UserType value) {
        return new JAXBElement<UserType>(_Buyer_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BMManageButtonStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BMManageButtonStatusRequest")
    public JAXBElement<BMManageButtonStatusRequestType> createBMManageButtonStatusRequest(BMManageButtonStatusRequestType value) {
        return new JAXBElement<BMManageButtonStatusRequestType>(_BMManageButtonStatusRequest_QNAME, BMManageButtonStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "APIType")
    public JAXBElement<APIType> createAPIType(APIType value) {
        return new JAXBElement<APIType>(_APIType_QNAME, APIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAUpdateResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BAUpdateResponseDetails")
    public JAXBElement<BAUpdateResponseDetailsType> createBAUpdateResponseDetails(BAUpdateResponseDetailsType value) {
        return new JAXBElement<BAUpdateResponseDetailsType>(_BAUpdateResponseDetails_QNAME, BAUpdateResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AmountPastDue")
    public JAXBElement<AmountType> createAmountPastDue(AmountType value) {
        return new JAXBElement<AmountType>(_AmountPastDue_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "InstrumentDetails")
    public JAXBElement<InstrumentDetailsType> createInstrumentDetails(InstrumentDetailsType value) {
        return new JAXBElement<InstrumentDetailsType>(_InstrumentDetails_QNAME, InstrumentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReauthorizationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoReauthorizationRequest")
    public JAXBElement<DoReauthorizationRequestType> createDoReauthorizationRequest(DoReauthorizationRequestType value) {
        return new JAXBElement<DoReauthorizationRequestType>(_DoReauthorizationRequest_QNAME, DoReauthorizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentType")
    public JAXBElement<PaymentType> createPaymentType(PaymentType value) {
        return new JAXBElement<PaymentType>(_PaymentType_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMobilePaymentRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CreateMobilePaymentRequestDetails")
    public JAXBElement<CreateMobilePaymentRequestDetailsType> createCreateMobilePaymentRequestDetails(CreateMobilePaymentRequestDetailsType value) {
        return new JAXBElement<CreateMobilePaymentRequestDetailsType>(_CreateMobilePaymentRequestDetails_QNAME, CreateMobilePaymentRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCheckoutOperationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ExecuteCheckoutOperationsResponse")
    public JAXBElement<ExecuteCheckoutOperationsResponseType> createExecuteCheckoutOperationsResponse(ExecuteCheckoutOperationsResponseType value) {
        return new JAXBElement<ExecuteCheckoutOperationsResponseType>(_ExecuteCheckoutOperationsResponse_QNAME, ExecuteCheckoutOperationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoExpressCheckoutPaymentRequestDetails")
    public JAXBElement<DoExpressCheckoutPaymentRequestDetailsType> createDoExpressCheckoutPaymentRequestDetails(DoExpressCheckoutPaymentRequestDetailsType value) {
        return new JAXBElement<DoExpressCheckoutPaymentRequestDetailsType>(_DoExpressCheckoutPaymentRequestDetails_QNAME, DoExpressCheckoutPaymentRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ItemID")
    public JAXBElement<String> createItemID(String value) {
        return new JAXBElement<String>(_ItemID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCancelRecoupRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedCancelRecoupRequestDetails")
    public JAXBElement<EnhancedCancelRecoupRequestDetailsType> createEnhancedCancelRecoupRequestDetails(EnhancedCancelRecoupRequestDetailsType value) {
        return new JAXBElement<EnhancedCancelRecoupRequestDetailsType>(_EnhancedCancelRecoupRequestDetails_QNAME, EnhancedCancelRecoupRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccessPermissionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "UpdateAccessPermissionsResponse")
    public JAXBElement<UpdateAccessPermissionsResponseType> createUpdateAccessPermissionsResponse(UpdateAccessPermissionsResponseType value) {
        return new JAXBElement<UpdateAccessPermissionsResponseType>(_UpdateAccessPermissionsResponse_QNAME, UpdateAccessPermissionsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDirectPaymentRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoDirectPaymentRequestDetails")
    public JAXBElement<DoDirectPaymentRequestDetailsType> createDoDirectPaymentRequestDetails(DoDirectPaymentRequestDetailsType value) {
        return new JAXBElement<DoDirectPaymentRequestDetailsType>(_DoDirectPaymentRequestDetails_QNAME, DoDirectPaymentRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessPermissionDetailsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetAccessPermissionDetailsResponse")
    public JAXBElement<GetAccessPermissionDetailsResponseType> createGetAccessPermissionDetailsResponse(GetAccessPermissionDetailsResponseType value) {
        return new JAXBElement<GetAccessPermissionDetailsResponseType>(_GetAccessPermissionDetailsResponse_QNAME, GetAccessPermissionDetailsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "RefundType")
    public JAXBElement<RefundType> createRefundType(RefundType value) {
        return new JAXBElement<RefundType>(_RefundType_QNAME, RefundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingRegionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ShippingRegions")
    public JAXBElement<ShippingRegionCodeType> createShippingRegions(ShippingRegionCodeType value) {
        return new JAXBElement<ShippingRegionCodeType>(_ShippingRegions_QNAME, ShippingRegionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDirectPaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoDirectPaymentResponse")
    public JAXBElement<DoDirectPaymentResponseType> createDoDirectPaymentResponse(DoDirectPaymentResponseType value) {
        return new JAXBElement<DoDirectPaymentResponseType>(_DoDirectPaymentResponse_QNAME, DoDirectPaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Region")
    public JAXBElement<String> createRegion(String value) {
        return new JAXBElement<String>(_Region_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Fees")
    public JAXBElement<FeesType> createFees(FeesType value) {
        return new JAXBElement<FeesType>(_Fees_QNAME, FeesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelRecoupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "CancelRecoupRequest")
    public JAXBElement<CancelRecoupRequestType> createCancelRecoupRequest(CancelRecoupRequestType value) {
        return new JAXBElement<CancelRecoupRequestType>(_CancelRecoupRequest_QNAME, CancelRecoupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReferenceTransactionRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "DoReferenceTransactionRequestDetails")
    public JAXBElement<DoReferenceTransactionRequestDetailsType> createDoReferenceTransactionRequestDetails(DoReferenceTransactionRequestDetailsType value) {
        return new JAXBElement<DoReferenceTransactionRequestDetailsType>(_DoReferenceTransactionRequestDetails_QNAME, DoReferenceTransactionRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetExpressCheckoutRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetExpressCheckoutRequestDetails")
    public JAXBElement<SetExpressCheckoutRequestDetailsType> createSetExpressCheckoutRequestDetails(SetExpressCheckoutRequestDetailsType value) {
        return new JAXBElement<SetExpressCheckoutRequestDetailsType>(_SetExpressCheckoutRequestDetails_QNAME, SetExpressCheckoutRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoExpressCheckoutPaymentRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "DoExpressCheckoutPaymentRequest")
    public JAXBElement<DoExpressCheckoutPaymentRequestType> createDoExpressCheckoutPaymentRequest(DoExpressCheckoutPaymentRequestType value) {
        return new JAXBElement<DoExpressCheckoutPaymentRequestType>(_DoExpressCheckoutPaymentRequest_QNAME, DoExpressCheckoutPaymentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiateRecoupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "InitiateRecoupRequest")
    public JAXBElement<InitiateRecoupRequestType> createInitiateRecoupRequest(InitiateRecoupRequestType value) {
        return new JAXBElement<InitiateRecoupRequestType>(_InitiateRecoupRequest_QNAME, InitiateRecoupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Error")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAUpdateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "BAUpdateRequest")
    public JAXBElement<BAUpdateRequestType> createBAUpdateRequest(BAUpdateRequestType value) {
        return new JAXBElement<BAUpdateRequestType>(_BAUpdateRequest_QNAME, BAUpdateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Transaction")
    public JAXBElement<TransactionType> createTransaction(TransactionType value) {
        return new JAXBElement<TransactionType>(_Transaction_QNAME, TransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceOptionCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "InsuranceOption")
    public JAXBElement<InsuranceOptionCodeType> createInsuranceOption(InsuranceOptionCodeType value) {
        return new JAXBElement<InsuranceOptionCodeType>(_InsuranceOption_QNAME, InsuranceOptionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEbayMobileCheckoutRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "SetEbayMobileCheckoutRequestDetails")
    public JAXBElement<SetEbayMobileCheckoutRequestDetailsType> createSetEbayMobileCheckoutRequestDetails(SetEbayMobileCheckoutRequestDetailsType value) {
        return new JAXBElement<SetEbayMobileCheckoutRequestDetailsType>(_SetEbayMobileCheckoutRequestDetails_QNAME, SetEbayMobileCheckoutRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MassPayRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "MassPayRequest")
    public JAXBElement<MassPayRequestType> createMassPayRequest(MassPayRequestType value) {
        return new JAXBElement<MassPayRequestType>(_MassPayRequest_QNAME, MassPayRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "Category")
    public JAXBElement<CategoryType> createCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_Category_QNAME, CategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExpressCheckoutDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetExpressCheckoutDetailsRequest")
    public JAXBElement<GetExpressCheckoutDetailsRequestType> createGetExpressCheckoutDetailsRequest(GetExpressCheckoutDetailsRequestType value) {
        return new JAXBElement<GetExpressCheckoutDetailsRequestType>(_GetExpressCheckoutDetailsRequest_QNAME, GetExpressCheckoutDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingAgreementCustomerDetailsResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "GetBillingAgreementCustomerDetailsResponseDetails")
    public JAXBElement<GetBillingAgreementCustomerDetailsResponseDetailsType> createGetBillingAgreementCustomerDetailsResponseDetails(GetBillingAgreementCustomerDetailsResponseDetailsType value) {
        return new JAXBElement<GetBillingAgreementCustomerDetailsResponseDetailsType>(_GetBillingAgreementCustomerDetailsResponseDetails_QNAME, GetBillingAgreementCustomerDetailsResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "ReverseTransactionResponse")
    public JAXBElement<ReverseTransactionResponseType> createReverseTransactionResponse(ReverseTransactionResponseType value) {
        return new JAXBElement<ReverseTransactionResponseType>(_ReverseTransactionResponse_QNAME, ReverseTransactionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPalDetailsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "GetPalDetailsRequest")
    public JAXBElement<GetPalDetailsRequestType> createGetPalDetailsRequest(GetPalDetailsRequestType value) {
        return new JAXBElement<GetPalDetailsRequestType>(_GetPalDetailsRequest_QNAME, GetPalDetailsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "RefundTransactionID", scope = RefundTransactionResponseType.class)
    public JAXBElement<String> createRefundTransactionResponseTypeRefundTransactionID(String value) {
        return new JAXBElement<String>(_RefundTransactionResponseTypeRefundTransactionID_QNAME, String.class, RefundTransactionResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "MsgSubID", scope = DoUATPAuthorizationResponseType.class)
    public JAXBElement<String> createDoUATPAuthorizationResponseTypeMsgSubID(String value) {
        return new JAXBElement<String>(_DoUATPAuthorizationResponseTypeMsgSubID_QNAME, String.class, DoUATPAuthorizationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "InvoiceID", scope = DoUATPAuthorizationResponseType.class)
    public JAXBElement<String> createDoUATPAuthorizationResponseTypeInvoiceID(String value) {
        return new JAXBElement<String>(_DoUATPAuthorizationResponseTypeInvoiceID_QNAME, String.class, DoUATPAuthorizationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:api:PayPalAPI", name = "AuthorizationCode", scope = DoUATPAuthorizationResponseType.class)
    public JAXBElement<String> createDoUATPAuthorizationResponseTypeAuthorizationCode(String value) {
        return new JAXBElement<String>(_DoUATPAuthorizationResponseTypeAuthorizationCode_QNAME, String.class, DoUATPAuthorizationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerPaymentMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PaymentMethod", scope = AccountSummaryType.class)
    public JAXBElement<SellerPaymentMethodCodeType> createAccountSummaryTypePaymentMethod(SellerPaymentMethodCodeType value) {
        return new JAXBElement<SellerPaymentMethodCodeType>(_AccountSummaryTypePaymentMethod_QNAME, SellerPaymentMethodCodeType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AdditionalAccount", scope = AccountSummaryType.class)
    public JAXBElement<AdditionalAccountType> createAccountSummaryTypeAdditionalAccount(AdditionalAccountType value) {
        return new JAXBElement<AdditionalAccountType>(_AccountSummaryTypeAdditionalAccount_QNAME, AdditionalAccountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CCExp", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeCCExp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeCCExp_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "PastDue", scope = AccountSummaryType.class)
    public JAXBElement<Boolean> createAccountSummaryTypePastDue(Boolean value) {
        return new JAXBElement<Boolean>(_AccountSummaryTypePastDue_QNAME, Boolean.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AdditionalAccountsCount", scope = AccountSummaryType.class)
    public JAXBElement<Integer> createAccountSummaryTypeAdditionalAccountsCount(Integer value) {
        return new JAXBElement<Integer>(_AccountSummaryTypeAdditionalAccountsCount_QNAME, Integer.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CCModifyDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeCCModifyDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeCCModifyDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastInvoiceAmount", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeLastInvoiceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeLastInvoiceAmount_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BillingCycleDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeBillingCycleDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeBillingCycleDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BankModifyDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeBankModifyDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeBankModifyDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "CCInfo", scope = AccountSummaryType.class)
    public JAXBElement<String> createAccountSummaryTypeCCInfo(String value) {
        return new JAXBElement<String>(_AccountSummaryTypeCCInfo_QNAME, String.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountStateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "AccountState", scope = AccountSummaryType.class)
    public JAXBElement<AccountStateCodeType> createAccountSummaryTypeAccountState(AccountStateCodeType value) {
        return new JAXBElement<AccountStateCodeType>(_AccountSummaryTypeAccountState_QNAME, AccountStateCodeType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastAmountPaid", scope = AccountSummaryType.class)
    public JAXBElement<AmountType> createAccountSummaryTypeLastAmountPaid(AmountType value) {
        return new JAXBElement<AmountType>(_AccountSummaryTypeLastAmountPaid_QNAME, AmountType.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "BankAccountInfo", scope = AccountSummaryType.class)
    public JAXBElement<String> createAccountSummaryTypeBankAccountInfo(String value) {
        return new JAXBElement<String>(_AccountSummaryTypeBankAccountInfo_QNAME, String.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastInvoiceDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeLastInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeLastInvoiceDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "LastPaymentDate", scope = AccountSummaryType.class)
    public JAXBElement<XMLGregorianCalendar> createAccountSummaryTypeLastPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountSummaryTypeLastPaymentDate_QNAME, XMLGregorianCalendar.class, AccountSummaryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:eBLBaseComponents", name = "ReverseTransactionID", scope = ReverseTransactionResponseDetailsType.class)
    public JAXBElement<String> createReverseTransactionResponseDetailsTypeReverseTransactionID(String value) {
        return new JAXBElement<String>(_ReverseTransactionResponseDetailsTypeReverseTransactionID_QNAME, String.class, ReverseTransactionResponseDetailsType.class, value);
    }

}
