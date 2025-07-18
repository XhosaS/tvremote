package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kzp implements vug {
    UNKNOWN_LANGUAGE_TYPE(0),
    ORIGINAL(1),
    DUBBED(2),
    UNRECOGNIZED(-1);

    private final int f;

    kzp(int i) {
        this.f = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
