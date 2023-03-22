package com.greselle.behavioral.chainOfResponsibility.challenge;

public class IssueRaiser {
    private ReceiverInterface receiverInterface;

    public IssueRaiser(ReceiverInterface receiverInterface) {
        this.receiverInterface = receiverInterface;
    }
    public void raiseMessage(Message message) {
        if (receiverInterface != null) {
            receiverInterface.processMessage(message);
        }
    }
}
