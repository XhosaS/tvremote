package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtj {
    public final boolean a;
    public final int b;

    public qtj() {
        throw null;
    }

    public static qti a() {
        qti qtiVar = new qti();
        qtiVar.b(false);
        qtiVar.c(1);
        return qtiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qtj) {
            qtj qtjVar = (qtj) obj;
            if (this.a == qtjVar.a) {
                int i = this.b;
                int i2 = qtjVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bw(i);
        return i ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "GaiaAccountData{isG1User=" + this.a + ", isUnicornUser=" + qtl.b(this.b) + "}";
    }

    public qtj(boolean z, int i) {
        this.a = z;
        this.b = i;
    }
}
