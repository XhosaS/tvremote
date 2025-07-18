package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cis extends cgw implements Runnable {
    private cja a;

    public cis(cja cjaVar) {
        this.a = cjaVar;
    }

    @Override // defpackage.cgx
    protected final String a() {
        cja cjaVar = this.a;
        if (cjaVar != null) {
            return b.i(cjaVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.cgx
    protected final void b() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cja cjaVar = this.a;
        if (cjaVar != null) {
            e(cjaVar);
        }
    }
}
