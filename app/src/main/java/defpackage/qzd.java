package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qzd implements qsn {
    final /* synthetic */ zyh a;
    final /* synthetic */ qzf b;

    public qzd(qzf qzfVar, zyh zyhVar) {
        this.a = zyhVar;
        this.b = qzfVar;
    }

    @Override // defpackage.qsn
    public final void g(final qpi qpiVar) {
        qzf qzfVar = this.b;
        qzfVar.d.a(3, qpiVar.a);
        qzfVar.a();
        qzfVar.f = this.a.schedule(new Runnable() { // from class: qzb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d.a(5, qpiVar.a);
            }
        }, 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.qsn
    public final void j(final qpi qpiVar) {
        qzf qzfVar = this.b;
        qzfVar.d.a(4, qpiVar.a);
        qzfVar.a();
        qzfVar.e = this.a.schedule(new Runnable() { // from class: qzc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d.a(6, qpiVar.a);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
