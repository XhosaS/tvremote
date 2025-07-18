package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqt {
    private static volatile int a = 100;

    public static dqu f(Object obj) {
        return ((dpf) obj).unknownFields;
    }

    public static void g(Object obj, dqu dquVar) {
        ((dpf) obj).unknownFields = dquVar;
    }

    final boolean a(Object obj, dop dopVar, int i) throws dpm {
        int i2 = dopVar.b;
        int iA = dri.a(i2);
        int iB = dri.b(i2);
        if (iB == 0) {
            d(obj, iA, dopVar.k());
            return true;
        }
        if (iB == 1) {
            dqu dquVar = (dqu) obj;
            dquVar.e(dri.c(iA, 1), Long.valueOf(dopVar.j()));
            return true;
        }
        if (iB == 2) {
            c(obj, iA, dopVar.o());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw new dpl();
            }
            dqu dquVar2 = (dqu) obj;
            dquVar2.e(dri.c(iA, 5), Integer.valueOf(dopVar.e()));
            return true;
        }
        dqu dquVar3 = new dqu();
        int iC = dri.c(iA, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new dpm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (dopVar.c() != Integer.MAX_VALUE && a(dquVar3, dopVar, i3)) {
        }
        if (iC != dopVar.b) {
            throw new dpm("Protocol message end-group tag did not match expected tag.");
        }
        dquVar3.d();
        ((dqu) obj).e(dri.c(iA, 3), dquVar3);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        dqu dquVarF = f(obj);
        if (dquVarF != dqu.a) {
            return dquVarF;
        }
        dqu dquVar = new dqu();
        g(obj, dquVar);
        return dquVar;
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i, dol dolVar) {
        ((dqu) obj).e(dri.c(i, 2), dolVar);
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((dqu) obj).e(dri.c(i, 0), Long.valueOf(j));
    }

    public final void e(Object obj) {
        f(obj).d();
    }
}
