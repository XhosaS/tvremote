package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvj extends bvd {
    final bvk a;

    public bvj(bvk bvkVar) {
        this.a = bvkVar;
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void b(bvc bvcVar) {
        bvk bvkVar = this.a;
        int i = bvkVar.w - 1;
        bvkVar.w = i;
        if (i == 0) {
            bvkVar.x = false;
            bvkVar.s();
        }
        bvcVar.H(this);
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void e(bvc bvcVar) {
        bvk bvkVar = this.a;
        if (bvkVar.x) {
            return;
        }
        bvkVar.B();
        bvkVar.x = true;
    }
}
