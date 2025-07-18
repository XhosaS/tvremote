package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcp {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public hcp(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcp)) {
            return false;
        }
        hcp hcpVar = (hcp) obj;
        return this.a == hcpVar.a && this.b == hcpVar.b && this.c == hcpVar.c && this.d == hcpVar.d;
    }

    public final int hashCode() {
        int iA = hco.a(this.a);
        boolean z = this.d;
        return (((((iA * 31) + hco.a(this.b)) * 31) + hco.a(this.c)) * 31) + hco.a(z);
    }

    public final String toString() {
        return "AssistantAccountSettings(safeSearch=" + this.a + ", voiceInputEnabled=" + this.b + ", personalResults=" + this.c + ", proactiveResults=" + this.d + ")";
    }
}
