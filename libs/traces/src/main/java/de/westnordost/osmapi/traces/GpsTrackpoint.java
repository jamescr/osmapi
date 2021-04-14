package de.westnordost.osmapi.traces;

import java.io.Serializable;
import java.time.Instant;

import de.westnordost.osmapi.map.data.LatLon;

public class GpsTrackpoint implements Serializable
{
	private static final long serialVersionUID = 2L;

	public GpsTrackpoint(LatLon position)
	{
		this.position = position;
	}
	
	/** whether this trackpoint is the first point in a new segment/track (no differentiation made) */
	public boolean isFirstPointInTrackSegment;
	
	public LatLon position;
	
	/** null if unknown. The time is only specified in tracks uploaded with the visibility
	 *  identifiable or trackable (see GpsTraceDetails) */
	public Instant time;
	
	public Float horizontalDilutionOfPrecision;
	public Float elevation;
}
