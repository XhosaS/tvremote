package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zik extends zjh {
    static final zjs c = new zij(zik.class);
    private static final zik[] d = new zik[12];
    public final byte[] a;
    public final int b;

    public zik(int i) {
        this.a = BigInteger.valueOf(i).toByteArray();
        this.b = 0;
    }

    static zik f(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length > 1) {
            return new zik(bArr, z);
        }
        if (length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new zik(bArr, z);
        }
        zik[] zikVarArr = d;
        zik zikVar = zikVarArr[i];
        if (zikVar != null) {
            return zikVar;
        }
        zik zikVar2 = new zik(bArr, z);
        zikVarArr[i] = zikVar2;
        return zikVar2;
    }

    public static zik g(Object obj) {
        if (obj == null || (obj instanceof zik)) {
            return (zik) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (zik) c.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    public final BigInteger b() {
        return new BigInteger(this.a);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 10, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zik) {
            return Arrays.equals(this.a, ((zik) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.a);
    }

    public zik(byte[] bArr, boolean z) {
        if (ziu.r(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.a = z ? vxr.bd(bArr) : bArr;
        this.b = ziu.g(bArr);
    }
}
