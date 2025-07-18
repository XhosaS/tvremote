package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbz implements cch, cdb {
    private static final String a = new String();
    public final long b;
    public cby c;
    public ccp d;
    private final Level e;
    private ccc f;
    private ced g;
    private Object[] h;

    protected cbz(Level level) {
        long jB = ceb.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    private final void M(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof cbu) {
                objArr[i] = ((cbu) obj).a();
            }
        }
        if (str != a) {
            this.g = new ced(a(), str);
        }
        cez cezVarK = ceb.k();
        if (!cezVarK.a()) {
            cdh cdhVarK = k();
            cck cckVar = cbx.h;
            cez cezVar = (cez) cdhVarK.d(cckVar);
            if (cezVar != null && !cezVar.a()) {
                cezVarK = cezVarK.a() ? cezVar : new cez(new cex(cezVarK.c, cezVar.c));
            }
            o(cckVar, cezVarK);
        }
        cbl cblVarC = c();
        try {
            cfm cfmVarA = cfm.a();
            int i2 = cfmVarA.a + 1;
            cfmVarA.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    cblVarC.a.b(this);
                } else {
                    cbl.h("unbounded recursion in log statement", this);
                }
                if (cfmVarA != null) {
                    cfmVarA.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                cblVarC.a.a(e, this);
            } catch (cde e2) {
                throw e2;
            } catch (RuntimeException e3) {
                cbl.h(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean N() {
        ccd ccdVarB;
        cby cbyVar;
        int i;
        if (this.f == null) {
            this.f = ceb.g().a(cbz.class, 1);
        }
        if (this.f != ccc.a) {
            ccdVarB = this.f;
            cby cbyVar2 = this.c;
            if (cbyVar2 != null && (i = cbyVar2.b) > 0) {
                ccdVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (cbx.f.equals(cbyVar2.c(i2))) {
                        Object objE = cbyVar2.e(i2);
                        ccdVarB = objE instanceof cci ? ((cci) objE).b() : new cct(ccdVarB, objE);
                    }
                }
            }
        } else {
            ccdVarB = null;
        }
        boolean zB = b(ccdVarB);
        ccp ccpVar = this.d;
        if (ccpVar == null) {
            return zB;
        }
        cco ccoVar = (cco) cco.a.b(ccdVarB, this.c);
        int iIncrementAndGet = ccoVar.c.incrementAndGet();
        int i3 = -1;
        if (ccpVar != ccp.c && ccoVar.b.compareAndSet(false, true)) {
            try {
                ccpVar.a();
                ccoVar.b.set(false);
                ccoVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                ccoVar.b.set(false);
                throw th;
            }
        }
        if (zB && i3 > 0 && (cbyVar = this.c) != null) {
            cbyVar.f(cbx.e, Integer.valueOf(i3));
        }
        return zB & (i3 >= 0);
    }

    @Override // defpackage.cch
    public final void A(String str, Object obj, Object obj2, Object obj3) {
        if (N()) {
            M(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.cch
    public final void B(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (N()) {
            M(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.cch
    public final void C(String str, Object[] objArr) {
        if (N()) {
            M(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.cch
    public final boolean D() {
        return E() || c().i(this.e);
    }

    @Override // defpackage.cdb
    public final boolean E() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(cbx.g));
    }

    @Override // defpackage.cdb
    public final Object[] F() {
        ces.k(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.cch
    public final cch G(TimeUnit timeUnit) {
        if (E()) {
            return d();
        }
        cck cckVar = cbx.d;
        cce cceVar = cbq.a;
        o(cckVar, new cbp(timeUnit));
        return d();
    }

    @Override // defpackage.cch
    public final void H(int i, long j) {
        if (N()) {
            M("Pairing has failed %d times. Sleeping %dms...", Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.cch
    public final void I(int i, short s) {
        if (N()) {
            M("Unexpected predicted PCM Value %d (expected: %d)", Integer.valueOf(i), Short.valueOf(s));
        }
    }

    @Override // defpackage.cch
    public final void J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (N()) {
            M("Voice config for %d is %d %d %d %d from %s", obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.cch
    public final void K(short s) {
        if (N()) {
            M("Received mic open error without pending session: %X", Short.valueOf(s));
        }
    }

    @Override // defpackage.cch
    public final void L(short s, int i) {
        if (N()) {
            M("Unexpected audio frame number %d received (skipped: %d)", Short.valueOf(s), Integer.valueOf(i));
        }
    }

    protected abstract cfh a();

    protected boolean b(ccd ccdVar) {
        throw null;
    }

    protected abstract cbl c();

    protected abstract cch d();

    @Override // defpackage.cdb
    public final long e() {
        return this.b;
    }

    @Override // defpackage.cdb
    public final ccc f() {
        ccc cccVar = this.f;
        if (cccVar != null) {
            return cccVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.cch
    public final cch g(cck cckVar) {
        return h(cckVar, Boolean.TRUE);
    }

    @Override // defpackage.cch
    public final cch h(cck cckVar, Object obj) {
        cckVar.getClass();
        if (obj != null) {
            o(cckVar, obj);
        }
        return d();
    }

    @Override // defpackage.cch
    public final cch i(Throwable th) {
        return h(cbx.a, th);
    }

    @Override // defpackage.cch
    public final cch j(String str, String str2, int i, String str3) {
        ccc cccVar = ccc.a;
        ccb ccbVar = new ccb(str, str2, i, str3);
        if (this.f == null) {
            this.f = ccbVar;
        }
        return d();
    }

    @Override // defpackage.cdb
    public final cdh k() {
        cby cbyVar = this.c;
        return cbyVar != null ? cbyVar : cdg.a;
    }

    @Override // defpackage.cdb
    public final ced l() {
        return this.g;
    }

    @Override // defpackage.cdb
    public final Object m() {
        ces.k(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.cdb
    public final Level n() {
        return this.e;
    }

    protected final void o(cck cckVar, Object obj) {
        if (this.c == null) {
            this.c = new cby();
        }
        this.c.f(cckVar, obj);
    }

    @Override // defpackage.cch
    public final void p(String str) {
        if (N()) {
            M(a, str);
        }
    }

    @Override // defpackage.cch
    public final void q(String str, byte b) {
        if (N()) {
            M(str, Byte.valueOf(b));
        }
    }

    @Override // defpackage.cch
    public final void r(String str, int i) {
        if (N()) {
            M(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.cch
    public final void s(String str, long j) {
        if (N()) {
            M(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.cch
    public final void t(String str, Object obj) {
        if (N()) {
            M(str, obj);
        }
    }

    @Override // defpackage.cch
    public final void u(String str, byte b, Object obj) {
        if (N()) {
            M(str, Byte.valueOf(b), obj);
        }
    }

    @Override // defpackage.cch
    public final void v(String str, int i, byte b) {
        if (N()) {
            M(str, Integer.valueOf(i), Byte.valueOf(b));
        }
    }

    @Override // defpackage.cch
    public final void w(String str, int i, int i2) {
        if (N()) {
            M(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.cch
    public final void x(String str, int i, Object obj) {
        if (N()) {
            M(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.cch
    public final void y(String str, Object obj, int i) {
        if (N()) {
            M(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.cch
    public final void z(String str, Object obj, Object obj2) {
        if (N()) {
            M(str, obj, obj2);
        }
    }
}
