package com.nttdata.bootcamp.temperaturaspringautoconfigure.temperatura;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("temperatura.sistema")
@Getter
@Setter
public class TemperaturaProperties {
	
	private String sistem = "CELSIUS";

	/**
	 * @return the sistem
	 */
	public String getSistem() {
		return sistem;
	}

	/**
	 * @param sistem the sistem to set
	 */
	public void setSistem(String sistem) {
		this.sistem = sistem;
	}
	
}
