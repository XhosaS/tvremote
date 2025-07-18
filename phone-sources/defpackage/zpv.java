package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpv extends zix {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public zpw d;
    private final int e;

    public zpv(byte[] bArr, byte[] bArr2, byte[] bArr3, zpw zpwVar) {
        this.e = 0;
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = zpwVar;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(this.e));
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        ziiVar.b(new zkn(this.c));
        zpw zpwVar = this.d;
        if (zpwVar != null) {
            ziiVar.b(new zpw(zpwVar.a));
        }
        return new zkq(ziiVar);
    }

    public zpv(zjm zjmVar) {
        int iF = ziu.m(zjmVar.h(0)).f();
        this.e = iF;
        if (iF != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = vxr.bd(zjd.f(zjmVar.h(1)).b);
        this.b = vxr.bd(zjd.f(zjmVar.h(2)).b);
        this.c = vxr.bd(zjd.f(zjmVar.h(3)).b);
        if (zjmVar.b() == 5) {
            zih zihVarH = zjmVar.h(4);
            this.d = zihVarH instanceof zpw ? (zpw) zihVarH : zihVarH != null ? new zpw(zjm.j(zihVarH)) : null;
        }
    }
}
