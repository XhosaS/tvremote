package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oas extends oal {
    final /* synthetic */ oat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oas(oat oatVar, int i, Bundle bundle) {
        super(oatVar, i, bundle);
        this.g = oatVar;
    }

    @Override // defpackage.oal
    protected final void a(nve nveVar) {
        oat oatVar = this.g;
        oatVar.z.a(nveVar);
        oatVar.o(nveVar);
    }

    @Override // defpackage.oal
    protected final boolean b() {
        this.g.z.a(nve.a);
        return true;
    }
}
