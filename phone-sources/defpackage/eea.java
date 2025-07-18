package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eea implements eac {
    public final long a;
    public final long b;
    public final long c;

    public eea(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
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
        if (!(obj instanceof eea)) {
            return false;
        }
        eea eeaVar = (eea) obj;
        return this.a == eeaVar.a && this.b == eeaVar.b && this.c == eeaVar.c;
    }

    public final int hashCode() {
        return ((((a.k(this.a) + 527) * 31) + a.k(this.b)) * 31) + a.k(this.c);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
