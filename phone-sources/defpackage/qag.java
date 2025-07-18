package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qag extends qad {
    private final pyd c;
    private final String d;

    public qag(pyd pydVar) {
        pydVar.getClass();
        this.c = pydVar;
        this.d = "RPC_STORE_TARGET";
    }

    @Override // defpackage.qsx
    public final String d() {
        return this.d;
    }

    @Override // defpackage.qad
    public final Object f(Bundle bundle, vme vmeVar, qen qenVar, yih yihVar) {
        if (qenVar == null) {
            return j();
        }
        vmd vmdVarB = vmd.b(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", vmd.REGISTRATION_REASON_UNSPECIFIED.p));
        if (vmdVarB != null) {
            return this.c.b(qenVar, vmdVarB, vmeVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // defpackage.qad
    protected final String g() {
        return "StoreTargetCallback";
    }
}
