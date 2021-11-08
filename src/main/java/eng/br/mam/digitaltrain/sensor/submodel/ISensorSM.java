package eng.br.mam.digitaltrain.sensor.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

public interface ISensorSM extends ISubmodel {
	
	public IProperty getValue();
	// PUBSUP Proxy attribute
	
	public float fetchValue();
	public void setValue(float newValue);
	
	// TODO PUB/SUB Integration
	
}
