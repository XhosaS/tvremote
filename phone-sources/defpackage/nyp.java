package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyp implements nws, nwt {
    final /* synthetic */ nyr a;

    public nyp(nyr nyrVar) {
        this.a = nyrVar;
    }

    @Override // defpackage.nzw
    public final void aC(nve nveVar) {
        nyr nyrVar = this.a;
        nyrVar.b.lock();
        try {
            if (nyrVar.n(nveVar)) {
                nyrVar.i();
                nyrVar.k();
            } else {
                nyrVar.j(nveVar);
            }
        } finally {
            this.a.b.unlock();
        }
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        nyr nyrVar = this.a;
        ocv.aF(nyrVar.i);
        onj onjVar = nyrVar.j;
        ocv.aF(onjVar);
        onjVar.q(new nyo(nyrVar));
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
    }
}
