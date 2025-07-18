package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfz {
    private static volatile int a = 100;

    public static dga e(Object obj) {
        return ((dek) obj).unknownFields;
    }

    public static void f(Object obj, dga dgaVar) {
        ((dek) obj).unknownFields = dgaVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        dga dgaVarE = e(obj);
        if (dgaVarE != dga.a) {
            return dgaVarE;
        }
        dga dgaVar = new dga();
        f(obj, dgaVar);
        return dgaVar;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, int i, dds ddsVar) {
        ((dga) obj).e(dgn.c(i, 2), ddsVar);
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i, long j) {
        ((dga) obj).e(dgn.c(i, 0), Long.valueOf(j));
    }

    public final void d(Object obj) {
        e(obj).d();
    }

    final boolean g(Object obj, som somVar, int i) throws der {
        int i2 = somVar.b;
        int iA = dgn.a(i2);
        int iB = dgn.b(i2);
        if (iB == 0) {
            c(obj, iA, somVar.n());
            return true;
        }
        if (iB == 1) {
            dga dgaVar = (dga) obj;
            dgaVar.e(dgn.c(iA, 1), Long.valueOf(somVar.m()));
            return true;
        }
        if (iB == 2) {
            b(obj, iA, somVar.r());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw new deq();
            }
            dga dgaVar2 = (dga) obj;
            dgaVar2.e(dgn.c(iA, 5), Integer.valueOf(somVar.h()));
            return true;
        }
        dga dgaVar3 = new dga();
        int iC = dgn.c(iA, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new der("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (somVar.f() != Integer.MAX_VALUE && g(dgaVar3, somVar, i3)) {
        }
        if (iC != somVar.b) {
            throw new der("Protocol message end-group tag did not match expected tag.");
        }
        dgaVar3.d();
        ((dga) obj).e(dgn.c(iA, 3), dgaVar3);
        return true;
    }
}
