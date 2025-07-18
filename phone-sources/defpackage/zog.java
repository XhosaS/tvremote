package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zog {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final zoh d;

    public zog(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, zoh zohVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = zohVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zog)) {
            return false;
        }
        zog zogVar = (zog) obj;
        return zogVar.c.equals(this.c) && zogVar.b.equals(this.b) && zogVar.a.equals(this.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
