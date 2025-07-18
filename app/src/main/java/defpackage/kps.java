package defpackage;

import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class kps extends kpj {
    final /* synthetic */ lvj a;
    final /* synthetic */ kpc b;

    public kps(lvj lvjVar, kpc kpcVar) {
        this.a = lvjVar;
        this.b = kpcVar;
    }

    @Override // defpackage.kpk
    public final void e(FusedLocationProviderResult fusedLocationProviderResult) {
        kid.a(fusedLocationProviderResult.a, null, this.a);
    }

    @Override // defpackage.kpk
    public final void f() {
        this.b.f();
    }
}
