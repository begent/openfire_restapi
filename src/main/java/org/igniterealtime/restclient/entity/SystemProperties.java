package org.igniterealtime.restclient.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * The Class SystemProperties.
 */
@XmlRootElement(name = "properties")
public class SystemProperties {

	/** The properties. */
	List<SystemProperty> properties;

	/**
	 * Instantiates a new system properties.
	 */
	public SystemProperties() {

	}

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	@XmlElement(name = "property")
	public List<SystemProperty> getProperties() {
		return properties;
	}


	/**
	 * Sets the properties.
	 *
	 * @param properties the new properties
	 */
	public void setProperties(List<SystemProperty> properties) {
		this.properties = properties;
	}
}
