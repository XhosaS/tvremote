package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrr {
    public final int a;
    public final ksn b;
    public final mee c;
    public final boolean d;
    public final long e;
    public final ksy f;
    public final boolean g;
    private final String h;

    public lrr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrr) {
            lrr lrrVar = (lrr) obj;
            if (this.a == lrrVar.a && this.b.equals(lrrVar.b) && this.c.equals(lrrVar.c) && this.d == lrrVar.d && this.e == lrrVar.e && this.f.equals(lrrVar.f) && this.h.equals(lrrVar.h) && this.g == lrrVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = true != this.d ? 1237 : 1231;
        long j = this.e;
        return (((((((((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        ksy ksyVar = this.f;
        mee meeVar = this.c;
        return "FetchCencLicenseRequest{keyRequestType=" + this.a + ", account=" + String.valueOf(this.b) + ", data=" + String.valueOf(meeVar) + ", isAlreadyPinned=" + this.d + ", timeSinceStartedMillis=" + this.e + ", assetId=" + String.valueOf(ksyVar) + ", cpn=" + this.h + ", isHeartbeat=" + this.g + "}";
    }

    public lrr(int i, ksn ksnVar, mee meeVar, boolean z, long j, ksy ksyVar, String str, boolean z2) {
        this.a = i;
        this.b = ksnVar;
        this.c = meeVar;
        this.d = z;
        this.e = j;
        this.f = ksyVar;
        this.h = str;
        this.g = z2;
    }
}
