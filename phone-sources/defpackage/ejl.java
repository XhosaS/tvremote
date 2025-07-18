package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejl {
    public final evz a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ejl(evz evzVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        a.H(!z3 || z);
        a.H(!z2 || z);
        a.H(true);
        this.a = evzVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = false;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final ejl a(long j) {
        return j == this.c ? this : new ejl(this.a, this.b, j, this.d, this.e, this.h, this.i, this.j);
    }

    public final ejl b(long j) {
        return j == this.b ? this : new ejl(this.a, j, this.c, this.d, this.e, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ejl ejlVar = (ejl) obj;
            if (this.b == ejlVar.b && this.c == ejlVar.c && this.d == ejlVar.d && this.e == ejlVar.e && this.h == ejlVar.h && this.i == ejlVar.i && this.j == ejlVar.j && Objects.equals(this.a, ejlVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((((((((iHashCode * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
