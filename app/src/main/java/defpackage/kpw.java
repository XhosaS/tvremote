package defpackage;

import android.location.Location;

/* compiled from: PG */
/* loaded from: classes.dex */
class kpw extends kpb {
    public final kpt a;

    public kpw(kpt kptVar) {
        this.a = kptVar;
    }

    @Override // defpackage.kpc
    public final void e(Location location) {
        this.a.b().a(new kpu(location));
    }

    @Override // defpackage.kpc
    public final void f() {
        this.a.b().a(new kpv(this));
    }
}
