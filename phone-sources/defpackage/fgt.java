package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgt extends fgu {
    public final long a;
    public final long b;

    public fgt(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.fgu
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }
}
