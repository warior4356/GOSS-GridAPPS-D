package pnnl.goss.gridappsd.requests;

import java.io.Serializable;

public class PowerSystemConfig implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String SubGeographicalRegion_name;

	private String GeographicalRegion_name;

	private String Line_name;

	public PowerSystemConfig(){
	}
	public PowerSystemConfig(String line_name, String subGeographicalRegion_name, String geographicalRegion_name){
		this.Line_name = line_name;
		this.SubGeographicalRegion_name = subGeographicalRegion_name;
		this.GeographicalRegion_name = geographicalRegion_name;
	}

	public String getSubGeographicalRegion_name() {
		return SubGeographicalRegion_name;
	}

	public void setSubGeographicalRegion_name(String SubGeographicalRegion_name) {
		this.SubGeographicalRegion_name = SubGeographicalRegion_name;
	}

	public String getGeographicalRegion_name() {
		return GeographicalRegion_name;
	}

	public void setGeographicalRegion_name(String GeographicalRegion_name) {
		this.GeographicalRegion_name = GeographicalRegion_name;
	}

	public String getLine_name() {
		return Line_name;
	}

	public void setLine_name(String Line_name) {
		this.Line_name = Line_name;
	}

	@Override
	public String toString() {
		return "ClassPojo [SubGeographicalRegion_name = "
				+ SubGeographicalRegion_name + ", GeographicalRegion_name = "
				+ GeographicalRegion_name + ", Line_name = " + Line_name + "]";
	}
}