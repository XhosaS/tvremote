package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnx {
    private static volatile int a = 100;

    public static cny f(Object obj) {
        return ((clt) obj).v;
    }

    public static void g(Object obj, cny cnyVar) {
        ((clt) obj).v = cnyVar;
    }

    final boolean a(Object obj, ckz ckzVar, int i) throws cmh {
        int i2 = ckzVar.b;
        int iA = coi.a(i2);
        int iB = coi.b(i2);
        if (iB == 0) {
            d(obj, iA, ckzVar.k());
            return true;
        }
        if (iB == 1) {
            cny cnyVar = (cny) obj;
            cnyVar.e(coi.c(iA, 1), Long.valueOf(ckzVar.j()));
            return true;
        }
        if (iB == 2) {
            c(obj, iA, ckzVar.o());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i != 0) {
                    return false;
                }
                throw new cmh("Protocol message end-group tag did not match expected tag.");
            }
            if (iB != 5) {
                throw new cmg();
            }
            cny cnyVar2 = (cny) obj;
            cnyVar2.e(coi.c(iA, 5), Integer.valueOf(ckzVar.e()));
            return true;
        }
        cny cnyVar3 = new cny();
        int iC = coi.c(iA, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new cmh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (ckzVar.c() != Integer.MAX_VALUE && a(cnyVar3, ckzVar, i3)) {
        }
        if (iC != ckzVar.b) {
            throw new cmh("Protocol message end-group tag did not match expected tag.");
        }
        cnyVar3.d();
        ((cny) obj).e(coi.c(iA, 3), cnyVar3);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        cny cnyVarF = f(obj);
        if (cnyVarF != cny.a) {
            return cnyVarF;
        }
        cny cnyVar = new cny();
        g(obj, cnyVar);
        return cnyVar;
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i, ckv ckvVar) {
        ((cny) obj).e(coi.c(i, 2), ckvVar);
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((cny) obj).e(coi.c(i, 0), Long.valueOf(j));
    }

    public final void e(Object obj) {
        f(obj).d();
    }
}
