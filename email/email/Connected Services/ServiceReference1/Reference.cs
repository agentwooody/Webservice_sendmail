﻿//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由工具生成。
//     运行时版本:4.0.30319.42000
//
//     对此文件的更改可能会导致不正确的行为，并且如果
//     重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------

namespace email.ServiceReference1 {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://javatest/", ConfigurationName="ServiceReference1.emailinterface")]
    public interface emailinterface {
        
        // CODEGEN: 参数“return”需要其他方案信息，使用参数模式无法捕获这些信息。特定特性为“System.Xml.Serialization.XmlElementAttribute”。
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        email.ServiceReference1.checkEmailResponse checkEmail(email.ServiceReference1.checkEmail request);
        
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        System.Threading.Tasks.Task<email.ServiceReference1.checkEmailResponse> checkEmailAsync(email.ServiceReference1.checkEmail request);
        
        // CODEGEN: 参数“url”需要其他方案信息，使用参数模式无法捕获这些信息。特定特性为“System.Xml.Serialization.XmlElementAttribute”。
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        email.ServiceReference1.SendEmailResponse SendEmail(email.ServiceReference1.SendEmail request);
        
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        System.Threading.Tasks.Task<email.ServiceReference1.SendEmailResponse> SendEmailAsync(email.ServiceReference1.SendEmail request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="checkEmail", WrapperNamespace="http://javatest/", IsWrapped=true)]
    public partial class checkEmail {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://javatest/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string url;
        
        public checkEmail() {
        }
        
        public checkEmail(string url) {
            this.url = url;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="checkEmailResponse", WrapperNamespace="http://javatest/", IsWrapped=true)]
    public partial class checkEmailResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://javatest/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public bool @return;
        
        public checkEmailResponse() {
        }
        
        public checkEmailResponse(bool @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="SendEmail", WrapperNamespace="http://javatest/", IsWrapped=true)]
    public partial class SendEmail {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://javatest/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("url", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string[] url;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://javatest/", Order=1)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string payload;
        
        public SendEmail() {
        }
        
        public SendEmail(string[] url, string payload) {
            this.url = url;
            this.payload = payload;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="SendEmailResponse", WrapperNamespace="http://javatest/", IsWrapped=true)]
    public partial class SendEmailResponse {
        
        public SendEmailResponse() {
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface emailinterfaceChannel : email.ServiceReference1.emailinterface, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class emailinterfaceClient : System.ServiceModel.ClientBase<email.ServiceReference1.emailinterface>, email.ServiceReference1.emailinterface {
        
        public emailinterfaceClient() {
        }
        
        public emailinterfaceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public emailinterfaceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public emailinterfaceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public emailinterfaceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        email.ServiceReference1.checkEmailResponse email.ServiceReference1.emailinterface.checkEmail(email.ServiceReference1.checkEmail request) {
            return base.Channel.checkEmail(request);
        }
        
        public bool checkEmail(string url) {
            email.ServiceReference1.checkEmail inValue = new email.ServiceReference1.checkEmail();
            inValue.url = url;
            email.ServiceReference1.checkEmailResponse retVal = ((email.ServiceReference1.emailinterface)(this)).checkEmail(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<email.ServiceReference1.checkEmailResponse> email.ServiceReference1.emailinterface.checkEmailAsync(email.ServiceReference1.checkEmail request) {
            return base.Channel.checkEmailAsync(request);
        }
        
        public System.Threading.Tasks.Task<email.ServiceReference1.checkEmailResponse> checkEmailAsync(string url) {
            email.ServiceReference1.checkEmail inValue = new email.ServiceReference1.checkEmail();
            inValue.url = url;
            return ((email.ServiceReference1.emailinterface)(this)).checkEmailAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        email.ServiceReference1.SendEmailResponse email.ServiceReference1.emailinterface.SendEmail(email.ServiceReference1.SendEmail request) {
            return base.Channel.SendEmail(request);
        }
        
        public void SendEmail(string[] url, string payload) {
            email.ServiceReference1.SendEmail inValue = new email.ServiceReference1.SendEmail();
            inValue.url = url;
            inValue.payload = payload;
            email.ServiceReference1.SendEmailResponse retVal = ((email.ServiceReference1.emailinterface)(this)).SendEmail(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<email.ServiceReference1.SendEmailResponse> email.ServiceReference1.emailinterface.SendEmailAsync(email.ServiceReference1.SendEmail request) {
            return base.Channel.SendEmailAsync(request);
        }
        
        public System.Threading.Tasks.Task<email.ServiceReference1.SendEmailResponse> SendEmailAsync(string[] url, string payload) {
            email.ServiceReference1.SendEmail inValue = new email.ServiceReference1.SendEmail();
            inValue.url = url;
            inValue.payload = payload;
            return ((email.ServiceReference1.emailinterface)(this)).SendEmailAsync(inValue);
        }
    }
}