package org.igniterealtime.restclient.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * The Class GroupEntities.
 */
@XmlRootElement(name = "groups")
public class GroupEntities {
	
	/** The groups. */
	List<GroupEntity> groups;

	/**
	 * Instantiates a new group entities.
	 */
	public GroupEntities() {
	}

	/**
	 * Instantiates a new group entities.
	 *
	 * @param groups the groups
	 */
	public GroupEntities(List<GroupEntity> groups) {
		this.groups = groups;
	}

	/**
	 * Gets the groups.
	 *
	 * @return the groups
	 */
	@XmlElement(name = "group")
	public List<GroupEntity> getGroups() {
		return groups;
	}

	/**
	 * Sets the groups.
	 *
	 * @param groups the new groups
	 */
	public void setGroups(List<GroupEntity> groups) {
		this.groups = groups;
	}

}
