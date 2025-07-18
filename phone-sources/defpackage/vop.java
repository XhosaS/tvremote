package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vop {
    public int a = 3;
    public int b;

    public vop(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vop)) {
            return false;
        }
        vop vopVar = (vop) obj;
        return this.a == vopVar.a && this.b == vopVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "RemainingAccountsNumberContent(headerMaxAvatars=" + this.a + ", numberOfAvailableAccounts=" + this.b + ")";
    }
}
