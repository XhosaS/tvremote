package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgp extends czr {
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;
    public dcw e;
    private byte[] f;

    public dgp(int i, int i2, dnw dnwVar, dob dobVar, doa doaVar, dcw dcwVar) {
        this.a = i;
        this.b = i2;
        int i3 = dnwVar.b;
        int i4 = 1;
        this.f = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >> 24)};
        int i5 = 8;
        while (dobVar.a.a > i5) {
            i5 += 8;
            i4++;
        }
        byte[] bArr = new byte[dobVar.c.length * i4];
        int i6 = 0;
        for (int i7 = 0; i7 < dobVar.c.length; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                bArr[i6] = (byte) (dobVar.c[i7] >>> i8);
                i8 += 8;
                i6++;
            }
        }
        this.c = bArr;
        int length = doaVar.a.length;
        int iA = dny.a(length - 1);
        byte[] bArr2 = new byte[(length * iA) + 4];
        dos.z(length, bArr2, 0);
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = doaVar.a[i9];
            int i11 = (i9 * iA) + 4;
            for (int i12 = iA - 1; i12 >= 0; i12--) {
                bArr2[i11 + i12] = (byte) (i10 >>> (i12 * 8));
            }
        }
        this.d = bArr2;
        this.e = dcwVar;
    }

    public final dnw a() {
        return new dnw(this.f);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc();
        czcVar.b(new czo(this.a));
        czcVar.b(new czo(this.b));
        czcVar.b(new dbh(this.f));
        czcVar.b(new dbh(this.c));
        czcVar.b(new dbh(this.d));
        czcVar.b(this.e);
        return new dbk(czcVar);
    }

    public dgp(dag dagVar) {
        this.a = ((czo) dagVar.h(0)).f();
        this.b = ((czo) dagVar.h(1)).f();
        this.f = ((czx) dagVar.h(2)).b;
        this.c = ((czx) dagVar.h(3)).b;
        this.d = ((czx) dagVar.h(4)).b;
        this.e = dcw.a(dagVar.h(5));
    }
}
