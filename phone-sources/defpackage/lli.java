package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lli implements llq {
    public final lnu a;
    public final llw b;
    public int c;
    public int d;
    public kwy e;
    public kuw f;
    public volatile llr g;
    public final llh h;
    public final nux i;
    public zuw j;
    private final ieg k;
    private final ksy l;
    private final mfe m;
    private final lux n;
    private final mem o;
    private mff p;
    private boolean q;
    private boolean r;
    private final lfz s;

    public lli(Executor executor, lfz lfzVar, lsc lscVar, nux nuxVar, lxm lxmVar, mem memVar, lnu lnuVar, llh llhVar, ksy ksyVar, ieg iegVar, llw llwVar, lux luxVar) {
        Executor executor2 = ksk.a;
        this.p = new mff(new ehq(3));
        this.h = llhVar;
        this.k = iegVar;
        this.a = lnuVar;
        this.s = lfzVar;
        this.b = llwVar;
        this.i = nuxVar;
        this.n = luxVar;
        this.o = memVar;
        this.l = ksyVar;
        mfe mfeVar = new mfe(new lll(this, 1), true);
        this.m = mfeVar;
        krd.b("Getting trailer asset for ".concat(ksyVar.b));
        lnuVar.e(5);
        int i = 4;
        mjo.e(mfeVar.a(new jbj(this, 14)), new ldj(lxmVar, ksyVar, i), executor);
        krd.b("Getting mpd of ".concat(ksyVar.b));
        lnuVar.e(3);
        lbh lbhVarA = lgm.a();
        String strC = llwVar.c();
        Locale localeForLanguageTag = TextUtils.isEmpty(strC) ? null : Locale.forLanguageTag(strC);
        nag nagVar = new nag(null, null, null, null);
        nagVar.n(iegVar);
        nagVar.o(ksyVar);
        nagVar.a = tst.h(localeForLanguageTag);
        nagVar.p(lbhVarA);
        lry lryVarM = nagVar.m();
        executor.execute(new lke((Object) lscVar, (Object) lryVarM, (Object) mfeVar.a(new lkd(this, (Locale) lryVarM.d.f(), lryVarM.a.b, i)), 2, (char[]) null));
        mfeVar.c();
    }

    @Override // defpackage.llq
    public final lgo a() {
        return null;
    }

    public final synchronized void b(ImmutableList immutableList) {
        this.a.c(5);
        if (immutableList.isEmpty()) {
            this.i.d(2, new llt(true != this.o.d() ? 6 : 17, -1, null, false, false, trk.a));
            return;
        }
        kst kstVar = (kst) immutableList.get(0);
        if (ksy.v(kstVar.o())) {
            kvf kvfVar = (kvf) kstVar;
            lfz lfzVar = this.s;
            kvfVar.D();
            lfzVar.o();
            this.e = new kwy(kvfVar);
            this.f = new kuw(kvfVar);
            this.c = kvfVar.c() * 1000;
            this.d = kvfVar.e();
            return;
        }
        if (!ksy.t(kstVar.o())) {
            this.i.d(2, new llt(17, -1, null, false, false, trk.a));
            return;
        }
        kuo kuoVar = (kuo) kstVar;
        lfz lfzVar2 = this.s;
        String str = kuoVar.d;
        lfzVar2.p();
        this.e = new kwy(kuoVar);
        this.f = new kuw(kuoVar);
        this.c = kuoVar.m * 1000;
        this.d = kuoVar.l;
    }

    public final synchronized void c(Runnable runnable) {
        if (this.q) {
            return;
        }
        mff mffVar = new mff(runnable);
        this.p = mffVar;
        ksk.g(mffVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized void d(zuw zuwVar, Locale locale) {
        Iterator it = zuwVar.b.iterator();
        while (it.hasNext()) {
            if (((lvh) it.next()).a.isEmpty()) {
                this.i.d(1, new llt(7, -1, new lve(), false, false, trk.a));
                return;
            }
        }
        if (locale != null || zuwVar.g() <= 1) {
            this.j = zuwVar;
            return;
        }
        this.b.m();
        this.j = zuwVar.k(this.n.b(zuwVar.i().a));
    }

    @Override // defpackage.llq
    public final synchronized void f() {
        this.m.e();
        this.p.a();
        this.q = true;
    }

    @Override // defpackage.llq
    public final synchronized boolean i() {
        if (this.g == null || this.r) {
            return false;
        }
        this.r = true;
        this.h.x(this.g);
        return true;
    }
}
