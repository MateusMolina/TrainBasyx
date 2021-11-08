package eng.br.mam.digitaltrain.submodel.map.car;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.aas.api.device.ICompressorAAS;
import eng.br.mam.digitaltrain.aas.api.device.IEngineAAS;
import eng.br.mam.digitaltrain.submodel.api.car.ILocomotiveSM;

public class LocomotiveSM extends Submodel implements ILocomotiveSM {
	
	private ICompressorAAS compressorAAS;
	private IEngineAAS engineAAS;

	public LocomotiveSM(ICompressorAAS compressorAAS, IEngineAAS engineAAS) {
		super();
		this.compressorAAS = compressorAAS;
		this.engineAAS = engineAAS;
	}

	public ICompressorAAS getCompressor() {
		return compressorAAS;
	}

	public IEngineAAS getEngine() {
		return engineAAS;
	}


}
