package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abvo implements Iterable, Serializable {
    public static final abvo b = new abvm(abxt.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    private static abvo c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (abvo) it.next();
        }
        int i2 = i >>> 1;
        return c(it, i2).s(c(it, i - i2));
    }

    static int q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.a(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.k(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.k(i3, i2, "End index: ", " >= "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static abvo t(Iterable iterable) {
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

    public static abvo u(byte[] bArr, int i, int i2) {
        q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new abvm(bArr2);
    }

    public static abvo v(String str) {
        return new abvm(str.getBytes(abxt.a));
    }

    public static abvo w(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            abvo abvoVarU = i == 0 ? null : u(bArr, 0, i);
            if (abvoVarU == null) {
                return t(arrayList);
            }
            arrayList.add(abvoVarU);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    static void y(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.k(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.b(i, "Index < 0: "));
        }
    }

    public final boolean A() {
        return d() == 0;
    }

    public final byte[] B() {
        int iD = d();
        if (iD == 0) {
            return abxt.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    protected abstract boolean h();

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

    public abstract abvo j(int i, int i2);

    public abstract abvt k();

    public abstract InputStream l();

    protected abstract String m(Charset charset);

    public abstract ByteBuffer n();

    public abstract void o(abvf abvfVar);

    public abstract void p(OutputStream outputStream);

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abvj iterator() {
        return new abvg(this);
    }

    public final abvo s(abvo abvoVar) {
        if (Integer.MAX_VALUE - d() < abvoVar.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + d() + "+" + abvoVar.d());
        }
        int i = abzi.h;
        if (abvoVar.d() == 0) {
            return this;
        }
        if (d() == 0) {
            return abvoVar;
        }
        int iD = d() + abvoVar.d();
        if (iD < 128) {
            return abzi.g(this, abvoVar);
        }
        if (this instanceof abzi) {
            abzi abziVar = (abzi) this;
            abvo abvoVar2 = abziVar.f;
            if (abvoVar2.d() + abvoVar.d() < 128) {
                return new abzi(abziVar.e, abzi.g(abvoVar2, abvoVar));
            }
            abvo abvoVar3 = abziVar.e;
            if (abvoVar3.f() > abvoVar2.f() && abziVar.g > abvoVar.f()) {
                return new abzi(abvoVar3, new abzi(abvoVar2, abvoVar));
            }
        }
        if (iD >= abzi.c(Math.max(f(), abvoVar.f()) + 1)) {
            return new abzi(this, abvoVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        abzf.a(this, arrayDeque);
        abzf.a(abvoVar, arrayDeque);
        abvo abziVar2 = (abvo) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            abziVar2 = new abzi((abvo) arrayDeque.pop(), abziVar2);
        }
        return abziVar2;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? abzw.a(this) : abzw.a(j(0, 47)).concat("..."));
    }

    public final String x(Charset charset) {
        return d() == 0 ? "" : m(charset);
    }

    @Deprecated
    public final void z(byte[] bArr, int i, int i2, int i3) {
        q(i, i + i3, d());
        q(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }
}
