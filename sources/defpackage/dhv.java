package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhv extends dht {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;

    public dhv(dhu dhuVar, byte[] bArr) {
        super(true, dhuVar);
        dhs dhsVar = new dhs(dhuVar.e);
        this.c = dos.t(bArr, 0, dhsVar.b);
        int i = dhsVar.b;
        this.f = dos.t(bArr, i, (dhsVar.a + i) - 32);
        int i2 = i + (dhsVar.a - 32);
        int i3 = i2 + 32;
        this.g = dos.t(bArr, i2, i3);
        int i4 = i2 + 64;
        this.d = dos.t(bArr, i3, i4);
        this.e = dos.t(bArr, i4, i2 + 96);
    }
}
