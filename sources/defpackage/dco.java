package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dco extends czr {
    private final dai a;

    public dco(dai daiVar) {
        this.a = daiVar;
    }

    public final int a() {
        return this.a.b();
    }

    public final dcn b() {
        dai daiVar = this.a;
        if (daiVar.b() == 0) {
            return null;
        }
        return dcn.a(daiVar.f(0));
    }

    public final boolean c() {
        return this.a.b() > 1;
    }

    public final dcn[] d() {
        dai daiVar = this.a;
        int iB = daiVar.b();
        dcn[] dcnVarArr = new dcn[iB];
        for (int i = 0; i != iB; i++) {
            dcnVarArr[i] = dcn.a(daiVar.f(i));
        }
        return dcnVarArr;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }

    public dco(czv czvVar, czb czbVar) {
        this.a = new dbl(new dcn(czvVar, czbVar));
    }

    public dco(dcn[] dcnVarArr) {
        this.a = new dbl(dcnVarArr);
    }
}
