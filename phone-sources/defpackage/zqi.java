package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqi extends zix {
    public final int a;
    public final int b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    private final byte[] h;

    public zqi(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = 0;
        this.b = i;
        this.c = vxr.bd(bArr);
        this.d = vxr.bd(bArr2);
        this.e = vxr.bd(bArr3);
        this.f = vxr.bd(bArr4);
        this.h = vxr.bd(bArr5);
        this.g = -1;
    }

    public final byte[] a() {
        return vxr.bd(this.h);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        int i = this.g;
        if (i >= 0) {
            ziiVar.b(new ziu(1L));
        } else {
            ziiVar.b(new ziu(0L));
        }
        zii ziiVar2 = new zii();
        ziiVar2.b(new ziu(this.b));
        ziiVar2.b(new zkn(this.c));
        ziiVar2.b(new zkn(this.d));
        ziiVar2.b(new zkn(this.e));
        ziiVar2.b(new zkn(this.f));
        if (i >= 0) {
            ziiVar2.b(new zks(false, 0, new ziu(i)));
        }
        ziiVar.b(new zkq(ziiVar2));
        ziiVar.b(new zks(true, 0, new zkn(this.h)));
        return new zkq(ziiVar);
    }

    public zqi(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.a = 1;
        this.b = i;
        this.c = vxr.bd(bArr);
        this.d = vxr.bd(bArr2);
        this.e = vxr.bd(bArr3);
        this.f = vxr.bd(bArr4);
        this.h = vxr.bd(bArr5);
        this.g = i2;
    }

    public zqi(zjm zjmVar) {
        ziu ziuVarM = ziu.m(zjmVar.h(0));
        if (!ziuVarM.o(0) && !ziuVarM.o(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = ziuVarM.f();
        if (zjmVar.b() != 2 && zjmVar.b() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        zjm zjmVarJ = zjm.j(zjmVar.h(1));
        this.b = ziu.m(zjmVarJ.h(0)).f();
        this.c = vxr.bd(zkn.f(zjmVarJ.h(1)).b);
        this.d = vxr.bd(zkn.f(zjmVarJ.h(2)).b);
        this.e = vxr.bd(zkn.f(zjmVarJ.h(3)).b);
        this.f = vxr.bd(zkn.f(zjmVarJ.h(4)).b);
        if (zjmVarJ.b() == 6) {
            zjr zjrVarM = zjr.m(zjmVarJ.h(5));
            if (zjrVarM.c == 0) {
                this.g = ziu.n(zjrVarM, false).f();
            } else {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
        } else if (zjmVarJ.b() == 5) {
            this.g = -1;
        } else {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        }
        if (zjmVar.b() == 3) {
            this.h = vxr.bd(zkn.g(zjr.m(zjmVar.h(2)), true).b);
        } else {
            this.h = null;
        }
    }
}
