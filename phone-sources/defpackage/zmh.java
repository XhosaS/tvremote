package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmh extends zix {
    private BigInteger a;

    public zmh(BigInteger bigInteger) {
        if (zxm.a.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
        }
        this.a = bigInteger;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return new ziu(this.a);
    }

    public final String toString() {
        return "CRLNumber: ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
