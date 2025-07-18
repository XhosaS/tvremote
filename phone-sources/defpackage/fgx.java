package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgx extends fgu {
    public final long a;
    public final long b;

    public fgx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static long d(edi ediVar, long j) {
        long j2 = ediVar.j();
        if ((128 & j2) != 0) {
            return 8589934591L & ((((j2 & 1) << 32) | ediVar.r()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.fgu
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }
}
