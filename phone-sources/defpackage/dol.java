package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dol implements Iterable, Serializable {
    private static final doh a;
    public static final dol b = new doj(dpk.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    static {
        a = doc.a() ? new dok(0) : new dok(1);
    }

    public static dol h(byte[] bArr, int i, int i2) {
        a.J(i, i + i2, bArr.length);
        return new doj(a.a(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    public abstract void e(doe doeVar);

    public abstract boolean equals(Object obj);

    protected abstract int f(int i, int i2);

    public abstract dol g(int i);

    public final int hashCode() {
        int iF = this.c;
        if (iF == 0) {
            int iC = c();
            iF = f(iC, iC);
            if (iF == 0) {
                iF = 1;
            }
            this.c = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new dof(this, 0);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()), c() <= 50 ? cwt.n(this) : cwt.n(g(47)).concat("..."));
    }
}
