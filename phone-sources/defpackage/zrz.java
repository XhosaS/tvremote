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
/* loaded from: classes3.dex */
public final class zrz extends zrx {
    private static zry c;
    private static zry[] d;
    public zsa b;
    private final byte[] e;
    private final zsd f;
    private final zrv g;
    private final int h;
    private final byte[] i;
    private final Map j;
    private final int k;
    private final znp l;
    private final int m;

    static {
        zry zryVar = new zry(1);
        c = zryVar;
        zry[] zryVarArr = new zry[129];
        d = zryVarArr;
        zryVarArr[1] = zryVar;
        int i = 2;
        while (true) {
            zry[] zryVarArr2 = d;
            int length = zryVarArr2.length;
            if (i >= 129) {
                return;
            }
            zryVarArr2[i] = new zry(i);
            i++;
        }
    }

    public zrz(zsd zsdVar, zrv zrvVar, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f = zsdVar;
        this.g = zrvVar;
        this.m = i;
        this.e = vxr.bd(bArr);
        this.h = i2;
        this.i = vxr.bd(bArr2);
        this.k = 1 << (zsdVar.w + 1);
        this.j = new WeakHashMap();
        this.l = wef.O(zsdVar.x, zsdVar.v);
    }

    public static zrz a(Object obj) {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof zrz) {
            return (zrz) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return a(vxr.aO((InputStream) obj));
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
                zrz zrzVarA = a(dataInputStream);
                dataInputStream.close();
                return zrzVarA;
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
        zsd zsdVarA = zsd.a(dataInputStream2.readInt());
        zrv zrvVarA = zrv.a(dataInputStream2.readInt());
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
            return new zrz(zsdVarA, zrvVarA, i, bArr, i2, bArr2);
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
            znp znpVar = this.l;
            wef.L(bArrD, znpVar);
            wef.N(i, znpVar);
            wef.M((short) -31869, znpVar);
            wef.L(bArrC, znpVar);
            wef.L(bArrC2, znpVar);
            byte[] bArr = new byte[znpVar.b()];
            znpVar.a(bArr, 0);
            return bArr;
        }
        byte[] bArrD2 = d();
        znp znpVar2 = this.l;
        wef.L(bArrD2, znpVar2);
        wef.N(i, znpVar2);
        wef.M((short) -32126, znpVar2);
        zrv zrvVar = this.g;
        byte[] bArrD3 = d();
        byte[] bArrBd = vxr.bd(this.i);
        znp znpVarP = wef.P(zrvVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wef.R(bArrD3, byteArrayOutputStream);
        int i4 = i - i2;
        wef.T(i4, byteArrayOutputStream);
        byteArrayOutputStream.write(-128);
        byteArrayOutputStream.write(-128);
        wef.S(22, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        znpVarP.e(byteArray, 0, byteArray.length);
        znp znpVarP2 = wef.P(zrvVar);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        wef.R(bArrD3, byteArrayOutputStream2);
        wef.T(i4, byteArrayOutputStream2);
        wef.S(znpVarP2.b() + 23, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        znp znpVarP3 = wef.P(zrvVar);
        int i5 = 1 << zrvVar.s;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = zrvVar.t;
            if (i6 >= i8) {
                byte[] bArr2 = new byte[znpVarP.b()];
                znpVarP.a(bArr2, 0);
                wef.L(bArr2, znpVar2);
                byte[] bArr3 = new byte[znpVar2.b()];
                znpVar2.a(bArr3, 0);
                return bArr3;
            }
            int i9 = i8 - 1;
            if (byteArray2.length - 23 < znpVarP3.b()) {
                throw new IllegalArgumentException("target length is less than digest size.");
            }
            znpVarP3.e(bArrD3, 0, bArrD3.length);
            znpVarP3.d((byte) (i4 >> 24));
            znpVarP3.d((byte) (i4 >>> 16));
            znpVarP3.d((byte) (i4 >>> 8));
            znpVarP3.d((byte) i4);
            znpVarP3.d((byte) (i7 >>> 8));
            znpVarP3.d((byte) i7);
            znpVarP3.d((byte) -1);
            znpVarP3.e(bArrBd, 0, bArrBd.length);
            znpVarP3.a(byteArray2, 23);
            if (i6 < i9) {
                i7++;
            }
            short s = (short) i6;
            byteArray2[20] = (byte) (s >>> 8);
            byteArray2[21] = (byte) s;
            for (int i10 = 0; i10 < i5 - 1; i10++) {
                byteArray2[22] = (byte) i10;
                znpVarP2.e(byteArray2, 0, byteArray2.length);
                znpVarP2.a(byteArray2, 23);
            }
            znpVarP.e(byteArray2, 23, zrvVar.r);
            i6++;
        }
    }

    private final byte[] f(zry zryVar) {
        Map map = this.j;
        synchronized (map) {
            byte[] bArr = (byte[]) map.get(zryVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] bArrE = e(zryVar.a);
            map.put(zryVar, bArrE);
            return bArrE;
        }
    }

    public final zsa b() {
        zsa zsaVar;
        synchronized (this) {
            if (this.b == null) {
                this.b = new zsa(this.f, this.g, f(c), this.e);
            }
            zsaVar = this.b;
        }
        return zsaVar;
    }

    final byte[] c(int i) {
        if (i >= this.k) {
            return e(i);
        }
        zry[] zryVarArr = d;
        int length = zryVarArr.length;
        return f(i < 129 ? zryVarArr[i] : new zry(i));
    }

    public final byte[] d() {
        return vxr.bd(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zrz zrzVar = (zrz) obj;
        if (this.m != zrzVar.m || this.h != zrzVar.h || !Arrays.equals(this.e, zrzVar.e)) {
            return false;
        }
        zsd zsdVar = this.f;
        if (zsdVar == null ? zrzVar.f != null : !zsdVar.equals(zrzVar.f)) {
            return false;
        }
        zrv zrvVar = this.g;
        if (zrvVar == null ? zrzVar.g == null : zrvVar.equals(zrzVar.g)) {
            return Arrays.equals(this.i, zrzVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iBa = (this.m * 31) + vxr.ba(this.e);
        zsd zsdVar = this.f;
        int iHashCode = ((iBa * 31) + (zsdVar != null ? zsdVar.hashCode() : 0)) * 31;
        zrv zrvVar = this.g;
        return ((((iHashCode + (zrvVar != null ? zrvVar.hashCode() : 0)) * 31) + this.h) * 31) + vxr.ba(this.i);
    }

    @Override // defpackage.zrx, defpackage.zxn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wef.T(0, byteArrayOutputStream);
        wef.T(this.f.u, byteArrayOutputStream);
        wef.T(this.g.q, byteArrayOutputStream);
        wef.R(this.e, byteArrayOutputStream);
        wef.T(this.m, byteArrayOutputStream);
        wef.T(this.h, byteArrayOutputStream);
        byte[] bArr = this.i;
        wef.T(bArr.length, byteArrayOutputStream);
        wef.R(bArr, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
