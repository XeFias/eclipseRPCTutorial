 
package com.vogella.tasks.ui.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

public class PlaygroundPart {
	@Inject
	public PlaygroundPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
	}
	
	@PostConstruct
	public void createControls(Composite parent) {
	    System.out.println(this.getClass().getSimpleName()
	    + " @PostConstruct method called.");
	}
	
	
}