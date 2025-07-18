package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovx implements ovk {
    public final oum a;
    public final Context b;
    public ovl c;
    public ovf d;
    public String e;
    public String f;
    public out g;
    public ouc h;
    public final ouy i;
    private final yow j;
    private final tst k;
    private final tst l;
    private final yfo m;
    private nex n;
    private net o;
    private egc p;
    private byte[] q;

    public ovx(ouy ouyVar, yow yowVar, tst tstVar, tst tstVar2, oum oumVar, yfo yfoVar, Context context) {
        ouyVar.getClass();
        oumVar.getClass();
        yfoVar.getClass();
        this.i = ouyVar;
        this.j = yowVar;
        this.k = tstVar;
        this.l = tstVar2;
        this.a = oumVar;
        this.m = yfoVar;
        this.b = context;
        ouc oucVar = oud.a;
        this.h = oud.a;
    }

    @Override // defpackage.ovk
    public final void a(eao eaoVar) {
        if (this.e == null) {
            throw new IllegalStateException("Missing necessary attribute: accountName");
        }
        ykr.q(this.j, null, 0, new kbl(this, eaoVar, (yih) null, 18), 3);
    }

    @Override // defpackage.ovk
    public final void b(enr enrVar, eao eaoVar) {
        out outVar = this.g;
        if (outVar != null) {
            ouy ouyVar = this.i;
            yfo yfoVar = this.m;
            ovi oviVar = new ovi(outVar.c, ouyVar, yfoVar);
            ove oveVar = new ove(new jeb(oviVar, this, 2), oviVar);
            ovm ovmVar = ovm.a;
            ewb ewbVarA = ovm.a(this.b, enrVar, this.n, this.o, this.l, this.k, yfoVar, oveVar, this.p, this.q);
            if (eaoVar != null) {
                eaoVar.S(oveVar);
            }
            ovl ovlVar = this.c;
            if (ovlVar != null) {
                ovlVar.I(ewbVarA, this.g, oviVar);
            }
        }
    }

    @Override // defpackage.ovk
    public final void c() {
        this.c = null;
        this.e = null;
        this.g = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.ovk
    public final void d(Context context, ovl ovlVar, nex nexVar, net netVar, ovf ovfVar, String str, String str2, out outVar, ouc oucVar, egc egcVar, byte[] bArr) {
        context.getClass();
        this.c = ovlVar;
        this.n = nexVar;
        this.o = netVar;
        this.d = ovfVar;
        this.e = str;
        this.f = str2;
        this.g = outVar;
        this.h = oucVar;
        this.p = egcVar;
        this.q = bArr;
    }
}
