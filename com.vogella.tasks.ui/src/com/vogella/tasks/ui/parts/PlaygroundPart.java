 
package com.vogella.tasks.ui.parts;

import javax.inject.Inject;
//import javax.annotation.PostConstruct;
//import org.eclipse.swt.widgets.Composite;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class PlaygroundPart {
	@Inject
    public PlaygroundPart() {

        IEclipseContext localCtx = EclipseContextFactory.create();
        localCtx.set(String.class, "Hello");

        // You could also connect your new local context with an existing context hierarchy
//      localCtx.setParent(context);

        // Create instance via factory (DI!)
        ACustomClass p = ContextInjectionFactory.make(ACustomClass.class, localCtx);
        System.out.println(p);
    }
	
//	@PostConstruct
//	public void postConstruct(Composite parent) {
//		
//	}
//	
//	@PostConstruct
//	public void createControls(Composite parent) {
//	    System.out.println(this.getClass().getSimpleName()
//	    + " @PostConstruct method called.");
//	}
	
	
}