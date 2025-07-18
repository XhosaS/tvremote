package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxr {
    public final String a;

    public fxr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxr) && agvy.c(this.a, ((fxr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FieldDescriptor(path=" + this.a + ")";
    }
}
