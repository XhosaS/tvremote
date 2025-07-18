package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkv {
    public final pji a;
    public boolean c = false;
    public boolean d = false;
    public final pku i = new pku(this);
    public int e = 0;
    public Runnable f = null;
    public int g = 0;
    public Runnable h = null;
    public final pky b = new pky();

    public pkv(pji pjiVar) {
        this.a = pjiVar;
    }

    public final void a() {
        this.f = null;
        if (this.b.c()) {
            tql tqlVarQ = szg.q("GIL:AutoProcessBatch");
            try {
                this.a.b(new pkt(this, 1));
                tqlVarQ.close();
            } catch (Throwable th) {
                try {
                    tqlVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f != null) {
            return;
        }
        nur nurVar = new nur(this, 17);
        this.f = nurVar;
        int i = this.e;
        if (i > 0) {
            sjl.d(nurVar, i);
        } else {
            sjl.e(nurVar);
        }
    }
}
