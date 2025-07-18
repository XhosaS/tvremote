package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnn extends ckv {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final ckv e;
    public final ckv f;
    public final int g;
    private final int h;

    public cnn(ckv ckvVar, ckv ckvVar2) {
        this.e = ckvVar;
        this.f = ckvVar2;
        int iD = ckvVar.d();
        this.h = iD;
        this.d = iD + ckvVar2.d();
        this.g = Math.max(ckvVar.f(), ckvVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static ckv g(ckv ckvVar, ckv ckvVar2) {
        int iD = ckvVar.d();
        int iD2 = ckvVar2.d();
        byte[] bArr = new byte[iD + iD2];
        ckvVar.u(bArr, 0, iD);
        ckvVar2.u(bArr, iD, iD2);
        return new ckt(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.ckv
    public final byte a(int i) {
        r(i, this.d);
        return b(i);
    }

    @Override // defpackage.ckv
    public final byte b(int i) {
        int i2 = this.h;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.ckv
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ckv
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

    @Override // defpackage.ckv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ckv)) {
            return false;
        }
        ckv ckvVar = (ckv) obj;
        int i = this.d;
        if (i != ckvVar.d()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.c;
        int i3 = ckvVar.c;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        cnm cnmVar = new cnm(this);
        cks cksVarA = cnmVar.next();
        cnm cnmVar2 = new cnm(ckvVar);
        cks cksVarA2 = cnmVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iD = cksVarA.d() - i4;
            int iD2 = cksVarA2.d() - i5;
            int iMin = Math.min(iD, iD2);
            if (!(i4 == 0 ? cksVarA.g(cksVarA2, i5, iMin) : cksVarA2.g(cksVarA, i4, iMin))) {
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
                cksVarA = cnmVar.next();
            } else {
                i4 += iMin;
                cksVarA = cksVarA;
            }
            if (iMin == iD2) {
                cksVarA2 = cnmVar2.next();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    @Override // defpackage.ckv
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.ckv
    public final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.ckv
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

    @Override // defpackage.ckv, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new cnl(this);
    }

    @Override // defpackage.ckv
    public final ckv j(int i, int i2) {
        int i3 = this.d;
        int iM = m(i, i2, i3);
        if (iM == 0) {
            return ckv.b;
        }
        if (iM == i3) {
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
        ckv ckvVar = this.e;
        return new cnn(ckvVar.j(i, ckvVar.d()), this.f.j(0, i5));
    }

    @Override // defpackage.ckv
    public final void k(ckn cknVar) {
        this.e.k(cknVar);
        this.f.k(cknVar);
    }

    @Override // defpackage.ckv
    public final void l(OutputStream outputStream) {
        this.e.l(outputStream);
        this.f.l(outputStream);
    }

    @Override // defpackage.ckv
    /* renamed from: n */
    public final ckr iterator() {
        return new cnl(this);
    }

    Object writeReplace() {
        return new ckt(t());
    }
}
