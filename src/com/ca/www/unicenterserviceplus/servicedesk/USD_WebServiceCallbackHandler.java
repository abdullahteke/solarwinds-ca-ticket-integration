/**
 * USD_WebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */
package com.ca.www.unicenterserviceplus.servicedesk;


/**
 *  USD_WebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class USD_WebServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public USD_WebServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public USD_WebServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for attachURLLinkToTicket method
     * override this method for handling normal response from attachURLLinkToTicket operation
     */
    public void receiveResultattachURLLinkToTicket(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AttachURLLinkToTicketResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from attachURLLinkToTicket operation
     */
    public void receiveErrorattachURLLinkToTicket(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for notifyContacts method
     * override this method for handling normal response from notifyContacts operation
     */
    public void receiveResultnotifyContacts(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.NotifyContactsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from notifyContacts operation
     */
    public void receiveErrornotifyContacts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for transfer method
     * override this method for handling normal response from transfer operation
     */
    public void receiveResulttransfer(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.TransferResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from transfer operation
     */
    public void receiveErrortransfer(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createTicket method
     * override this method for handling normal response from createTicket operation
     */
    public void receiveResultcreateTicket(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateTicketResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createTicket operation
     */
    public void receiveErrorcreateTicket(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for modifyDocument method
     * override this method for handling normal response from modifyDocument operation
     */
    public void receiveResultmodifyDocument(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ModifyDocumentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from modifyDocument operation
     */
    public void receiveErrormodifyDocument(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createAsset method
     * override this method for handling normal response from createAsset operation
     */
    public void receiveResultcreateAsset(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateAssetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createAsset operation
     */
    public void receiveErrorcreateAsset(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createWorkFlowTask method
     * override this method for handling normal response from createWorkFlowTask operation
     */
    public void receiveResultcreateWorkFlowTask(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateWorkFlowTaskResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createWorkFlowTask operation
     */
    public void receiveErrorcreateWorkFlowTask(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for changeStatus method
     * override this method for handling normal response from changeStatus operation
     */
    public void receiveResultchangeStatus(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ChangeStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from changeStatus operation
     */
    public void receiveErrorchangeStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteWorkFlowTask method
     * override this method for handling normal response from deleteWorkFlowTask operation
     */
    public void receiveResultdeleteWorkFlowTask(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DeleteWorkFlowTaskResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteWorkFlowTask operation
     */
    public void receiveErrordeleteWorkFlowTask(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getQuestionsAsked method
     * override this method for handling normal response from getQuestionsAsked operation
     */
    public void receiveResultgetQuestionsAsked(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetQuestionsAskedResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getQuestionsAsked operation
     */
    public void receiveErrorgetQuestionsAsked(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createAssetParentChildRelationship method
     * override this method for handling normal response from createAssetParentChildRelationship operation
     */
    public void receiveResultcreateAssetParentChildRelationship(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateAssetParentChildRelationshipResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createAssetParentChildRelationship operation
     */
    public void receiveErrorcreateAssetParentChildRelationship(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDocument method
     * override this method for handling normal response from getDocument operation
     */
    public void receiveResultgetDocument(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetDocumentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDocument operation
     */
    public void receiveErrorgetDocument(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPriorities method
     * override this method for handling normal response from getPriorities operation
     */
    public void receiveResultgetPriorities(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetPrioritiesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPriorities operation
     */
    public void receiveErrorgetPriorities(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCategory method
     * override this method for handling normal response from getCategory operation
     */
    public void receiveResultgetCategory(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetCategoryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCategory operation
     */
    public void receiveErrorgetCategory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for clearNotification method
     * override this method for handling normal response from clearNotification operation
     */
    public void receiveResultclearNotification(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ClearNotificationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from clearNotification operation
     */
    public void receiveErrorclearNotification(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDocumentsByIDs method
     * override this method for handling normal response from getDocumentsByIDs operation
     */
    public void receiveResultgetDocumentsByIDs(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetDocumentsByIDsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDocumentsByIDs operation
     */
    public void receiveErrorgetDocumentsByIDs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDependentAttrControls method
     * override this method for handling normal response from getDependentAttrControls operation
     */
    public void receiveResultgetDependentAttrControls(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetDependentAttrControlsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDependentAttrControls operation
     */
    public void receiveErrorgetDependentAttrControls(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for loginWithArtifact method
     * override this method for handling normal response from loginWithArtifact operation
     */
    public void receiveResultloginWithArtifact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LoginWithArtifactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from loginWithArtifact operation
     */
    public void receiveErrorloginWithArtifact(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeMemberFromGroup method
     * override this method for handling normal response from removeMemberFromGroup operation
     */
    public void receiveResultremoveMemberFromGroup(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.RemoveMemberFromGroupResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeMemberFromGroup operation
     */
    public void receiveErrorremoveMemberFromGroup(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for impersonate method
     * override this method for handling normal response from impersonate operation
     */
    public void receiveResultimpersonate(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ImpersonateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from impersonate operation
     */
    public void receiveErrorimpersonate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getComments method
     * override this method for handling normal response from getComments operation
     */
    public void receiveResultgetComments(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetCommentsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getComments operation
     */
    public void receiveErrorgetComments(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createFolder method
     * override this method for handling normal response from createFolder operation
     */
    public void receiveResultcreateFolder(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateFolderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createFolder operation
     */
    public void receiveErrorcreateFolder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBookmarks method
     * override this method for handling normal response from getBookmarks operation
     */
    public void receiveResultgetBookmarks(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetBookmarksResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBookmarks operation
     */
    public void receiveErrorgetBookmarks(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getBopsid method
     * override this method for handling normal response from getBopsid operation
     */
    public void receiveResultgetBopsid(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetBopsidResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getBopsid operation
     */
    public void receiveErrorgetBopsid(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addBookmark method
     * override this method for handling normal response from addBookmark operation
     */
    public void receiveResultaddBookmark(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AddBookmarkResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addBookmark operation
     */
    public void receiveErroraddBookmark(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createLrelRelationships method
     * override this method for handling normal response from createLrelRelationships operation
     */
    public void receiveResultcreateLrelRelationships(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateLrelRelationshipsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createLrelRelationships operation
     */
    public void receiveErrorcreateLrelRelationships(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for freeListHandles method
     * override this method for handling normal response from freeListHandles operation
     */
    public void receiveResultfreeListHandles(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.FreeListHandlesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from freeListHandles operation
     */
    public void receiveErrorfreeListHandles(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for escalate method
     * override this method for handling normal response from escalate operation
     */
    public void receiveResultescalate(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.EscalateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from escalate operation
     */
    public void receiveErrorescalate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateRating method
     * override this method for handling normal response from updateRating operation
     */
    public void receiveResultupdateRating(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.UpdateRatingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateRating operation
     */
    public void receiveErrorupdateRating(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getHandleForUserid method
     * override this method for handling normal response from getHandleForUserid operation
     */
    public void receiveResultgetHandleForUserid(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetHandleForUseridResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getHandleForUserid operation
     */
    public void receiveErrorgetHandleForUserid(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createAttachment method
     * override this method for handling normal response from createAttachment operation
     */
    public void receiveResultcreateAttachment(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateAttachmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createAttachment operation
     */
    public void receiveErrorcreateAttachment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doQuery method
     * override this method for handling normal response from doQuery operation
     */
    public void receiveResultdoQuery(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoQueryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doQuery operation
     */
    public void receiveErrordoQuery(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for loginService method
     * override this method for handling normal response from loginService operation
     */
    public void receiveResultloginService(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LoginServiceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from loginService operation
     */
    public void receiveErrorloginService(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeLrelRelationships method
     * override this method for handling normal response from removeLrelRelationships operation
     */
    public void receiveResultremoveLrelRelationships(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.RemoveLrelRelationshipsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeLrelRelationships operation
     */
    public void receiveErrorremoveLrelRelationships(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getStatuses method
     * override this method for handling normal response from getStatuses operation
     */
    public void receiveResultgetStatuses(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetStatusesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getStatuses operation
     */
    public void receiveErrorgetStatuses(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createQuickTicket method
     * override this method for handling normal response from createQuickTicket operation
     */
    public void receiveResultcreateQuickTicket(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateQuickTicketResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createQuickTicket operation
     */
    public void receiveErrorcreateQuickTicket(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPendingChangeTaskListForContact method
     * override this method for handling normal response from getPendingChangeTaskListForContact operation
     */
    public void receiveResultgetPendingChangeTaskListForContact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetPendingChangeTaskListForContactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPendingChangeTaskListForContact operation
     */
    public void receiveErrorgetPendingChangeTaskListForContact(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createObject method
     * override this method for handling normal response from createObject operation
     */
    public void receiveResultcreateObject(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateObjectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createObject operation
     */
    public void receiveErrorcreateObject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFolderInfo method
     * override this method for handling normal response from getFolderInfo operation
     */
    public void receiveResultgetFolderInfo(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetFolderInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFolderInfo operation
     */
    public void receiveErrorgetFolderInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getArtifact method
     * override this method for handling normal response from getArtifact operation
     */
    public void receiveResultgetArtifact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetArtifactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getArtifact operation
     */
    public void receiveErrorgetArtifact(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for loginServiceManaged method
     * override this method for handling normal response from loginServiceManaged operation
     */
    public void receiveResultloginServiceManaged(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LoginServiceManagedResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from loginServiceManaged operation
     */
    public void receiveErrorloginServiceManaged(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLrelValues method
     * override this method for handling normal response from getLrelValues operation
     */
    public void receiveResultgetLrelValues(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetLrelValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLrelValues operation
     */
    public void receiveErrorgetLrelValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for attmntFolderLinkCount method
     * override this method for handling normal response from attmntFolderLinkCount operation
     */
    public void receiveResultattmntFolderLinkCount(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AttmntFolderLinkCountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from attmntFolderLinkCount operation
     */
    public void receiveErrorattmntFolderLinkCount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPolicyInfo method
     * override this method for handling normal response from getPolicyInfo operation
     */
    public void receiveResultgetPolicyInfo(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetPolicyInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPolicyInfo operation
     */
    public void receiveErrorgetPolicyInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFolderList method
     * override this method for handling normal response from getFolderList operation
     */
    public void receiveResultgetFolderList(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetFolderListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFolderList operation
     */
    public void receiveErrorgetFolderList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for serverStatus method
     * override this method for handling normal response from serverStatus operation
     */
    public void receiveResultserverStatus(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ServerStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from serverStatus operation
     */
    public void receiveErrorserverStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPropertyInfoForCategory method
     * override this method for handling normal response from getPropertyInfoForCategory operation
     */
    public void receiveResultgetPropertyInfoForCategory(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetPropertyInfoForCategoryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPropertyInfoForCategory operation
     */
    public void receiveErrorgetPropertyInfoForCategory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createRequest method
     * override this method for handling normal response from createRequest operation
     */
    public void receiveResultcreateRequest(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateRequestResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createRequest operation
     */
    public void receiveErrorcreateRequest(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLrelLength method
     * override this method for handling normal response from getLrelLength operation
     */
    public void receiveResultgetLrelLength(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetLrelLengthResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLrelLength operation
     */
    public void receiveErrorgetLrelLength(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for findContacts method
     * override this method for handling normal response from findContacts operation
     */
    public void receiveResultfindContacts(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.FindContactsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from findContacts operation
     */
    public void receiveErrorfindContacts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAccessTypeForContact method
     * override this method for handling normal response from getAccessTypeForContact operation
     */
    public void receiveResultgetAccessTypeForContact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetAccessTypeForContactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAccessTypeForContact operation
     */
    public void receiveErrorgetAccessTypeForContact(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDecisionTrees method
     * override this method for handling normal response from getDecisionTrees operation
     */
    public void receiveResultgetDecisionTrees(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetDecisionTreesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDecisionTrees operation
     */
    public void receiveErrorgetDecisionTrees(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getWorkflowTemplateList method
     * override this method for handling normal response from getWorkflowTemplateList operation
     */
    public void receiveResultgetWorkflowTemplateList(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetWorkflowTemplateListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getWorkflowTemplateList operation
     */
    public void receiveErrorgetWorkflowTemplateList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getValidTaskTransitions method
     * override this method for handling normal response from getValidTaskTransitions operation
     */
    public void receiveResultgetValidTaskTransitions(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetValidTaskTransitionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getValidTaskTransitions operation
     */
    public void receiveErrorgetValidTaskTransitions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for attachURLLink method
     * override this method for handling normal response from attachURLLink operation
     */
    public void receiveResultattachURLLink(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AttachURLLinkResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from attachURLLink operation
     */
    public void receiveErrorattachURLLink(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getGroupMemberListValues method
     * override this method for handling normal response from getGroupMemberListValues operation
     */
    public void receiveResultgetGroupMemberListValues(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetGroupMemberListValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getGroupMemberListValues operation
     */
    public void receiveErrorgetGroupMemberListValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doSelectKD method
     * override this method for handling normal response from doSelectKD operation
     */
    public void receiveResultdoSelectKD(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoSelectKDResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doSelectKD operation
     */
    public void receiveErrordoSelectKD(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getConfigurationMode method
     * override this method for handling normal response from getConfigurationMode operation
     */
    public void receiveResultgetConfigurationMode(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetConfigurationModeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getConfigurationMode operation
     */
    public void receiveErrorgetConfigurationMode(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDocumentTypes method
     * override this method for handling normal response from getDocumentTypes operation
     */
    public void receiveResultgetDocumentTypes(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetDocumentTypesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDocumentTypes operation
     */
    public void receiveErrorgetDocumentTypes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRepositoryInfo method
     * override this method for handling normal response from getRepositoryInfo operation
     */
    public void receiveResultgetRepositoryInfo(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetRepositoryInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRepositoryInfo operation
     */
    public void receiveErrorgetRepositoryInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteBookmark method
     * override this method for handling normal response from deleteBookmark operation
     */
    public void receiveResultdeleteBookmark(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DeleteBookmarkResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteBookmark operation
     */
    public void receiveErrordeleteBookmark(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getWorkFlowTemplates method
     * override this method for handling normal response from getWorkFlowTemplates operation
     */
    public void receiveResultgetWorkFlowTemplates(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetWorkFlowTemplatesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getWorkFlowTemplates operation
     */
    public void receiveErrorgetWorkFlowTemplates(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for logout method
     * override this method for handling normal response from logout operation
     */
    public void receiveResultlogout(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LogoutResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from logout operation
     */
    public void receiveErrorlogout(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getObjectValues method
     * override this method for handling normal response from getObjectValues operation
     */
    public void receiveResultgetObjectValues(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetObjectValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getObjectValues operation
     */
    public void receiveErrorgetObjectValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAttmntInfo method
     * override this method for handling normal response from getAttmntInfo operation
     */
    public void receiveResultgetAttmntInfo(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetAttmntInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAttmntInfo operation
     */
    public void receiveErrorgetAttmntInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for faq method
     * override this method for handling normal response from faq operation
     */
    public void receiveResultfaq(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.FaqResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from faq operation
     */
    public void receiveErrorfaq(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteDocument method
     * override this method for handling normal response from deleteDocument operation
     */
    public void receiveResultdeleteDocument(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DeleteDocumentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteDocument operation
     */
    public void receiveErrordeleteDocument(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRelatedList method
     * override this method for handling normal response from getRelatedList operation
     */
    public void receiveResultgetRelatedList(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetRelatedListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRelatedList operation
     */
    public void receiveErrorgetRelatedList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createAttmnt method
     * override this method for handling normal response from createAttmnt operation
     */
    public void receiveResultcreateAttmnt(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateAttmntResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createAttmnt operation
     */
    public void receiveErrorcreateAttmnt(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addComment method
     * override this method for handling normal response from addComment operation
     */
    public void receiveResultaddComment(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AddCommentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addComment operation
     */
    public void receiveErroraddComment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getValidTransitions method
     * override this method for handling normal response from getValidTransitions operation
     */
    public void receiveResultgetValidTransitions(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetValidTransitionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getValidTransitions operation
     */
    public void receiveErrorgetValidTransitions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAttmntList method
     * override this method for handling normal response from getAttmntList operation
     */
    public void receiveResultgetAttmntList(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetAttmntListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAttmntList operation
     */
    public void receiveErrorgetAttmntList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPendingIssueTaskListForContact method
     * override this method for handling normal response from getPendingIssueTaskListForContact operation
     */
    public void receiveResultgetPendingIssueTaskListForContact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetPendingIssueTaskListForContactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPendingIssueTaskListForContact operation
     */
    public void receiveErrorgetPendingIssueTaskListForContact(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getNotificationsForContact method
     * override this method for handling normal response from getNotificationsForContact operation
     */
    public void receiveResultgetNotificationsForContact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetNotificationsForContactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getNotificationsForContact operation
     */
    public void receiveErrorgetNotificationsForContact(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createChangeOrder method
     * override this method for handling normal response from createChangeOrder operation
     */
    public void receiveResultcreateChangeOrder(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateChangeOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createChangeOrder operation
     */
    public void receiveErrorcreateChangeOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for callServerMethod method
     * override this method for handling normal response from callServerMethod operation
     */
    public void receiveResultcallServerMethod(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CallServerMethodResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from callServerMethod operation
     */
    public void receiveErrorcallServerMethod(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTaskListValues method
     * override this method for handling normal response from getTaskListValues operation
     */
    public void receiveResultgetTaskListValues(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetTaskListValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTaskListValues operation
     */
    public void receiveErrorgetTaskListValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createIssue method
     * override this method for handling normal response from createIssue operation
     */
    public void receiveResultcreateIssue(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateIssueResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createIssue operation
     */
    public void receiveErrorcreateIssue(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for logComment method
     * override this method for handling normal response from logComment operation
     */
    public void receiveResultlogComment(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LogCommentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from logComment operation
     */
    public void receiveErrorlogComment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createActivityLog method
     * override this method for handling normal response from createActivityLog operation
     */
    public void receiveResultcreateActivityLog(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateActivityLogResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createActivityLog operation
     */
    public void receiveErrorcreateActivityLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for attachChangeToRequest method
     * override this method for handling normal response from attachChangeToRequest operation
     */
    public void receiveResultattachChangeToRequest(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AttachChangeToRequestResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from attachChangeToRequest operation
     */
    public void receiveErrorattachChangeToRequest(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeAttachment method
     * override this method for handling normal response from removeAttachment operation
     */
    public void receiveResultremoveAttachment(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.RemoveAttachmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeAttachment operation
     */
    public void receiveErrorremoveAttachment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createDocument method
     * override this method for handling normal response from createDocument operation
     */
    public void receiveResultcreateDocument(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateDocumentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createDocument operation
     */
    public void receiveErrorcreateDocument(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTemplateList method
     * override this method for handling normal response from getTemplateList operation
     */
    public void receiveResultgetTemplateList(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetTemplateListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTemplateList operation
     */
    public void receiveErrorgetTemplateList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getContact method
     * override this method for handling normal response from getContact operation
     */
    public void receiveResultgetContact(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetContactResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getContact operation
     */
    public void receiveErrorgetContact(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAssetExtensionInformation method
     * override this method for handling normal response from getAssetExtensionInformation operation
     */
    public void receiveResultgetAssetExtensionInformation(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetAssetExtensionInformationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAssetExtensionInformation operation
     */
    public void receiveErrorgetAssetExtensionInformation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for detachChangeFromRequest method
     * override this method for handling normal response from detachChangeFromRequest operation
     */
    public void receiveResultdetachChangeFromRequest(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DetachChangeFromRequestResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from detachChangeFromRequest operation
     */
    public void receiveErrordetachChangeFromRequest(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for search method
     * override this method for handling normal response from search operation
     */
    public void receiveResultsearch(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.SearchResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from search operation
     */
    public void receiveErrorsearch(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addAssetLog method
     * override this method for handling normal response from addAssetLog operation
     */
    public void receiveResultaddAssetLog(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AddAssetLogResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addAssetLog operation
     */
    public void receiveErroraddAssetLog(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRelatedListValues method
     * override this method for handling normal response from getRelatedListValues operation
     */
    public void receiveResultgetRelatedListValues(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetRelatedListValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRelatedListValues operation
     */
    public void receiveErrorgetRelatedListValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addMemberToGroup method
     * override this method for handling normal response from addMemberToGroup operation
     */
    public void receiveResultaddMemberToGroup(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.AddMemberToGroupResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addMemberToGroup operation
     */
    public void receiveErroraddMemberToGroup(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for rateDocument method
     * override this method for handling normal response from rateDocument operation
     */
    public void receiveResultrateDocument(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.RateDocumentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from rateDocument operation
     */
    public void receiveErrorrateDocument(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPermissionGroups method
     * override this method for handling normal response from getPermissionGroups operation
     */
    public void receiveResultgetPermissionGroups(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetPermissionGroupsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPermissionGroups operation
     */
    public void receiveErrorgetPermissionGroups(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for isAttmntLinkedKD method
     * override this method for handling normal response from isAttmntLinkedKD operation
     */
    public void receiveResultisAttmntLinkedKD(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.IsAttmntLinkedKDResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from isAttmntLinkedKD operation
     */
    public void receiveErrorisAttmntLinkedKD(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteComment method
     * override this method for handling normal response from deleteComment operation
     */
    public void receiveResultdeleteComment(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DeleteCommentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteComment operation
     */
    public void receiveErrordeleteComment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getListValues method
     * override this method for handling normal response from getListValues operation
     */
    public void receiveResultgetListValues(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetListValuesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getListValues operation
     */
    public void receiveErrorgetListValues(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAttmntListPerKD method
     * override this method for handling normal response from getAttmntListPerKD operation
     */
    public void receiveResultgetAttmntListPerKD(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetAttmntListPerKDResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAttmntListPerKD operation
     */
    public void receiveErrorgetAttmntListPerKD(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for closeTicket method
     * override this method for handling normal response from closeTicket operation
     */
    public void receiveResultcloseTicket(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CloseTicketResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from closeTicket operation
     */
    public void receiveErrorcloseTicket(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateObject method
     * override this method for handling normal response from updateObject operation
     */
    public void receiveResultupdateObject(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.UpdateObjectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateObject operation
     */
    public void receiveErrorupdateObject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getKDListPerAttmnt method
     * override this method for handling normal response from getKDListPerAttmnt operation
     */
    public void receiveResultgetKDListPerAttmnt(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetKDListPerAttmntResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getKDListPerAttmnt operation
     */
    public void receiveErrorgetKDListPerAttmnt(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doSelect method
     * override this method for handling normal response from doSelect operation
     */
    public void receiveResultdoSelect(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoSelectResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doSelect operation
     */
    public void receiveErrordoSelect(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for login method
     * override this method for handling normal response from login operation
     */
    public void receiveResultlogin(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LoginResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from login operation
     */
    public void receiveErrorlogin(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getObjectTypeInformation method
     * override this method for handling normal response from getObjectTypeInformation operation
     */
    public void receiveResultgetObjectTypeInformation(
        com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.GetObjectTypeInformationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getObjectTypeInformation operation
     */
    public void receiveErrorgetObjectTypeInformation(java.lang.Exception e) {
    }
}
