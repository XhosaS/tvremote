package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilz {
    public final ink a;
    public final String b;
    public final inl c;
    public final long d;
    public final long e;
    public final int f;
    private final long g;

    public ilz(ink inkVar, String str, inl inlVar, long j, long j2, int i) {
        inkVar.getClass();
        str.getClass();
        inlVar.getClass();
        this.a = inkVar;
        this.b = str;
        this.c = inlVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilz)) {
            return false;
        }
        ilz ilzVar = (ilz) obj;
        if (!yks.e(this.a, ilzVar.a) || !yks.e(this.b, ilzVar.b) || !yks.e(this.c, ilzVar.c) || this.d != ilzVar.d || this.e != ilzVar.e || this.f != ilzVar.f) {
            return false;
        }
        long j = ilzVar.g;
        return true;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        ink inkVar = this.a;
        if (inkVar.A()) {
            iJ = inkVar.j();
        } else {
            int iJ3 = inkVar.M;
            if (iJ3 == 0) {
                iJ3 = inkVar.j();
                inkVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int iHashCode = (iJ * 31) + this.b.hashCode();
        inl inlVar = this.c;
        if (inlVar.A()) {
            iJ2 = inlVar.j();
        } else {
            int iJ4 = inlVar.M;
            if (iJ4 == 0) {
                iJ4 = inlVar.j();
                inlVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return (((((((((iHashCode * 31) + iJ2) * 31) + a.k(this.d)) * 31) + a.k(this.e)) * 31) + this.f) * 31) + a.k(0L);
    }

    public final String toString() {
        return "CacheItem(cacheKey=" + this.a + ", accountName=" + this.b + ", cacheValue=" + this.c + ", expirationTimeMillis=" + this.d + ", accessTimeMillis=" + this.e + ", cacheValueBytes=" + this.f + ", cache_id=0)";
    }
}
