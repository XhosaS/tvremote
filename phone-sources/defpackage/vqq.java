package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqq implements vpf {
    public final vqj a;
    public final vov b;
    public final vqs c;
    public final vqs e;
    private final boolean g = false;
    public final vqs d = null;
    public final vqs f = null;

    public vqq(vqj vqjVar, vov vovVar, vqs vqsVar, vqs vqsVar2, vqs vqsVar3) {
        this.a = vqjVar;
        this.b = vovVar;
        this.c = vqsVar;
        this.e = vqsVar3;
    }

    @Override // defpackage.vpf
    public final boolean a() {
        return this.b == null && this.c == null && this.e == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqq)) {
            return false;
        }
        vqq vqqVar = (vqq) obj;
        if (!yks.e(this.a, vqqVar.a) || !yks.e(this.b, vqqVar.b) || !yks.e(this.c, vqqVar.c)) {
            return false;
        }
        boolean z = vqqVar.g;
        vqs vqsVar = vqqVar.d;
        if (!yks.e(null, null) || !yks.e(this.e, vqqVar.e)) {
            return false;
        }
        vqs vqsVar2 = vqqVar.f;
        return yks.e(null, null);
    }

    public final int hashCode() {
        vqj vqjVar = this.a;
        int iHashCode = vqjVar == null ? 0 : vqjVar.hashCode();
        vov vovVar = this.b;
        int iHashCode2 = vovVar == null ? 0 : vovVar.hashCode();
        int i = iHashCode * 31;
        vqs vqsVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (vqsVar == null ? 0 : vqsVar.hashCode())) * 31;
        vqs vqsVar2 = this.e;
        return (((iHashCode3 + 1237) * 961) + (vqsVar2 != null ? vqsVar2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "WithAccountsState(selectedAccountData=" + this.a + ", accountManagementData=" + this.b + ", accountCard=" + this.c + ", isAccountCardA11yHighPriority=false, storageCard=null, switchProfileCard=" + this.e + ", highPriorityStorageCard=null)";
    }
}
