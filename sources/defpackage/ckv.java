package defpackage;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ckv implements Iterable, Serializable {
    public static final ckv b = new ckt(cmf.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    private static ckv c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (ckv) it.next();
        }
        int i2 = i >>> 1;
        ckv ckvVarC = c(it, i2);
        ckv ckvVarC2 = c(it, i - i2);
        if (Integer.MAX_VALUE - ckvVarC.d() < ckvVarC2.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + ckvVarC.d() + "+" + ckvVarC2.d());
        }
        int[] iArr = cnn.a;
        if (ckvVarC2.d() == 0) {
            return ckvVarC;
        }
        if (ckvVarC.d() == 0) {
            return ckvVarC2;
        }
        int iD = ckvVarC.d() + ckvVarC2.d();
        if (iD < 128) {
            return cnn.g(ckvVarC, ckvVarC2);
        }
        if (ckvVarC instanceof cnn) {
            cnn cnnVar = (cnn) ckvVarC;
            ckv ckvVar = cnnVar.f;
            if (ckvVar.d() + ckvVarC2.d() < 128) {
                return new cnn(cnnVar.e, cnn.g(ckvVar, ckvVarC2));
            }
            ckv ckvVar2 = cnnVar.e;
            if (ckvVar2.f() > ckvVar.f() && cnnVar.g > ckvVarC2.f()) {
                return new cnn(ckvVar2, new cnn(ckvVar, ckvVarC2));
            }
        }
        if (iD >= cnn.c(Math.max(ckvVarC.f(), ckvVarC2.f()) + 1)) {
            return new cnn(ckvVarC, ckvVarC2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        dnx.bw(ckvVarC, arrayDeque);
        dnx.bw(ckvVarC2, arrayDeque);
        ckv cnnVar2 = (ckv) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            cnnVar2 = new cnn((ckv) arrayDeque.pop(), cnnVar2);
        }
        return cnnVar2;
    }

    static int m(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(b.h(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(b.f(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(b.f(i3, i2, "End index: ", " >= "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ckv o(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? b : c(iterable.iterator(), size);
    }

    public static ckv p(byte[] bArr) {
        return q(bArr, 0, bArr.length);
    }

    public static ckv q(byte[] bArr, int i, int i2) {
        m(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ckt(bArr2);
    }

    static void r(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(b.f(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(b.e(i, "Index < 0: "));
        }
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int iD = d();
            i = i(iD, 0, iD);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    public abstract ckv j(int i, int i2);

    public abstract void k(ckn cknVar);

    public abstract void l(OutputStream outputStream);

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ckr iterator() {
        return new cko(this);
    }

    public final boolean s() {
        return d() == 0;
    }

    public final byte[] t() {
        int iD = d();
        if (iD == 0) {
            return cmf.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? dnx.bv(this) : dnx.bv(j(0, 47)).concat("..."));
    }

    @Deprecated
    public final void u(byte[] bArr, int i, int i2) {
        m(0, i2, d());
        m(i, i + i2, bArr.length);
        if (i2 > 0) {
            e(bArr, 0, i, i2);
        }
    }
}
