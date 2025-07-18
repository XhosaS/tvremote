package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqp implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final /* synthetic */ int g;

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i) {
        this.g = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.g) {
            case 0:
                qjy qjyVar = (qjy) this.a.b();
                xcq xcqVar = this.d;
                xcq xcqVar2 = this.c;
                yil yilVarA = ((mdx) this.b).a();
                cb cbVarB = ((qle) xcqVar2).b();
                Context contextA = ((rgq) xcqVar).a();
                qps qpsVar = new qps();
                tst tstVar = (tst) ((xcn) this.e).a;
                puz.a().booleanValue();
                return new qqo(qjyVar, yilVarA, cbVarB, contextA, qpsVar, tstVar, this.f);
            case 1:
                xcq xcqVar3 = this.c;
                xcq xcqVar4 = this.f;
                xcq xcqVar5 = this.e;
                return new qfc(((rgq) this.d).a(), ((xco) this.a).b(), xcl.a(this.b), xcl.a(xcqVar5), xcl.a(xcqVar4), ((mdx) xcqVar3).a());
            case 2:
                ((qod) this.d).b();
                qse qseVar = (qse) this.a.b();
                return new qsc(qseVar, ((qle) this.e).b());
            case 3:
                Object obj = ((xcn) this.e).a;
                Context contextA2 = ((rgq) this.d).a();
                tst tstVar2 = (tst) ((xcn) this.b).a;
                tst tstVar3 = (tst) ((xcn) this.c).a;
                tst tstVar4 = (tst) ((xcn) this.a).a;
                rjr rjrVar = new rjr();
                rjrVar.a = contextA2.getApplicationContext();
                rjrVar.b = (ExecutorService) tstVar2.f();
                rjrVar.c = (ScheduledExecutorService) tstVar3.f();
                rjrVar.d = (Handler) ((tst) obj).f();
                rjrVar.g = (riv) tstVar4.f();
                rjrVar.a.getClass();
                if (rjrVar.b == null) {
                    ExecutorService executorServiceNewCachedThreadPool = rjrVar.c;
                    if (executorServiceNewCachedThreadPool == null) {
                        executorServiceNewCachedThreadPool = Executors.newCachedThreadPool((ThreadFactory) rjrVar.f.get());
                    }
                    rjrVar.b = executorServiceNewCachedThreadPool;
                }
                if (rjrVar.c == null) {
                    rjrVar.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) rjrVar.f.get());
                }
                return new rla(rjrVar.b, new riu(rjrVar, 9), 1);
            case 4:
                xcq xcqVar6 = this.f;
                xcq xcqVar7 = this.d;
                return new unc((unc) xcqVar6.b(), (uht) xcqVar7.b(), (Random) this.c.b(), this.b, this.e, this.a);
            case 5:
                rou rouVar = (rou) this.a.b();
                uht uhtVar = (uht) this.e.b();
                Executor executor = (Executor) this.d.b();
                xcq xcqVar8 = this.c;
                xbw xbwVarA = xcl.a(this.b);
                xcl.a(xcqVar8);
                return new rsv(rouVar, uhtVar, executor, xbwVarA);
            case 6:
                rou rouVar2 = (rou) this.a.b();
                xcq xcqVar9 = this.c;
                xcq xcqVar10 = this.b;
                xcq xcqVar11 = this.e;
                return new rty(rouVar2, this.f, this.d, xcqVar11, xcqVar10, xcl.a(xcqVar9));
            case 7:
                xcq xcqVar12 = this.b;
                yyh yyhVarB = ((rqe) this.e).b();
                Executor executor2 = (Executor) xcqVar12.b();
                xcq xcqVar13 = this.a;
                xcq xcqVar14 = this.d;
                return new ruo(yyhVarB, executor2, xcl.a(this.f), xcl.a(xcqVar14), this.c, ((rvj) xcqVar13).b());
            default:
                xcq xcqVar15 = this.c;
                xcq xcqVar16 = this.d;
                xcq xcqVar17 = this.e;
                xcq xcqVar18 = this.f;
                return new unc(this.b, this.a, xcqVar18, xcqVar17, xcqVar16, xcqVar15);
        }
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, byte[] bArr) {
        this.g = i;
        this.d = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.e = xcqVar4;
        this.f = xcqVar5;
        this.c = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, char[] cArr) {
        this.g = i;
        this.d = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
        this.f = xcqVar4;
        this.b = xcqVar5;
        this.e = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, float[] fArr) {
        this.g = i;
        this.a = xcqVar;
        this.f = xcqVar2;
        this.d = xcqVar3;
        this.e = xcqVar4;
        this.b = xcqVar5;
        this.c = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, int[] iArr) {
        this.g = i;
        this.f = xcqVar;
        this.d = xcqVar2;
        this.c = xcqVar3;
        this.b = xcqVar4;
        this.e = xcqVar5;
        this.a = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, short[] sArr) {
        this.g = i;
        this.d = xcqVar;
        this.e = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
        this.f = xcqVar5;
        this.a = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = xcqVar;
        this.e = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
        this.c = xcqVar5;
        this.f = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, byte[][] bArr) {
        this.g = i;
        this.e = xcqVar;
        this.b = xcqVar2;
        this.f = xcqVar3;
        this.d = xcqVar4;
        this.c = xcqVar5;
        this.a = xcqVar6;
    }

    public qqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, int i, char[][] cArr) {
        this.g = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.f = xcqVar3;
        this.e = xcqVar4;
        this.d = xcqVar5;
        this.c = xcqVar6;
    }
}
