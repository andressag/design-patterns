package com.greselle.behavioral.chainOfResponsibility.challenge;

public interface ReceiverInterface {
    boolean processMessage(Message message);
    void setNextChain(ReceiverInterface receiverInterface);
}

class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Faz")) {
            System.out.println("FazErrorHandler " + message.priority + " priority");
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
class EmailErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("EmailErrorHandler " + message.priority + " priority");
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
            return false;
        }
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
