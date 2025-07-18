package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxf {
    public static final vwe a;
    public static final vwe b;
    public static final ThreadLocal c;

    static {
        vtw vtwVarM = vwe.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((vwe) vucVar).b = -62135596800L;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vwe) vtwVarM.b).c = 0;
        vtw vtwVarM2 = vwe.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        ((vwe) vucVar2).b = 253402300799L;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        ((vwe) vtwVarM2.b).c = 999999999;
        a = (vwe) vtwVarM2.r();
        vtw vtwVarM3 = vwe.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar3 = vtwVarM3.b;
        ((vwe) vucVar3).b = 0L;
        if (!vucVar3.A()) {
            vtwVarM3.u();
        }
        ((vwe) vtwVarM3.b).c = 0;
        b = (vwe) vtwVarM3.r();
        c = new vxe();
        i("now");
        i("getEpochSecond");
        i("getNano");
    }

    public static int a(vwe vweVar, vwe vweVar2) {
        g(vweVar);
        g(vweVar2);
        int iCompare = Long.compare(vweVar.b, vweVar2.b);
        return iCompare != 0 ? iCompare : Integer.compare(vweVar.c, vweVar2.c);
    }

    public static long b(vwe vweVar) {
        g(vweVar);
        return sfy.an(sfy.ao(vweVar.b, 1000L), vweVar.c / 1000000);
    }

    @Deprecated
    public static vtl c(vwe vweVar, vwe vweVar2) {
        g(vweVar);
        g(vweVar2);
        long jAp = sfy.ap(vweVar2.b, vweVar.b);
        int i = vweVar2.c;
        int i2 = vweVar.c;
        long j = i - i2;
        int i3 = (int) j;
        boolean z = j == ((long) i3);
        int[] iArr = udo.a;
        sfy.ai(z, "checkedSubtract", i, i2);
        return vxd.f(jAp, i3);
    }

    public static vwe d(long j) {
        return f(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    public static vwe e(long j) {
        return f(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static vwe f(long j, int i) {
        if (!h(j)) {
            throw new IllegalArgumentException(sij.m("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = sfy.an(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = sfy.ap(j, 1L);
        }
        vtw vtwVarM = vwe.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((vwe) vucVar).b = j;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vwe) vtwVarM.b).c = i;
        vwe vweVar = (vwe) vtwVarM.r();
        g(vweVar);
        return vweVar;
    }

    public static void g(vwe vweVar) {
        long j = vweVar.b;
        boolean zH = h(j);
        int i = vweVar.c;
        if (!zH || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(sij.m("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean h(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }

    private static void i(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
