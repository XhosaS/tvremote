package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqu {
    public final List a;
    public final Integer b;

    public vqu() {
        this((List) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqu)) {
            return false;
        }
        vqu vquVar = (vqu) obj;
        return yks.e(this.a, vquVar.a) && yks.e(this.b, vquVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CardStack(rows=" + this.a + ", stableId=" + this.b + ")";
    }

    public vqu(List list, Integer num) {
        list.getClass();
        this.a = list;
        this.b = num;
    }

    public /* synthetic */ vqu(List list, int i) {
        this((i & 1) != 0 ? yhb.a : list, (Integer) null);
    }
}
