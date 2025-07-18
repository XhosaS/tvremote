package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqr implements vpf {
    public final vpn a;

    public vqr(vpn vpnVar) {
        vpnVar.getClass();
        this.a = vpnVar;
    }

    @Override // defpackage.vpf
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqr) && yks.e(this.a, ((vqr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithoutAccountsState(button=" + this.a + ")";
    }
}
