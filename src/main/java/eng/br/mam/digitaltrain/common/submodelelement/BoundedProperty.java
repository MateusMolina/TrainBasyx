package eng.br.mam.digitaltrain.common.submodelelement;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.valuetype.ValueTypeHelper;

public class BoundedProperty extends Property implements IBoundedProperty{

	public static final String UPPERLIMIT = "upperlimit";
	public static final String BOTTOMLIMIT = "bottomlimit";

	
	public BoundedProperty(String idShort, Object value, Object bottomLimit, Object upperLimit) {
		super(idShort, value);
		setUpperLimit(upperLimit);
		setBottomLimit(bottomLimit);
	}	
	
	@Override
	public void setUpperLimit(Object upperLimit) {
		put(UPPERLIMIT, ValueTypeHelper.prepareForSerialization(upperLimit));
	}

	@Override
	public void setBottomLimit(Object bottomLimit) {
		put(BOTTOMLIMIT, ValueTypeHelper.prepareForSerialization(bottomLimit));
	}
	
	@Override
	public Object getUpperLimit() {
		return get(UPPERLIMIT);
	}
	
	@Override
	public Object getBottomLimit() {
		return get(BOTTOMLIMIT);
	}
	
	@Override
	public void setValue(Object value) {
		Double val = (Double) getValue();
		Double ul = (Double) getUpperLimit();
		Double bl = (Double) getBottomLimit();
		
		if (val <= ul && val >= bl) {
			super.setValue(value);
		}else {
			throw new RuntimeException("Set Value from "+this.getIdShort()+" should be between "+bl+" and "+ul);
		}
	}
}