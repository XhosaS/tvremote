package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vov {
    public final List a;
    public final vqe b;
    public final vqe c;
    public final vqu d;
    public final int e;
    private final vqe f = null;

    public vov(List list, int i, vqe vqeVar, vqe vqeVar2, vqu vquVar) {
        this.a = list;
        this.e = i;
        this.b = vqeVar;
        this.c = vqeVar2;
        this.d = vquVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vov)) {
            return false;
        }
        vov vovVar = (vov) obj;
        if (!yks.e(this.a, vovVar.a) || this.e != vovVar.e) {
            return false;
        }
        vqe vqeVar = vovVar.f;
        return yks.e(null, null) && yks.e(this.b, vovVar.b) && yks.e(this.c, vovVar.c) && yks.e(this.d, vovVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.e;
        a.bw(i);
        return ((((((iHashCode + i) * 961) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountManagementData(availableAccountsData=");
        sb.append(this.a);
        sb.append(", expandState=");
        int i = this.e;
        sb.append((Object) (i != 2 ? i != 3 ? "EXPAND_STATE_EXPANDED" : "EXPAND_STATE_COLLAPSED" : "EXPAND_STATE_NON_COLLAPSIBLE"));
        sb.append(", accountListTitleText=null, accountListTitleAccessibility=");
        sb.append(this.b);
        sb.append(", afterExpandOrCollapseAccessibility=");
        sb.append(this.c);
        sb.append(", accountManagementActions=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
