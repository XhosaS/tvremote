package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zrf extends zrc {
    public final byte[] c;
    public final byte[] d;

    public zrf(zrd zrdVar, byte[] bArr) {
        super(false, zrdVar);
        int length = bArr.length;
        int i = length - 32;
        this.c = vxr.bh(bArr, 0, i);
        this.d = vxr.bh(bArr, i, length);
    }

    public zrf(zrd zrdVar, byte[] bArr, byte[] bArr2) {
        super(false, zrdVar);
        this.c = vxr.bd(bArr);
        this.d = vxr.bd(bArr2);
    }
}
