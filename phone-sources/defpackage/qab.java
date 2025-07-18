package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qab extends qad {
    private final pyd c;
    private final String d;

    public qab(pyd pydVar) {
        pydVar.getClass();
        this.c = pydVar;
        this.d = "RPC_REMOVE_TARGET";
    }

    @Override // defpackage.qsx
    public final String d() {
        return this.d;
    }

    @Override // defpackage.qad
    public final Object f(Bundle bundle, vme vmeVar, qen qenVar, yih yihVar) {
        return qenVar == null ? j() : this.c.a(qenVar, vmeVar);
    }

    @Override // defpackage.qad
    protected final String g() {
        return "RemoveTargetCallback";
    }
}
