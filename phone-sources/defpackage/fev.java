package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fev {
    public final feu a;
    public final fel b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long[] l;
    public int[] m;
    private final long n;

    public fev(int i, feu feuVar, fel felVar) {
        this.a = feuVar;
        int iB = feuVar.b();
        boolean z = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z = false;
            }
        }
        a.H(z);
        this.c = d(i, iB == 2 ? 1667497984 : 1651965952);
        this.n = feuVar.c();
        this.b = felVar;
        this.d = iB == 2 ? d(i, 1650720768) : -1;
        this.k = -1L;
        this.l = new long[512];
        this.m = new int[512];
        this.e = feuVar.d;
    }

    private static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final feg e(int i) {
        return new feg(this.m[i] * b(), this.l[i]);
    }

    public final long a(int i) {
        return (this.n * i) / this.e;
    }

    public final long b() {
        return a(1);
    }

    public final fed c(long j) {
        if (this.j == 0) {
            feg fegVar = new feg(0L, this.k);
            return new fed(fegVar, fegVar);
        }
        int iB = (int) (j / b());
        int iB2 = edt.b(this.m, iB, true, true);
        if (this.m[iB2] == iB) {
            feg fegVarE = e(iB2);
            return new fed(fegVarE, fegVarE);
        }
        feg fegVarE2 = e(iB2);
        int i = iB2 + 1;
        return i < this.l.length ? new fed(fegVarE2, e(i)) : new fed(fegVarE2, fegVarE2);
    }
}
