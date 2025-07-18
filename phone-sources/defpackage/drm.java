package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class drm {
    public final int a;

    public static String a(int i) {
        return "Horizontal(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof drm) && this.a == ((drm) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
