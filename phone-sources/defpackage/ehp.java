package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehp extends eay {
    public static final /* synthetic */ int h = 0;
    public final int e;
    public final eay[] f;
    public final Object[] g;
    private final int i;
    private final int j;
    private final int[] k;
    private final int[] l;
    private final HashMap m;
    private final cvi n;

    /* JADX WARN: Illegal instructions before constructor call */
    public ehp(Collection collection, cvi cviVar) {
        eay[] eayVarArr = new eay[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            eayVarArr[i2] = ((ejo) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((ejo) it2.next()).b();
            i++;
        }
        this(eayVarArr, objArr, cviVar);
    }

    private final int A(int i, boolean z) {
        if (!z) {
            if (i >= this.i - 1) {
                return -1;
            }
            return i + 1;
        }
        cvi cviVar = this.n;
        int i2 = ((int[]) cviVar.b)[i] + 1;
        int[] iArr = (int[]) cviVar.c;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private final int B(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        cvi cviVar = this.n;
        int i2 = ((int[]) cviVar.b)[i] - 1;
        if (i2 >= 0) {
            return ((int[]) cviVar.c)[i2];
        }
        return -1;
    }

    public static Object r(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object s(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // defpackage.eay
    public final int a(Object obj) {
        int iA;
        if (obj instanceof Pair) {
            Object objS = s(obj);
            Object objR = r(obj);
            int iT = t(objS);
            if (iT != -1 && (iA = y(iT).a(objR)) != -1) {
                return w(iT) + iA;
            }
        }
        return -1;
    }

    @Override // defpackage.eay
    public final int b() {
        return this.j;
    }

    @Override // defpackage.eay
    public final int c() {
        return this.e;
    }

    @Override // defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        int iU = u(i);
        int iX = x(iU);
        y(iU).d(i - w(iU), eavVar, z);
        eavVar.h += iX;
        if (z) {
            Object objZ = z(iU);
            Object obj = eavVar.g;
            obj.getClass();
            eavVar.g = Pair.create(objZ, obj);
        }
        return eavVar;
    }

    @Override // defpackage.eay
    public final eax e(int i, eax eaxVar, long j) {
        int iV = v(i);
        int iX = x(iV);
        int iW = w(iV);
        y(iV).e(i - iX, eaxVar, j);
        Object objZ = z(iV);
        if (!eax.a.equals(eaxVar.o)) {
            objZ = Pair.create(objZ, eaxVar.o);
        }
        eaxVar.o = objZ;
        eaxVar.B += iW;
        eaxVar.C += iW;
        return eaxVar;
    }

    @Override // defpackage.eay
    public final Object f(int i) {
        int iU = u(i);
        return Pair.create(z(iU), y(iU).f(i - w(iU)));
    }

    @Override // defpackage.eay
    public final int g(boolean z) {
        if (this.i != 0) {
            int iA = 0;
            if (z) {
                int[] iArr = (int[]) this.n.c;
                iA = iArr.length > 0 ? iArr[0] : -1;
            }
            while (y(iA).q()) {
                iA = A(iA, z);
                if (iA == -1) {
                }
            }
            return x(iA) + y(iA).g(z);
        }
        return -1;
    }

    @Override // defpackage.eay
    public final int h(boolean z) {
        int iB;
        int i = this.i;
        if (i != 0) {
            if (z) {
                int[] iArr = (int[]) this.n.c;
                int length = iArr.length;
                iB = length > 0 ? iArr[length - 1] : -1;
            } else {
                iB = i - 1;
            }
            while (y(iB).q()) {
                iB = B(iB, z);
                if (iB == -1) {
                }
            }
            return x(iB) + y(iB).h(z);
        }
        return -1;
    }

    @Override // defpackage.eay
    public final int i(int i, int i2, boolean z) {
        int iV = v(i);
        int iX = x(iV);
        int i3 = y(iV).i(i - iX, i2 == 2 ? 0 : i2, z);
        if (i3 != -1) {
            return iX + i3;
        }
        int iA = A(iV, z);
        while (iA != -1 && y(iA).q()) {
            iA = A(iA, z);
        }
        if (iA != -1) {
            return x(iA) + y(iA).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.eay
    public final int j(int i, int i2, boolean z) {
        int iV = v(i);
        int iX = x(iV);
        int iJ = y(iV).j(i - iX, i2 == 2 ? 0 : i2, z);
        if (iJ != -1) {
            return iX + iJ;
        }
        int iB = B(iV, z);
        while (iB != -1 && y(iB).q()) {
            iB = B(iB, z);
        }
        if (iB != -1) {
            return x(iB) + y(iB).h(z);
        }
        if (i2 == 2) {
            return h(z);
        }
        return -1;
    }

    @Override // defpackage.eay
    public final eav o(Object obj, eav eavVar) {
        Object objS = s(obj);
        Object objR = r(obj);
        int iT = t(objS);
        int iX = x(iT);
        y(iT).o(objR, eavVar);
        eavVar.h += iX;
        eavVar.g = obj;
        return eavVar;
    }

    protected final int t(Object obj) {
        Integer num = (Integer) this.m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected final int u(int i) {
        return edt.b(this.k, i + 1, false, false);
    }

    protected final int v(int i) {
        return edt.b(this.l, i + 1, false, false);
    }

    protected final int w(int i) {
        return this.k[i];
    }

    protected final int x(int i) {
        return this.l[i];
    }

    protected final eay y(int i) {
        return this.f[i];
    }

    protected final Object z(int i) {
        return this.g[i];
    }

    public ehp(eay[] eayVarArr, Object[] objArr, cvi cviVar) {
        this.n = cviVar;
        this.i = cviVar.p();
        this.f = eayVarArr;
        int length = eayVarArr.length;
        this.k = new int[length];
        this.l = new int[length];
        this.g = objArr;
        this.m = new HashMap();
        int i = 0;
        int iC = 0;
        int iB = 0;
        int i2 = 0;
        while (i < eayVarArr.length) {
            eay eayVar = eayVarArr[i];
            this.f[i2] = eayVar;
            this.l[i2] = iC;
            this.k[i2] = iB;
            iC += eayVar.c();
            iB += this.f[i2].b();
            this.m.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.e = iC;
        this.j = iB;
    }
}
