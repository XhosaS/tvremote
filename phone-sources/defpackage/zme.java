package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zme extends zix {
    zjd a;
    zmr b;
    ziu c;

    public zme(zmw zmwVar, zmr zmrVar, BigInteger bigInteger) {
        this.a = null;
        this.b = null;
        this.c = null;
        znv znvVar = new znv();
        byte[] bArr = new byte[20];
        byte[] bArrM = zmwVar.b.m();
        znvVar.e(bArrM, 0, bArrM.length);
        znvVar.a(bArr, 0);
        this.a = new zkn(bArr);
        this.b = zmrVar;
        this.c = bigInteger != null ? new ziu(bigInteger) : null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(3);
        zjd zjdVar = this.a;
        if (zjdVar != null) {
            ziiVar.b(new zks(false, 0, zjdVar));
        }
        zmr zmrVar = this.b;
        if (zmrVar != null) {
            ziiVar.b(new zks(false, 1, zmrVar));
        }
        ziu ziuVar = this.c;
        if (ziuVar != null) {
            ziiVar.b(new zks(false, 2, ziuVar));
        }
        return new zkq(ziiVar);
    }

    public final String toString() {
        zjd zjdVar = this.a;
        return a.cg(zjdVar != null ? zxx.a(zjdVar.b) : "null", "AuthorityKeyIdentifier: KeyID(", ")");
    }
}
