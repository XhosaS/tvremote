package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvi extends bvd {
    final /* synthetic */ bvk a;

    public bvi(bvk bvkVar) {
        this.a = bvkVar;
    }

    @Override // defpackage.bvd, defpackage.buv
    public final void a(bvc bvcVar) {
        bvk bvkVar = this.a;
        bvkVar.u.remove(bvcVar);
        if (bvkVar.C()) {
            return;
        }
        bvkVar.t(bvkVar, bvb.c, false);
        bvkVar.m = true;
        bvkVar.t(bvkVar, bvb.b, false);
    }
}
