package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrs {
    private static final yns a = new yns(0, ynv.a);
    private final Map b = new LinkedHashMap();

    public final vrp a(yjv yjvVar) {
        vtw vtwVarM = vrp.a.m();
        vtwVarM.getClass();
        int iB = a.b();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vrp vrpVar = (vrp) vtwVarM.b;
        vrpVar.b |= 1;
        vrpVar.c = iB;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        vrp vrpVar2 = (vrp) vucVarR;
        this.b.put(vrpVar2, yjvVar);
        return vrpVar2;
    }

    public final vrr b(vrp vrpVar, View view) {
        yjv yjvVar = (yjv) this.b.get(vrpVar);
        if (yjvVar != null) {
            return (vrr) yjvVar.a(view);
        }
        throw new IllegalStateException("Tap is not mapped to any action.");
    }

    public final void c(vrp vrpVar, yjv yjvVar) {
        vrpVar.getClass();
        Map map = this.b;
        if (!map.containsKey(vrpVar)) {
            throw new IllegalArgumentException("Can't update tap that is not registered. Make sure to create Taps using TapMapper.newTap()");
        }
        map.put(vrpVar, yjvVar);
    }
}
