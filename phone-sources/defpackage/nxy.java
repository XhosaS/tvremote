package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxy implements nws, nwt {
    public nxz a;
    public final jzs b;
    private final boolean c;

    public nxy(jzs jzsVar, boolean z) {
        this.b = jzsVar;
        this.c = z;
    }

    private final nxz c() {
        ocv.aG(this.a, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.a;
    }

    @Override // defpackage.nzw
    public final void aC(nve nveVar) {
        nxz nxzVarC = c();
        nza nzaVar = (nza) nxzVarC;
        nzaVar.a.lock();
        try {
            ((nza) nxzVarC).j.h(nveVar, this.b, this.c);
        } finally {
            nzaVar.a.unlock();
        }
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        c().aD(bundle);
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
        c().aE(i);
    }
}
