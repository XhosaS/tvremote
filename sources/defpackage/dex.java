package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dex {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final dey d;

    public dex(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, dey deyVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = deyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dex)) {
            return false;
        }
        dex dexVar = (dex) obj;
        return dexVar.c.equals(this.c) && dexVar.b.equals(this.b) && dexVar.a.equals(this.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
