package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aia extends aht {
    final /* synthetic */ aib g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aia(aib aibVar, int i, Bundle bundle) {
        super(aibVar, i, bundle);
        this.g = aibVar;
    }

    @Override // defpackage.aht
    protected final void a(aeq aeqVar) {
        this.g.f.a(aeqVar);
        System.currentTimeMillis();
    }

    @Override // defpackage.aht
    protected final boolean b() {
        this.g.f.a(aeq.a);
        return true;
    }
}
