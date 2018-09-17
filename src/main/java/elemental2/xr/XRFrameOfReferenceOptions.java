package elemental2.xr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 9/10/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class XRFrameOfReferenceOptions {
    // false
    public boolean disableStageEmulation;
    // 0.0
    public double stageEmulationHeight;
}
