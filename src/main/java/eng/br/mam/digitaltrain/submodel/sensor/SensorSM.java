package eng.br.mam.digitaltrain.submodel.sensor;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class SensorSM extends Submodel implements ISensorSM {

	private String valueId;
	
	
	public SensorSM() {
		super();
		IProperty value = new Property("value", 0f);
		addSubmodelElement(value);
		this.valueId = value.getIdShort();
	}
	
	
	@Override
	public IProperty getValue() {
		return (Property) this.getSubmodelElement(valueId);
	}

	@Override
	public float fetchValue() {
		return (Float) this.getSubmodelElement(valueId).getValue();
	}

	@Override
	public void setValue(float newValue) {
		IProperty value = (Property) this.getSubmodelElement(valueId);
		value.setValue(newValue);
	}

}
