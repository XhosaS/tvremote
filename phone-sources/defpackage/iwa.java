package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwa {
    public final tlu a;
    public final tol b;
    public final int c;
    private final String d;
    private final int e;
    private final int f;
    private final boolean g;

    public iwa(tlu tluVar, tol tolVar, int i) {
        tolVar.getClass();
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = true;
        this.a = tluVar;
        this.b = tolVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa)) {
            return false;
        }
        iwa iwaVar = (iwa) obj;
        if (!yks.e(this.d, iwaVar.d)) {
            return false;
        }
        int i = iwaVar.e;
        int i2 = iwaVar.f;
        boolean z = iwaVar.g;
        return yks.e(this.a, iwaVar.a) && yks.e(this.b, iwaVar.b) && this.c == iwaVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 29791;
        tlu tluVar = this.a;
        int iHashCode2 = (((((iHashCode + 1231) * 31) + (tluVar == null ? 0 : tluVar.hashCode())) * 31) + this.b.hashCode()) * 31;
        int i = this.c;
        a.bl(i);
        return iHashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardInput(value=");
        sb.append(this.d);
        sb.append(", cursorStartIndex=0, cursorEndIndex=0, originatedOnTv=true, imeService=");
        sb.append(this.a);
        sb.append(", imeListener=");
        sb.append(this.b);
        sb.append(", keyboardState=");
        sb.append((Object) (this.c != 2 ? "AVAILABLE" : "UNKNOWN"));
        sb.append(")");
        return sb.toString();
    }
}
