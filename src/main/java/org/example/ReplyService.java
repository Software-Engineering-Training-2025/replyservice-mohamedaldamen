package org.example;

import java.util.HashMap;
import java.util.Map;

import static org.example.ReplyType.FORMAL;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {
    Map<String, Map<ReplyType, String>> repliesMap = new HashMap<>();

    public ReplyService() {
        addHi();
        addHello();
        addBye();
        addAccountHelp();
        addThanksReply();
        addHowRU();
        addNeedHelp();
        addWrongTextReply();
        addYourName();
    }

    private void addHi() {
        Map<ReplyType, String> Hireply = new HashMap<>();
        Hireply.put(FORMAL, "Hello. How may I assist you today?");
        Hireply.put(ReplyType.FRIENDLY, "Hey there! \uD83D\uDE0A How can I help?");
        Hireply.put(ReplyType.CONCISE, "Hello. How can I help?");
        repliesMap.put("hi", Hireply);
    }

    private void addHello() {
        Map<ReplyType, String> helloreply = new HashMap<>();
        helloreply.put(FORMAL, "Hello. How may I assist you today?");
        helloreply.put(ReplyType.FRIENDLY, "Hi! \uD83D\uDC4B What’s up?");
        helloreply.put(ReplyType.CONCISE, "Hello. How can I help?");
        repliesMap.put("hello", helloreply);
    }

    private void addHowRU() {
        Map<ReplyType, String> howru = new HashMap<>();
        howru.put(FORMAL, "I am functioning properly. How may I assist you?");
        howru.put(ReplyType.FRIENDLY, "Doing great! \uD83D\uDE04 How can I help?");
        howru.put(ReplyType.CONCISE, "I’m good. How can I help?");
        repliesMap.put("how are you", howru);
    }

    private void addNeedHelp() {
        Map<ReplyType, String> NeedHelpReply = new HashMap<>();
        NeedHelpReply.put(FORMAL, "I can assist with that. Please provide more details.");
        NeedHelpReply.put(ReplyType.FRIENDLY, "I’ve got you! \uD83D\uDE42 Tell me a bit more.");
        NeedHelpReply.put(ReplyType.CONCISE, "Share details; I’ll help.");
        repliesMap.put("i need help", NeedHelpReply);
    }

    private void addAccountHelp() {
        Map<ReplyType, String> AccountHelp = new HashMap<>();
        AccountHelp.put(FORMAL, "Certainly. Please describe the account issue.");
        AccountHelp.put(ReplyType.FRIENDLY, "Sure thing! \uD83D\uDE0A What’s wrong with the account?");
        AccountHelp.put(ReplyType.CONCISE, "Describe the account issue…");
        repliesMap.put("can you help me with my account", AccountHelp);
    }

    private void addThanksReply() {
        Map<ReplyType, String> thanksReply = new HashMap<>();
        thanksReply.put(FORMAL, "You are welcome.");
        thanksReply.put(ReplyType.FRIENDLY, "Anytime! \uD83D\uDE4C");
        thanksReply.put(ReplyType.CONCISE, "You’re welcome.");
        repliesMap.put("thanks", thanksReply);
    }

    private void addBye() {
        Map<ReplyType, String> byeReply = new HashMap<>();
        byeReply.put(FORMAL, "Goodbye.");
        byeReply.put(ReplyType.FRIENDLY, "See you later! \uD83D\uDC4B");
        byeReply.put(ReplyType.CONCISE, "Goodbye.");
        repliesMap.put("bye", byeReply);
    }

    private void addYourName() {
        Map<ReplyType, String> yourNameReply = new HashMap<>();
        yourNameReply.put(FORMAL, "I am your virtual assistant.");
        yourNameReply.put(ReplyType.FRIENDLY, "I’m your helper bot \uD83E\uDD16");
        yourNameReply.put(ReplyType.CONCISE, "I’m your assistant.");
        repliesMap.put("what is your name", yourNameReply);
    }

    private void addWrongTextReply() {
        Map<ReplyType, String> wrongTextReply = new HashMap<>();
        wrongTextReply.put(FORMAL, "Could you clarify your request?");
        wrongTextReply.put(ReplyType.FRIENDLY, "Could you tell me more?");
        wrongTextReply.put(ReplyType.CONCISE, "Please clarify.");
        repliesMap.put("anything", wrongTextReply);
    }


    public String reply(String message, ReplyType type) {
        if (message == null || message.startsWith(" ")|| message.equals(""))
            return "Please say something.";

        message=message.toLowerCase();

        Map<ReplyType, String> replies = repliesMap.get(message);
        if (replies == null)
            replies = repliesMap.get("anything");
        return replies.get(type);


    }

}
