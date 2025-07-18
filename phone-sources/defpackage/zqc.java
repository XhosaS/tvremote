package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqc extends zix {
    public byte[] a;
    public byte[] b;
    public zqd c;
    private final int d;

    public zqc(zjm zjmVar) {
        int iF = ziu.m(zjmVar.h(0)).f();
        this.d = iF;
        if (iF != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = vxr.bd(zjd.f(zjmVar.h(1)).b);
        this.b = vxr.bd(zjd.f(zjmVar.h(2)).b);
        if (zjmVar.b() == 4) {
            zih zihVarH = zjmVar.h(3);
            this.c = zihVarH instanceof zqd ? (zqd) zihVarH : zihVarH != null ? new zqd(zjm.j(zihVarH)) : null;
        }
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(this.d));
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        zqd zqdVar = this.c;
        if (zqdVar != null) {
            ziiVar.b(new zqd(zqdVar.b(), this.c.a()));
        }
        return new zkq(ziiVar);
    }
}
