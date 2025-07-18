package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixb implements iwu {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesProviderImpl");
    public final ahbt b;
    public final gfr c;
    public final gmd d;
    public final ghp e;
    public final ghr f;
    public final List g;
    public boolean h;
    public final Object i;
    public int j;
    public final iwj k;
    public final ize l;
    private final fae m;
    private final fam n;
    private final zyh o;
    private final Random p;

    public ixb(ahbt ahbtVar, fae faeVar, fam famVar, gfr gfrVar, gmd gmdVar, zyh zyhVar, iwj iwjVar, ghp ghpVar, ghr ghrVar, ize izeVar) {
        ahbtVar.getClass();
        famVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        zyhVar.getClass();
        ghpVar.getClass();
        ghrVar.getClass();
        this.b = ahbtVar;
        this.m = faeVar;
        this.n = famVar;
        this.c = gfrVar;
        this.d = gmdVar;
        this.o = zyhVar;
        this.k = iwjVar;
        this.e = ghpVar;
        this.f = ghrVar;
        this.l = izeVar;
        this.g = new ArrayList();
        this.i = new Object();
        this.p = new Random();
    }

    @Override // defpackage.iwu
    public final List a() {
        List list;
        synchronized (this.i) {
            list = this.g;
        }
        return list;
    }

    @Override // defpackage.iwu
    public final void b() {
        this.j = 0;
        this.h = false;
    }

    @Override // defpackage.iwu
    public final void c() {
        synchronized (this.i) {
            this.g.clear();
        }
    }

    @Override // defpackage.iwu
    public final void d(final xds xdsVar, iyd iydVar) {
        abnb abnbVarB;
        this.j = this.p.nextInt(Integer.MAX_VALUE) + 1;
        if (this.h) {
            iwr iwrVar = (iwr) iydVar;
            gfq.a(iwrVar.a.c, rpm.eD(), abqb.UNKNOWN, 8);
            iwrVar.a();
            return;
        }
        this.h = true;
        iwv iwvVar = new iwv(this);
        abmr abmrVar = xdsVar.c;
        if (abmrVar == null) {
            abmrVar = abmr.a;
        }
        if (abmrVar.c != 26 || (abnbVarB = abnb.b(((Integer) abmrVar.d).intValue())) == null) {
            abnbVarB = abnb.UNKNOWN;
        }
        abnbVarB.getClass();
        final ixa ixaVar = new ixa(this, iydVar, iwvVar, abnbVarB);
        this.c.a(rpm.cM(), abqb.OK, null, null);
        this.d.l(gmc.T);
        fae faeVar = this.m;
        fam famVar = this.n;
        final zyd zydVarA = faeVar.a();
        final zyd zydVarA2 = famVar.a();
        vqi.c(zxn.b(zydVarA, zydVarA2).a(wyo.i(new Callable() { // from class: iww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object objO = zxn.o(zydVarA);
                objO.getClass();
                Object objO2 = zxn.o(zydVarA2);
                objO2.getClass();
                Optional optionalOf = Optional.of(xdsVar);
                Optional optionalOf2 = Optional.of((xfp) objO);
                Optional optionalOf3 = Optional.of((xdl) objO2);
                ixb ixbVar = this;
                int i = ixbVar.j;
                ize izeVar = ixbVar.l;
                ahal.e(izeVar.a, null, 0, new izd(izeVar, ixaVar, optionalOf, optionalOf2, optionalOf3, i, null), 3);
                return agpu.a;
            }
        }), this.o), "Failed to get device params", new Object[0]);
        iwr iwrVar2 = (iwr) iydVar;
        final iwt iwtVar = iwrVar2.a;
        final abnb abnbVar = iwrVar2.b;
        int iOrdinal = abnbVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7) {
            Duration duration = Duration.ZERO;
            duration.getClass();
            iwtVar.o = duration;
        } else if (iOrdinal == 11) {
            Duration durationOfMillis = Duration.ofMillis(1200L);
            durationOfMillis.getClass();
            iwtVar.o = durationOfMillis;
        }
        iwtVar.s = new Runnable() { // from class: iwp
            @Override // java.lang.Runnable
            public final void run() {
                iwt iwtVar2 = iwtVar;
                if (!((ixd) iwtVar2.g.a()).n() && iwtVar2.l) {
                    iwtVar2.i(iwtVar2.e.a(), abnbVar);
                }
                iwtVar2.m = true;
            }
        };
        Runnable runnable = iwtVar.s;
        if (runnable != null) {
            feq.e(iwtVar.j, iwtVar.o, runnable);
        }
    }
}
