package eng.br.mam.digitaltrain.car.submodel.locomotive;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.common.submodelelement.BoundedProperty;

public class LocomotiveControlSM extends Submodel implements ILocomotiveControlSM {

	public static final String IDSHORT = "locomotiveControlSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	};
	
	public static final String CURRENTTRACTIVENOTCH_IDSHORT = "currentTractiveNotch";
	public static final String CURRENTPNEUMATICBRAKENOTCH_IDSHORT = "currentPneumaticBrakeNotch";

	
	public LocomotiveControlSM(String aasId, BoundedProperty currentTractiveNotchProp, BoundedProperty currentPneumaticBrakeNotch) {
		super(IDSHORT, new ModelUrn(ID(aasId)));
		
		currentTractiveNotchProp.setIdShort(CURRENTTRACTIVENOTCH_IDSHORT);
		currentPneumaticBrakeNotch.setIdShort(CURRENTPNEUMATICBRAKENOTCH_IDSHORT);
		
		addSubmodelElement(currentTractiveNotchProp);
		addSubmodelElement(getCurrentPneumaticBrakeNotch());
	}
	
	/**
	 * Creates a blank LocomotiveControlSM with all properties set to 0
	 * 
	 * @param aasId
	 */
	public LocomotiveControlSM(String aasId) {
		this(aasId, new BoundedProperty(CURRENTTRACTIVENOTCH_IDSHORT, 0, -8, 8),
					new BoundedProperty(CURRENTPNEUMATICBRAKENOTCH_IDSHORT, 0, 0, 32));
	}
	
	@Override
	public BoundedProperty getCurrentTractiveNotch() {
		return (BoundedProperty) getSubmodelElement(CURRENTTRACTIVENOTCH_IDSHORT);
	}

	@Override
	public BoundedProperty getCurrentPneumaticBrakeNotch() {
		return (BoundedProperty) getSubmodelElement(CURRENTPNEUMATICBRAKENOTCH_IDSHORT);
	}

}
