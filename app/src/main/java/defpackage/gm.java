package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gm implements Runnable {
    final /* synthetic */ hf a;

    public gm(hf hfVar) {
        this.a = hfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hf hfVar = this.a;
        if ((hfVar.J & 1) != 0) {
            hfVar.y(0);
        }
        if ((hfVar.J & 4096) != 0) {
            hfVar.y(108);
        }
        hfVar.I = false;
        hfVar.J = 0;
    }
}
