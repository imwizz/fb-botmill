package co.aurasphere.facebot.model.outcoming.factory;

import co.aurasphere.facebot.bean.FaceBotBean;
import co.aurasphere.facebot.model.base.User;
import co.aurasphere.facebot.model.incoming.MessageEnvelope;
import co.aurasphere.facebot.model.outcoming.FaceBotResponse;
import co.aurasphere.facebot.model.outcoming.message.FaceBotMessageResponse;
import co.aurasphere.facebot.model.outcoming.message.Message;
import co.aurasphere.facebot.model.outcoming.message.TextMessage;

/**
 * A builder for a message that contains only text.
 * 
 * @author Donato
 * @date 08/ago/2016
 */
public class TextMessageBuilder extends FaceBotBean implements
		FaceBotResponseBuilder {

	/**
	 * The message of the response.
	 */
	private String messageText;

	TextMessageBuilder(String messageText) {
		this.messageText = messageText;
	}

	public FaceBotResponse build(MessageEnvelope envelope) {
		User recipient = safeGetSender(envelope);
		Message message = new TextMessage(messageText);
		return new FaceBotMessageResponse(recipient, message);
	}

}