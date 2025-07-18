package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vna implements vug {
    USER_ACTION_UNSPECIFIED(0),
    USER_ACTION_POSITIVE(1),
    USER_ACTION_NEGATIVE(2),
    USER_ACTION_DISMISS(3),
    USER_ACTION_ACKNOWLEDGE(4);

    private final int g;

    vna(int i) {
        this.g = i;
    }

    public static vna b(int i) {
        if (i == 0) {
            return USER_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return USER_ACTION_POSITIVE;
        }
        if (i == 2) {
            return USER_ACTION_NEGATIVE;
        }
        if (i == 3) {
            return USER_ACTION_DISMISS;
        }
        if (i != 4) {
            return null;
        }
        return USER_ACTION_ACKNOWLEDGE;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
