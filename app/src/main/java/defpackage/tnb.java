package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnb {
    public final addl a;
    public final int b;

    public tnb(addl addlVar, int i) {
        addlVar.getClass();
        this.a = addlVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnb)) {
            return false;
        }
        tnb tnbVar = (tnb) obj;
        return this.a == tnbVar.a && this.b == tnbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        int i = this.b;
        if (i <= 0) {
            return this.a.name();
        }
        return this.a.name() + "|" + i;
    }
}
