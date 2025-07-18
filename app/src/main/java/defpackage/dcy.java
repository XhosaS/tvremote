package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dcy implements dde, dez, ddg {
    public static final boolean a = Log.isLoggable("Engine", 2);
    public final ddl b;
    public final dcv c;
    public final dcw d;
    public final dct e;
    public final dby f;
    public final dey g;
    private final ddt h;

    public dcy(dey deyVar, deu deuVar, dfj dfjVar, dfj dfjVar2, dfj dfjVar3, dfj dfjVar4) throws Throwable {
        this.g = deyVar;
        dcw dcwVar = new dcw(deuVar);
        this.d = dcwVar;
        dby dbyVar = new dby();
        this.f = dbyVar;
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                synchronized (dbyVar) {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                this.b = new ddl();
                this.c = new dcv(dfjVar, dfjVar2, dfjVar4, this, this);
                this.e = new dct(dcwVar);
                this.h = new ddt();
                deyVar.a = this;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void a(String str, long j, daj dajVar) {
        Log.v("Engine", str + " in " + dqf.a(j) + "ms, key: " + dajVar.toString());
    }

    @Override // defpackage.dde
    public final synchronized void b(ddd dddVar, daj dajVar) {
        this.b.a(dajVar, dddVar);
    }

    @Override // defpackage.dde
    public final synchronized void c(ddd dddVar, daj dajVar, ddh ddhVar) {
        if (ddhVar != null) {
            if (ddhVar.a) {
                this.f.b(dajVar, ddhVar);
            }
            this.b.a(dajVar, dddVar);
        } else {
            this.b.a(dajVar, dddVar);
        }
    }

    @Override // defpackage.ddg
    public final void d(daj dajVar, ddh ddhVar) {
        this.f.d(dajVar);
        if (ddhVar.a) {
            this.g.d(dajVar, ddhVar);
        } else {
            this.h.a(ddhVar, false);
        }
    }

    @Override // defpackage.dez
    public final void e(ddp ddpVar) {
        this.h.a(ddpVar, true);
    }
}
