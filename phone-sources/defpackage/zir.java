package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zir extends zjh implements zjp {
    public static final zjs b = new ziq(zir.class);
    final byte[] a;

    public zir(byte[] bArr) {
        this.a = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zir f(Object obj) {
        if (obj == 0 || (obj instanceof zir)) {
            return (zir) obj;
        }
        zjh zjhVarP = obj.p();
        if (zjhVarP instanceof zir) {
            return (zir) zjhVarP;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (zir) b.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    @Override // defpackage.zjp
    public final String b() {
        return zxr.a(this.a);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 22, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zir) {
            return Arrays.equals(this.a, ((zir) zjhVar).a);
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

    public String toString() {
        return b();
    }

    public zir(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.a = zxr.d(str);
    }
}
