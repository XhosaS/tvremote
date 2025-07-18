package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzi extends abvo {
    static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public static final /* synthetic */ int h = 0;
    private static final long serialVersionUID = 1;
    public final int d;
    public final abvo e;
    public final abvo f;
    public final int g;
    private final int i;

    public abzi(abvo abvoVar, abvo abvoVar2) {
        this.e = abvoVar;
        this.f = abvoVar2;
        int iD = abvoVar.d();
        this.i = iD;
        this.d = iD + abvoVar2.d();
        this.g = Math.max(abvoVar.f(), abvoVar2.f()) + 1;
    }

    static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static abvo g(abvo abvoVar, abvo abvoVar2) {
        int iD = abvoVar.d();
        int iD2 = abvoVar2.d();
        byte[] bArr = new byte[iD + iD2];
        abvoVar.z(bArr, 0, 0, iD);
        abvoVar2.z(bArr, 0, iD, iD2);
        return new abvm(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.abvo
    public final byte a(int i) {
        y(i, this.d);
        return b(i);
    }

    @Override // defpackage.abvo
    public final byte b(int i) {
        int i2 = this.i;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.abvo
    public final int d() {
        return this.d;
    }

    @Override // defpackage.abvo
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.i;
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

    @Override // defpackage.abvo
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abvo)) {
            return false;
        }
        abvo abvoVar = (abvo) obj;
        int i = this.d;
        if (i != abvoVar.d()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.c;
        int i3 = abvoVar.c;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        abzg abzgVar = new abzg(this);
        abvl abvlVarA = abzgVar.next();
        abzg abzgVar2 = new abzg(abvoVar);
        abvl abvlVarA2 = abzgVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iD = abvlVarA.d() - i4;
            int iD2 = abvlVarA2.d() - i5;
            int iMin = Math.min(iD, iD2);
            if (!(i4 == 0 ? abvlVarA.g(abvlVarA2, i5, iMin) : abvlVarA2.g(abvlVarA, i4, iMin))) {
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
                abvlVarA = abzgVar.next();
            } else {
                i4 += iMin;
                abvlVarA = abvlVarA;
            }
            if (iMin == iD2) {
                abvlVarA2 = abzgVar2.next();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    @Override // defpackage.abvo
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.abvo
    protected final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.abvo
    protected final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.i;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.abvo, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new abze(this);
    }

    @Override // defpackage.abvo
    public final abvo j(int i, int i2) {
        int i3 = this.d;
        int iQ = q(i, i2, i3);
        if (iQ == 0) {
            return abvo.b;
        }
        if (iQ == i3) {
            return this;
        }
        int i4 = this.i;
        if (i2 <= i4) {
            return this.e.j(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.f.j(i - i4, i5);
        }
        abvo abvoVar = this.e;
        return new abzi(abvoVar.j(i, abvoVar.d()), this.f.j(0, i5));
    }

    @Override // defpackage.abvo
    public final abvt k() {
        ArrayList arrayList = new ArrayList();
        abzg abzgVar = new abzg(this);
        while (abzgVar.hasNext()) {
            arrayList.add(abzgVar.next().n());
        }
        return abvt.P(arrayList);
    }

    @Override // defpackage.abvo
    public final InputStream l() {
        return new abzh(this);
    }

    @Override // defpackage.abvo
    protected final String m(Charset charset) {
        return new String(B(), charset);
    }

    @Override // defpackage.abvo
    public final ByteBuffer n() {
        throw null;
    }

    @Override // defpackage.abvo
    public final void o(abvf abvfVar) {
        this.e.o(abvfVar);
        this.f.o(abvfVar);
    }

    @Override // defpackage.abvo
    public final void p(OutputStream outputStream) {
        this.e.p(outputStream);
        this.f.p(outputStream);
    }

    @Override // defpackage.abvo
    /* renamed from: r */
    public final abvj iterator() {
        return new abze(this);
    }

    Object writeReplace() {
        return new abvm(B());
    }
}
