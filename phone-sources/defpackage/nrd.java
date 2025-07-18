package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrd implements noc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nrd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.noc
    public final void a() {
        if (this.b == 0) {
            nrg nrgVar = (nrg) this.a;
            nrgVar.e();
            nrgVar.d();
            return;
        }
        nsf.e();
        Object obj = this.a;
        nom nomVar = (nom) obj;
        nomVar.c.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            nomVar.V();
        } else {
            new ogh(Looper.getMainLooper()).post(new mpz(obj, 14));
        }
    }

    @Override // defpackage.noc
    public final void b() {
        if (this.b != 0) {
            ((nom) this.a).T();
            return;
        }
        nrg nrgVar = (nrg) this.a;
        nrgVar.e();
        nrgVar.b();
    }
}
