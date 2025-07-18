package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zva {
    public final zvc a;
    public final zuw b;
    public byte[] c;
    private byte[] d;

    public zva(zvc zvcVar) {
        this.a = zvcVar;
        int i = zvcVar.a;
        this.b = new zuw(zvcVar.c, i);
        this.d = new byte[i];
        this.c = new byte[i];
    }

    private final byte[] d(byte[] bArr, int i, zuz zuzVar) {
        int length = bArr.length;
        int i2 = this.a.a;
        if (length != i2) {
            throw new IllegalArgumentException(a.cd(i2, "startHash needs to be ", "bytes"));
        }
        zuzVar.a();
        if (i > 15) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return bArr;
        }
        int i3 = i - 1;
        byte[] bArrD = d(bArr, i3, zuzVar);
        zuy zuyVar = new zuy();
        zuyVar.e = zuzVar.d;
        zuyVar.f = zuzVar.e;
        zuyVar.a = zuzVar.a;
        zuyVar.b = zuzVar.b;
        zuyVar.c = i3;
        zuyVar.g = 0;
        zuz zuzVar2 = new zuz(zuyVar);
        zuw zuwVar = this.b;
        byte[] bArrA = zuwVar.a(this.c, zuzVar2.a());
        zuy zuyVar2 = new zuy();
        zuyVar2.e = zuzVar2.d;
        zuyVar2.f = zuzVar2.e;
        zuyVar2.a = zuzVar2.a;
        zuyVar2.b = zuzVar2.b;
        zuyVar2.c = zuzVar2.c;
        zuyVar2.g = 1;
        byte[] bArrA2 = zuwVar.a(this.c, new zuz(zuyVar2).a());
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (bArrD[i4] ^ bArrA2[i4]);
        }
        int length2 = bArrA.length;
        int i5 = zuwVar.a;
        if (length2 != i5) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 == i5) {
            return zuwVar.b(0, bArrA, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    final void a(byte[] bArr, byte[] bArr2) {
        zvc zvcVar = this.a;
        int length = bArr.length;
        int i = zvcVar.a;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2.length != i) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.d = bArr;
        this.c = bArr2;
    }

    protected final byte[] b(byte[] bArr, zuz zuzVar) {
        zuy zuyVar = new zuy();
        zuyVar.e = zuzVar.d;
        zuyVar.f = zuzVar.e;
        zuyVar.a = zuzVar.a;
        return this.b.a(bArr, new zuz(zuyVar).a());
    }

    final zyt c(zuz zuzVar) {
        zvc zvcVar = this.a;
        int i = zvcVar.b;
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            zuy zuyVar = new zuy();
            zuyVar.e = zuzVar.d;
            zuyVar.f = zuzVar.e;
            zuyVar.a = zuzVar.a;
            zuyVar.b = i2;
            zuyVar.c = zuzVar.c;
            zuyVar.g = zuzVar.f;
            zuzVar = new zuz(zuyVar);
            if (i2 >= i) {
                throw new IllegalArgumentException("index out of bounds");
            }
            bArr[i2] = d(this.b.a(this.d, vxr.bC(i2, 32)), 15, zuzVar);
        }
        return new zyt(zvcVar, bArr);
    }
}
