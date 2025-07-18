package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpt extends zix {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    private final int f;
    private zpu g;

    public zpt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, zpu zpuVar) {
        this.f = 0;
        this.a = vxr.bd(bArr);
        this.b = vxr.bd(bArr2);
        this.c = vxr.bd(bArr3);
        this.d = vxr.bd(bArr4);
        this.e = vxr.bd(bArr5);
        this.g = zpuVar;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(this.f));
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        ziiVar.b(new zkn(this.c));
        ziiVar.b(new zkn(this.d));
        ziiVar.b(new zkn(this.e));
        zpu zpuVar = this.g;
        if (zpuVar != null) {
            ziiVar.b(new zpu(zpuVar.b()));
        }
        return new zkq(ziiVar);
    }

    public zpt(zjm zjmVar) {
        int iF = ziu.m(zjmVar.h(0)).f();
        this.f = iF;
        if (iF == 0) {
            this.a = vxr.bd(zjd.f(zjmVar.h(1)).b);
            this.b = vxr.bd(zjd.f(zjmVar.h(2)).b);
            this.c = vxr.bd(zjd.f(zjmVar.h(3)).b);
            this.d = vxr.bd(zjd.f(zjmVar.h(4)).b);
            this.e = vxr.bd(zjd.f(zjmVar.h(5)).b);
            if (zjmVar.b() == 7) {
                this.g = zpu.a(zjmVar.h(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }
}
