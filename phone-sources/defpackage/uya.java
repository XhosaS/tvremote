package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uya implements vug {
    BUTTONS_ORDER_UNSPECIFIED(0),
    ACTION_BUTTON_PRIMARY(1),
    ACK_BUTTON_PRIMARY(2);

    public final int d;

    uya(int i) {
        this.d = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
