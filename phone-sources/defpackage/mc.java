package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mc {
    public static final os a = fh.g(0.0f, 400.0f, null, 5);
    public static final os b;
    public static final os c;

    static {
        Map map = qa.a;
        long j = 4294967297L;
        b = fh.g(0.0f, 400.0f, new cmf(j), 1);
        c = fh.g(0.0f, 400.0f, new cmh(j), 1);
    }

    public static final mf a(bcb bcbVar) {
        return (mf) bcbVar.a();
    }

    public static final mg b(bcb bcbVar) {
        return (mg) bcbVar.a();
    }

    public static final void c(bcb bcbVar, mf mfVar) {
        bcbVar.b(mfVar);
    }

    public static final void d(bcb bcbVar, mg mgVar) {
        bcbVar.b(mgVar);
    }

    public static /* synthetic */ mf e(np npVar, bkh bkhVar, int i) {
        if ((i & 1) != 0) {
            Map map = qa.a;
            npVar = fh.g(0.0f, 400.0f, new cmh(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            bkhVar = bkb.o;
        }
        return new mf(new mp(null, null, new lv(i(bkhVar), new lk(lo.e, 4), npVar), false, null, 59));
    }

    public static /* synthetic */ mg f(np npVar, bkh bkhVar, int i) {
        if ((i & 1) != 0) {
            Map map = qa.a;
            npVar = fh.g(0.0f, 400.0f, new cmh(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            bkhVar = bkb.o;
        }
        return new mg(new mp(null, null, new lv(i(bkhVar), new lk(lo.f, 5), npVar), false, null, 59));
    }

    public static /* synthetic */ mf g(np npVar) {
        return new mf(new mp(new mh(npVar), null, null, false, null, 62));
    }

    public static /* synthetic */ mg h(np npVar) {
        return new mg(new mp(new mh(npVar), null, null, false, null, 62));
    }

    private static final bkd i(bkh bkhVar) {
        return yks.e(bkhVar, bkb.m) ? bkb.b : yks.e(bkhVar, bkb.o) ? bkb.h : bkb.e;
    }
}
