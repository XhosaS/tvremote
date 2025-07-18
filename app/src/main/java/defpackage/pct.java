package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pct {
    public final pbb a;
    public final pas c;
    public final vpt g;
    public final pcl d = new pcs(this);
    public int e = 0;
    public Runnable f = null;
    public final pcw b = new pcw();

    public pct(pbb pbbVar, vpt vptVar, pas pasVar) {
        this.a = pbbVar;
        this.g = vptVar;
        this.c = pasVar;
    }

    public final void a() {
        this.f = null;
        if (this.b.c()) {
            wvx wvxVarF = wzg.f("GIL:AutoProcessBatch", wwb.a, true);
            try {
                this.a.c(new pba() { // from class: pcp
                    @Override // defpackage.pba
                    public final List a() {
                        pcw pcwVar = this.a.b;
                        pcwVar.b();
                        boolean z = pcwVar.b;
                        return pcwVar.a();
                    }
                });
                wvxVarF.close();
            } catch (Throwable th) {
                try {
                    wvxVarF.close();
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
        Runnable runnableA = this.g.a(new Runnable() { // from class: pcq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
        this.f = runnableA;
        int i = this.e;
        if (i <= 0) {
            uea.a().post(runnableA);
        } else {
            uea.a().postDelayed(runnableA, i);
        }
    }
}
