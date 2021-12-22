package eng.br.mam.digitaltrain.car.submodel.locomotive;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class LocomotiveControlSM extends Submodel implements ILocomotiveControlSM {

	public static final String IDSHORT = "locomotiveControlSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	};
	
	public static final String CURRENTTRACTIVENOTCH_IDSHORT = "currentTractiveNotch";
	public static final String CURRENTPNEUMATICBRAKENOTCH_IDSHORT = "currentPneumaticBrakeNotch";
	public static final String CURRENTEGPPRESSURE_IDSHORT = "currentEGPressure";

	
	public LocomotiveControlSM(String aasId, Property currentTractiveNotchProp, Property currentPneumaticBrakeNotch, Property currentEGPressure) {
		super(IDSHORT, new ModelUrn(ID(aasId)));
		
		currentTractiveNotchProp.setIdShort(CURRENTTRACTIVENOTCH_IDSHORT);
		currentPneumaticBrakeNotch.setIdShort(CURRENTPNEUMATICBRAKENOTCH_IDSHORT);
		currentEGPressure.setIdShort(CURRENTEGPPRESSURE_IDSHORT);
		
		addSubmodelElement(currentTractiveNotchProp);
		addSubmodelElement(getCurrentPneumaticBrakeNotch());
		addSubmodelElement(getCurrentEGPressure());
	}
	
	/**
	 * Creates a blank LocomotiveControlSM with all properties set to 0
	 * 
	 * @param aasId
	 */
	public LocomotiveControlSM(String aasId) {
		this(aasId, new Property(CURRENTTRACTIVENOTCH_IDSHORT, 0),
					new Property(CURRENTPNEUMATICBRAKENOTCH_IDSHORT, 0),
					new Property(CURRENTEGPPRESSURE_IDSHORT, 0));
	}
	
	@Override
	public Property getCurrentTractiveNotch() {
		return (Property) getSubmodelElement(CURRENTTRACTIVENOTCH_IDSHORT);
	}

	@Override
	public Property getCurrentPneumaticBrakeNotch() {
		return (Property) getSubmodelElement(CURRENTPNEUMATICBRAKENOTCH_IDSHORT);
	}

	@Override
	public Property getCurrentEGPressure() {
		return (Property) getSubmodelElement(CURRENTEGPPRESSURE_IDSHORT);
	}

}
