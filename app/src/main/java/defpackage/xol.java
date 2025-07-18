package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xol implements abxf {
    UNSPECIFIED_TECHNOLOGY(0),
    HTML(1),
    ELEMENTS(2);

    public final int d;

    xol(int i) {
        this.d = i;
    }

    public static xol b(int i) {
        if (i == 0) {
            return UNSPECIFIED_TECHNOLOGY;
        }
        if (i == 1) {
            return HTML;
        }
        if (i != 2) {
            return null;
        }
        return ELEMENTS;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
