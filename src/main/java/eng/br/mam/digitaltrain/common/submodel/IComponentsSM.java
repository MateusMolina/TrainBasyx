package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.component.aas.IComponentAAS;

public interface IComponentsSM extends ISubmodel{
	
	public ISubmodelElementCollection getComponents();
	
	public void addComponent(IComponentAAS component);
}
