package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwg {
    private static volatile int a = 100;

    public static vwh f(Object obj) {
        return ((vuc) obj).P;
    }

    public static void g(Object obj, vwh vwhVar) {
        ((vuc) obj).P = vwhVar;
    }

    final boolean a(Object obj, vtf vtfVar, int i) throws vuq {
        int i2 = vtfVar.b;
        int iA = vwq.a(i2);
        int iB = vwq.b(i2);
        if (iB == 0) {
            d(obj, iA, vtfVar.k());
            return true;
        }
        if (iB == 1) {
            vwh vwhVar = (vwh) obj;
            vwhVar.e(vwq.c(iA, 1), Long.valueOf(vtfVar.j()));
            return true;
        }
        if (iB == 2) {
            c(obj, iA, vtfVar.o());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i != 0) {
                    return false;
                }
                throw new vuq("Protocol message end-group tag did not match expected tag.");
            }
            if (iB != 5) {
                throw new vup();
            }
            vwh vwhVar2 = (vwh) obj;
            vwhVar2.e(vwq.c(iA, 5), Integer.valueOf(vtfVar.e()));
            return true;
        }
        vwh vwhVar3 = new vwh();
        int iC = vwq.c(iA, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new vuq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (vtfVar.c() != Integer.MAX_VALUE && a(vwhVar3, vtfVar, i3)) {
        }
        if (iC != vtfVar.b) {
            throw new vuq("Protocol message end-group tag did not match expected tag.");
        }
        vwhVar3.d();
        ((vwh) obj).e(vwq.c(iA, 3), vwhVar3);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        vwh vwhVarF = f(obj);
        if (vwhVarF != vwh.a) {
            return vwhVarF;
        }
        vwh vwhVar = new vwh();
        g(obj, vwhVar);
        return vwhVar;
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i, vsz vszVar) {
        ((vwh) obj).e(vwq.c(i, 2), vszVar);
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((vwh) obj).e(vwq.c(i, 0), Long.valueOf(j));
    }

    public final void e(Object obj) {
        f(obj).d();
    }
}
