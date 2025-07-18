package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tun implements tuv, tvu {
    private static final String a = new String();
    public final long b;
    public tum c;
    public tvd d;
    private final Level e;
    private tuq f;
    private tww g;
    private Object[] h;

    protected tun(Level level) {
        long jB = twu.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void N(java.lang.String r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tun.N(java.lang.String, java.lang.Object[]):void");
    }

    private final boolean O() {
        tur turVarB;
        tum tumVar;
        int i;
        if (this.f == null) {
            this.f = twu.g().a(tun.class, 1);
        }
        if (this.f != tuq.a) {
            turVarB = this.f;
            tum tumVar2 = this.c;
            if (tumVar2 != null && (i = tumVar2.b) > 0) {
                turVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (tul.f.equals(tumVar2.c(i2))) {
                        Object objE = tumVar2.e(i2);
                        turVarB = objE instanceof tuw ? ((tuw) objE).b() : new tvh(turVarB, objE);
                    }
                }
            }
        } else {
            turVarB = null;
        }
        boolean zB = b(turVarB);
        tvd tvdVar = this.d;
        if (tvdVar == null) {
            return zB;
        }
        tvc tvcVar = (tvc) tvc.a.b(turVarB, this.c);
        int iIncrementAndGet = tvcVar.c.incrementAndGet();
        int i3 = -1;
        if (tvdVar != tvd.c && tvcVar.b.compareAndSet(false, true)) {
            try {
                tvdVar.a();
                tvcVar.b.set(false);
                tvcVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                tvcVar.b.set(false);
                throw th;
            }
        }
        if (zB && i3 > 0 && (tumVar = this.c) != null) {
            tumVar.f(tul.e, Integer.valueOf(i3));
        }
        return zB & (i3 >= 0);
    }

    @Override // defpackage.tuv
    public final void A(String str, Object obj, long j) {
        if (O()) {
            N(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.tuv
    public final void B(String str, Object obj, Object obj2) {
        if (O()) {
            N(str, obj, obj2);
        }
    }

    @Override // defpackage.tuv
    public final void C(String str, Object obj, boolean z) {
        if (O()) {
            N(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.tuv
    public final void D(String str, boolean z, Object obj) {
        if (O()) {
            N(str, Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.tuv
    public final void E(String str, Object obj, Object obj2, Object obj3) {
        if (O()) {
            N(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.tuv
    public final void F(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (O()) {
            N(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.tuv
    public final void G(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (O()) {
            N(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.tuv
    public final void H(String str, Object[] objArr) {
        if (O()) {
            N(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.tuv
    public final boolean I() {
        return J() || c().j(this.e);
    }

    @Override // defpackage.tvu
    public final boolean J() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(tul.g));
    }

    @Override // defpackage.tvu
    public final Object[] K() {
        a.ah(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.tuv
    public final void L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (O()) {
            N("Handler:buildDetailedNotification for Download ID: %s (Notif ID: %d) - Title: '%s', Poster Null: %b, State: %s, Percent: %.2f, isGroupChild: %b", obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.tuv
    public final void M(boolean z, boolean z2) {
        if (O()) {
            N("Theme or activity not found for promotion logging. IsThemeNull [%s], IsActivityNull [%s]", Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    protected abstract tyj a();

    protected boolean b(tur turVar) {
        throw null;
    }

    protected abstract ttz c();

    protected abstract tuv d();

    @Override // defpackage.tvu
    public final long e() {
        return this.b;
    }

    @Override // defpackage.tvu
    public final tuq f() {
        tuq tuqVar = this.f;
        if (tuqVar != null) {
            return tuqVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.tuv
    public final tuv g(int i, TimeUnit timeUnit) {
        if (J()) {
            return d();
        }
        tuy tuyVar = tul.d;
        tus tusVar = tue.a;
        q(tuyVar, new tud(i, timeUnit));
        return d();
    }

    @Override // defpackage.tuv
    public final tuv h(tuy tuyVar, Object obj) {
        tuyVar.getClass();
        if (obj != null) {
            q(tuyVar, obj);
        }
        return d();
    }

    @Override // defpackage.tuv
    public final tuv i(Throwable th) {
        return h(tul.a, th);
    }

    @Override // defpackage.tuv
    public final tuv j(String str, String str2, int i, String str3) {
        tuq tuqVar = tuq.a;
        tup tupVar = new tup(str, str2, i, str3);
        if (this.f == null) {
            this.f = tupVar;
        }
        return d();
    }

    @Override // defpackage.tuv
    public final tuv k(tvj tvjVar) {
        tvjVar.getClass();
        if (tvjVar != tvj.NONE) {
            q(tul.i, tvjVar);
        }
        return d();
    }

    @Override // defpackage.tvu
    public final twa l() {
        tum tumVar = this.c;
        return tumVar != null ? tumVar : tvz.a;
    }

    @Override // defpackage.tvu
    public final tww m() {
        return this.g;
    }

    @Override // defpackage.tvu
    public final Object n() {
        a.ah(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.tvu
    public final String o() {
        return c().a.a();
    }

    @Override // defpackage.tvu
    public final Level p() {
        return this.e;
    }

    protected final void q(tuy tuyVar, Object obj) {
        if (this.c == null) {
            this.c = new tum();
        }
        this.c.f(tuyVar, obj);
    }

    @Override // defpackage.tuv
    public final void r() {
        if (O()) {
            N(a, "");
        }
    }

    @Override // defpackage.tuv
    public final void s(String str) {
        if (O()) {
            N(a, str);
        }
    }

    @Override // defpackage.tuv
    public final void t(String str, int i) {
        if (O()) {
            N(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.tuv
    public final void u(String str, long j) {
        if (O()) {
            N(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.tuv
    public final void v(String str, Object obj) {
        if (O()) {
            N(str, obj);
        }
    }

    @Override // defpackage.tuv
    public final void w(String str, int i, int i2) {
        if (O()) {
            N(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.tuv
    public final void x(String str, int i, Object obj) {
        if (O()) {
            N(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.tuv
    public final void y(String str, long j, Object obj) {
        if (O()) {
            N(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.tuv
    public final void z(String str, Object obj, int i) {
        if (O()) {
            N(str, obj, Integer.valueOf(i));
        }
    }
}
