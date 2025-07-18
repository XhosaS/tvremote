package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dds implements Iterable, Serializable {
    private static final ddo a;
    public static final dds b = new ddq(dep.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    static {
        a = ddk.a() ? new ddr(0) : new ddr(1);
    }

    public static dds i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static dds j(byte[] bArr, int i, int i2) {
        a.J(i, i + i2, bArr.length);
        return new ddq(a.a(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    protected abstract void d(byte[] bArr, int i);

    public abstract boolean equals(Object obj);

    public abstract void f(ddm ddmVar);

    protected abstract int g(int i, int i2);

    public abstract dds h(int i);

    public final int hashCode() {
        int iG = this.c;
        if (iG == 0) {
            int iC = c();
            iG = g(iC, iC);
            if (iG == 0) {
                iG = 1;
            }
            this.c = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new dof(this, 1);
    }

    public final byte[] k() {
        int iC = c();
        if (iC == 0) {
            return dep.b;
        }
        byte[] bArr = new byte[iC];
        d(bArr, iC);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()), c() <= 50 ? cyg.g(this) : cyg.g(h(47)).concat("..."));
    }
}
