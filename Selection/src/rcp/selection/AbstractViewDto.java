package rcp.selection;

import java.beans.PropertyChangeListener;

/**
 * .
 *
 * @author ahorvath
 */
public class AbstractViewDto {
	private long id;

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
	}

	public long getId() {
		return id;
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
	}

	public void setId(long id) {
		this.id = id;
	}
}
