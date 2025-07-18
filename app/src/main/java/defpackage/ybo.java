package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ybo implements abxf {
    UNKNOWN_STATUS(0),
    SUCCESS(1),
    FAILURE(2),
    CANCELED(3),
    SKIPPED(4);

    public final int f;

    ybo(int i) {
        this.f = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
