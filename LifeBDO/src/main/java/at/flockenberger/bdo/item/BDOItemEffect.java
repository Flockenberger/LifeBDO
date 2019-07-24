package at.flockenberger.bdo.item;

/**
 * <h1>BDOItemEffect</h1> <br>
 * The effect fo a {@link BDOItem}. Right now only the effect part is used!
 * 
 * @author Flockenberger
 *
 */
public class BDOItemEffect {

	private String effect;
	private int amplifier;
	private boolean percent;

	public BDOItemEffect(String effect, int amplifier, boolean isPercent) {
		super();
		this.effect = effect;
		this.amplifier = amplifier;
		this.percent = isPercent;
	}

	/**
	 * @return the item's effect as String
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * Sets the effect..
	 * 
	 * @param effect the effect to set
	 */
	public void setEffect(String effect) {
		this.effect = effect;
	}

	/**
	 * 
	 * @return the amplifier of the effect
	 */
	public int getAmplifier() {
		return amplifier;
	}

	/**
	 * Sets the amplifier of the effect
	 * 
	 * @param amplifier the amplifier to set
	 */
	public void setAmplifier(int amplifier) {
		this.amplifier = amplifier;
	}

	/**
	 * @return whether the amplifier is in percentage or not
	 */
	public boolean isPercent() {
		return percent;
	}

	@Override
	public String toString() {
		return "BDOItemEffect [effect=" + effect + ", amplifier=" + amplifier + ", percent=" + percent + "]";
	}

}
