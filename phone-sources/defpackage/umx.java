package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umx {
    public final String a;
    public final List b;

    public umx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof umx) {
            umx umxVar = (umx) obj;
            if (this.a.equals(umxVar.a) && this.b.equals(umxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b.toString() + "}";
    }

    public umx(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = list;
    }
}
