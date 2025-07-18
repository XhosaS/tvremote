package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvx extends vsz {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
    private static final long serialVersionUID = 1;
    public final int d;
    public final vsz e;
    public final vsz f;
    public final int g;
    private final int h;

    public vvx(vsz vszVar, vsz vszVar2) {
        this.e = vszVar;
        this.f = vszVar2;
        int iD = vszVar.d();
        this.h = iD;
        this.d = iD + vszVar2.d();
        this.g = Math.max(vszVar.f(), vszVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        return i >= 47 ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : iArr[i];
    }

    public static vsz g(vsz vszVar, vsz vszVar2) {
        int iD = vszVar.d();
        int iD2 = vszVar2.d();
        byte[] bArr = new byte[iD + iD2];
        vszVar.x(bArr, 0, iD);
        vszVar2.x(bArr, iD, iD2);
        return new vsw(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.vsz
    public final byte a(int i) {
        a.K(i, this.d);
        return b(i);
    }

    @Override // defpackage.vsz
    public final byte b(int i) {
        int i2 = this.h;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.vsz
    public final int d() {
        return this.d;
    }

    @Override // defpackage.vsz
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.vsz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vsz)) {
            return false;
        }
        vsz vszVar = (vsz) obj;
        int i = this.d;
        if (i != vszVar.d()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.c;
        int i3 = vszVar.c;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        vvw vvwVar = new vvw(this);
        vsv vsvVarA = vvwVar.next();
        vvw vvwVar2 = new vvw(vszVar);
        vsv vsvVarA2 = vvwVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iD = vsvVarA.d() - i4;
            int iD2 = vsvVarA2.d() - i5;
            int iMin = Math.min(iD, iD2);
            if (!(i4 == 0 ? vsvVarA.g(vsvVarA2, i5, iMin) : vsvVarA2.g(vsvVarA, i4, iMin))) {
                return false;
            }
            i6 += iMin;
            if (i6 >= i) {
                if (i6 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                i4 = 0;
                vsvVarA = vvwVar.next();
            } else {
                i4 += iMin;
                vsvVarA = vsvVarA;
            }
            if (iMin == iD2) {
                vsvVarA2 = vvwVar2.next();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    @Override // defpackage.vsz
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.vsz
    public final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.vsz
    protected final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.vsz, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vvv(this);
    }

    @Override // defpackage.vsz
    public final vsz j(int i, int i2) {
        int i3 = this.d;
        int iJ = a.J(i, i2, i3);
        if (iJ == 0) {
            return vsz.b;
        }
        if (iJ == i3) {
            return this;
        }
        int i4 = this.h;
        if (i2 <= i4) {
            return this.e.j(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.f.j(i - i4, i5);
        }
        vsz vszVar = this.e;
        return new vvx(vszVar.j(i, vszVar.d()), this.f.j(0, i5));
    }

    @Override // defpackage.vsz
    public final vte k() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        vvw vvwVar = new vvw(this);
        while (vvwVar.hasNext()) {
            arrayList.add(vvwVar.next().l());
        }
        int i = vte.g;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new vtb(arrayList, iRemaining) : vte.L(new vur(arrayList));
    }

    @Override // defpackage.vsz
    public final ByteBuffer l() {
        return ByteBuffer.wrap(w()).asReadOnlyBuffer();
    }

    @Override // defpackage.vsz
    public final void m(vsq vsqVar) {
        this.e.m(vsqVar);
        this.f.m(vsqVar);
    }

    @Override // defpackage.vsz
    public final void n(OutputStream outputStream) {
        this.e.n(outputStream);
        this.f.n(outputStream);
    }

    @Override // defpackage.vsz
    /* renamed from: o */
    public final vsu iterator() {
        return new vvv(this);
    }

    Object writeReplace() {
        return new vsw(w());
    }
}
