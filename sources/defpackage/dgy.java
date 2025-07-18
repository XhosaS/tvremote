package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgy extends czr {
    private final byte[] a;
    private final byte[] b;

    public dgy(byte[] bArr, byte[] bArr2) {
        this.a = dos.p(bArr);
        this.b = dos.p(bArr2);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(0L));
        czcVar.b(new dbh(this.a));
        czcVar.b(new dbh(this.b));
        return new dbk(czcVar);
    }
}
