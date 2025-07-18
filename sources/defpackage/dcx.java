package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcx extends czr {
    czx a;
    ddk b;
    czo c;

    public dcx(ddp ddpVar, ddk ddkVar, BigInteger bigInteger) {
        this.a = null;
        this.b = null;
        this.c = null;
        den denVar = new den();
        byte[] bArr = new byte[20];
        byte[] bArrM = ddpVar.b.m();
        denVar.e(bArrM, 0, bArrM.length);
        denVar.a(bArr, 0);
        this.a = new dbh(bArr);
        this.b = ddkVar;
        this.c = bigInteger != null ? new czo(bigInteger) : null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(3);
        czx czxVar = this.a;
        if (czxVar != null) {
            czcVar.b(new dbm(false, 0, czxVar));
        }
        ddk ddkVar = this.b;
        if (ddkVar != null) {
            czcVar.b(new dbm(false, 1, ddkVar));
        }
        czo czoVar = this.c;
        if (czoVar != null) {
            czcVar.b(new dbm(false, 2, czoVar));
        }
        return new dbk(czcVar);
    }

    public final String toString() {
        czx czxVar = this.a;
        return b.c(czxVar != null ? dop.a(czxVar.b) : "null", "AuthorityKeyIdentifier: KeyID(", ")");
    }
}
