package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luj {
    public final ksn a;
    public final ksy b;
    public final long c;
    public final long d;
    public final tst e;
    public final tst f;

    public luj() {
        throw null;
    }

    public static luj a(ksn ksnVar, ksy ksyVar, long j, long j2, lui luiVar) {
        return new luj(ksnVar, ksyVar, j, j2, tst.i(luiVar), trk.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luj) {
            luj lujVar = (luj) obj;
            if (this.a.equals(lujVar.a) && this.b.equals(lujVar.b) && this.c == lujVar.c && this.d == lujVar.d && this.e.equals(lujVar.e) && this.f.equals(lujVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.d;
        tst tstVar = this.e;
        long j2 = this.c;
        return (((((((iHashCode * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ tstVar.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        tst tstVar = this.f;
        tst tstVar2 = this.e;
        ksy ksyVar = this.b;
        return "UpdateWatchEventRequest{account=" + this.a.toString() + ", assetId=" + ksyVar.toString() + ", startTimestampMsec=" + this.c + ", updateTimeMsec=" + this.d + ", playback=" + tstVar2.toString() + ", watchAction=" + tstVar.toString() + "}";
    }

    public luj(ksn ksnVar, ksy ksyVar, long j, long j2, tst tstVar, tst tstVar2) {
        this.a = ksnVar;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.b = ksyVar;
        this.c = j;
        this.d = j2;
        this.e = tstVar;
        this.f = tstVar2;
    }
}
