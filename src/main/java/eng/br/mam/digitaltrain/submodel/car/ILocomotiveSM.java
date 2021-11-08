package eng.br.mam.digitaltrain.submodel.api.car;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;

import eng.br.mam.digitaltrain.aas.api.device.ICompressorAAS;
import eng.br.mam.digitaltrain.aas.api.device.IEngineAAS;

public interface ILocomotiveSM extends ISubmodel{
	
	public ICompressorAAS getCompressor();
	public IEngineAAS getEngine();

}
