package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dda extends czr {
    private BigInteger a;

    public dda(BigInteger bigInteger) {
        if (doe.a.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
        }
        this.a = bigInteger;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return new czo(this.a);
    }

    public final String toString() {
        return "CRLNumber: ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
