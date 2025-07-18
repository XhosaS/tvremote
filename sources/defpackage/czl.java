package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czl extends dab implements daj {
    public static final dam b = new czk(czl.class);
    final byte[] a;

    public czl(byte[] bArr) {
        this.a = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static czl f(Object obj) {
        if (obj == 0 || (obj instanceof czl)) {
            return (czl) obj;
        }
        dab dabVarP = obj.p();
        if (dabVarP instanceof czl) {
            return (czl) dabVarP;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (czl) b.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.a.length);
    }

    @Override // defpackage.daj
    public final String b() {
        return doj.a(this.a);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.j(z, 22, this.a);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (dabVar instanceof czl) {
            return Arrays.equals(this.a, ((czl) dabVar).a);
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

    public String toString() {
        return b();
    }

    public czl(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.a = doj.d(str);
    }
}
