package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dev {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public dev(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        if (i > bigInteger.bitLength() && !doh.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dev)) {
            return false;
        }
        dev devVar = (dev) obj;
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(devVar.c)) {
                return false;
            }
        } else if (devVar.c != null) {
            return false;
        }
        return devVar.b.equals(this.b) && devVar.a.equals(this.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return iHashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
