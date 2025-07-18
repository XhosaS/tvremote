package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnc implements cno {
    public static final int[] a = new int[0];
    public static final Unsafe b = cod.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final cmz g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final cnx m;

    public cnc(int[] iArr, Object[] objArr, int i, int i2, cmz cmzVar, int[] iArr2, int i3, int i4, cnx cnxVar, dnx dnxVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = cmzVar instanceof clt;
        boolean z = false;
        if (dnxVar != null && (cmzVar instanceof clr)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = cnxVar;
        this.g = cmzVar;
    }

    private final Object A(Object obj, int i, Object obj2, cnx cnxVar, Object obj3) {
        cly clyVarY;
        int iP = p(i);
        Object objF = cod.f(obj, w(v(i)));
        if (objF == null || (clyVarY = y(i)) == null) {
            return obj2;
        }
        cmt cmtVarBx = dnx.bx(B(i));
        Iterator it = ((cmu) objF).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!clyVarY.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = cnxVar.b(obj3);
                }
                int iP2 = asv.p(cmtVarBx, entry.getKey(), entry.getValue());
                ckv ckvVar = ckv.b;
                byte[] bArr = new byte[iP2];
                cld cldVarAg = cld.ag(bArr);
                try {
                    asv.q(cldVarAg, cmtVarBx, entry.getKey(), entry.getValue());
                    cnxVar.c(obj2, iP, dnx.bH(cldVarAg, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        cno cnoVarZ = z(i);
        long jW = w(v(i));
        if (!N(obj, i)) {
            return cnoVarZ.e();
        }
        Object object = b.getObject(obj, jW);
        if (Q(object)) {
            return object;
        }
        Object objE = cnoVarZ.e();
        if (object != null) {
            cnoVarZ.h(objE, object);
        }
        return objE;
    }

    private final Object D(Object obj, int i, int i2) {
        cno cnoVarZ = z(i2);
        if (!R(obj, i, i2)) {
            return cnoVarZ.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (Q(object)) {
            return object;
        }
        Object objE = cnoVarZ.e();
        if (object != null) {
            cnoVarZ.h(objE, object);
        }
        return objE;
    }

    private static void E(Object obj) {
        if (!Q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void F(Object obj, Object obj2, int i) {
        if (N(obj2, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            cno cnoVarZ = z(i);
            if (!N(obj, i)) {
                if (Q(object)) {
                    Object objE = cnoVarZ.e();
                    cnoVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                H(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!Q(object2)) {
                Object objE2 = cnoVarZ.e();
                cnoVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            cnoVarZ.h(object2, object);
        }
    }

    private final void G(Object obj, Object obj2, int i) {
        int iP = p(i);
        if (R(obj2, iP, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            cno cnoVarZ = z(i);
            if (!R(obj, iP, i)) {
                if (Q(object)) {
                    Object objE = cnoVarZ.e();
                    cnoVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                I(obj, iP, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!Q(object2)) {
                Object objE2 = cnoVarZ.e();
                cnoVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            cnoVarZ.h(object2, object);
        }
    }

    private final void H(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        cod.p(obj, j, (1 << (iS >>> 20)) | cod.c(obj, j));
    }

    private final void I(Object obj, int i, int i2) {
        cod.p(obj, s(i2) & 1048575, i);
    }

    private final void J(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        H(obj, i);
    }

    private final void K(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        I(obj, i, i2);
    }

    private final boolean L(Object obj, Object obj2, int i) {
        return N(obj, i) == N(obj2, i);
    }

    private static boolean M(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean N(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j != 1048575) {
            return (cod.c(obj, j) & (1 << (iS >>> 20))) != 0;
        }
        int iV = v(i);
        long jW = w(iV);
        switch (u(iV)) {
            case 0:
                return Double.doubleToRawLongBits(cod.a(obj, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(cod.b(obj, jW)) != 0;
            case 2:
                return cod.d(obj, jW) != 0;
            case 3:
                return cod.d(obj, jW) != 0;
            case 4:
                return cod.c(obj, jW) != 0;
            case 5:
                return cod.d(obj, jW) != 0;
            case 6:
                return cod.c(obj, jW) != 0;
            case 7:
                return cod.t(obj, jW);
            case 8:
                Object objF = cod.f(obj, jW);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof ckv) {
                    return !ckv.b.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return cod.f(obj, jW) != null;
            case 10:
                return !ckv.b.equals(cod.f(obj, jW));
            case 11:
                return cod.c(obj, jW) != 0;
            case 12:
                return cod.c(obj, jW) != 0;
            case 13:
                return cod.c(obj, jW) != 0;
            case 14:
                return cod.d(obj, jW) != 0;
            case 15:
                return cod.c(obj, jW) != 0;
            case 16:
                return cod.d(obj, jW) != 0;
            case 17:
                return cod.f(obj, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean O(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? N(obj, i) : (i3 & i4) != 0;
    }

    private static boolean P(Object obj, int i, cno cnoVar) {
        return cnoVar.k(cod.f(obj, w(i)));
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof clt) {
            return ((clt) obj).A();
        }
        return true;
    }

    private final boolean R(Object obj, int i, int i2) {
        return cod.c(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean S(Object obj, long j) {
        return ((Boolean) cod.f(obj, j)).booleanValue();
    }

    private final void T(Object obj, int i, ckz ckzVar) {
        if (M(i)) {
            cod.r(obj, w(i), ckzVar.v());
        } else if (this.i) {
            cod.r(obj, w(i), ckzVar.u());
        } else {
            cod.r(obj, w(i), ckzVar.o());
        }
    }

    private static final int U(byte[] bArr, int i, int i2, cog cogVar, Class cls, ckj ckjVar) {
        cog cogVar2 = cog.DOUBLE;
        switch (cogVar) {
            case DOUBLE:
                int i3 = i + 8;
                ckjVar.c = Double.valueOf(ckk.a(bArr, i));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                ckjVar.c = Float.valueOf(ckk.b(bArr, i));
                return i4;
            case INT64:
            case UINT64:
                int iO = ckk.o(bArr, i, ckjVar);
                ckjVar.c = Long.valueOf(ckjVar.b);
                return iO;
            case INT32:
            case UINT32:
            case ENUM:
                int iL = ckk.l(bArr, i, ckjVar);
                ckjVar.c = Integer.valueOf(ckjVar.a);
                return iL;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                ckjVar.c = Long.valueOf(ckk.s(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                ckjVar.c = Integer.valueOf(ckk.d(bArr, i));
                return i6;
            case BOOL:
                int iO2 = ckk.o(bArr, i, ckjVar);
                ckjVar.c = Boolean.valueOf(ckjVar.b != 0);
                return iO2;
            case STRING:
                return ckk.j(bArr, i, ckjVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return ckk.f(cni.a.a(cls), bArr, i, i2, ckjVar);
            case BYTES:
                return ckk.c(bArr, i, ckjVar);
            case SINT32:
                int iL2 = ckk.l(bArr, i, ckjVar);
                ckjVar.c = Integer.valueOf(cky.H(ckjVar.a));
                return iL2;
            case SINT64:
                int iO3 = ckk.o(bArr, i, ckjVar);
                ckjVar.c = Long.valueOf(cky.J(ckjVar.b));
                return iO3;
        }
    }

    private static final void V(int i, Object obj, asv asvVar) {
        if (obj instanceof String) {
            asvVar.H(i, (String) obj);
        } else {
            asvVar.s(i, (ckv) obj);
        }
    }

    static cny d(Object obj) {
        clt cltVar = (clt) obj;
        cny cnyVar = cltVar.v;
        if (cnyVar != cny.a) {
            return cnyVar;
        }
        cny cnyVar2 = new cny();
        cltVar.v = cnyVar2;
        return cnyVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) cod.f(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) cod.f(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) cod.f(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return t(i, 0);
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iP = p(i4);
            if (i == iP) {
                return i4;
            }
            if (i < iP) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & 255;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) cod.f(obj, j)).longValue();
    }

    private final cly y(int i) {
        int i2 = i / 3;
        return (cly) this.d[i2 + i2 + 1];
    }

    private final cno z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        cno cnoVar = (cno) objArr[i3];
        if (cnoVar != null) {
            return cnoVar;
        }
        cno cnoVarA = cni.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = cnoVarA;
        return cnoVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:506:0x03c8  */
    @Override // defpackage.cno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.a(java.lang.Object):int");
    }

    @Override // defpackage.cno
    public final int b(Object obj) {
        int i;
        int iB;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iV = v(i4);
            int iP = p(i4);
            long jW = w(iV);
            int iHashCode = 37;
            switch (u(iV)) {
                case 0:
                    i = i3 * 53;
                    iB = cmf.b(Double.doubleToLongBits(cod.a(obj, jW)));
                    i3 = i + iB;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(cod.b(obj, jW));
                    i3 = i + iB;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = cmf.b(cod.d(obj, jW));
                    i3 = i + iB;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = cmf.b(cod.d(obj, jW));
                    i3 = i + iB;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = cod.c(obj, jW);
                    i3 = i + iB;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = cmf.b(cod.d(obj, jW));
                    i3 = i + iB;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = cod.c(obj, jW);
                    i3 = i + iB;
                    break;
                case 7:
                    i = i3 * 53;
                    iB = cmf.a(cod.t(obj, jW));
                    i3 = i + iB;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) cod.f(obj, jW)).hashCode();
                    i3 = i + iB;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objF = cod.f(obj, jW);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = cod.f(obj, jW).hashCode();
                    i3 = i + iB;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = cod.c(obj, jW);
                    i3 = i + iB;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = cod.c(obj, jW);
                    i3 = i + iB;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = cod.c(obj, jW);
                    i3 = i + iB;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = cmf.b(cod.d(obj, jW));
                    i3 = i + iB;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = cod.c(obj, jW);
                    i3 = i + iB;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = cmf.b(cod.d(obj, jW));
                    i3 = i + iB;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objF2 = cod.f(obj, jW);
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = cod.f(obj, jW).hashCode();
                    i3 = i + iB;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = cod.f(obj, jW).hashCode();
                    i3 = i + iB;
                    break;
                case 51:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.b(Double.doubleToLongBits(n(obj, jW)));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(o(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.a(S(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = ((String) cod.f(obj, jW)).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cod.f(obj, jW).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cod.f(obj, jW).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cmf.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = cod.f(obj, jW).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + cnx.f(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + dnx.bD(obj).hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.ckj r40) {
        /*
            Method dump skipped, instructions count: 3906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.c(java.lang.Object, byte[], int, int, int, ckj):int");
    }

    @Override // defpackage.cno
    public final Object e() {
        return ((clt) this.g).p();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0073  */
    @Override // defpackage.cno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = Q(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof defpackage.clt
            r1 = 0
            if (r0 == 0) goto L20
            r0 = r8
            clt r0 = (defpackage.clt) r0
            int r2 = r0.u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r3
            r0.u = r2
            r0.s = r1
            r0.x()
        L20:
            int[] r0 = r7.c
        L22:
            int r2 = r0.length
            if (r1 >= r2) goto L89
            int r2 = r7.v(r1)
            long r3 = w(r2)
            int r2 = u(r2)
            r5 = 9
            if (r2 == r5) goto L73
            r5 = 60
            if (r2 == r5) goto L5b
            r5 = 68
            if (r2 == r5) goto L5b
            switch(r2) {
                case 17: goto L73;
                case 18: goto L53;
                case 19: goto L53;
                case 20: goto L53;
                case 21: goto L53;
                case 22: goto L53;
                case 23: goto L53;
                case 24: goto L53;
                case 25: goto L53;
                case 26: goto L53;
                case 27: goto L53;
                case 28: goto L53;
                case 29: goto L53;
                case 30: goto L53;
                case 31: goto L53;
                case 32: goto L53;
                case 33: goto L53;
                case 34: goto L53;
                case 35: goto L53;
                case 36: goto L53;
                case 37: goto L53;
                case 38: goto L53;
                case 39: goto L53;
                case 40: goto L53;
                case 41: goto L53;
                case 42: goto L53;
                case 43: goto L53;
                case 44: goto L53;
                case 45: goto L53;
                case 46: goto L53;
                case 47: goto L53;
                case 48: goto L53;
                case 49: goto L53;
                case 50: goto L41;
                default: goto L40;
            }
        L40:
            goto L86
        L41:
            sun.misc.Unsafe r2 = defpackage.cnc.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L86
            r6 = r5
            cmu r6 = (defpackage.cmu) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L86
        L53:
            cme r2 = defpackage.dnx.bB(r8, r3)
            r2.b()
            goto L86
        L5b:
            int r2 = r7.p(r1)
            boolean r2 = r7.R(r8, r2, r1)
            if (r2 == 0) goto L86
            cno r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.cnc.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
            goto L86
        L73:
            boolean r2 = r7.N(r8, r1)
            if (r2 == 0) goto L86
            cno r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.cnc.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
        L86:
            int r1 = r1 + 3
            goto L22
        L89:
            cnx r0 = r7.m
            r0.e(r8)
            boolean r0 = r7.h
            if (r0 == 0) goto L95
            defpackage.dnx.bG(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.g(java.lang.Object):void");
    }

    @Override // defpackage.cno
    public final void h(Object obj, Object obj2) {
        E(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            int iP = p(i);
            switch (u(iV)) {
                case 0:
                    if (N(obj2, i)) {
                        cod.n(obj, jW, cod.a(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (N(obj2, i)) {
                        cod.o(obj, jW, cod.b(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (N(obj2, i)) {
                        cod.q(obj, jW, cod.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (N(obj2, i)) {
                        cod.q(obj, jW, cod.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (N(obj2, i)) {
                        cod.p(obj, jW, cod.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (N(obj2, i)) {
                        cod.q(obj, jW, cod.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (N(obj2, i)) {
                        cod.p(obj, jW, cod.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (N(obj2, i)) {
                        cod.j(obj, jW, cod.t(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (N(obj2, i)) {
                        cod.r(obj, jW, cod.f(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    F(obj, obj2, i);
                    break;
                case 10:
                    if (N(obj2, i)) {
                        cod.r(obj, jW, cod.f(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (N(obj2, i)) {
                        cod.p(obj, jW, cod.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (N(obj2, i)) {
                        cod.p(obj, jW, cod.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (N(obj2, i)) {
                        cod.p(obj, jW, cod.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (N(obj2, i)) {
                        cod.q(obj, jW, cod.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (N(obj2, i)) {
                        cod.p(obj, jW, cod.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (N(obj2, i)) {
                        cod.q(obj, jW, cod.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    F(obj, obj2, i);
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    cme cmeVarBB = dnx.bB(obj, jW);
                    cme cmeVarBB2 = dnx.bB(obj2, jW);
                    int size = cmeVarBB.size();
                    int size2 = cmeVarBB2.size();
                    if (size > 0 && size2 > 0) {
                        if (!cmeVarBB.c()) {
                            cmeVarBB = cmeVarBB.d(size2 + size);
                        }
                        cmeVarBB.addAll(cmeVarBB2);
                    }
                    if (size > 0) {
                        cmeVarBB2 = cmeVarBB;
                    }
                    cod.r(obj, jW, cmeVarBB2);
                    break;
                case 50:
                    cnx cnxVar = cnp.a;
                    cod.r(obj, jW, dnx.bz(cod.f(obj, jW), cod.f(obj2, jW)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (R(obj2, iP, i)) {
                        cod.r(obj, jW, cod.f(obj2, jW));
                        I(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    G(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (R(obj2, iP, i)) {
                        cod.r(obj, jW, cod.f(obj2, jW));
                        I(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    G(obj, obj2, i);
                    break;
            }
        }
        cnp.n(obj, obj2);
        if (this.h) {
            cnp.m(obj, obj2);
        }
    }

    @Override // defpackage.cno
    public final void i(Object obj, byte[] bArr, int i, int i2, ckj ckjVar) {
        c(obj, bArr, i, i2, 0, ckjVar);
    }

    @Override // defpackage.cno
    public final boolean j(Object obj, Object obj2) {
        boolean zX;
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            switch (u(iV)) {
                case 0:
                    if (!L(obj, obj2, i) || Double.doubleToLongBits(cod.a(obj, jW)) != Double.doubleToLongBits(cod.a(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!L(obj, obj2, i) || Float.floatToIntBits(cod.b(obj, jW)) != Float.floatToIntBits(cod.b(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!L(obj, obj2, i) || cod.d(obj, jW) != cod.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!L(obj, obj2, i) || cod.d(obj, jW) != cod.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!L(obj, obj2, i) || cod.c(obj, jW) != cod.c(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!L(obj, obj2, i) || cod.d(obj, jW) != cod.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!L(obj, obj2, i) || cod.c(obj, jW) != cod.c(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!L(obj, obj2, i) || cod.t(obj, jW) != cod.t(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (L(obj, obj2, i)) {
                        Object objF = cod.f(obj, jW);
                        Object objF2 = cod.f(obj2, jW);
                        cnx cnxVar = cnp.a;
                        if (ii.X(objF, objF2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (L(obj, obj2, i)) {
                        Object objF3 = cod.f(obj, jW);
                        Object objF4 = cod.f(obj2, jW);
                        cnx cnxVar2 = cnp.a;
                        if (ii.X(objF3, objF4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (L(obj, obj2, i)) {
                        Object objF5 = cod.f(obj, jW);
                        Object objF6 = cod.f(obj2, jW);
                        cnx cnxVar3 = cnp.a;
                        if (ii.X(objF5, objF6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!L(obj, obj2, i) || cod.c(obj, jW) != cod.c(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!L(obj, obj2, i) || cod.c(obj, jW) != cod.c(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!L(obj, obj2, i) || cod.c(obj, jW) != cod.c(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!L(obj, obj2, i) || cod.d(obj, jW) != cod.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!L(obj, obj2, i) || cod.c(obj, jW) != cod.c(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!L(obj, obj2, i) || cod.d(obj, jW) != cod.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (L(obj, obj2, i)) {
                        Object objF7 = cod.f(obj, jW);
                        Object objF8 = cod.f(obj2, jW);
                        cnx cnxVar4 = cnp.a;
                        if (ii.X(objF7, objF8)) {
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
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    Object objF9 = cod.f(obj, jW);
                    Object objF10 = cod.f(obj2, jW);
                    cnx cnxVar5 = cnp.a;
                    zX = ii.X(objF9, objF10);
                    break;
                case 50:
                    Object objF11 = cod.f(obj, jW);
                    Object objF12 = cod.f(obj2, jW);
                    cnx cnxVar6 = cnp.a;
                    zX = ii.X(objF11, objF12);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jS = s(i) & 1048575;
                    if (cod.c(obj, jS) == cod.c(obj2, jS)) {
                        Object objF13 = cod.f(obj, jW);
                        Object objF14 = cod.f(obj2, jW);
                        cnx cnxVar7 = cnp.a;
                        if (ii.X(objF13, objF14)) {
                            continue;
                        }
                    }
                    return false;
                default:
            }
            if (!zX) {
                return false;
            }
        }
        if (!cnx.f(obj).equals(cnx.f(obj2))) {
            return false;
        }
        if (this.h) {
            return dnx.bD(obj).equals(dnx.bD(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00be  */
    @Override // defpackage.cno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.k(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:570:0x0408, code lost:
    
        r3.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x040b, code lost:
    
        r22.a.A(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0412, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0416, code lost:
    
        r22.a.A(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x041b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0187 A[Catch: all -> 0x01b8, TryCatch #8 {all -> 0x01b8, blocks: (B:438:0x0054, B:439:0x0058, B:441:0x0060, B:442:0x0068, B:475:0x0176, B:483:0x01a3, B:480:0x0187, B:482:0x0191, B:444:0x006e, B:445:0x0078, B:446:0x0082, B:447:0x008c, B:448:0x0096, B:449:0x009d, B:450:0x009e, B:451:0x00a8, B:452:0x00ae, B:454:0x00bb, B:456:0x00ca, B:457:0x00d7, B:458:0x00dc, B:459:0x00e8, B:461:0x00f5, B:463:0x0104, B:464:0x0111, B:465:0x0116, B:466:0x012a, B:467:0x012f, B:468:0x0138, B:469:0x0141, B:470:0x014a, B:471:0x0153, B:472:0x015c, B:473:0x0165, B:474:0x016e, B:485:0x01ad, B:486:0x01b0, B:488:0x01b3), top: B:718:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:693:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0823 A[LOOP:3: B:702:0x081f->B:704:0x0823, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x07e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:741:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:813:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:837:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // defpackage.cno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r21, defpackage.ckz r22, defpackage.cli r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.l(java.lang.Object, ckz, cli):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0020  */
    @Override // defpackage.cno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r21, defpackage.asv r22) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnc.m(java.lang.Object, asv):void");
    }
}
