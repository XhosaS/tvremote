package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzq {
    public Map a;

    final void a(ogn ognVar, dxo dxoVar, duv duvVar) {
        if (this.a == null) {
            this.a = new LinkedHashMap();
        }
        String str = "imageprefetch_" + ognVar.hashCode();
        dzo dzoVar = (dzo) this.a.get(str);
        if (dzoVar == null) {
            this.a.put(str, new dzo(ognVar, dxoVar, duvVar));
        } else {
            dzoVar.a.add(dxoVar);
        }
    }
}
