
package com.ebay.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PayPalAPIInterface", targetNamespace = "urn:ebay:api:PayPalAPI")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PayPalAPIInterface {


    /**
     * 
     * @param requesterCredentials
     * @param refundTransactionRequest
     * @return
     *     returns com.ebay.api.RefundTransactionResponseType
     */
    @WebMethod(operationName = "RefundTransaction")
    @WebResult(name = "RefundTransactionResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "RefundTransactionResponse")
    public RefundTransactionResponseType refundTransaction(
        @WebParam(name = "RefundTransactionReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "RefundTransactionRequest")
        RefundTransactionReq refundTransactionRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param initiateRecoupRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.InitiateRecoupResponseType
     */
    @WebMethod(operationName = "InitiateRecoup")
    @WebResult(name = "InitiateRecoupResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "InitiateRecoupResponse")
    public InitiateRecoupResponseType initiateRecoup(
        @WebParam(name = "InitiateRecoupReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "InitiateRecoupRequest")
        InitiateRecoupReq initiateRecoupRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param completeRecoupRequest
     * @return
     *     returns com.ebay.api.CompleteRecoupResponseType
     */
    @WebMethod(operationName = "CompleteRecoup")
    @WebResult(name = "CompleteRecoupResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CompleteRecoupResponse")
    public CompleteRecoupResponseType completeRecoup(
        @WebParam(name = "CompleteRecoupReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CompleteRecoupRequest")
        CompleteRecoupReq completeRecoupRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param cancelRecoupRequest
     * @return
     *     returns com.ebay.api.CancelRecoupResponseType
     */
    @WebMethod(operationName = "CancelRecoup")
    @WebResult(name = "CancelRecoupResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CancelRecoupResponse")
    public CancelRecoupResponseType cancelRecoup(
        @WebParam(name = "CancelRecoupReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CancelRecoupRequest")
        CancelRecoupReq cancelRecoupRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param getTransactionDetailsRequest
     * @return
     *     returns com.ebay.api.GetTransactionDetailsResponseType
     */
    @WebMethod(operationName = "GetTransactionDetails")
    @WebResult(name = "GetTransactionDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetTransactionDetailsResponse")
    public GetTransactionDetailsResponseType getTransactionDetails(
        @WebParam(name = "GetTransactionDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetTransactionDetailsRequest")
        GetTransactionDetailsReq getTransactionDetailsRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param bmCreateButtonRequest
     * @return
     *     returns com.ebay.api.BMCreateButtonResponseType
     */
    @WebMethod(operationName = "BMCreateButton")
    @WebResult(name = "BMCreateButtonResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMCreateButtonResponse")
    public BMCreateButtonResponseType bmCreateButton(
        @WebParam(name = "BMCreateButtonReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMCreateButtonRequest")
        BMCreateButtonReq bmCreateButtonRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param bmUpdateButtonRequest
     * @return
     *     returns com.ebay.api.BMUpdateButtonResponseType
     */
    @WebMethod(operationName = "BMUpdateButton")
    @WebResult(name = "BMUpdateButtonResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMUpdateButtonResponse")
    public BMUpdateButtonResponseType bmUpdateButton(
        @WebParam(name = "BMUpdateButtonReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMUpdateButtonRequest")
        BMUpdateButtonReq bmUpdateButtonRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param bmSetInventoryRequest
     * @return
     *     returns com.ebay.api.BMSetInventoryResponseType
     */
    @WebMethod(operationName = "BMSetInventory")
    @WebResult(name = "BMSetInventoryResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMSetInventoryResponse")
    public BMSetInventoryResponseType bmSetInventory(
        @WebParam(name = "BMSetInventoryReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMSetInventoryRequest")
        BMSetInventoryReq bmSetInventoryRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param bmGetButtonDetailsRequest
     * @return
     *     returns com.ebay.api.BMGetButtonDetailsResponseType
     */
    @WebMethod(operationName = "BMGetButtonDetails")
    @WebResult(name = "BMGetButtonDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMGetButtonDetailsResponse")
    public BMGetButtonDetailsResponseType bmGetButtonDetails(
        @WebParam(name = "BMGetButtonDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMGetButtonDetailsRequest")
        BMGetButtonDetailsReq bmGetButtonDetailsRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param bmGetInventoryRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.BMGetInventoryResponseType
     */
    @WebMethod(operationName = "BMGetInventory")
    @WebResult(name = "BMGetInventoryResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMGetInventoryResponse")
    public BMGetInventoryResponseType bmGetInventory(
        @WebParam(name = "BMGetInventoryReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMGetInventoryRequest")
        BMGetInventoryReq bmGetInventoryRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param bmManageButtonStatusRequest
     * @return
     *     returns com.ebay.api.BMManageButtonStatusResponseType
     */
    @WebMethod(operationName = "BMManageButtonStatus")
    @WebResult(name = "BMManageButtonStatusResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMManageButtonStatusResponse")
    public BMManageButtonStatusResponseType bmManageButtonStatus(
        @WebParam(name = "BMManageButtonStatusReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMManageButtonStatusRequest")
        BMManageButtonStatusReq bmManageButtonStatusRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param bmButtonSearchRequest
     * @return
     *     returns com.ebay.api.BMButtonSearchResponseType
     */
    @WebMethod(operationName = "BMButtonSearch")
    @WebResult(name = "BMButtonSearchResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMButtonSearchResponse")
    public BMButtonSearchResponseType bmButtonSearch(
        @WebParam(name = "BMButtonSearchReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BMButtonSearchRequest")
        BMButtonSearchReq bmButtonSearchRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param billUserRequest
     * @return
     *     returns com.ebay.api.BillUserResponseType
     */
    @WebMethod(operationName = "BillUser")
    @WebResult(name = "BillUserResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BillUserResponse")
    public BillUserResponseType billUser(
        @WebParam(name = "BillUserReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BillUserRequest")
        BillUserReq billUserRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param transactionSearchRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.TransactionSearchResponseType
     */
    @WebMethod(operationName = "TransactionSearch")
    @WebResult(name = "TransactionSearchResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "TransactionSearchResponse")
    public TransactionSearchResponseType transactionSearch(
        @WebParam(name = "TransactionSearchReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "TransactionSearchRequest")
        TransactionSearchReq transactionSearchRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param massPayRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.MassPayResponseType
     */
    @WebMethod(operationName = "MassPay")
    @WebResult(name = "MassPayResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "MassPayResponse")
    public MassPayResponseType massPay(
        @WebParam(name = "MassPayReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "MassPayRequest")
        MassPayReq massPayRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param billAgreementUpdateRequest
     * @return
     *     returns com.ebay.api.BAUpdateResponseType
     */
    @WebMethod(operationName = "BillAgreementUpdate")
    @WebResult(name = "BAUpdateResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "body")
    public BAUpdateResponseType billAgreementUpdate(
        @WebParam(name = "BillAgreementUpdateReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "BillAgreementUpdateRequest")
        BillAgreementUpdateReq billAgreementUpdateRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param addressVerifyRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.AddressVerifyResponseType
     */
    @WebMethod(operationName = "AddressVerify")
    @WebResult(name = "AddressVerifyResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "AddressVerifyResponse")
    public AddressVerifyResponseType addressVerify(
        @WebParam(name = "AddressVerifyReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "AddressVerifyRequest")
        AddressVerifyReq addressVerifyRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param enterBoardingRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.EnterBoardingResponseType
     */
    @WebMethod(operationName = "EnterBoarding")
    @WebResult(name = "EnterBoardingResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "EnterBoardingResponse")
    public EnterBoardingResponseType enterBoarding(
        @WebParam(name = "EnterBoardingReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "EnterBoardingRequest")
        EnterBoardingReq enterBoardingRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param getBoardingDetailsRequest
     * @return
     *     returns com.ebay.api.GetBoardingDetailsResponseType
     */
    @WebMethod(operationName = "GetBoardingDetails")
    @WebResult(name = "GetBoardingDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetBoardingDetailsResponse")
    public GetBoardingDetailsResponseType getBoardingDetails(
        @WebParam(name = "GetBoardingDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetBoardingDetailsRequest")
        GetBoardingDetailsReq getBoardingDetailsRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param createMobilePaymentRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.CreateMobilePaymentResponseType
     */
    @WebMethod(operationName = "CreateMobilePayment")
    @WebResult(name = "CreateMobilePaymentResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CreateMobilePaymentResponse")
    public CreateMobilePaymentResponseType createMobilePayment(
        @WebParam(name = "CreateMobilePaymentReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "CreateMobilePaymentRequest")
        CreateMobilePaymentReq createMobilePaymentRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param getMobileStatusRequest
     * @return
     *     returns com.ebay.api.GetMobileStatusResponseType
     */
    @WebMethod(operationName = "GetMobileStatus")
    @WebResult(name = "GetMobileStatusResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetMobileStatusResponse")
    public GetMobileStatusResponseType getMobileStatus(
        @WebParam(name = "GetMobileStatusReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetMobileStatusRequest")
        GetMobileStatusReq getMobileStatusRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param setMobileCheckoutRequest
     * @return
     *     returns com.ebay.api.SetMobileCheckoutResponseType
     */
    @WebMethod(operationName = "SetMobileCheckout")
    @WebResult(name = "SetMobileCheckoutResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "SetMobileCheckoutResponse")
    public SetMobileCheckoutResponseType setMobileCheckout(
        @WebParam(name = "SetMobileCheckoutReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "SetMobileCheckoutRequest")
        SetMobileCheckoutReq setMobileCheckoutRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param doMobileCheckoutPaymentRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.DoMobileCheckoutPaymentResponseType
     */
    @WebMethod(operationName = "DoMobileCheckoutPayment")
    @WebResult(name = "DoMobileCheckoutPaymentResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoMobileCheckoutPaymentResponse")
    public DoMobileCheckoutPaymentResponseType doMobileCheckoutPayment(
        @WebParam(name = "DoMobileCheckoutPaymentReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "DoMobileCheckoutPaymentRequest")
        DoMobileCheckoutPaymentReq doMobileCheckoutPaymentRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param getBalanceRequest
     * @param requesterCredentials
     * @return
     *     returns com.ebay.api.GetBalanceResponseType
     */
    @WebMethod(operationName = "GetBalance")
    @WebResult(name = "GetBalanceResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetBalanceResponse")
    public GetBalanceResponseType getBalance(
        @WebParam(name = "GetBalanceReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetBalanceRequest")
        GetBalanceReq getBalanceRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

    /**
     * 
     * @param requesterCredentials
     * @param getPalDetailsRequest
     * @return
     *     returns com.ebay.api.GetPalDetailsResponseType
     */
    @WebMethod(operationName = "GetPalDetails")
    @WebResult(name = "GetPalDetailsResponse", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetPalDetailsResponse")
    public GetPalDetailsResponseType getPalDetails(
        @WebParam(name = "GetPalDetailsReq", targetNamespace = "urn:ebay:api:PayPalAPI", partName = "GetPalDetailsRequest")
        GetPalDetailsReq getPalDetailsRequest,
        @WebParam(name = "RequesterCredentials", targetNamespace = "urn:ebay:api:PayPalAPI", header = true, mode = WebParam.Mode.INOUT, partName = "RequesterCredentials")
        Holder<CustomSecurityHeaderType> requesterCredentials);

}
