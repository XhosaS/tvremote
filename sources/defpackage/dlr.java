package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlr {
    public final dlt a;
    public final dln b;
    public byte[] c;
    private byte[] d;

    public dlr(dlt dltVar) {
        this.a = dltVar;
        int i = dltVar.a;
        this.b = new dln(dltVar.c, i);
        this.d = new byte[i];
        this.c = new byte[i];
    }

    private final byte[] d(byte[] bArr, int i, dlq dlqVar) {
        int length = bArr.length;
        int i2 = this.a.a;
        if (length != i2) {
            throw new IllegalArgumentException(b.h(i2, "startHash needs to be ", "bytes"));
        }
        dlqVar.a();
        if (i > 15) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return bArr;
        }
        int i3 = i - 1;
        byte[] bArrD = d(bArr, i3, dlqVar);
        dlp dlpVar = new dlp();
        dlpVar.e = dlqVar.d;
        dlpVar.f = dlqVar.e;
        dlpVar.a = dlqVar.a;
        dlpVar.b = dlqVar.b;
        dlpVar.c = i3;
        dlpVar.g = 0;
        dlq dlqVar2 = new dlq(dlpVar);
        dln dlnVar = this.b;
        byte[] bArrA = dlnVar.a(this.c, dlqVar2.a());
        dlp dlpVar2 = new dlp();
        dlpVar2.e = dlqVar2.d;
        dlpVar2.f = dlqVar2.e;
        dlpVar2.a = dlqVar2.a;
        dlpVar2.b = dlqVar2.b;
        dlpVar2.c = dlqVar2.c;
        dlpVar2.g = 1;
        byte[] bArrA2 = dlnVar.a(this.c, new dlq(dlpVar2).a());
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (bArrD[i4] ^ bArrA2[i4]);
        }
        int length2 = bArrA.length;
        int i5 = dlnVar.a;
        if (length2 != i5) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 == i5) {
            return dlnVar.b(0, bArrA, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    final void a(byte[] bArr, byte[] bArr2) {
        dlt dltVar = this.a;
        int length = bArr.length;
        int i = dltVar.a;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2.length != i) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.d = bArr;
        this.c = bArr2;
    }

    protected final byte[] b(byte[] bArr, dlq dlqVar) {
        dlp dlpVar = new dlp();
        dlpVar.e = dlqVar.d;
        dlpVar.f = dlqVar.e;
        dlpVar.a = dlqVar.a;
        return this.b.a(bArr, new dlq(dlpVar).a());
    }

    final att c(dlq dlqVar) {
        dlt dltVar = this.a;
        int i = dltVar.b;
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            dlp dlpVar = new dlp();
            dlpVar.e = dlqVar.d;
            dlpVar.f = dlqVar.e;
            dlpVar.a = dlqVar.a;
            dlpVar.b = i2;
            dlpVar.c = dlqVar.c;
            dlpVar.g = dlqVar.f;
            dlqVar = new dlq(dlpVar);
            if (i2 >= i) {
                throw new IllegalArgumentException("index out of bounds");
            }
            bArr[i2] = d(this.b.a(this.d, dnx.o(i2, 32)), 15, dlqVar);
        }
        return new att(dltVar, bArr);
    }
}
