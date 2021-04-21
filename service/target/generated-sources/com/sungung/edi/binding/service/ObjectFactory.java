//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.21 at 01:57:35 PM AEST 
//


package com.sungung.edi.binding.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sungung.edi.binding.service package. 
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

    private final static QName _AUTACK_QNAME = new QName("http://www.ibm.com/dfdl/edi/un/service/4.1", "AUTACK");
    private final static QName _CONTRL_QNAME = new QName("http://www.ibm.com/dfdl/edi/un/service/4.1", "CONTRL");
    private final static QName _KEYMAN_QNAME = new QName("http://www.ibm.com/dfdl/edi/un/service/4.1", "KEYMAN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sungung.edi.binding.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KEYMAN }
     * 
     */
    public KEYMAN createKEYMAN() {
        return new KEYMAN();
    }

    /**
     * Create an instance of {@link KEYMAN.SegGrp4 }
     * 
     */
    public KEYMAN.SegGrp4 createKEYMANSegGrp4() {
        return new KEYMAN.SegGrp4();
    }

    /**
     * Create an instance of {@link KEYMAN.SegGrp1 }
     * 
     */
    public KEYMAN.SegGrp1 createKEYMANSegGrp1() {
        return new KEYMAN.SegGrp1();
    }

    /**
     * Create an instance of {@link KEYMAN.SegGrp1 .SegGrp2 }
     * 
     */
    public KEYMAN.SegGrp1 .SegGrp2 createKEYMANSegGrp1SegGrp2() {
        return new KEYMAN.SegGrp1 .SegGrp2();
    }

    /**
     * Create an instance of {@link CONTRL }
     * 
     */
    public CONTRL createCONTRL() {
        return new CONTRL();
    }

    /**
     * Create an instance of {@link CONTRL.SegGrp3 }
     * 
     */
    public CONTRL.SegGrp3 createCONTRLSegGrp3() {
        return new CONTRL.SegGrp3();
    }

    /**
     * Create an instance of {@link CONTRL.SegGrp3 .SegGrp4 }
     * 
     */
    public CONTRL.SegGrp3 .SegGrp4 createCONTRLSegGrp3SegGrp4() {
        return new CONTRL.SegGrp3 .SegGrp4();
    }

    /**
     * Create an instance of {@link CONTRL.SegGrp1 }
     * 
     */
    public CONTRL.SegGrp1 createCONTRLSegGrp1() {
        return new CONTRL.SegGrp1();
    }

    /**
     * Create an instance of {@link AUTACK }
     * 
     */
    public AUTACK createAUTACK() {
        return new AUTACK();
    }

    /**
     * Create an instance of {@link AUTACK.SegGrp1 }
     * 
     */
    public AUTACK.SegGrp1 createAUTACKSegGrp1() {
        return new AUTACK.SegGrp1();
    }

    /**
     * Create an instance of {@link UNA }
     * 
     */
    public UNA createUNA() {
        return new UNA();
    }

    /**
     * Create an instance of {@link UCDDataElementErrorIndication }
     * 
     */
    public UCDDataElementErrorIndication createUCDDataElementErrorIndication() {
        return new UCDDataElementErrorIndication();
    }

    /**
     * Create an instance of {@link UCFGroupResponse }
     * 
     */
    public UCFGroupResponse createUCFGroupResponse() {
        return new UCFGroupResponse();
    }

    /**
     * Create an instance of {@link UCIInterchangeResponse }
     * 
     */
    public UCIInterchangeResponse createUCIInterchangeResponse() {
        return new UCIInterchangeResponse();
    }

    /**
     * Create an instance of {@link UCMMessagePackageResponse }
     * 
     */
    public UCMMessagePackageResponse createUCMMessagePackageResponse() {
        return new UCMMessagePackageResponse();
    }

    /**
     * Create an instance of {@link UCSSegmentErrorIndication }
     * 
     */
    public UCSSegmentErrorIndication createUCSSegmentErrorIndication() {
        return new UCSSegmentErrorIndication();
    }

    /**
     * Create an instance of {@link UGHAntiCollisionSegmentGroupHeader }
     * 
     */
    public UGHAntiCollisionSegmentGroupHeader createUGHAntiCollisionSegmentGroupHeader() {
        return new UGHAntiCollisionSegmentGroupHeader();
    }

    /**
     * Create an instance of {@link UGTAntiCollisionSegmentGroupTrailer }
     * 
     */
    public UGTAntiCollisionSegmentGroupTrailer createUGTAntiCollisionSegmentGroupTrailer() {
        return new UGTAntiCollisionSegmentGroupTrailer();
    }

    /**
     * Create an instance of {@link UIBInteractiveInterchangeHeader }
     * 
     */
    public UIBInteractiveInterchangeHeader createUIBInteractiveInterchangeHeader() {
        return new UIBInteractiveInterchangeHeader();
    }

    /**
     * Create an instance of {@link UIHInteractiveMessageHeader }
     * 
     */
    public UIHInteractiveMessageHeader createUIHInteractiveMessageHeader() {
        return new UIHInteractiveMessageHeader();
    }

    /**
     * Create an instance of {@link UIRInteractiveStatus }
     * 
     */
    public UIRInteractiveStatus createUIRInteractiveStatus() {
        return new UIRInteractiveStatus();
    }

    /**
     * Create an instance of {@link UITInteractiveMessageTrailer }
     * 
     */
    public UITInteractiveMessageTrailer createUITInteractiveMessageTrailer() {
        return new UITInteractiveMessageTrailer();
    }

    /**
     * Create an instance of {@link UIZInteractiveInterchangeTrailer }
     * 
     */
    public UIZInteractiveInterchangeTrailer createUIZInteractiveInterchangeTrailer() {
        return new UIZInteractiveInterchangeTrailer();
    }

    /**
     * Create an instance of {@link UNBInterchangeHeader }
     * 
     */
    public UNBInterchangeHeader createUNBInterchangeHeader() {
        return new UNBInterchangeHeader();
    }

    /**
     * Create an instance of {@link UNEGroupTrailer }
     * 
     */
    public UNEGroupTrailer createUNEGroupTrailer() {
        return new UNEGroupTrailer();
    }

    /**
     * Create an instance of {@link UNGGroupHeader }
     * 
     */
    public UNGGroupHeader createUNGGroupHeader() {
        return new UNGGroupHeader();
    }

    /**
     * Create an instance of {@link UNHMessageHeader }
     * 
     */
    public UNHMessageHeader createUNHMessageHeader() {
        return new UNHMessageHeader();
    }

    /**
     * Create an instance of {@link UNOObjectHeader }
     * 
     */
    public UNOObjectHeader createUNOObjectHeader() {
        return new UNOObjectHeader();
    }

    /**
     * Create an instance of {@link UNPObjectTrailer }
     * 
     */
    public UNPObjectTrailer createUNPObjectTrailer() {
        return new UNPObjectTrailer();
    }

    /**
     * Create an instance of {@link UNSSectionControl }
     * 
     */
    public UNSSectionControl createUNSSectionControl() {
        return new UNSSectionControl();
    }

    /**
     * Create an instance of {@link UNTMessageTrailer }
     * 
     */
    public UNTMessageTrailer createUNTMessageTrailer() {
        return new UNTMessageTrailer();
    }

    /**
     * Create an instance of {@link UNZInterchangeTrailer }
     * 
     */
    public UNZInterchangeTrailer createUNZInterchangeTrailer() {
        return new UNZInterchangeTrailer();
    }

    /**
     * Create an instance of {@link USASecurityAlgorithm }
     * 
     */
    public USASecurityAlgorithm createUSASecurityAlgorithm() {
        return new USASecurityAlgorithm();
    }

    /**
     * Create an instance of {@link USBSecuredDataIdentification }
     * 
     */
    public USBSecuredDataIdentification createUSBSecuredDataIdentification() {
        return new USBSecuredDataIdentification();
    }

    /**
     * Create an instance of {@link USCCertificate }
     * 
     */
    public USCCertificate createUSCCertificate() {
        return new USCCertificate();
    }

    /**
     * Create an instance of {@link USDDataEncryptionHeader }
     * 
     */
    public USDDataEncryptionHeader createUSDDataEncryptionHeader() {
        return new USDDataEncryptionHeader();
    }

    /**
     * Create an instance of {@link USESecurityMessageRelation }
     * 
     */
    public USESecurityMessageRelation createUSESecurityMessageRelation() {
        return new USESecurityMessageRelation();
    }

    /**
     * Create an instance of {@link USFKeyManagementFunction }
     * 
     */
    public USFKeyManagementFunction createUSFKeyManagementFunction() {
        return new USFKeyManagementFunction();
    }

    /**
     * Create an instance of {@link USHSecurityHeader }
     * 
     */
    public USHSecurityHeader createUSHSecurityHeader() {
        return new USHSecurityHeader();
    }

    /**
     * Create an instance of {@link USLSecurityListStatus }
     * 
     */
    public USLSecurityListStatus createUSLSecurityListStatus() {
        return new USLSecurityListStatus();
    }

    /**
     * Create an instance of {@link USRSecurityResult }
     * 
     */
    public USRSecurityResult createUSRSecurityResult() {
        return new USRSecurityResult();
    }

    /**
     * Create an instance of {@link USTSecurityTrailer }
     * 
     */
    public USTSecurityTrailer createUSTSecurityTrailer() {
        return new USTSecurityTrailer();
    }

    /**
     * Create an instance of {@link USUDataEncryptionTrailer }
     * 
     */
    public USUDataEncryptionTrailer createUSUDataEncryptionTrailer() {
        return new USUDataEncryptionTrailer();
    }

    /**
     * Create an instance of {@link USXSecurityReferences }
     * 
     */
    public USXSecurityReferences createUSXSecurityReferences() {
        return new USXSecurityReferences();
    }

    /**
     * Create an instance of {@link USYSecurityOnReferences }
     * 
     */
    public USYSecurityOnReferences createUSYSecurityOnReferences() {
        return new USYSecurityOnReferences();
    }

    /**
     * Create an instance of {@link S001SyntaxIdentifier }
     * 
     */
    public S001SyntaxIdentifier createS001SyntaxIdentifier() {
        return new S001SyntaxIdentifier();
    }

    /**
     * Create an instance of {@link S002InterchangeSender }
     * 
     */
    public S002InterchangeSender createS002InterchangeSender() {
        return new S002InterchangeSender();
    }

    /**
     * Create an instance of {@link S003InterchangeRecipient }
     * 
     */
    public S003InterchangeRecipient createS003InterchangeRecipient() {
        return new S003InterchangeRecipient();
    }

    /**
     * Create an instance of {@link S004DateAndTimeOfPreparation }
     * 
     */
    public S004DateAndTimeOfPreparation createS004DateAndTimeOfPreparation() {
        return new S004DateAndTimeOfPreparation();
    }

    /**
     * Create an instance of {@link S005RecipientReferencePasswordDetails }
     * 
     */
    public S005RecipientReferencePasswordDetails createS005RecipientReferencePasswordDetails() {
        return new S005RecipientReferencePasswordDetails();
    }

    /**
     * Create an instance of {@link S006ApplicationSenderIdentification }
     * 
     */
    public S006ApplicationSenderIdentification createS006ApplicationSenderIdentification() {
        return new S006ApplicationSenderIdentification();
    }

    /**
     * Create an instance of {@link S007ApplicationRecipientIdentification }
     * 
     */
    public S007ApplicationRecipientIdentification createS007ApplicationRecipientIdentification() {
        return new S007ApplicationRecipientIdentification();
    }

    /**
     * Create an instance of {@link S008MessageVersion }
     * 
     */
    public S008MessageVersion createS008MessageVersion() {
        return new S008MessageVersion();
    }

    /**
     * Create an instance of {@link S009MessageIdentifier }
     * 
     */
    public S009MessageIdentifier createS009MessageIdentifier() {
        return new S009MessageIdentifier();
    }

    /**
     * Create an instance of {@link S010StatusOfTheTransfer }
     * 
     */
    public S010StatusOfTheTransfer createS010StatusOfTheTransfer() {
        return new S010StatusOfTheTransfer();
    }

    /**
     * Create an instance of {@link S011DataElementIdentification }
     * 
     */
    public S011DataElementIdentification createS011DataElementIdentification() {
        return new S011DataElementIdentification();
    }

    /**
     * Create an instance of {@link S016MessageSubsetIdentification }
     * 
     */
    public S016MessageSubsetIdentification createS016MessageSubsetIdentification() {
        return new S016MessageSubsetIdentification();
    }

    /**
     * Create an instance of {@link S017MessageImplementationGuidelineIdentification }
     * 
     */
    public S017MessageImplementationGuidelineIdentification createS017MessageImplementationGuidelineIdentification() {
        return new S017MessageImplementationGuidelineIdentification();
    }

    /**
     * Create an instance of {@link S018ScenarioIdentification }
     * 
     */
    public S018ScenarioIdentification createS018ScenarioIdentification() {
        return new S018ScenarioIdentification();
    }

    /**
     * Create an instance of {@link S020ReferenceIdentification }
     * 
     */
    public S020ReferenceIdentification createS020ReferenceIdentification() {
        return new S020ReferenceIdentification();
    }

    /**
     * Create an instance of {@link S021ObjectTypeIdentification }
     * 
     */
    public S021ObjectTypeIdentification createS021ObjectTypeIdentification() {
        return new S021ObjectTypeIdentification();
    }

    /**
     * Create an instance of {@link S022StatusOfTheObject }
     * 
     */
    public S022StatusOfTheObject createS022StatusOfTheObject() {
        return new S022StatusOfTheObject();
    }

    /**
     * Create an instance of {@link S300DateAndOrTimeOfInitiation }
     * 
     */
    public S300DateAndOrTimeOfInitiation createS300DateAndOrTimeOfInitiation() {
        return new S300DateAndOrTimeOfInitiation();
    }

    /**
     * Create an instance of {@link S301StatusOfTransferInteractive }
     * 
     */
    public S301StatusOfTransferInteractive createS301StatusOfTransferInteractive() {
        return new S301StatusOfTransferInteractive();
    }

    /**
     * Create an instance of {@link S302DialogueReference }
     * 
     */
    public S302DialogueReference createS302DialogueReference() {
        return new S302DialogueReference();
    }

    /**
     * Create an instance of {@link S303TransactionReference }
     * 
     */
    public S303TransactionReference createS303TransactionReference() {
        return new S303TransactionReference();
    }

    /**
     * Create an instance of {@link S305DialogueIdentification }
     * 
     */
    public S305DialogueIdentification createS305DialogueIdentification() {
        return new S305DialogueIdentification();
    }

    /**
     * Create an instance of {@link S306InteractiveMessageIdentifier }
     * 
     */
    public S306InteractiveMessageIdentifier createS306InteractiveMessageIdentifier() {
        return new S306InteractiveMessageIdentifier();
    }

    /**
     * Create an instance of {@link S307StatusInformation }
     * 
     */
    public S307StatusInformation createS307StatusInformation() {
        return new S307StatusInformation();
    }

    /**
     * Create an instance of {@link S500SecurityIdentificationDetails }
     * 
     */
    public S500SecurityIdentificationDetails createS500SecurityIdentificationDetails() {
        return new S500SecurityIdentificationDetails();
    }

    /**
     * Create an instance of {@link S501SecurityDateAndTime }
     * 
     */
    public S501SecurityDateAndTime createS501SecurityDateAndTime() {
        return new S501SecurityDateAndTime();
    }

    /**
     * Create an instance of {@link S502SecurityAlgorithm }
     * 
     */
    public S502SecurityAlgorithm createS502SecurityAlgorithm() {
        return new S502SecurityAlgorithm();
    }

    /**
     * Create an instance of {@link S503AlgorithmParameter }
     * 
     */
    public S503AlgorithmParameter createS503AlgorithmParameter() {
        return new S503AlgorithmParameter();
    }

    /**
     * Create an instance of {@link S504ListParameter }
     * 
     */
    public S504ListParameter createS504ListParameter() {
        return new S504ListParameter();
    }

    /**
     * Create an instance of {@link S505ServiceCharacterForSignature }
     * 
     */
    public S505ServiceCharacterForSignature createS505ServiceCharacterForSignature() {
        return new S505ServiceCharacterForSignature();
    }

    /**
     * Create an instance of {@link S508ValidationResult }
     * 
     */
    public S508ValidationResult createS508ValidationResult() {
        return new S508ValidationResult();
    }

    /**
     * Create an instance of {@link KEYMAN.SegGrp4 .SegGrp5 }
     * 
     */
    public KEYMAN.SegGrp4 .SegGrp5 createKEYMANSegGrp4SegGrp5() {
        return new KEYMAN.SegGrp4 .SegGrp5();
    }

    /**
     * Create an instance of {@link KEYMAN.SegGrp1 .SegGrp2 .SegGrp3 }
     * 
     */
    public KEYMAN.SegGrp1 .SegGrp2 .SegGrp3 createKEYMANSegGrp1SegGrp2SegGrp3() {
        return new KEYMAN.SegGrp1 .SegGrp2 .SegGrp3();
    }

    /**
     * Create an instance of {@link CONTRL.SegGrp3 .SegGrp4 .SegGrp5 }
     * 
     */
    public CONTRL.SegGrp3 .SegGrp4 .SegGrp5 createCONTRLSegGrp3SegGrp4SegGrp5() {
        return new CONTRL.SegGrp3 .SegGrp4 .SegGrp5();
    }

    /**
     * Create an instance of {@link CONTRL.SegGrp1 .SegGrp2 }
     * 
     */
    public CONTRL.SegGrp1 .SegGrp2 createCONTRLSegGrp1SegGrp2() {
        return new CONTRL.SegGrp1 .SegGrp2();
    }

    /**
     * Create an instance of {@link AUTACK.SegGrp3 }
     * 
     */
    public AUTACK.SegGrp3 createAUTACKSegGrp3() {
        return new AUTACK.SegGrp3();
    }

    /**
     * Create an instance of {@link AUTACK.SegGrp4 }
     * 
     */
    public AUTACK.SegGrp4 createAUTACKSegGrp4() {
        return new AUTACK.SegGrp4();
    }

    /**
     * Create an instance of {@link AUTACK.SegGrp1 .SegGrp2 }
     * 
     */
    public AUTACK.SegGrp1 .SegGrp2 createAUTACKSegGrp1SegGrp2() {
        return new AUTACK.SegGrp1 .SegGrp2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AUTACK }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AUTACK }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ibm.com/dfdl/edi/un/service/4.1", name = "AUTACK")
    public JAXBElement<AUTACK> createAUTACK(AUTACK value) {
        return new JAXBElement<AUTACK>(_AUTACK_QNAME, AUTACK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CONTRL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CONTRL }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ibm.com/dfdl/edi/un/service/4.1", name = "CONTRL")
    public JAXBElement<CONTRL> createCONTRL(CONTRL value) {
        return new JAXBElement<CONTRL>(_CONTRL_QNAME, CONTRL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KEYMAN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KEYMAN }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ibm.com/dfdl/edi/un/service/4.1", name = "KEYMAN")
    public JAXBElement<KEYMAN> createKEYMAN(KEYMAN value) {
        return new JAXBElement<KEYMAN>(_KEYMAN_QNAME, KEYMAN.class, null, value);
    }

}
