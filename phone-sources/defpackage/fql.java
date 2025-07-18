package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fql implements fnv {
    private final fnk a;
    private final int b;

    public fql(fnk fnkVar, int i) {
        this.a = fnkVar;
        this.b = i;
    }

    public final IBinder D() {
        return this.a.asBinder();
    }

    @Override // defpackage.fnv
    public final void a(int i, eak eakVar) {
        this.a.a(i, eakVar.c());
    }

    @Override // defpackage.fnv
    public final void b(int i, fnn fnnVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(fnn.a, fnnVar.e);
        bundle.putLong(fnn.b, fnnVar.f);
        bundle.putBundle(fnn.d, fnnVar.g.a());
        bundle.putInt(fnn.c, 4);
        this.a.d(i, bundle);
    }

    @Override // defpackage.fnv
    public final void c(int i, fqz fqzVar, boolean z, boolean z2, int i2) {
        this.a.e(i, fqzVar.b(z, z2).a(i2));
    }

    @Override // defpackage.fnv
    public final void d(int i, fqr fqrVar, eak eakVar, boolean z, boolean z2) {
        Bundle bundleA;
        int i2 = this.b;
        a.ab(i2 != 0);
        boolean z3 = z || !eakVar.d(17);
        boolean z4 = z2 || !eakVar.d(30);
        if (i2 < 2) {
            this.a.f(i, fqrVar.f(eakVar, z, true).a(i2), z3);
            return;
        }
        fqr fqrVarF = fqrVar.f(eakVar, z, z2);
        fnk fnkVar = this.a;
        if (fnkVar instanceof fnj) {
            bundleA = new Bundle();
            bundleA.putBinder(fqr.h, new fqq());
        } else {
            bundleA = fqrVarF.a(i2);
        }
        fqp fqpVar = new fqp(z3, z4);
        Bundle bundle = new Bundle();
        bundle.putBoolean(fqp.a, fqpVar.c);
        bundle.putBoolean(fqp.b, fqpVar.d);
        fnkVar.g(i, bundleA, bundle);
    }

    @Override // defpackage.fnv
    public final void e(int i) {
        this.a.h(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != fql.class) {
            return false;
        }
        return Objects.equals(D(), ((fql) obj).D());
    }

    @Override // defpackage.fnv
    public final void f(int i, fra fraVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(fra.a, fraVar.e);
        bundle.putBundle(fra.b, fraVar.f);
        bundle.putLong(fra.c, fraVar.g);
        fqy fqyVar = fraVar.h;
        if (fqyVar != null) {
            bundle.putBundle(fra.d, fqyVar.a());
        }
        this.a.i(i, bundle);
    }

    @Override // defpackage.fnv
    public final void g(int i, fqw fqwVar, Bundle bundle) {
        this.a.c(i, fqwVar.a(), bundle);
    }

    public final int hashCode() {
        return Objects.hash(D());
    }

    @Override // defpackage.fnv
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void C(fqt fqtVar) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void h(dyo dyoVar) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void m(dzy dzyVar) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void t(eab eabVar) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.fnv
    public final /* synthetic */ void x(eay eayVar) {
    }
}
