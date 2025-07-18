package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cze extends dab {
    static final dam c = new czd(cze.class);
    private static final cze[] d = new cze[12];
    public final byte[] a;
    public final int b;

    public cze(int i) {
        this.a = BigInteger.valueOf(i).toByteArray();
        this.b = 0;
    }

    static cze f(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length > 1) {
            return new cze(bArr, z);
        }
        if (length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new cze(bArr, z);
        }
        cze[] czeVarArr = d;
        cze czeVar = czeVarArr[i];
        if (czeVar != null) {
            return czeVar;
        }
        cze czeVar2 = new cze(bArr, z);
        czeVarArr[i] = czeVar2;
        return czeVar2;
    }

    public static cze g(Object obj) {
        if (obj == null || (obj instanceof cze)) {
            return (cze) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (cze) c.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.a.length);
    }

    public final BigInteger b() {
        return new BigInteger(this.a);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.j(z, 10, this.a);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (dabVar instanceof cze) {
            return Arrays.equals(this.a, ((cze) dabVar).a);
        }
        return false;
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return dos.m(this.a);
    }

    public cze(byte[] bArr, boolean z) {
        if (czo.r(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.a = z ? dos.p(bArr) : bArr;
        this.b = czo.g(bArr);
    }
}
