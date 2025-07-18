package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjz {
    public final vjj a;
    public final vjl b;
    public final Map c;

    public qjz(vjj vjjVar, vjl vjlVar, Map map) {
        vjjVar.getClass();
        map.getClass();
        this.a = vjjVar;
        this.b = vjlVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjz)) {
            return false;
        }
        qjz qjzVar = (qjz) obj;
        return yks.e(this.a, qjzVar.a) && yks.e(this.b, qjzVar.b) && yks.e(this.c, qjzVar.c);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        vjj vjjVar = this.a;
        if (vjjVar.A()) {
            iJ = vjjVar.j();
        } else {
            int iJ3 = vjjVar.M;
            if (iJ3 == 0) {
                iJ3 = vjjVar.j();
                vjjVar.M = iJ3;
            }
            iJ = iJ3;
        }
        vjl vjlVar = this.b;
        if (vjlVar.A()) {
            iJ2 = vjlVar.j();
        } else {
            int iJ4 = vjlVar.M;
            if (iJ4 == 0) {
                iJ4 = vjlVar.j();
                vjlVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return (((iJ * 31) + iJ2) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MultiLoginUpdateRequestAndResponse(request=" + this.a + ", response=" + this.b + ", authResultPerUser=" + this.c + ")";
    }
}
