 
package com.vogella.tasks.ui.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;

public class TodoDetailsPart {
	@Inject
	public TodoDetailsPart() {
		System.out.println(this.getClass().getSimpleName() + " constructed.");
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
	}
	
	
	
	
}