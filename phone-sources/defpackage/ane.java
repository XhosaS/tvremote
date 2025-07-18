package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ane {
    private final afo a;
    private final long b;
    private final boolean c;
    private final int d;

    public ane(afo afoVar, long j, int i, boolean z) {
        this.a = afoVar;
        this.b = j;
        this.d = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ane)) {
            return false;
        }
        ane aneVar = (ane) obj;
        return this.a == aneVar.a && a.s(this.b, aneVar.b) && this.d == aneVar.d && this.c == aneVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.d;
        a.bw(i);
        return ((((iHashCode + a.k(this.b)) * 31) + i) * 31) + a.q(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) bmx.d(this.b));
        sb.append(", anchor=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "Right" : "Middle" : "Left"));
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
