package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ort {
    public final int a;

    public ort(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ort) && this.a == ((ort) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
