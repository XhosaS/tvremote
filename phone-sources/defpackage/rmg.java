package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmg {
    public final rma a;
    public final rma b;
    public final rma c;
    public final int d;

    public rmg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmg) {
            rmg rmgVar = (rmg) obj;
            if (this.a.equals(rmgVar.a) && this.b.equals(rmgVar.b) && this.c.equals(rmgVar.c) && this.d == rmgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        rma rmaVar = this.c;
        rma rmaVar2 = this.b;
        return "ViewProviders{headerViewProvider=" + String.valueOf(this.a) + ", contentViewProvider=" + String.valueOf(rmaVar2) + ", footerViewProvider=" + String.valueOf(rmaVar) + ", title=" + this.d + "}";
    }

    public rmg(rma rmaVar, rma rmaVar2, rma rmaVar3, int i) {
        this.a = rmaVar;
        this.b = rmaVar2;
        this.c = rmaVar3;
        this.d = i;
    }
}
