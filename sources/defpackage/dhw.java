package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhw extends dht {
    public final byte[] c;
    public final byte[] d;

    public dhw(dhu dhuVar, byte[] bArr) {
        super(false, dhuVar);
        int length = bArr.length;
        int i = length - 32;
        this.c = dos.t(bArr, 0, i);
        this.d = dos.t(bArr, i, length);
    }

    public dhw(dhu dhuVar, byte[] bArr, byte[] bArr2) {
        super(false, dhuVar);
        this.c = dos.p(bArr);
        this.d = dos.p(bArr2);
    }
}
