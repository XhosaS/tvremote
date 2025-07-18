package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggs {
    public final Long a;
    public final Long b;
    public final Long c;

    public ggs(Long l, Long l2, Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggs)) {
            return false;
        }
        ggs ggsVar = (ggs) obj;
        return agvy.c(this.a, ggsVar.a) && agvy.c(this.b, ggsVar.b) && agvy.c(this.c, ggsVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.b;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int i = iHashCode * 31;
        Long l3 = this.c;
        return ((i + iHashCode2) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "DscCardTextDetails(header_id=" + this.a + ", body_id=" + this.b + ", details_id=" + this.c + ")";
    }
}
