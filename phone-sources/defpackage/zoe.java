package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zoe {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public zoe(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        if (i > bigInteger.bitLength() && !zxp.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zoe)) {
            return false;
        }
        zoe zoeVar = (zoe) obj;
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(zoeVar.c)) {
                return false;
            }
        } else if (zoeVar.c != null) {
            return false;
        }
        return zoeVar.b.equals(this.b) && zoeVar.a.equals(this.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return iHashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
