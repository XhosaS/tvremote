package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srl {
    public final rxh a;
    public final String b;
    public final int c;

    public srl(rxh rxhVar, int i, String str) {
        rxhVar.getClass();
        this.a = rxhVar;
        this.c = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srl)) {
            return false;
        }
        srl srlVar = (srl) obj;
        return this.a == srlVar.a && this.c == srlVar.c && agvy.c(this.b, srlVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FailedSessionStatuses(openingFailure=" + this.a + ", closingFailure=" + ((Object) Integer.toString(this.c - 1)) + ", message=" + this.b + ")";
    }
}
