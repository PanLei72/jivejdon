/*
 * Copyright 2003-2009 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.jdon.jivejdon.event.domain.producer.write;

import com.jdon.annotation.Introduce;
import com.jdon.annotation.model.Send;
import com.jdon.domain.message.DomainMessage;
import com.jdon.jivejdon.model.event.MessageMovedEvent;
import com.jdon.jivejdon.model.event.MessagePropertiesUpdatedEvent;
import com.jdon.jivejdon.model.event.MessageUpdatedEvent;
import com.jdon.jivejdon.model.event.ReplyMessageCreatedEvent;
import com.jdon.jivejdon.model.event.ThreadNameSavedEvent;
import com.jdon.jivejdon.model.event.ThreadTagsSavedEvent;
import com.jdon.jivejdon.model.event.UploadFilesSavedEvent;

@Introduce("message")
public class MessageEventSourcingRole {

	@Send("addReplyMessage")
	public DomainMessage addReplyMessage(ReplyMessageCreatedEvent event) {
		return new DomainMessage(event);
	}

	@Send("saveMessage")
	public DomainMessage saveMessage(MessageUpdatedEvent event) {
		return new DomainMessage(event);
	}

	@Send("moveMessage")
	public DomainMessage moveMessage(MessageMovedEvent event) {
		return new DomainMessage(event);
	}

	@Send("updateMessageProperties")
	public DomainMessage saveMessageProperties(MessagePropertiesUpdatedEvent event) {
		return new DomainMessage(event);
	}

	@Send("saveUploadFiles")
	public DomainMessage saveUploadFiles(UploadFilesSavedEvent event) {
		return new DomainMessage(event);
	}

	@Send("saveTags")
	public DomainMessage saveTagTitles(ThreadTagsSavedEvent event) {
		return new DomainMessage(event);
	}

	@Send("saveName")
	public DomainMessage saveName(ThreadNameSavedEvent event) {
		return new DomainMessage(event);
	}

}