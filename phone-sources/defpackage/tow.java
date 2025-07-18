package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tow {
    NONE(23),
    NEUTRAL(0),
    RIGHT(22),
    UP(19),
    LEFT(21),
    DOWN(20);

    public final int g;

    tow(int i) {
        this.g = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "SwipeDirection{" + name() + "}";
    }
}
