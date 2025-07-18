package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddp extends czr {
    public dcw a;
    public cyw b;

    public ddp(dag dagVar) {
        if (dagVar.b() == 2) {
            Enumeration enumerationF = dagVar.f();
            this.a = dcw.a(enumerationF.nextElement());
            this.b = cyw.i(enumerationF.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + dagVar.b());
        }
    }

    public static ddp b(Object obj) {
        if (obj instanceof ddp) {
            return (ddp) obj;
        }
        if (obj != null) {
            return new ddp(dag.j(obj));
        }
        return null;
    }

    public final dab a() {
        return dab.v(this.b.n());
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(2);
        czcVar.b(this.a);
        czcVar.b(this.b);
        return new dbk(czcVar);
    }

    public ddp(dcw dcwVar, czb czbVar) {
        this.b = new dbd(czbVar);
        this.a = dcwVar;
    }

    public ddp(dcw dcwVar, byte[] bArr) {
        this.b = new dbd(bArr);
        this.a = dcwVar;
    }
}
