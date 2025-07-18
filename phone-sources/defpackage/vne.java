package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vne implements vug {
    BUTTONS_ORDER_UNSPECIFIED(0),
    ACTION_BUTTON_PRIMARY(1),
    ACK_BUTTON_PRIMARY(2);

    private final int e;

    vne(int i) {
        this.e = i;
    }

    public static vne b(int i) {
        if (i == 0) {
            return BUTTONS_ORDER_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_BUTTON_PRIMARY;
        }
        if (i != 2) {
            return null;
        }
        return ACK_BUTTON_PRIMARY;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
