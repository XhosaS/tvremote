package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gq implements Runnable {
    final /* synthetic */ hf a;

    public gq(hf hfVar) {
        this.a = hfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hf hfVar = this.a;
        hfVar.s.showAtLocation(hfVar.r, 55, 0, 0);
        hfVar.z();
        if (!hfVar.I()) {
            hfVar.r.setAlpha(1.0f);
            hfVar.r.setVisibility(0);
            return;
        }
        hfVar.r.setAlpha(0.0f);
        ahw ahwVarD = ahj.d(hfVar.r);
        ahwVarD.b(1.0f);
        hfVar.u = ahwVarD;
        hfVar.u.d(new gp(this));
    }
}
