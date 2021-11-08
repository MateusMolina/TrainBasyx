package eng.br.mam.digitaltrain.aas.car;

import eng.br.mam.digitaltrain.aas.device.CompressorAASFactory;
import eng.br.mam.digitaltrain.aas.device.EngineAASFactory;
import eng.br.mam.digitaltrain.submodel.car.LocomotiveSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

public class LocomotiveAASFactory extends CarAASFactory {
	private LocomotiveSM locomotiveSM;
		
	public LocomotiveAASFactory(ServiceSM locomotiveServiceSM, ServiceSM compressorServiceSM, ServiceSM engineServiceSM) {
		super(locomotiveServiceSM);
		this.locomotiveSM = new LocomotiveSM(new CompressorAASFactory(compressorServiceSM).build(),
										new EngineAASFactory(engineServiceSM).build()); 
		
	}	
	
	public LocomotiveAAS build() {
		LocomotiveAAS locomotiveAAS = new LocomotiveAAS(getServiceSM(),
												getStatusSM(),
												getMaintenanceSM(),
												getStateSM(),
												getLocomotiveSM());
		return locomotiveAAS;
	}
	
	public LocomotiveSM getLocomotiveSM() {
		return this.locomotiveSM;
	}
}
