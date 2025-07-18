package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qup {
    public final String a;
    public final int b;
    public final yau c;
    public final rdd d;

    public qup() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qup) {
            qup qupVar = (qup) obj;
            rdd rddVar = this.d;
            if (rddVar != null ? rddVar.equals(qupVar.d) : qupVar.d == null) {
                yau yauVar = this.c;
                if (yauVar != null ? yauVar.equals(qupVar.c) : qupVar.c == null) {
                    String str = this.a;
                    if (str != null ? str.equals(qupVar.a) : qupVar.a == null) {
                        int i = this.b;
                        int i2 = qupVar.b;
                        if (i != 0 ? i == i2 : i2 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rdd rddVar = this.d;
        int i = 0;
        int iHashCode = rddVar == null ? 0 : rddVar.hashCode();
        yau yauVar = this.c;
        int iHashCode2 = yauVar == null ? 0 : yauVar.hashCode();
        int i2 = iHashCode ^ 1000003;
        String str = this.a;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i3 = this.b;
        if (i3 != 0) {
            a.bw(i3);
            i = i3;
        }
        return iHashCode3 ^ i;
    }

    public final String toString() {
        yau yauVar = this.c;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(yauVar);
        int i = this.b;
        return "RingContent{scalableRingDrawableProvider=" + strValueOf + ", ringDrawableProvider=" + strValueOf2 + ", contentDescription=" + this.a + ", discAnimationType=" + (i != 0 ? Integer.toString(i - 1) : "null") + "}";
    }

    public qup(rdd rddVar, yau yauVar, String str, int i) {
        this.d = rddVar;
        this.c = yauVar;
        this.a = str;
        this.b = i;
    }
}
