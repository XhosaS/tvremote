package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class drn {
    public final int a;

    public static String a(int i) {
        return "Vertical(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof drn) && this.a == ((drn) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
