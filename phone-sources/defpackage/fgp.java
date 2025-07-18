package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgp implements eac {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public fgp(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgp fgpVar = (fgp) obj;
            if (this.a == fgpVar.a && this.b == fgpVar.b && this.c == fgpVar.c && this.d == fgpVar.d && this.e == fgpVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iK = a.k(this.a) + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((iK * 31) + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j2)) * 31) + a.k(j);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
