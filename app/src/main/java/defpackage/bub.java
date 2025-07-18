package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class bub extends bvd {
    boolean a = false;
    final ViewGroup b;

    public bub(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void a(bvc bvcVar) {
        bvo.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void b(bvc bvcVar) {
        if (!this.a) {
            bvo.a(this.b, false);
        }
        bvcVar.H(this);
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void c() {
        bvo.a(this.b, false);
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void d() {
        bvo.a(this.b, true);
    }
}
