package com.volmit.react.api;

import org.bukkit.event.Listener;

/**
 * Represents a sampler
 *
 * @author cyberpwn
 *
 */
public interface ISampler extends Listener
{
	/**
	 * Check if this sampler is hibernating
	 *
	 * @return true if it hasnt been used for a long time
	 */
	public boolean isHibernating();

	/**
	 * Set this sampler to allow hibernating when not used
	 *
	 * @param b
	 *            true if its hibernating
	 */
	public void setAllowHibernation(boolean b);

	/**
	 * Get the tick interval of this sampler
	 *
	 * @return the tick interval
	 */
	public int getInterval();

	/**
	 * Set the tick interval of this sampler
	 *
	 * @param interval
	 *            the interval
	 */
	public void setInterval(int interval);

	/**
	 * Hint the sampler formatter to set its accuracy to x digits
	 *
	 * @param accuracy
	 *            the accuracy
	 */
	public void setAccuracy(int accuracy);

	/**
	 * Get this samplers digit accuracy hint
	 *
	 * @return the accuracy hint
	 */
	public int getAccuracy();

	/**
	 * Get the id of this sampler
	 *
	 * @return the identifier
	 */
	public String getId();

	/**
	 * Get the shortcode of this sampler
	 *
	 * @return the sampler shortcode i.e. TPS or MEM or CHKS
	 */
	public String getShortcode();

	/**
	 * Get the display name of this sampler
	 *
	 * @return the display name
	 */
	public String getDisplayName();

	/**
	 * Get the description of this sampler
	 *
	 * @return the description
	 */
	public String getDescription();

	/**
	 * Called when it is time to sample
	 */
	public void sample();

	/**
	 * Get the raw value of this sampler
	 *
	 * @return the value
	 */
	public double getValue();

	/**
	 * Get the formatted value of this sampler
	 *
	 * @return the formatted value
	 */
	public String get();

	/**
	 * Get the fully formatted tag for this value
	 *
	 * @return the formatted tag shown in the action bar
	 */
	public String getTag();
}
