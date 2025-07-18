package defpackage;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpd implements ros, rot {
    public static final zdy a = zdy.h("com/google/android/libraries/search/appflows/GenericAppFlowLogger");
    private static final Random j = new Random();
    private static final zyd k = zxn.h(acpz.a);
    public final Object b = new Object();
    public final aehf c;
    public final yzq d;
    public final rpk e;
    public final rou f;
    public final rqb g;
    public final rqh h;
    public final long i;
    private final Executor l;
    private final int m;
    private final yqt n;
    private final mcw o;

    public rpd(mcw mcwVar, yqt yqtVar, yqt yqtVar2, Set set, rpi rpiVar, yqt yqtVar3, yqt yqtVar4, aehf aehfVar, rpk rpkVar) {
        this.o = mcwVar;
        rqb rqbVar = (rqb) yqtVar.e(rqb.b().a());
        this.g = rqbVar;
        this.h = (rqh) yqtVar2.e(rqh.g().a());
        this.d = yzq.o(set);
        this.c = aehfVar;
        this.e = rpkVar;
        this.m = ((Integer) ((roy) rpkVar).g.e(0)).intValue();
        this.l = new zyt(rqbVar.d());
        this.i = j.nextLong();
        rrl rrlVar = (rrl) rpiVar.a.a();
        rrlVar.getClass();
        yqt yqtVar5 = (yqt) ((aejh) rpiVar.b).b;
        yqtVar5.getClass();
        mcw mcwVar2 = (mcw) rpiVar.c.a();
        mcwVar2.getClass();
        ((rrb) rpiVar.d.a()).getClass();
        yqt yqtVar6 = (yqt) rpiVar.e.a();
        yqtVar6.getClass();
        rph rphVar = new rph(rrlVar, yqtVar5, mcwVar2, yqtVar6, rpkVar);
        this.f = rphVar;
        if (((roy) rpkVar).a && yqtVar3.g()) {
            ((rqj) yqtVar3.c()).a(((roy) rpkVar).b, rphVar);
        }
        this.n = yqtVar4;
        synchronized (rphVar.a) {
            rphVar.c = yqt.i(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:11:0x0056, B:10:0x0054), top: B:17:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized defpackage.zyd c(final defpackage.rqu r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            mcw r0 = r4.o     // Catch: java.lang.Throwable -> L67
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L67
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L67
            r2.getClass()     // Catch: java.lang.Throwable -> L67
            rqh r2 = r4.h     // Catch: java.lang.Throwable -> L67
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L54
            rpk r2 = r4.e     // Catch: java.lang.Throwable -> L67
            roy r2 = (defpackage.roy) r2     // Catch: java.lang.Throwable -> L67
            boolean r2 = r2.c     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L54
            yqt r2 = r4.n     // Catch: java.lang.Throwable -> L67
            boolean r3 = r2.g()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L54
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L67
            tja r2 = (defpackage.tja) r2     // Catch: java.lang.Throwable -> L67
            r2 = r5
            rqt r2 = (defpackage.rqt) r2     // Catch: java.lang.Throwable -> L67
            rpz r2 = r2.a     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r2.g     // Catch: java.lang.Throwable -> L67
            r3.getClass()     // Catch: java.lang.Throwable -> L67
            abxc r3 = defpackage.acqa.a     // Catch: java.lang.Throwable -> L67
            r3.getClass()     // Catch: java.lang.Throwable -> L67
            rql r2 = r2.a     // Catch: java.lang.Throwable -> L67
            rqm r2 = (defpackage.rqm) r2     // Catch: java.lang.Throwable -> L67
            int r2 = r2.a     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L67
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Throwable -> L67
            r2.getClass()     // Catch: java.lang.Throwable -> L67
            acpz r2 = defpackage.acpz.a     // Catch: java.lang.Throwable -> L67
            zyd r2 = defpackage.zxn.h(r2)     // Catch: java.lang.Throwable -> L67
            goto L56
        L54:
            zyd r2 = defpackage.rpd.k     // Catch: java.lang.Throwable -> L67
        L56:
            rpb r3 = new rpb     // Catch: java.lang.Throwable -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.Executor r5 = r4.l     // Catch: java.lang.Throwable -> L67
            zvi r0 = defpackage.wyo.c(r3)     // Catch: java.lang.Throwable -> L67
            zyd r5 = defpackage.zuz.h(r2, r0, r5)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r4)
            return r5
        L67:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpd.c(rqu):zyd");
    }

    @Override // defpackage.ros
    public final void a(rqu rquVar) {
        int i;
        if (this.h.c()) {
            yzq yzqVar = ((rqm) ((rqt) rquVar).a.a).b;
            if (yzqVar.contains(0) || (i = this.m) == 0 || (!yzqVar.contains(-1) && i != -1 && !yzqVar.contains(Integer.valueOf(i)))) {
                zxn.g(new IllegalArgumentException("Logger Ids of the logger and the event don't match or aren't set."));
                return;
            }
        }
        zxn.p(c(rquVar), wyo.f(new rpc()), zwk.a);
    }

    @Override // defpackage.rot
    public final zyd b(final rru rruVar) {
        rruVar.f();
        rruVar.e();
        synchronized (this.b) {
            zdl it = ((roy) this.e).f.iterator();
            while (it.hasNext()) {
                ((rqr) it.next()).b();
            }
            zdl it2 = this.d.iterator();
            while (it2.hasNext()) {
                ((rqq) it2.next()).b();
            }
        }
        zvh zvhVar = new zvh() { // from class: rpa
            @Override // defpackage.zvh
            public final zyd a() {
                return ((rrv) this.a.c.a()).a(rruVar);
            }
        };
        return zxn.l(wyo.b(zvhVar), this.l);
    }

    public final String toString() {
        return "Generic AppFlows Logger: ".concat(String.valueOf(((roy) this.e).b));
    }
}
