package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class bve extends bvd {
    final /* synthetic */ we a;
    final /* synthetic */ bvf b;

    public bve(bvf bvfVar, we weVar) {
        this.b = bvfVar;
        this.a = weVar;
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void b(bvc bvcVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(bvcVar);
        bvcVar.H(this);
    }
}
