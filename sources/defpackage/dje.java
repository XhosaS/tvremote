package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dje extends djb {
    public final byte[] c;
    public final byte[] d;

    public dje(djc djcVar, byte[] bArr) {
        super(false, djcVar);
        byte[] bArrT = dos.t(bArr, 0, 32);
        this.c = bArrT;
        this.d = dos.t(bArr, bArrT.length, bArr.length);
    }
}
