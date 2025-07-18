package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpm implements qpl {
    private final qpv a;
    private final agow b;
    private final agow c;
    private final agow d;
    private final agow e;
    private final agow f;
    private final agow g;
    private final qsv h;

    public qpm(qpv qpvVar, agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6, qsv qsvVar) {
        this.a = qpvVar;
        this.b = agowVar;
        this.c = agowVar2;
        this.d = agowVar3;
        this.e = agowVar4;
        this.f = agowVar5;
        this.g = agowVar6;
        this.h = qsvVar;
        Boolean bool = false;
        bool.getClass();
        try {
            wum.w(false);
            Iterator it = ((Set) agowVar.a()).iterator();
            while (it.hasNext()) {
                ((quz) it.next()).k();
            }
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", '{', "PrimesApiImpl.java")).u("Primes failed to initialize");
            qpv qpvVar2 = this.a;
            if (qpvVar2.a) {
                return;
            }
            qpvVar2.a = true;
        }
    }

    @Override // defpackage.qpl
    public final void a(qpi qpiVar) {
        ((rbn) this.f.a()).b(qpiVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [agow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [agow, java.lang.Object] */
    @Override // defpackage.qpl
    public final void b() {
        qsv qsvVar = this.h;
        if (qsvVar.a.getAndSet(true)) {
            return;
        }
        ((qwd) ((yqz) qsvVar.b).a.a()).l();
        ((qzg) ((yqz) qsvVar.c).a.a()).a();
    }

    @Override // defpackage.qpl
    public final void c(qpi qpiVar, long j, long j2, ahqu ahquVar) {
        ((rbi) this.g.a()).a(qpiVar, j, j2, ahquVar);
    }

    @Override // defpackage.qpl
    public final void d(qzv qzvVar) {
        ((qzx) this.e.a()).a(qzvVar);
    }

    @Override // defpackage.qpl
    public final void e(qpi qpiVar) {
        ((rbn) this.f.a()).c(qpiVar);
    }

    @Override // defpackage.qpl
    public final void f() {
        ((qzg) this.d.a()).a();
    }

    @Override // defpackage.qpl
    public final void g(qpi qpiVar, qpi qpiVar2, ahqu ahquVar, rbl rblVar) {
        ((rbn) this.f.a()).d(qpiVar, qpiVar2, ahquVar, rblVar);
    }

    @Override // defpackage.qpl
    public final void h(qpi qpiVar) {
        ((qzg) this.d.a()).b(qpiVar);
    }

    @Override // defpackage.qpl
    public final void i() {
    }
}
