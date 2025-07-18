package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhi extends dhg {
    public final byte[] c;

    public dhi(dhh dhhVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, dhhVar);
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = length + length2;
        int length3 = bArr3.length;
        int i2 = i + length3;
        int length4 = bArr4.length;
        int i3 = i2 + length4;
        int length5 = bArr5.length;
        byte[] bArr6 = new byte[i3 + length5];
        this.c = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, length);
        System.arraycopy(bArr2, 0, bArr6, length, length2);
        System.arraycopy(bArr3, 0, bArr6, i, length3);
        System.arraycopy(bArr4, 0, bArr6, i2, length4);
        System.arraycopy(bArr5, 0, bArr6, i3, length5);
    }

    public final byte[] a() {
        return dos.p(this.c);
    }
}
