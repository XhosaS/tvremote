package defpackage;

import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class kpr extends kpj {
    final /* synthetic */ Object a;
    final /* synthetic */ lvj b;

    public kpr(Object obj, lvj lvjVar) {
        this.a = obj;
        this.b = lvjVar;
    }

    @Override // defpackage.kpk
    public final void e(FusedLocationProviderResult fusedLocationProviderResult) {
        kid.a(fusedLocationProviderResult.a, this.a, this.b);
    }

    @Override // defpackage.kpk
    public final void f() {
    }
}
