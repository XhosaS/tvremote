package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qax {
    public final long a;
    public final String b;
    public final long c;
    public final vll d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;

    public qax(long j, String str, long j2, int i, vll vllVar, int i2, int i3, long j3) {
        if (i == 0) {
            throw null;
        }
        vllVar.getClass();
        if (i2 == 0 || i3 == 0) {
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = j2;
        this.h = i;
        this.d = vllVar;
        this.f = i2;
        this.g = i3;
        this.e = j3;
    }

    public static /* synthetic */ qax a(qax qaxVar, long j, long j2, int i) {
        long j3 = (i & 1) != 0 ? qaxVar.a : j;
        String str = (i & 2) != 0 ? qaxVar.b : null;
        long j4 = (i & 4) != 0 ? qaxVar.c : 0L;
        int i2 = (i & 8) != 0 ? qaxVar.h : 0;
        vll vllVar = (i & 16) != 0 ? qaxVar.d : null;
        int i3 = (i & 32) != 0 ? qaxVar.f : 0;
        int i4 = (i & 64) != 0 ? qaxVar.g : 0;
        long j5 = (i & 128) != 0 ? qaxVar.e : j2;
        str.getClass();
        if (i2 == 0) {
            throw null;
        }
        vllVar.getClass();
        if (i3 == 0 || i4 == 0) {
            throw null;
        }
        return new qax(j3, str, j4, i2, vllVar, i3, i4, j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qax)) {
            return false;
        }
        qax qaxVar = (qax) obj;
        return this.a == qaxVar.a && yks.e(this.b, qaxVar.b) && this.c == qaxVar.c && this.h == qaxVar.h && this.d == qaxVar.d && this.f == qaxVar.f && this.g == qaxVar.g && this.e == qaxVar.e;
    }

    public final int hashCode() {
        int iK = (((((((a.k(this.a) * 31) + this.b.hashCode()) * 31) + a.k(this.c)) * 31) + vmb.a(this.h)) * 31) + this.d.hashCode();
        int i = this.f;
        a.bw(i);
        int i2 = this.g;
        a.bw(i2);
        return (((((iK * 31) + i) * 31) + i2) * 31) + a.k(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeThreadState(id=");
        sb.append(this.a);
        sb.append(", threadId=");
        sb.append(this.b);
        sb.append(", lastUpdatedVersion=");
        sb.append(this.c);
        sb.append(", readState=");
        int i = this.h;
        sb.append((Object) (i != 0 ? vmb.toString$ar$edu(i) : "null"));
        sb.append(", deletionStatus=");
        sb.append(this.d);
        sb.append(", countBehavior=");
        sb.append((Object) ves.s(this.f));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) vfi.M(this.g));
        sb.append(", modifiedTimestamp=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
