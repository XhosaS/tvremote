package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adsh implements abxf {
    STOP_TYPE_UNKNOWN(0),
    STOP_TYPE_IMMEDIATE(1),
    STOP_TYPE_DEFERRED(2),
    STOP_TYPE_FORCED(3),
    STOP_TYPE_TIMEOUT(4);

    private final int g;

    adsh(int i) {
        this.g = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
