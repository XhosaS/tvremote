package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vsz implements Iterable, Serializable {
    public static final vsz b = new vsw(vuo.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    private static vsz c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (vsz) it.next();
        }
        int i2 = i >>> 1;
        vsz vszVarC = c(it, i2);
        vsz vszVarC2 = c(it, i - i2);
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - vszVarC.d() < vszVarC2.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + vszVarC.d() + "+" + vszVarC2.d());
        }
        int[] iArr = vvx.a;
        if (vszVarC2.d() == 0) {
            return vszVarC;
        }
        if (vszVarC.d() == 0) {
            return vszVarC2;
        }
        int iD = vszVarC.d() + vszVarC2.d();
        if (iD < 128) {
            return vvx.g(vszVarC, vszVarC2);
        }
        if (vszVarC instanceof vvx) {
            vvx vvxVar = (vvx) vszVarC;
            vsz vszVar = vvxVar.f;
            if (vszVar.d() + vszVarC2.d() < 128) {
                return new vvx(vvxVar.e, vvx.g(vszVar, vszVarC2));
            }
            vsz vszVar2 = vvxVar.e;
            if (vszVar2.f() > vszVar.f() && vvxVar.g > vszVarC2.f()) {
                return new vvx(vszVar2, new vvx(vszVar, vszVarC2));
            }
        }
        if (iD >= vvx.c(Math.max(vszVarC.f(), vszVarC2.f()) + 1)) {
            return new vvx(vszVarC, vszVarC2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        vxr.P(vszVarC, arrayDeque);
        vxr.P(vszVarC2, arrayDeque);
        vsz vvxVar2 = (vsz) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            vvxVar2 = new vvx((vsz) arrayDeque.pop(), vvxVar2);
        }
        return vvxVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vsz p(Iterable iterable) {
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

    public static vsz q(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static vsz r(byte[] bArr, int i, int i2) {
        a.J(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new vsw(bArr2);
    }

    public static vsz s(String str) {
        return new vsw(str.getBytes(vuo.a));
    }

    public static vsz t(InputStream inputStream) throws IOException {
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
            vsz vszVarR = i == 0 ? null : r(bArr, 0, i);
            if (vszVarR == null) {
                return p(arrayList);
            }
            arrayList.add(vszVarR);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    static vsz u(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new vsx(byteBuffer);
        }
        return new vst(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
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

    public abstract vsz j(int i, int i2);

    public abstract vte k();

    public abstract ByteBuffer l();

    public abstract void m(vsq vsqVar);

    public abstract void n(OutputStream outputStream);

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public vsu iterator() {
        return new vsr(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? vxr.v(this) : vxr.v(j(0, 47)).concat("..."));
    }

    public final boolean v() {
        return d() == 0;
    }

    public final byte[] w() {
        int iD = d();
        if (iD == 0) {
            return vuo.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    @Deprecated
    public final void x(byte[] bArr, int i, int i2) {
        a.J(0, i2, d());
        a.J(i, i + i2, bArr.length);
        if (i2 > 0) {
            e(bArr, 0, i, i2);
        }
    }
}
