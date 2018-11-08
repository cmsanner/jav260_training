package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television>{
	private String brand;
	private int volume;
	private Tuner tuner = new Tuner();
	private DisplayType display;
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 100;
	public static final int MIN_CHANNEL = 1;
	public static final int MAX_CHANNEL = 999;
	
	
	public Television() {
		
	}
	
	public Television(String brand, int volume) {
		this.brand = brand;
		this.setVolume(volume);
	}
	
	public Television(String brand, int volume, DisplayType display) {
		this.setBrand(brand);
		this.setVolume(volume);
		this.display = display;
		
	}
	
	public int getCurrentChannel() {
		return tuner.getChannel();
	}
	
	public void changeChannel(int channel) throws InvalidChannelException {
		if (channel >= MIN_CHANNEL && channel <=MAX_CHANNEL) {
			tuner.setChannel(channel);
		}else {
			throw new InvalidChannelException("Invalid channel " + channel + " valid channels are between " +
					MIN_CHANNEL + " and " + MAX_CHANNEL);
		}
		
	} 
	

	
	public String toString() {
		return getClass().getSimpleName() + " [brand = " + getBrand() +
				", volume = " + getVolume() + ", currentChannel=" +
				getCurrentChannel() + " displayType= " + getDisplay() + "]";
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVolume() {
		return volume;
	}

	public int setVolume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
		}else {
			
			throw new IllegalArgumentException("Invalid volume " + volume + " valid volume is between " +
			MIN_VOLUME + " and " + MAX_VOLUME);
		}
		return volume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getBrand(), getVolume());
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
//		result = prime * result + volume;
//		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Television) {
			Television other = (Television) obj;
			result = Objects.equals(this.getBrand(),  other.getBrand()) &&
					Objects.equals(this.getVolume(), other.getVolume());
		}
		return result;
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Television other = (Television) obj;
//		if (brand == null) {
//			if (other.brand != null)
//				return false;
//		} else if (!brand.equals(other.brand))
//			return false;
//		if (volume != other.volume)
//			return false;
//		return true;
	}

	@Override
	public int compareTo(Television other) {
		// TODO Auto-generated method stub
	//	return this.getBrand().compareTo(other.getBrand());
		return Integer.compare(this.getVolume(), other.getVolume());
	}

	public DisplayType getDisplay() {
		return display;
	}

	public void setDisplay(DisplayType display) {
		this.display = display;
	}
	

}
