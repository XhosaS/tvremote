package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijg {
    public final long a;
    public final int b;
    private final ink c;

    public ijg(long j, ink inkVar, int i) {
        this.a = j;
        this.c = inkVar;
        this.b = i;
    }

    static /* synthetic */ void a(ghi ghiVar, Object obj) {
        imf imfVar = (imf) obj;
        String strT = ipc.t(imfVar.a);
        if (strT == null) {
            ghiVar.h(1);
        } else {
            ghiVar.i(1, strT);
        }
        ghiVar.i(2, imfVar.b);
        ghiVar.i(3, imfVar.c);
    }

    static /* synthetic */ void b(ghi ghiVar, Object obj) {
        imi imiVar = (imi) obj;
        ghiVar.i(1, imiVar.b);
        ghiVar.i(2, ihz.c(imiVar.c));
        ghiVar.g(3, imiVar.d ? 1L : 0L);
        imiVar.e.getClass();
        ghiVar.g(4, r0.a());
        ghiVar.g(5, imiVar.f ? 1L : 0L);
        ghiVar.g(6, imiVar.g ? 1L : 0L);
        ghiVar.g(7, imiVar.h);
        ghiVar.g(8, imiVar.i);
    }

    static /* synthetic */ void c(ghi ghiVar, Object obj) {
        imi imiVar = (imi) obj;
        ghiVar.i(1, imiVar.b);
        ghiVar.i(2, ihz.c(imiVar.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijg)) {
            return false;
        }
        ijg ijgVar = (ijg) obj;
        return this.a == ijgVar.a && yks.e(this.c, ijgVar.c) && this.b == ijgVar.b;
    }

    public final int hashCode() {
        int iJ;
        ink inkVar = this.c;
        if (inkVar.A()) {
            iJ = inkVar.j();
        } else {
            int iJ2 = inkVar.M;
            if (iJ2 == 0) {
                iJ2 = inkVar.j();
                inkVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (((a.k(this.a) * 31) + iJ) * 31) + this.b;
    }

    public final String toString() {
        return "CacheKeysWithSize(cacheId=" + this.a + ", cacheKey=" + this.c + ", cacheValueBytes=" + this.b + ")";
    }
}
