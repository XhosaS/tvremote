package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diq extends dio {
    private static dip c;
    private static dip[] d;
    public dir b;
    private final byte[] e;
    private final diu f;
    private final dim g;
    private final int h;
    private final byte[] i;
    private final Map j;
    private final int k;
    private final deh l;
    private final int m;

    static {
        dip dipVar = new dip(1);
        c = dipVar;
        dip[] dipVarArr = new dip[129];
        d = dipVarArr;
        dipVarArr[1] = dipVar;
        int i = 2;
        while (true) {
            dip[] dipVarArr2 = d;
            int length = dipVarArr2.length;
            if (i >= 129) {
                return;
            }
            dipVarArr2[i] = new dip(i);
            i++;
        }
    }

    public diq(diu diuVar, dim dimVar, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f = diuVar;
        this.g = dimVar;
        this.m = i;
        this.e = dos.p(bArr);
        this.h = i2;
        this.i = dos.p(bArr2);
        this.k = 1 << (diuVar.w + 1);
        this.j = new WeakHashMap();
        this.l = dnx.L(diuVar.x, diuVar.v);
    }

    public static diq a(Object obj) {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof diq) {
            return (diq) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return a(dos.a((InputStream) obj));
                }
                throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
            }
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
            }
            try {
                diq diqVarA = a(dataInputStream);
                dataInputStream.close();
                return diqVarA;
            } catch (Throwable th3) {
                th = th3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        }
        DataInputStream dataInputStream2 = (DataInputStream) obj;
        if (dataInputStream2.readInt() != 0) {
            throw new IllegalStateException("expected version 0 lms private key");
        }
        diu diuVarA = diu.a(dataInputStream2.readInt());
        dim dimVarA = dim.a(dataInputStream2.readInt());
        byte[] bArr = new byte[16];
        dataInputStream2.readFully(bArr);
        int i = dataInputStream2.readInt();
        int i2 = dataInputStream2.readInt();
        int i3 = dataInputStream2.readInt();
        if (i3 < 0) {
            throw new IllegalStateException("secret length less than zero");
        }
        if (i3 <= dataInputStream2.available()) {
            byte[] bArr2 = new byte[i3];
            dataInputStream2.readFully(bArr2);
            return new diq(diuVarA, dimVarA, i, bArr, i2, bArr2);
        }
        throw new IOException("secret length exceeded " + dataInputStream2.available());
    }

    private final byte[] e(int i) {
        int i2 = 1 << this.f.w;
        if (i < i2) {
            int i3 = i + i;
            byte[] bArrC = c(i3);
            byte[] bArrC2 = c(i3 + 1);
            byte[] bArrD = d();
            deh dehVar = this.l;
            dnx.I(bArrD, dehVar);
            dnx.K(i, dehVar);
            dnx.J((short) -31869, dehVar);
            dnx.I(bArrC, dehVar);
            dnx.I(bArrC2, dehVar);
            byte[] bArr = new byte[dehVar.b()];
            dehVar.a(bArr, 0);
            return bArr;
        }
        byte[] bArrD2 = d();
        deh dehVar2 = this.l;
        dnx.I(bArrD2, dehVar2);
        dnx.K(i, dehVar2);
        dnx.J((short) -32126, dehVar2);
        dim dimVar = this.g;
        byte[] bArrD3 = d();
        byte[] bArrP = dos.p(this.i);
        deh dehVarM = dnx.M(dimVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dnx.O(bArrD3, byteArrayOutputStream);
        int i4 = i - i2;
        dnx.Q(i4, byteArrayOutputStream);
        byteArrayOutputStream.write(-128);
        byteArrayOutputStream.write(-128);
        dnx.P(22, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        dehVarM.e(byteArray, 0, byteArray.length);
        deh dehVarM2 = dnx.M(dimVar);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        dnx.O(bArrD3, byteArrayOutputStream2);
        dnx.Q(i4, byteArrayOutputStream2);
        dnx.P(dehVarM2.b() + 23, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        deh dehVarM3 = dnx.M(dimVar);
        int i5 = 1 << dimVar.s;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = dimVar.t;
            if (i6 >= i8) {
                byte[] bArr2 = new byte[dehVarM.b()];
                dehVarM.a(bArr2, 0);
                dnx.I(bArr2, dehVar2);
                byte[] bArr3 = new byte[dehVar2.b()];
                dehVar2.a(bArr3, 0);
                return bArr3;
            }
            int i9 = i8 - 1;
            if (byteArray2.length - 23 < dehVarM3.b()) {
                throw new IllegalArgumentException("target length is less than digest size.");
            }
            dehVarM3.e(bArrD3, 0, bArrD3.length);
            dehVarM3.d((byte) (i4 >> 24));
            dehVarM3.d((byte) (i4 >>> 16));
            dehVarM3.d((byte) (i4 >>> 8));
            dehVarM3.d((byte) i4);
            dehVarM3.d((byte) (i7 >>> 8));
            dehVarM3.d((byte) i7);
            dehVarM3.d((byte) -1);
            dehVarM3.e(bArrP, 0, bArrP.length);
            dehVarM3.a(byteArray2, 23);
            if (i6 < i9) {
                i7++;
            }
            short s = (short) i6;
            byteArray2[20] = (byte) (s >>> 8);
            byteArray2[21] = (byte) s;
            for (int i10 = 0; i10 < i5 - 1; i10++) {
                byteArray2[22] = (byte) i10;
                dehVarM2.e(byteArray2, 0, byteArray2.length);
                dehVarM2.a(byteArray2, 23);
            }
            dehVarM.e(byteArray2, 23, dimVar.r);
            i6++;
        }
    }

    private final byte[] f(dip dipVar) {
        Map map = this.j;
        synchronized (map) {
            byte[] bArr = (byte[]) map.get(dipVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] bArrE = e(dipVar.a);
            map.put(dipVar, bArrE);
            return bArrE;
        }
    }

    public final dir b() {
        dir dirVar;
        synchronized (this) {
            if (this.b == null) {
                this.b = new dir(this.f, this.g, f(c), this.e);
            }
            dirVar = this.b;
        }
        return dirVar;
    }

    final byte[] c(int i) {
        if (i >= this.k) {
            return e(i);
        }
        dip[] dipVarArr = d;
        int length = dipVarArr.length;
        return f(i < 129 ? dipVarArr[i] : new dip(i));
    }

    public final byte[] d() {
        return dos.p(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        diq diqVar = (diq) obj;
        if (this.m != diqVar.m || this.h != diqVar.h || !Arrays.equals(this.e, diqVar.e)) {
            return false;
        }
        diu diuVar = this.f;
        if (diuVar == null ? diqVar.f != null : !diuVar.equals(diqVar.f)) {
            return false;
        }
        dim dimVar = this.g;
        if (dimVar == null ? diqVar.g == null : dimVar.equals(diqVar.g)) {
            return Arrays.equals(this.i, diqVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iM = (this.m * 31) + dos.m(this.e);
        diu diuVar = this.f;
        int iHashCode = ((iM * 31) + (diuVar != null ? diuVar.hashCode() : 0)) * 31;
        dim dimVar = this.g;
        return ((((iHashCode + (dimVar != null ? dimVar.hashCode() : 0)) * 31) + this.h) * 31) + dos.m(this.i);
    }

    @Override // defpackage.dio, defpackage.dof
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dnx.Q(0, byteArrayOutputStream);
        dnx.Q(this.f.u, byteArrayOutputStream);
        dnx.Q(this.g.q, byteArrayOutputStream);
        dnx.O(this.e, byteArrayOutputStream);
        dnx.Q(this.m, byteArrayOutputStream);
        dnx.Q(this.h, byteArrayOutputStream);
        byte[] bArr = this.i;
        dnx.Q(bArr.length, byteArrayOutputStream);
        dnx.O(bArr, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
