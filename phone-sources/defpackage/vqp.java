package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqp {
    public final boolean a;
    public final Boolean b;
    public final boolean c;

    public vqp() {
        this(null);
    }

    public static /* synthetic */ vqp a(vqp vqpVar, boolean z, Boolean bool, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = vqpVar.a;
        }
        if ((i & 2) != 0) {
            bool = vqpVar.b;
        }
        if ((i & 4) != 0) {
            z2 = vqpVar.c;
        }
        return new vqp(z, bool, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqp)) {
            return false;
        }
        vqp vqpVar = (vqp) obj;
        return this.a == vqpVar.a && yks.e(this.b, vqpVar.b) && this.c == vqpVar.c;
    }

    public final int hashCode() {
        Boolean bool = this.b;
        return (((a.q(this.a) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "UserInput(isScrolled=" + this.a + ", isAccountManagementExpanded=" + this.b + ", isAllowInteractions=" + this.c + ")";
    }

    public vqp(boolean z, Boolean bool, boolean z2) {
        this.a = z;
        this.b = bool;
        this.c = z2;
    }

    public /* synthetic */ vqp(byte[] bArr) {
        this(false, null, true);
    }
}
