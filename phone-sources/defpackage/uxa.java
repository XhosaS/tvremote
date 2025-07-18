package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uxa implements vug {
    ACTION_UNKNOWN(0),
    ACTION_POSITIVE(1),
    ACTION_NEGATIVE(2),
    ACTION_DISMISS(3),
    ACTION_ACKNOWLEDGE(4);

    public final int f;

    uxa(int i) {
        this.f = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
