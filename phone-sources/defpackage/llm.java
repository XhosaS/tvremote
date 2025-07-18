package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llm implements llq {
    private mff A;
    private boolean B;
    public final Executor a;
    public final ieg b;
    public final String c;
    public final Executor d;
    public final lnu e;
    public final llw f;
    public final boolean g;
    public final ksy h;
    public final mfe i;
    public boolean j;
    public ieg k;
    public int l;
    public int m;
    public kuz n;
    public boolean o;
    public kwy p;
    public kuw q;
    public volatile llr r;
    public ImmutableMap s;
    public final llh t;
    public final lsc u;
    public final lfz v;
    public final lrc w;
    public final lqs x;
    public final nux y;
    public zuw z;

    public llm(Executor executor, lfz lfzVar, lsc lscVar, lrc lrcVar, ExecutorService executorService, lqs lqsVar, nux nuxVar, lxm lxmVar, lnu lnuVar, llh llhVar, String str, boolean z, ieg iegVar, llw llwVar) {
        Executor executor2 = ksk.a;
        this.A = new mff(new ehq(3));
        this.s = ImmutableMap.of();
        this.d = executor;
        this.y = nuxVar;
        this.t = llhVar;
        this.c = str;
        this.g = z;
        this.h = z ? ksy.h(str) : ksy.i(str);
        a.H(iegVar.m());
        this.b = iegVar;
        this.e = lnuVar;
        this.v = lfzVar;
        this.u = lscVar;
        this.w = lrcVar;
        this.x = lqsVar;
        this.f = llwVar;
        this.a = executorService;
        mfe mfeVar = new mfe(new lll(this, 0), false);
        this.i = mfeVar;
        mjo.e(mfeVar.a(new jbj(this, 18)), new ldj(this, lxmVar, 5, null), executorService);
    }

    @Override // defpackage.llq
    public final lgo a() {
        return null;
    }

    public final synchronized void b(kst kstVar) {
        int i = 19;
        if (kstVar instanceof kvf) {
            kvf kvfVar = (kvf) kstVar;
            this.l = kvfVar.c() * 1000;
            this.m = kvfVar.e();
            this.p = new kwy(kvfVar);
            this.q = new kuw(kvfVar);
            ImmutableList list = FluentIterable.from(kvfVar.r()).transform(new eyt(i)).toList();
            this.o = list.isEmpty() || a.am(list, Locale.getDefault().getLanguage());
            return;
        }
        if (!(kstVar instanceof kuo)) {
            krd.c("Unexpected asset type: ".concat(kstVar.toString()));
            this.y.d(2, new llt(0, -1, null, false, false, trk.a));
            return;
        }
        kuo kuoVar = (kuo) kstVar;
        this.l = kuoVar.m * 1000;
        this.m = kuoVar.l;
        this.p = new kwy(kuoVar);
        this.q = new kuw(kuoVar);
        ImmutableList list2 = FluentIterable.from(kuoVar.w).transform(new eyt(i)).toList();
        this.o = list2.isEmpty() || a.am(list2, Locale.getDefault().getLanguage());
    }

    public final synchronized void c(kvx kvxVar) {
        if (this.j) {
            return;
        }
        this.n = kuz.a(kvxVar);
    }

    public final synchronized void d(Runnable runnable) {
        if (this.j) {
            return;
        }
        mff mffVar = new mff(runnable);
        this.A = mffVar;
        ksk.g(mffVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized void e(zuw zuwVar) {
        Iterator it = zuwVar.b.iterator();
        while (it.hasNext()) {
            if (((lvh) it.next()).a.isEmpty()) {
                this.y.d(1, new llt(7, -1, new lve(), false, false, trk.a));
                return;
            }
        }
        this.z = zuwVar;
    }

    @Override // defpackage.llq
    public final synchronized void f() {
        this.i.e();
        this.A.a();
        this.j = true;
    }

    @Override // defpackage.llq
    public final synchronized boolean i() {
        if (this.r == null || this.B) {
            return false;
        }
        this.B = true;
        this.t.x(this.r);
        return true;
    }
}
