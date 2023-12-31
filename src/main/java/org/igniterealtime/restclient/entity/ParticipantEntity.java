package org.igniterealtime.restclient.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "participant")
public class ParticipantEntity {

	private String jid;
	private String role;
	private String affiliation;

	public ParticipantEntity() {
	}

	@XmlElement
	public String getJid() {
		return jid;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	@XmlElement
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@XmlElement
	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

}