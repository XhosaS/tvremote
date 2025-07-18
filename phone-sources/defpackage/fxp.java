package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxp {
    public static final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();

    public final fxo a(Class cls) {
        return b(fus.K(cls));
    }

    public final fxo b(String str) {
        str.getClass();
        if (!fus.J(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        fxo fxoVar = (fxo) this.b.get(str);
        if (fxoVar != null) {
            return fxoVar;
        }
        throw new IllegalStateException(a.cg(str, "Could not find Navigator with name \"", "\". You must call NavController.addNavigator() for each navigation type."));
    }

    public final Map c() {
        return yfm.l(this.b);
    }

    public final void d(fxo fxoVar) {
        fxoVar.getClass();
        String strK = fus.K(fxoVar.getClass());
        if (!fus.J(strK)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Map map = this.b;
        fxo fxoVar2 = (fxo) map.get(strK);
        if (yks.e(fxoVar2, fxoVar)) {
            return;
        }
        if (fxoVar2 != null && fxoVar2.b) {
            throw new IllegalStateException(a.ck(fxoVar2, fxoVar, "Navigator ", " is replacing an already attached "));
        }
        if (fxoVar.b) {
            throw new IllegalStateException(a.cj(fxoVar, "Navigator ", " is already attached to another NavController"));
        }
    }
}
