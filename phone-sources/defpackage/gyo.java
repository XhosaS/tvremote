package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyo extends fki {
    public final gxu a;
    public final int b;
    private final String c;

    public gyo(gxu gxuVar, String str, int i) {
        super((short[]) null);
        this.a = gxuVar;
        this.c = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyo)) {
            return false;
        }
        gyo gyoVar = (gyo) obj;
        return yks.e(this.a, gyoVar.a) && yks.e(this.c, gyoVar.c) && this.b == gyoVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i = this.b;
        a.bw(i);
        return iHashCode2 + i;
    }
}
