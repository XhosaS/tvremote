package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpy extends zix {
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;
    public zmd e;
    private byte[] f;

    public zpy(int i, int i2, zxf zxfVar, zxj zxjVar, zxi zxiVar, zmd zmdVar) {
        this.a = i;
        this.b = i2;
        int i3 = zxfVar.b;
        int i4 = 1;
        this.f = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >> 24)};
        int i5 = 8;
        while (zxjVar.a.a > i5) {
            i5 += 8;
            i4++;
        }
        byte[] bArr = new byte[zxjVar.c.length * i4];
        int i6 = 0;
        for (int i7 = 0; i7 < zxjVar.c.length; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                bArr[i6] = (byte) (zxjVar.c[i7] >>> i8);
                i8 += 8;
                i6++;
            }
        }
        this.c = bArr;
        int length = zxiVar.a.length;
        int iA = zxg.a(length - 1);
        byte[] bArr2 = new byte[(length * iA) + 4];
        vxr.bn(length, bArr2, 0);
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = zxiVar.a[i9];
            int i11 = (i9 * iA) + 4;
            for (int i12 = iA - 1; i12 >= 0; i12--) {
                bArr2[i11 + i12] = (byte) (i10 >>> (i12 * 8));
            }
        }
        this.d = bArr2;
        this.e = zmdVar;
    }

    public final zxf a() {
        return new zxf(this.f);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(this.a));
        ziiVar.b(new ziu(this.b));
        ziiVar.b(new zkn(this.f));
        ziiVar.b(new zkn(this.c));
        ziiVar.b(new zkn(this.d));
        ziiVar.b(this.e);
        return new zkq(ziiVar);
    }

    public zpy(zjm zjmVar) {
        this.a = ((ziu) zjmVar.h(0)).f();
        this.b = ((ziu) zjmVar.h(1)).f();
        this.f = ((zjd) zjmVar.h(2)).b;
        this.c = ((zjd) zjmVar.h(3)).b;
        this.d = ((zjd) zjmVar.h(4)).b;
        this.e = zmd.a(zjmVar.h(5));
    }
}
