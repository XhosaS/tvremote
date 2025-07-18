package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcj extends czr {
    public dcw a;
    public dai b;
    public cyw c;
    private czo d;
    private czx e;

    private dcj(dag dagVar) {
        Enumeration enumerationF = dagVar.f();
        czo czoVarM = czo.m(enumerationF.nextElement());
        this.d = czoVarM;
        int iF = czoVarM.f();
        if (iF < 0 || iF > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        this.a = dcw.a(enumerationF.nextElement());
        this.e = czx.f(enumerationF.nextElement());
        int i = -1;
        while (enumerationF.hasMoreElements()) {
            dal dalVar = (dal) enumerationF.nextElement();
            int i2 = dalVar.c;
            if (i2 <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (i2 == 0) {
                this.b = dai.h(dalVar);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iF <= 0) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.c = cyw.o(dalVar);
            }
            i = i2;
        }
    }

    public static dcj b(Object obj) {
        if (obj instanceof dcj) {
            return (dcj) obj;
        }
        if (obj != null) {
            return new dcj(dag.j(obj));
        }
        return null;
    }

    public final czb a() {
        return dab.v(this.e.b);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(5);
        czcVar.b(this.d);
        czcVar.b(this.a);
        czcVar.b(this.e);
        dai daiVar = this.b;
        if (daiVar != null) {
            czcVar.b(new dbm(false, 0, daiVar));
        }
        cyw cywVar = this.c;
        if (cywVar != null) {
            czcVar.b(new dbm(false, 1, cywVar));
        }
        return new dbk(czcVar);
    }

    public dcj(dcw dcwVar, czb czbVar) {
        this(dcwVar, czbVar, null, null);
    }

    public dcj(dcw dcwVar, czb czbVar, dai daiVar) {
        this(dcwVar, czbVar, daiVar, null);
    }

    public dcj(dcw dcwVar, czb czbVar, dai daiVar, byte[] bArr) {
        this.d = new czo(bArr != null ? doe.b : doe.a);
        this.a = dcwVar;
        this.e = new dbh(czbVar);
        this.b = daiVar;
        this.c = bArr == null ? null : new dbd(bArr);
    }
}
