package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum voo implements vug {
    ACTION_UNKNOWN(0),
    ACTION_POSITIVE(1),
    ACTION_NEGATIVE(2),
    ACTION_DISMISS(3),
    ACTION_ACKNOWLEDGE(4);

    private final int g;

    voo(int i) {
        this.g = i;
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
