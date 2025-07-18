package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxd {
    public static final vtl a;

    static {
        vtw vtwVarM = vtl.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((vtl) vucVar).b = -315576000000L;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vtl) vtwVarM.b).c = -999999999;
        vtw vtwVarM2 = vtl.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        ((vtl) vucVar2).b = 315576000000L;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        ((vtl) vtwVarM2.b).c = 999999999;
        vtw vtwVarM3 = vtl.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar3 = vtwVarM3.b;
        ((vtl) vucVar3).b = 0L;
        if (!vucVar3.A()) {
            vtwVarM3.u();
        }
        ((vtl) vtwVarM3.b).c = 0;
        a = (vtl) vtwVarM3.r();
    }

    public static int a(vtl vtlVar, vtl vtlVar2) {
        g(vtlVar);
        g(vtlVar2);
        int iCompare = Long.compare(vtlVar.b, vtlVar2.b);
        return iCompare != 0 ? iCompare : Integer.compare(vtlVar.c, vtlVar2.c);
    }

    public static long b(vtl vtlVar) {
        g(vtlVar);
        return sfy.an(sfy.ao(vtlVar.b, 1000L), vtlVar.c / 1000000);
    }

    public static long c(vtl vtlVar) {
        g(vtlVar);
        return vtlVar.b;
    }

    public static vtl d(long j) {
        return f(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static vtl e(long j) {
        vtw vtwVarM = vtl.a.m();
        long jAo = sfy.ao(j, 60L);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((vtl) vucVar).b = jAo;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vtl) vtwVarM.b).c = 0;
        return (vtl) vtwVarM.r();
    }

    public static vtl f(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = sfy.an(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        vtw vtwVarM = vtl.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((vtl) vucVar).b = j;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vtl) vtwVarM.b).c = i;
        vtl vtlVar = (vtl) vtwVarM.r();
        g(vtlVar);
        return vtlVar;
    }

    public static void g(vtl vtlVar) {
        long j = vtlVar.b;
        int i = vtlVar.c;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(sij.m("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
