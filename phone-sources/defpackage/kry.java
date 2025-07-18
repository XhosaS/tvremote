package defpackage;

import android.R;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kry implements iej {
    private final cr a;
    private final ieh b;
    private final ieh c;
    private final idb d;

    public kry(cr crVar, ieh iehVar, ieh iehVar2, idb idbVar) {
        crVar.getClass();
        this.a = crVar;
        this.b = iehVar;
        this.c = iehVar2;
        this.d = idbVar;
    }

    @Override // defpackage.iej
    public final void dM() {
        Object objA = this.b.a();
        String canonicalName = ((Class) objA).getCanonicalName();
        if (((krl) this.d).a || this.a.f(canonicalName) == null) {
            try {
                bv bvVar = (bv) ((Class) objA).newInstance();
                bvVar.setArguments((Bundle) ((icy) this.c).a);
                at atVar = new at(this.a);
                atVar.u(R.id.content, bvVar, canonicalName);
                atVar.l();
            } catch (IllegalAccessException | InstantiationException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
