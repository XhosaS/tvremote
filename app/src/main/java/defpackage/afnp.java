package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afnp extends afre {
    public final afot a;
    public final String b;
    final /* synthetic */ afnq d;
    private volatile Status e;
    private Status f;
    private Status g;
    public final AtomicInteger c = new AtomicInteger(-2147483647);
    private final afno h = new afno(this);

    public afnp(afnq afnqVar, afot afotVar, String str) {
        this.d = afnqVar;
        this.a = afotVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.afre, defpackage.afoh
    public final afoe b(afil afilVar, afih afihVar, afem afemVar, afev[] afevVarArr) {
        afoe afoeVar;
        Executor executor;
        afej afejVar = afemVar.e;
        if (afejVar == null) {
            afejVar = null;
        }
        if (afejVar == null) {
            return this.c.get() >= 0 ? new afqz(this.e, afof.PROCESSED, afevVarArr) : this.a.b(afilVar, afihVar, afemVar, afevVarArr);
        }
        afot afotVar = this.a;
        afno afnoVar = this.h;
        afvl afvlVar = new afvl(afotVar, afilVar, afihVar, afemVar, afnoVar, afevVarArr);
        if (this.c.incrementAndGet() > 0) {
            afnoVar.a();
            return new afqz(this.e, afof.PROCESSED, afevVarArr);
        }
        try {
            if (!((afki) afejVar).g || (executor = afemVar.c) == null) {
                executor = this.d.a;
            }
            afjh afjhVar = (afjh) yqr.c((afjh) this.a.a().b.get(afri.a), afjh.NONE);
            if (!((afki) afejVar).c || afjhVar == afjh.PRIVACY_AND_INTEGRITY) {
                try {
                    afki.a((String) yqr.c(null, this.b), afilVar);
                    ((afki) afejVar).d.b(executor, new afkf((afki) afejVar, afvlVar));
                } catch (StatusException e) {
                    afvlVar.a(e.a);
                }
            } else {
                afvlVar.a(Status.g.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(afjhVar.toString())));
            }
        } catch (Throwable th) {
            afvlVar.a(Status.g.withDescription("Credentials should use fail() instead of throwing exceptions").c(th));
        }
        synchronized (afvlVar.g) {
            afoeVar = afvlVar.h;
            if (afoeVar == null) {
                afvlVar.j = new afqm();
                afoeVar = afvlVar.j;
                afvlVar.h = afoeVar;
            }
        }
        return afoeVar;
    }

    @Override // defpackage.afre
    protected final afot e() {
        return this.a;
    }

    @Override // defpackage.afre, defpackage.afvc
    public final void f(Status status) {
        status.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = status;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    this.f = status;
                } else {
                    super.f(status);
                }
            }
        }
    }

    @Override // defpackage.afre, defpackage.afvc
    public final void g(Status status) {
        synchronized (this) {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = status;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
            } else if (this.g != null) {
                return;
            }
            if (atomicInteger.get() != 0) {
                this.g = status;
            } else {
                super.g(status);
            }
        }
    }

    public final void h() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            Status status = this.f;
            Status status2 = this.g;
            this.f = null;
            this.g = null;
            if (status != null) {
                super.f(status);
            }
            if (status2 != null) {
                super.g(status2);
            }
        }
    }
}
