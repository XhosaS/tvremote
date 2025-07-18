package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cli {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        a(0.0f);
        a(0.5f);
        a = 0.5f;
        a(-1.0f);
        b = -1.0f;
        a(1.0f);
        c = 1.0f;
    }

    public static void a(float f) {
        if ((f < 0.0f || f > 1.0f) && f != -1.0f) {
            cko.b("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
