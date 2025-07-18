package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class btg {
    private final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof btg) && this.a == ((btg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
