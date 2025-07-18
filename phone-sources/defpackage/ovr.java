package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovr implements ovk {
    public final oum a;
    public final Context b;
    public String c;
    public ouc d;
    public String e;
    public out f;
    public ovl g;
    public final ouy h;
    private final yow i;
    private final tst j;
    private final tst k;
    private final yfo l;
    private net m;
    private nex n;

    public ovr(ouy ouyVar, yow yowVar, tst tstVar, tst tstVar2, oum oumVar, yfo yfoVar, Context context) {
        ouyVar.getClass();
        oumVar.getClass();
        yfoVar.getClass();
        this.h = ouyVar;
        this.i = yowVar;
        this.j = tstVar;
        this.k = tstVar2;
        this.a = oumVar;
        this.l = yfoVar;
        this.b = context;
        ouc oucVar = oud.a;
        this.d = oud.a;
    }

    @Override // defpackage.ovk
    public final void a(eao eaoVar) {
        ykr.q(this.i, null, 0, new kbl(this, eaoVar, (yih) null, 17), 3);
    }

    @Override // defpackage.ovk
    public final void b(enr enrVar, eao eaoVar) {
        ovm ovmVar = ovm.a;
        ewb ewbVarA = ovm.a(this.b, enrVar, this.n, this.m, this.k, this.j, this.l, null, null, null);
        ovl ovlVar = this.g;
        if (ovlVar != null) {
            ovlVar.I(ewbVarA, this.f, null);
        }
    }

    @Override // defpackage.ovk
    public final void c() {
        this.g = null;
        this.c = null;
        this.f = null;
    }

    @Override // defpackage.ovk
    public final void d(Context context, ovl ovlVar, nex nexVar, net netVar, ovf ovfVar, String str, String str2, out outVar, ouc oucVar, egc egcVar, byte[] bArr) {
        context.getClass();
        this.g = ovlVar;
        this.n = nexVar;
        this.m = netVar;
        this.c = str;
        this.f = outVar;
        this.e = str2;
        this.d = oucVar;
    }
}
