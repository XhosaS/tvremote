package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vew implements vug {
    CONTENT_TYPE_UNSPECIFIED(0),
    VIDEO(1),
    AUDIO(2),
    IMAGE(3),
    TEXT(4),
    UNRECOGNIZED(-1);

    private final int h;

    vew(int i) {
        this.h = i;
    }

    public static vew b(int i) {
        if (i == 0) {
            return CONTENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return VIDEO;
        }
        if (i == 2) {
            return AUDIO;
        }
        if (i == 3) {
            return IMAGE;
        }
        if (i != 4) {
            return null;
        }
        return TEXT;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
