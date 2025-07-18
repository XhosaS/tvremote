package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyh implements nyx {
    public final nza a;

    public nyh(nza nzaVar) {
        this.a = nzaVar;
    }

    @Override // defpackage.nyx
    public final nxr a(nxr nxrVar) {
        try {
            nza nzaVar = this.a;
            nyw nywVar = nzaVar.l;
            nywVar.m.a(nxrVar);
            npj npjVar = nxrVar.g;
            nwj nwjVar = (nwj) nywVar.i.get(npjVar);
            ocv.aG(nwjVar, "Appropriate Api was not requested.");
            if (nwjVar.D() || !nzaVar.g.containsKey(npjVar)) {
                nxrVar.l(nwjVar);
                return nxrVar;
            }
            nxrVar.m(new Status(17));
            return nxrVar;
        } catch (DeadObjectException unused) {
            this.a.f(new nyg(this, this));
            return nxrVar;
        }
    }

    @Override // defpackage.nyx
    public final void e(int i) {
        nza nzaVar = this.a;
        nzaVar.i();
        nzaVar.m.c(i);
    }

    @Override // defpackage.nyx
    public final void f(nxr nxrVar) {
        a(nxrVar);
    }

    @Override // defpackage.nyx
    public final void g() {
        this.a.i();
    }

    @Override // defpackage.nyx
    public final void b() {
    }

    @Override // defpackage.nyx
    public final void c() {
    }

    @Override // defpackage.nyx
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.nyx
    public final void h(nve nveVar, jzs jzsVar, boolean z) {
    }
}
