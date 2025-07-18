package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zre extends zrc {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;

    public zre(zrd zrdVar, byte[] bArr) {
        super(true, zrdVar);
        zrb zrbVar = new zrb(zrdVar.e);
        this.c = vxr.bh(bArr, 0, zrbVar.b);
        int i = zrbVar.b;
        this.f = vxr.bh(bArr, i, (zrbVar.a + i) - 32);
        int i2 = i + (zrbVar.a - 32);
        int i3 = i2 + 32;
        this.g = vxr.bh(bArr, i2, i3);
        int i4 = i2 + 64;
        this.d = vxr.bh(bArr, i3, i4);
        this.e = vxr.bh(bArr, i4, i2 + 96);
    }
}
