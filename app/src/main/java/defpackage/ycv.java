package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ycv implements abxf {
    DSC_UNKNOWN(0),
    DSC_GRANTED(1),
    DSC_DENIED(2),
    DSC_DENIED_IN_OOBE(3);

    public final int e;

    ycv(int i) {
        this.e = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
