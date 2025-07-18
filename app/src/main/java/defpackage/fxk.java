package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxk {
    public final fxr a;
    public final fxj b;

    public fxk(fxr fxrVar, fxj fxjVar) {
        fxrVar.getClass();
        this.a = fxrVar;
        this.b = fxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxk)) {
            return false;
        }
        fxk fxkVar = (fxk) obj;
        return agvy.c(this.a, fxkVar.a) && agvy.c(this.b, fxkVar.b);
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChangeListener(field=" + this.a + ", onChange=" + this.b + ")";
    }
}
