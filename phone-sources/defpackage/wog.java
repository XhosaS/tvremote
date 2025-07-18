package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wog implements vug {
    SENTIMENT_TYPE_UNSPECIFIED(0),
    THUMBS_UP(1),
    THUMBS_DOWN(2),
    THUMBS_NONE(3),
    UNRECOGNIZED(-1);

    private final int g;

    wog(int i) {
        this.g = i;
    }

    public static wog b(int i) {
        if (i == 0) {
            return SENTIMENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return THUMBS_UP;
        }
        if (i == 2) {
            return THUMBS_DOWN;
        }
        if (i != 3) {
            return null;
        }
        return THUMBS_NONE;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
