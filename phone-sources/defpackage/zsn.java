package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zsn extends zsk {
    public final byte[] c;
    public final byte[] d;

    public zsn(zsl zslVar, byte[] bArr) {
        super(false, zslVar);
        byte[] bArrBh = vxr.bh(bArr, 0, 32);
        this.c = bArrBh;
        this.d = vxr.bh(bArr, bArrBh.length, bArr.length);
    }
}
