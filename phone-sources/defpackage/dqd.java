package defpackage;

import android.support.v7.appcompat.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqd implements dqk {
    private static final int[] a = new int[0];
    private static final Unsafe b = dra.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final dqa g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final dqt m;

    private dqd(int[] iArr, Object[] objArr, int i, int i2, dqa dqaVar, int[] iArr2, int i3, int i4, dqt dqtVar, cws cwsVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = dqaVar instanceof dpf;
        boolean z = false;
        if (cwsVar != null && (dqaVar instanceof dpd)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = dqtVar;
        this.g = dqaVar;
    }

    private final void A(Object obj, Object obj2, int i) {
        if (I(obj2, i)) {
            long jR = r(q(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m(i) + " is present but null: " + obj2);
            }
            dqk dqkVarU = u(i);
            if (!I(obj, i)) {
                if (L(object)) {
                    Object objC = dqkVarU.c();
                    dqkVarU.e(objC, object);
                    unsafe.putObject(obj, jR, objC);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                C(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!L(object2)) {
                Object objC2 = dqkVarU.c();
                dqkVarU.e(objC2, object2);
                unsafe.putObject(obj, jR, objC2);
                object2 = objC2;
            }
            dqkVarU.e(object2, object);
        }
    }

    private final void B(Object obj, Object obj2, int i) {
        int iM = m(i);
        if (M(obj2, iM, i)) {
            long jR = r(q(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m(i) + " is present but null: " + obj2);
            }
            dqk dqkVarU = u(i);
            if (!M(obj, iM, i)) {
                if (L(object)) {
                    Object objC = dqkVarU.c();
                    dqkVarU.e(objC, object);
                    unsafe.putObject(obj, jR, objC);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                D(obj, iM, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!L(object2)) {
                Object objC2 = dqkVarU.c();
                dqkVarU.e(objC2, object2);
                unsafe.putObject(obj, jR, objC2);
                object2 = objC2;
            }
            dqkVarU.e(object2, object);
        }
    }

    private final void C(Object obj, int i) {
        int iO = o(i);
        long j = 1048575 & iO;
        if (j == 1048575) {
            return;
        }
        dra.p(obj, j, (1 << (iO >>> 20)) | dra.c(obj, j));
    }

    private final void D(Object obj, int i, int i2) {
        dra.p(obj, o(i2) & 1048575, i);
    }

    private final void E(Object obj, int i, Object obj2) {
        b.putObject(obj, r(q(i)), obj2);
        C(obj, i);
    }

    private final void F(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, r(q(i2)), obj2);
        D(obj, i, i2);
    }

    private final boolean G(Object obj, Object obj2, int i) {
        return I(obj, i) == I(obj2, i);
    }

    private static boolean H(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean I(Object obj, int i) {
        int iO = o(i);
        long j = 1048575 & iO;
        if (j != 1048575) {
            return (dra.c(obj, j) & (1 << (iO >>> 20))) != 0;
        }
        int iQ = q(i);
        long jR = r(iQ);
        switch (p(iQ)) {
            case 0:
                return Double.doubleToRawLongBits(dra.a(obj, jR)) != 0;
            case 1:
                return Float.floatToRawIntBits(dra.b(obj, jR)) != 0;
            case 2:
                return dra.d(obj, jR) != 0;
            case 3:
                return dra.d(obj, jR) != 0;
            case 4:
                return dra.c(obj, jR) != 0;
            case 5:
                return dra.d(obj, jR) != 0;
            case 6:
                return dra.c(obj, jR) != 0;
            case 7:
                return dra.t(obj, jR);
            case 8:
                Object objF = dra.f(obj, jR);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof dol) {
                    return !dol.b.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return dra.f(obj, jR) != null;
            case 10:
                return !dol.b.equals(dra.f(obj, jR));
            case 11:
                return dra.c(obj, jR) != 0;
            case 12:
                return dra.c(obj, jR) != 0;
            case 13:
                return dra.c(obj, jR) != 0;
            case 14:
                return dra.d(obj, jR) != 0;
            case 15:
                return dra.c(obj, jR) != 0;
            case 16:
                return dra.d(obj, jR) != 0;
            case 17:
                return dra.f(obj, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean J(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? I(obj, i) : (i3 & i4) != 0;
    }

    private static boolean K(Object obj, int i, dqk dqkVar) {
        return dqkVar.g(dra.f(obj, r(i)));
    }

    private static boolean L(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof dpf) {
            return ((dpf) obj).t();
        }
        return true;
    }

    private final boolean M(Object obj, int i, int i2) {
        return dra.c(obj, (long) (o(i2) & 1048575)) == i;
    }

    private static boolean N(Object obj, long j) {
        return ((Boolean) dra.f(obj, j)).booleanValue();
    }

    private final void O(Object obj, int i, dop dopVar) {
        if (H(i)) {
            dra.r(obj, r(i), dopVar.q());
        } else if (this.i) {
            dra.r(obj, r(i), dopVar.p());
        } else {
            dra.r(obj, r(i), dopVar.o());
        }
    }

    private static final void P(int i, Object obj, dhq dhqVar) {
        if (!(obj instanceof String)) {
            dhqVar.c(i, (dol) obj);
        } else {
            ((dot) dhqVar.a).v(i, (String) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.dqd j(defpackage.dpx r35, defpackage.dqt r36, defpackage.cws r37) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqd.j(dpx, dqt, cws):dqd");
    }

    private static double k(Object obj, long j) {
        return ((Double) dra.f(obj, j)).doubleValue();
    }

    private static float l(Object obj, long j) {
        return ((Float) dra.f(obj, j)).floatValue();
    }

    private final int m(int i) {
        return this.c[i];
    }

    private static int n(Object obj, long j) {
        return ((Integer) dra.f(obj, j)).intValue();
    }

    private final int o(int i) {
        return this.c[i + 2];
    }

    private static int p(int i) {
        return (i >>> 20) & 255;
    }

    private final int q(int i) {
        return this.c[i + 1];
    }

    private static long r(int i) {
        return i & 1048575;
    }

    private static long s(Object obj, long j) {
        return ((Long) dra.f(obj, j)).longValue();
    }

    private final dpi t(int i) {
        int i2 = i / 3;
        return (dpi) this.d[i2 + i2 + 1];
    }

    private final dqk u(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        dqk dqkVar = (dqk) objArr[i3];
        if (dqkVar != null) {
            return dqkVar;
        }
        dqk dqkVarA = dqh.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = dqkVarA;
        return dqkVarA;
    }

    private final Object v(Object obj, int i, Object obj2, dqt dqtVar, Object obj3) {
        dpi dpiVarT;
        int iM = m(i);
        Object objF = dra.f(obj, r(q(i)));
        if (objF == null || (dpiVarT = t(i)) == null) {
            return obj2;
        }
        iom iomVarQ = cwt.q(w(i));
        Iterator it = ((dpv) objF).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!dpiVarT.a()) {
                if (obj2 == null) {
                    obj2 = dqtVar.b(obj3);
                }
                entry.getKey();
                entry.getValue();
                int iM2 = cws.m(iomVarQ);
                dol dolVar = dol.b;
                byte[] bArr = new byte[iM2];
                boolean z = dot.e;
                dor dorVar = new dor(bArr, iM2);
                try {
                    cws.l(dorVar, iomVarQ, entry.getKey(), entry.getValue());
                    dqtVar.c(obj2, iM, cwr.f(dorVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object w(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object x(Object obj, int i) {
        dqk dqkVarU = u(i);
        long jR = r(q(i));
        if (!I(obj, i)) {
            return dqkVarU.c();
        }
        Object object = b.getObject(obj, jR);
        if (L(object)) {
            return object;
        }
        Object objC = dqkVarU.c();
        if (object != null) {
            dqkVarU.e(objC, object);
        }
        return objC;
    }

    private final Object y(Object obj, int i, int i2) {
        dqk dqkVarU = u(i2);
        if (!M(obj, i, i2)) {
            return dqkVarU.c();
        }
        Object object = b.getObject(obj, r(q(i2)));
        if (L(object)) {
            return object;
        }
        Object objC = dqkVarU.c();
        if (object != null) {
            dqkVarU.e(objC, object);
        }
        return objC;
    }

    private static void z(Object obj) {
        if (L(obj)) {
            return;
        }
        Objects.toString(obj);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    @Override // defpackage.dqk
    public final int a(Object obj) {
        int i;
        int iAn;
        int iC;
        int iL;
        int size;
        int size2;
        int iL2;
        int iT;
        int iT2;
        int iT3;
        int iT4;
        int iT5;
        int iV;
        int iG;
        dqd dqdVar = this;
        Object obj2 = obj;
        Unsafe unsafe = b;
        int i2 = 0;
        int i3 = 0;
        int iAk = 0;
        int i4 = 1048575;
        while (true) {
            int[] iArr = dqdVar.c;
            if (i2 >= iArr.length) {
                int iA = iAk + dqt.f(obj).a();
                if (dqdVar.h) {
                    dqq dqqVar = cws.i(obj).b;
                    if (dqqVar.a() > 0) {
                        Map.Entry entryE = dqqVar.e(0);
                        entryE.getValue();
                        throw null;
                    }
                    Iterator it = dqqVar.b().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        entry.getValue();
                        throw null;
                    }
                }
                return iA;
            }
            int iQ = dqdVar.q(i2);
            int iP = p(iQ);
            int iM = dqdVar.m(i2);
            int i5 = iArr[i2 + 2];
            int i6 = i5 & 1048575;
            if (iP <= 17) {
                if (i6 != i4) {
                    i3 = i6 == 1048575 ? 0 : unsafe.getInt(obj2, i6);
                    i4 = i6;
                }
                i = 1 << (i5 >>> 20);
            } else {
                i = 0;
            }
            long jR = r(iQ);
            if (iP >= dpa.DOUBLE_LIST_PACKED.Z) {
                int i7 = dpa.SINT64_LIST_PACKED.Z;
            }
            switch (iP) {
                case 0:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAk += dot.ak(iM);
                    }
                    i2 += 3;
                    obj2 = obj;
                case 1:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.an(iM);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 2:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.J(iM, unsafe.getLong(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 3:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.W(iM, unsafe.getLong(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 4:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.H(iM, unsafe.getInt(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 5:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.am(iM);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 6:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.al(iM);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 7:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.aj(iM);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 8:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        Object object = unsafe.getObject(obj2, jR);
                        iAn = object instanceof dol ? dot.D(iM, (dol) object) : dot.R(iM, (String) object);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 9:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iC = dql.c(iM, unsafe.getObject(obj2, jR), dqdVar.u(i2));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case 10:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.D(iM, (dol) unsafe.getObject(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 11:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.U(iM, unsafe.getInt(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 12:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.F(iM, unsafe.getInt(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 13:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.ao(iM);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 14:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.ap(iM);
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 15:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.N(iM, unsafe.getInt(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 16:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iAn = dot.P(iM, unsafe.getLong(obj2, jR));
                        iAk += iAn;
                    }
                    dqdVar = this;
                    i2 += 3;
                    obj2 = obj;
                case 17:
                    if (dqdVar.J(obj2, i2, i4, i3, i)) {
                        iC = dot.G(iM, (dqa) unsafe.getObject(obj2, jR), dqdVar.u(i2));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case 18:
                    iC = dql.j(iM, (List) unsafe.getObject(obj2, jR));
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 19:
                    iC = dql.i(iM, (List) unsafe.getObject(obj2, jR));
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 20:
                    List list = (List) unsafe.getObject(obj2, jR);
                    Class cls = dql.a;
                    if (list.size() != 0) {
                        iL = dql.l(list);
                        size = list.size() * dot.T(iM);
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iT4 = 0;
                    iAk += iT4;
                    i2 += 3;
                    obj2 = obj;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, jR);
                    Class cls2 = dql.a;
                    size2 = list2.size();
                    if (size2 != 0) {
                        iL2 = dql.l(list2);
                        iT = dot.T(iM);
                        iC = iL2 + (size2 * iT);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, jR);
                    Class cls3 = dql.a;
                    size2 = list3.size();
                    if (size2 != 0) {
                        iL2 = dql.k(list3);
                        iT = dot.T(iM);
                        iC = iL2 + (size2 * iT);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 23:
                    iC = dql.j(iM, (List) unsafe.getObject(obj2, jR));
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 24:
                    iC = dql.i(iM, (List) unsafe.getObject(obj2, jR));
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, jR);
                    Class cls4 = dql.a;
                    int size3 = list4.size();
                    iC = size3 == 0 ? 0 : size3 * dot.aj(iM);
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, jR);
                    Class cls5 = dql.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iT2 = 0;
                    } else {
                        iT2 = dot.T(iM) * size4;
                        if (list5 instanceof dpp) {
                            dpp dppVar = (dpp) list5;
                            for (int i8 = 0; i8 < size4; i8++) {
                                Object objB = dppVar.b();
                                iT2 += objB instanceof dol ? dot.E((dol) objB) : dot.S((String) objB);
                            }
                        } else {
                            for (int i9 = 0; i9 < size4; i9++) {
                                Object obj3 = list5.get(i9);
                                iT2 += obj3 instanceof dol ? dot.E((dol) obj3) : dot.S((String) obj3);
                            }
                        }
                    }
                    iAk += iT2;
                    i2 += 3;
                    obj2 = obj;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, jR);
                    dqk dqkVarU = dqdVar.u(i2);
                    Class cls6 = dql.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iT3 = 0;
                    } else {
                        iT3 = dot.T(iM) * size5;
                        for (int i10 = 0; i10 < size5; i10++) {
                            Object obj4 = list6.get(i10);
                            iT3 += obj4 instanceof dpo ? dot.K((dpo) obj4) : dot.M((dqa) obj4, dqkVarU);
                        }
                    }
                    iAk += iT3;
                    i2 += 3;
                    obj2 = obj;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, jR);
                    Class cls7 = dql.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iT4 = 0;
                    } else {
                        iT4 = size6 * dot.T(iM);
                        for (int i11 = 0; i11 < list7.size(); i11++) {
                            iT4 += dot.E((dol) list7.get(i11));
                        }
                    }
                    iAk += iT4;
                    i2 += 3;
                    obj2 = obj;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, jR);
                    Class cls8 = dql.a;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iL2 = dql.f(list8);
                        iT = dot.T(iM);
                        iC = iL2 + (size2 * iT);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, jR);
                    Class cls9 = dql.a;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iL2 = dql.k(list9);
                        iT = dot.T(iM);
                        iC = iL2 + (size2 * iT);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iC = dql.i(iM, (List) unsafe.getObject(obj2, jR));
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 32:
                    iC = dql.j(iM, (List) unsafe.getObject(obj2, jR));
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    List list10 = (List) unsafe.getObject(obj2, jR);
                    Class cls10 = dql.a;
                    size2 = list10.size();
                    if (size2 != 0) {
                        iL2 = dql.d(list10);
                        iT = dot.T(iM);
                        iC = iL2 + (size2 * iT);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, jR);
                    Class cls11 = dql.a;
                    size2 = list11.size();
                    if (size2 != 0) {
                        iL2 = dql.e(list11);
                        iT = dot.T(iM);
                        iC = iL2 + (size2 * iT);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    }
                    iAk += iC;
                    i2 += 3;
                    obj2 = obj;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    size = dql.b((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    size = dql.a((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    size = dql.l((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    size = dql.l((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    size = dql.k((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    size = dql.b((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    size = dql.a((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, jR);
                    Class cls12 = dql.a;
                    size = list12.size();
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    size = dql.f((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    size = dql.k((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    size = dql.a((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    size = dql.b((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    size = dql.d((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    size = dql.e((List) unsafe.getObject(obj2, jR));
                    if (size > 0) {
                        iT5 = dot.T(iM);
                        iV = dot.V(size);
                        iL = iT5 + iV;
                        iT4 = iL + size;
                        iAk += iT4;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, jR);
                    dqk dqkVarU2 = dqdVar.u(i2);
                    Class cls13 = dql.a;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        iG = 0;
                    } else {
                        iG = 0;
                        for (int i12 = 0; i12 < size7; i12++) {
                            iG += dot.G(iM, (dqa) list13.get(i12), dqkVarU2);
                        }
                    }
                    iAk += iG;
                    i2 += 3;
                    obj2 = obj;
                case 50:
                    dpv dpvVar = (dpv) unsafe.getObject(obj2, jR);
                    if (dpvVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it2 = dpvVar.entrySet().iterator();
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i2 += 3;
                    obj2 = obj;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.ak(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.an(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.J(iM, s(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.W(iM, s(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.H(iM, n(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.am(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.al(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.aj(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        Object object2 = unsafe.getObject(obj2, jR);
                        iC = object2 instanceof dol ? dot.D(iM, (dol) object2) : dot.R(iM, (String) object2);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dql.c(iM, unsafe.getObject(obj2, jR), dqdVar.u(i2));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.D(iM, (dol) unsafe.getObject(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.U(iM, n(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.F(iM, n(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.ao(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.ap(iM);
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.N(iM, n(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.P(iM, s(obj2, jR));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (dqdVar.M(obj2, iM, i2)) {
                        iC = dot.G(iM, (dqa) unsafe.getObject(obj2, jR), dqdVar.u(i2));
                        iAk += iC;
                        i2 += 3;
                        obj2 = obj;
                    } else {
                        i2 += 3;
                        obj2 = obj;
                    }
                default:
                    i2 += 3;
                    obj2 = obj;
            }
        }
    }

    @Override // defpackage.dqk
    public final int b(Object obj) {
        int i;
        int iK;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iQ = q(i4);
            int iM = m(i4);
            long jR = r(iQ);
            int iHashCode = 37;
            switch (p(iQ)) {
                case 0:
                    i = i3 * 53;
                    long jDoubleToLongBits = Double.doubleToLongBits(dra.a(obj, jR));
                    byte[] bArr = dpk.b;
                    iK = a.k(jDoubleToLongBits);
                    i3 = i + iK;
                    break;
                case 1:
                    i = i3 * 53;
                    iK = Float.floatToIntBits(dra.b(obj, jR));
                    i3 = i + iK;
                    break;
                case 2:
                    i = i3 * 53;
                    long jD = dra.d(obj, jR);
                    byte[] bArr2 = dpk.b;
                    iK = a.k(jD);
                    i3 = i + iK;
                    break;
                case 3:
                    i = i3 * 53;
                    long jD2 = dra.d(obj, jR);
                    byte[] bArr3 = dpk.b;
                    iK = a.k(jD2);
                    i3 = i + iK;
                    break;
                case 4:
                    i = i3 * 53;
                    iK = dra.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 5:
                    i = i3 * 53;
                    long jD3 = dra.d(obj, jR);
                    byte[] bArr4 = dpk.b;
                    iK = a.k(jD3);
                    i3 = i + iK;
                    break;
                case 6:
                    i = i3 * 53;
                    iK = dra.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 7:
                    i = i3 * 53;
                    boolean zT = dra.t(obj, jR);
                    byte[] bArr5 = dpk.b;
                    iK = a.q(zT);
                    i3 = i + iK;
                    break;
                case 8:
                    i = i3 * 53;
                    iK = ((String) dra.f(obj, jR)).hashCode();
                    i3 = i + iK;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objF = dra.f(obj, jR);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iK = dra.f(obj, jR).hashCode();
                    i3 = i + iK;
                    break;
                case 11:
                    i = i3 * 53;
                    iK = dra.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 12:
                    i = i3 * 53;
                    iK = dra.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 13:
                    i = i3 * 53;
                    iK = dra.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 14:
                    i = i3 * 53;
                    long jD4 = dra.d(obj, jR);
                    byte[] bArr6 = dpk.b;
                    iK = a.k(jD4);
                    i3 = i + iK;
                    break;
                case 15:
                    i = i3 * 53;
                    iK = dra.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 16:
                    i = i3 * 53;
                    long jD5 = dra.d(obj, jR);
                    byte[] bArr7 = dpk.b;
                    iK = a.k(jD5);
                    i3 = i + iK;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objF2 = dra.f(obj, jR);
                    if (objF2 != null) {
                        iHashCode = objF2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case 34:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i = i3 * 53;
                    iK = dra.f(obj, jR).hashCode();
                    i3 = i + iK;
                    break;
                case 50:
                    i = i3 * 53;
                    iK = dra.f(obj, jR).hashCode();
                    i3 = i + iK;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jDoubleToLongBits2 = Double.doubleToLongBits(k(obj, jR));
                        byte[] bArr8 = dpk.b;
                        iK = a.k(jDoubleToLongBits2);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = Float.floatToIntBits(l(obj, jR));
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jS = s(obj, jR);
                        byte[] bArr9 = dpk.b;
                        iK = a.k(jS);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jS2 = s(obj, jR);
                        byte[] bArr10 = dpk.b;
                        iK = a.k(jS2);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = n(obj, jR);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jS3 = s(obj, jR);
                        byte[] bArr11 = dpk.b;
                        iK = a.k(jS3);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = n(obj, jR);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        boolean zN = N(obj, jR);
                        byte[] bArr12 = dpk.b;
                        iK = a.q(zN);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = ((String) dra.f(obj, jR)).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = dra.f(obj, jR).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = dra.f(obj, jR).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = n(obj, jR);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = n(obj, jR);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = n(obj, jR);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jS4 = s(obj, jR);
                        byte[] bArr13 = dpk.b;
                        iK = a.k(jS4);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = n(obj, jR);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jS5 = s(obj, jR);
                        byte[] bArr14 = dpk.b;
                        iK = a.k(jS5);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = dra.f(obj, jR).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + dqt.f(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + cws.i(obj).hashCode() : iHashCode2;
    }

    @Override // defpackage.dqk
    public final Object c() {
        return ((dpf) this.g).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    @Override // defpackage.dqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = L(r8)
            if (r0 != 0) goto L8
            goto L90
        L8:
            boolean r0 = r8 instanceof defpackage.dpf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            dpf r0 = (defpackage.dpf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.q(r2)
            r0.memoizedHashCode = r1
            r0.o()
        L1b:
            int[] r0 = r7.c
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L84
            int r2 = r7.q(r1)
            long r3 = r(r2)
            int r2 = p(r2)
            r5 = 9
            if (r2 == r5) goto L6e
            r5 = 60
            if (r2 == r5) goto L56
            r5 = 68
            if (r2 == r5) goto L56
            switch(r2) {
                case 17: goto L6e;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L81
        L3c:
            sun.misc.Unsafe r2 = defpackage.dqd.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            r6 = r5
            dpv r6 = (defpackage.dpv) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L81
        L4e:
            dpj r2 = defpackage.cws.f(r8, r3)
            r2.b()
            goto L81
        L56:
            int r2 = r7.m(r1)
            boolean r2 = r7.M(r8, r2, r1)
            if (r2 == 0) goto L81
            dqk r2 = r7.u(r1)
            sun.misc.Unsafe r5 = defpackage.dqd.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L81
        L6e:
            boolean r2 = r7.I(r8, r1)
            if (r2 == 0) goto L81
            dqk r2 = r7.u(r1)
            sun.misc.Unsafe r5 = defpackage.dqd.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L81:
            int r1 = r1 + 3
            goto L1d
        L84:
            dqt r0 = r7.m
            r0.e(r8)
            boolean r0 = r7.h
            if (r0 == 0) goto L90
            defpackage.cws.k(r8)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqd.d(java.lang.Object):void");
    }

    @Override // defpackage.dqk
    public final void e(Object obj, Object obj2) {
        z(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int iQ = q(i);
            long jR = r(iQ);
            int iM = m(i);
            switch (p(iQ)) {
                case 0:
                    if (I(obj2, i)) {
                        dra.n(obj, jR, dra.a(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(obj2, i)) {
                        dra.o(obj, jR, dra.b(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (I(obj2, i)) {
                        dra.q(obj, jR, dra.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (I(obj2, i)) {
                        dra.q(obj, jR, dra.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (I(obj2, i)) {
                        dra.p(obj, jR, dra.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (I(obj2, i)) {
                        dra.q(obj, jR, dra.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (I(obj2, i)) {
                        dra.p(obj, jR, dra.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (I(obj2, i)) {
                        dra.j(obj, jR, dra.t(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (I(obj2, i)) {
                        dra.r(obj, jR, dra.f(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    A(obj, obj2, i);
                    break;
                case 10:
                    if (I(obj2, i)) {
                        dra.r(obj, jR, dra.f(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (I(obj2, i)) {
                        dra.p(obj, jR, dra.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (I(obj2, i)) {
                        dra.p(obj, jR, dra.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (I(obj2, i)) {
                        dra.p(obj, jR, dra.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (I(obj2, i)) {
                        dra.q(obj, jR, dra.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (I(obj2, i)) {
                        dra.p(obj, jR, dra.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (I(obj2, i)) {
                        dra.q(obj, jR, dra.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    A(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case 34:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    dpj dpjVarF = cws.f(obj, jR);
                    dpj dpjVarF2 = cws.f(obj2, jR);
                    int size = dpjVarF.size();
                    int size2 = dpjVarF2.size();
                    if (size > 0 && size2 > 0) {
                        if (!dpjVarF.c()) {
                            dpjVarF = dpjVarF.d(size2 + size);
                        }
                        dpjVarF.addAll(dpjVarF2);
                    }
                    if (size > 0) {
                        dpjVarF2 = dpjVarF;
                    }
                    dra.r(obj, jR, dpjVarF2);
                    break;
                case 50:
                    Class cls = dql.a;
                    dra.r(obj, jR, cwt.o(dra.f(obj, jR), dra.f(obj2, jR)));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (M(obj2, iM, i)) {
                        dra.r(obj, jR, dra.f(obj2, jR));
                        D(obj, iM, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    B(obj, obj2, i);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (M(obj2, iM, i)) {
                        dra.r(obj, jR, dra.f(obj2, jR));
                        D(obj, iM, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    B(obj, obj2, i);
                    break;
            }
        }
        dql.n(obj, obj2);
        if (this.h) {
            dql.m(obj, obj2);
        }
    }

    @Override // defpackage.dqk
    public final boolean f(Object obj, Object obj2) {
        boolean zQ;
        for (int i = 0; i < this.c.length; i += 3) {
            int iQ = q(i);
            long jR = r(iQ);
            switch (p(iQ)) {
                case 0:
                    if (!G(obj, obj2, i) || Double.doubleToLongBits(dra.a(obj, jR)) != Double.doubleToLongBits(dra.a(obj2, jR))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!G(obj, obj2, i) || Float.floatToIntBits(dra.b(obj, jR)) != Float.floatToIntBits(dra.b(obj2, jR))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!G(obj, obj2, i) || dra.d(obj, jR) != dra.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!G(obj, obj2, i) || dra.d(obj, jR) != dra.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!G(obj, obj2, i) || dra.c(obj, jR) != dra.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!G(obj, obj2, i) || dra.d(obj, jR) != dra.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!G(obj, obj2, i) || dra.c(obj, jR) != dra.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!G(obj, obj2, i) || dra.t(obj, jR) != dra.t(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (G(obj, obj2, i)) {
                        Object objF = dra.f(obj, jR);
                        Object objF2 = dra.f(obj2, jR);
                        Class cls = dql.a;
                        if (a.Q(objF, objF2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (G(obj, obj2, i)) {
                        Object objF3 = dra.f(obj, jR);
                        Object objF4 = dra.f(obj2, jR);
                        Class cls2 = dql.a;
                        if (a.Q(objF3, objF4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (G(obj, obj2, i)) {
                        Object objF5 = dra.f(obj, jR);
                        Object objF6 = dra.f(obj2, jR);
                        Class cls3 = dql.a;
                        if (a.Q(objF5, objF6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!G(obj, obj2, i) || dra.c(obj, jR) != dra.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!G(obj, obj2, i) || dra.c(obj, jR) != dra.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!G(obj, obj2, i) || dra.c(obj, jR) != dra.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!G(obj, obj2, i) || dra.d(obj, jR) != dra.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!G(obj, obj2, i) || dra.c(obj, jR) != dra.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!G(obj, obj2, i) || dra.d(obj, jR) != dra.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (G(obj, obj2, i)) {
                        Object objF7 = dra.f(obj, jR);
                        Object objF8 = dra.f(obj2, jR);
                        Class cls4 = dql.a;
                        if (a.Q(objF7, objF8)) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case 34:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    Object objF9 = dra.f(obj, jR);
                    Object objF10 = dra.f(obj2, jR);
                    Class cls5 = dql.a;
                    zQ = a.Q(objF9, objF10);
                    break;
                case 50:
                    Object objF11 = dra.f(obj, jR);
                    Object objF12 = dra.f(obj2, jR);
                    Class cls6 = dql.a;
                    zQ = a.Q(objF11, objF12);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long jO = o(i) & 1048575;
                    if (dra.c(obj, jO) == dra.c(obj2, jO)) {
                        Object objF13 = dra.f(obj, jR);
                        Object objF14 = dra.f(obj2, jR);
                        Class cls7 = dql.a;
                        if (a.Q(objF13, objF14)) {
                            continue;
                        }
                    }
                    return false;
                default:
            }
            if (!zQ) {
                return false;
            }
        }
        if (!dqt.f(obj).equals(dqt.f(obj2))) {
            return false;
        }
        if (this.h) {
            return cws.i(obj).equals(cws.i(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    @Override // defpackage.dqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqd.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a8, code lost:
    
        r13.put(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ab, code lost:
    
        r20.a.k(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06bd A[LOOP:4: B:238:0x06b9->B:240:0x06bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [dqd] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // defpackage.dqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r19, defpackage.dop r20, defpackage.dox r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqd.h(java.lang.Object, dop, dox):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // defpackage.dqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r19, defpackage.dhq r20) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqd.i(java.lang.Object, dhq):void");
    }
}
