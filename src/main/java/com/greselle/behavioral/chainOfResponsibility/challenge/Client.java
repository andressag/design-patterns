package com.greselle.behavioral.chainOfResponsibility.challenge;

public class Client {
    public static void main(String[] args) {
        ReceiverInterface faxHandler, emailHandler;
        emailHandler = new EmailErrorHandler();
        faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message msg1 = new Message("Fax is out", MessagePriority.Normal);
        Message msg2 = new Message("Email is not available", MessagePriority.High);

        raiser.raiseMessage(msg1);
        raiser.raiseMessage(msg2);
    }
}
