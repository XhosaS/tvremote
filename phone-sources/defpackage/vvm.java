package defpackage;

import android.support.v7.appcompat.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvm<T> implements vvy<T> {
    public static final int[] a = new int[0];
    public static final Unsafe b = vwl.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final vvj g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final vwg m;

    public vvm(int[] iArr, Object[] objArr, int i, int i2, vvj vvjVar, int[] iArr2, int i3, int i4, vwg vwgVar, vxr vxrVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = vvjVar instanceof vuc;
        boolean z = false;
        if (vxrVar != null && (vvjVar instanceof vtz)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = vwgVar;
        this.g = vvjVar;
    }

    private final Object A(Object obj, int i, Object obj2, vwg vwgVar, Object obj3) {
        vuh vuhVarY;
        int iP = p(i);
        Object objH = vwl.h(obj, w(v(i)));
        if (objH == null || (vuhVarY = y(i)) == null) {
            return obj2;
        }
        vvd vvdVarQ = vxr.Q(B(i));
        Iterator it = ((vve) objH).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!vuhVarY.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = vwgVar.b(obj3);
                }
                int i2 = upo.i(vvdVarQ, entry.getKey(), entry.getValue());
                vsz vszVar = vsz.b;
                byte[] bArr = new byte[i2];
                vtj vtjVarAh = vtj.ah(bArr);
                try {
                    upo.j(vtjVarAh, vvdVarQ, entry.getKey(), entry.getValue());
                    vwgVar.c(obj2, iP, vxr.aa(vtjVarAh, bArr));
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
        vvy vvyVarZ = z(i);
        long jW = w(v(i));
        if (!N(obj, i)) {
            return vvyVarZ.e();
        }
        Object object = b.getObject(obj, jW);
        if (Q(object)) {
            return object;
        }
        Object objE = vvyVarZ.e();
        if (object != null) {
            vvyVarZ.h(objE, object);
        }
        return objE;
    }

    private final Object D(Object obj, int i, int i2) {
        vvy vvyVarZ = z(i2);
        if (!R(obj, i, i2)) {
            return vvyVarZ.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (Q(object)) {
            return object;
        }
        Object objE = vvyVarZ.e();
        if (object != null) {
            vvyVarZ.h(objE, object);
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
            vvy vvyVarZ = z(i);
            if (!N(obj, i)) {
                if (Q(object)) {
                    Object objE = vvyVarZ.e();
                    vvyVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                H(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!Q(object2)) {
                Object objE2 = vvyVarZ.e();
                vvyVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            vvyVarZ.h(object2, object);
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
            vvy vvyVarZ = z(i);
            if (!R(obj, iP, i)) {
                if (Q(object)) {
                    Object objE = vvyVarZ.e();
                    vvyVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                I(obj, iP, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!Q(object2)) {
                Object objE2 = vvyVarZ.e();
                vvyVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            vvyVarZ.h(object2, object);
        }
    }

    private final void H(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        vwl.s(obj, j, (1 << (iS >>> 20)) | vwl.d(obj, j));
    }

    private final void I(Object obj, int i, int i2) {
        vwl.s(obj, s(i2) & 1048575, i);
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
            return (vwl.d(obj, j) & (1 << (iS >>> 20))) != 0;
        }
        int iV = v(i);
        long jW = w(iV);
        switch (u(iV)) {
            case 0:
                return Double.doubleToRawLongBits(vwl.b(obj, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(vwl.c(obj, jW)) != 0;
            case 2:
                return vwl.f(obj, jW) != 0;
            case 3:
                return vwl.f(obj, jW) != 0;
            case 4:
                return vwl.d(obj, jW) != 0;
            case 5:
                return vwl.f(obj, jW) != 0;
            case 6:
                return vwl.d(obj, jW) != 0;
            case 7:
                return vwl.w(obj, jW);
            case 8:
                Object objH = vwl.h(obj, jW);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof vsz) {
                    return !vsz.b.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return vwl.h(obj, jW) != null;
            case 10:
                return !vsz.b.equals(vwl.h(obj, jW));
            case 11:
                return vwl.d(obj, jW) != 0;
            case 12:
                return vwl.d(obj, jW) != 0;
            case 13:
                return vwl.d(obj, jW) != 0;
            case 14:
                return vwl.f(obj, jW) != 0;
            case 15:
                return vwl.d(obj, jW) != 0;
            case 16:
                return vwl.f(obj, jW) != 0;
            case 17:
                return vwl.h(obj, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean O(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? N(obj, i) : (i3 & i4) != 0;
    }

    private static boolean P(Object obj, int i, vvy vvyVar) {
        return vvyVar.k(vwl.h(obj, w(i)));
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vuc) {
            return ((vuc) obj).A();
        }
        return true;
    }

    private final boolean R(Object obj, int i, int i2) {
        return vwl.d(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean S(Object obj, long j) {
        return ((Boolean) vwl.h(obj, j)).booleanValue();
    }

    private final void T(Object obj, int i, vtf vtfVar) {
        if (M(i)) {
            vwl.u(obj, w(i), vtfVar.v());
        } else if (this.i) {
            vwl.u(obj, w(i), vtfVar.u());
        } else {
            vwl.u(obj, w(i), vtfVar.o());
        }
    }

    private static final int U(byte[] bArr, int i, int i2, vwo vwoVar, Class cls, vsm vsmVar) {
        vwo vwoVar2 = vwo.DOUBLE;
        switch (vwoVar) {
            case DOUBLE:
                int i3 = i + 8;
                vsmVar.c = Double.valueOf(vsn.a(bArr, i));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                vsmVar.c = Float.valueOf(vsn.b(bArr, i));
                return i4;
            case INT64:
            case UINT64:
                int iO = vsn.o(bArr, i, vsmVar);
                vsmVar.c = Long.valueOf(vsmVar.b);
                return iO;
            case INT32:
            case UINT32:
            case ENUM:
                int iL = vsn.l(bArr, i, vsmVar);
                vsmVar.c = Integer.valueOf(vsmVar.a);
                return iL;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                vsmVar.c = Long.valueOf(vsn.s(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                vsmVar.c = Integer.valueOf(vsn.d(bArr, i));
                return i6;
            case BOOL:
                int iO2 = vsn.o(bArr, i, vsmVar);
                vsmVar.c = Boolean.valueOf(vsmVar.b != 0);
                return iO2;
            case STRING:
                return vsn.j(bArr, i, vsmVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return vsn.f(vvs.a.a(cls), bArr, i, i2, vsmVar);
            case BYTES:
                return vsn.c(bArr, i, vsmVar);
            case SINT32:
                int iL2 = vsn.l(bArr, i, vsmVar);
                vsmVar.c = Integer.valueOf(vte.I(vsmVar.a));
                return iL2;
            case SINT64:
                int iO3 = vsn.o(bArr, i, vsmVar);
                vsmVar.c = Long.valueOf(vte.K(vsmVar.b));
                return iO3;
        }
    }

    private static final void V(int i, Object obj, ulp ulpVar) {
        if (obj instanceof String) {
            ulpVar.P(i, (String) obj);
        } else {
            ulpVar.A(i, (vsz) obj);
        }
    }

    static vwh d(Object obj) {
        vuc vucVar = (vuc) obj;
        vwh vwhVar = vucVar.P;
        if (vwhVar != vwh.a) {
            return vwhVar;
        }
        vwh vwhVar2 = new vwh();
        vucVar.P = vwhVar2;
        return vwhVar2;
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
        return ((Double) vwl.h(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) vwl.h(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) vwl.h(obj, j)).intValue();
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
        return ((Long) vwl.h(obj, j)).longValue();
    }

    private final vuh y(int i) {
        int i2 = i / 3;
        return (vuh) this.d[i2 + i2 + 1];
    }

    private final vvy z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        vvy vvyVar = (vvy) objArr[i3];
        if (vvyVar != null) {
            return vvyVar;
        }
        vvy vvyVarA = vvs.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = vvyVarA;
        return vvyVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x03c8  */
    @Override // defpackage.vvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvm.a(java.lang.Object):int");
    }

    @Override // defpackage.vvy
    public final int b(Object obj) {
        int i;
        int iK;
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
                    long jDoubleToLongBits = Double.doubleToLongBits(vwl.b(obj, jW));
                    Charset charset = vuo.a;
                    iK = a.k(jDoubleToLongBits);
                    i3 = i + iK;
                    break;
                case 1:
                    i = i3 * 53;
                    iK = Float.floatToIntBits(vwl.c(obj, jW));
                    i3 = i + iK;
                    break;
                case 2:
                    i = i3 * 53;
                    long jF = vwl.f(obj, jW);
                    Charset charset2 = vuo.a;
                    iK = a.k(jF);
                    i3 = i + iK;
                    break;
                case 3:
                    i = i3 * 53;
                    long jF2 = vwl.f(obj, jW);
                    Charset charset3 = vuo.a;
                    iK = a.k(jF2);
                    i3 = i + iK;
                    break;
                case 4:
                    i = i3 * 53;
                    iK = vwl.d(obj, jW);
                    i3 = i + iK;
                    break;
                case 5:
                    i = i3 * 53;
                    long jF3 = vwl.f(obj, jW);
                    Charset charset4 = vuo.a;
                    iK = a.k(jF3);
                    i3 = i + iK;
                    break;
                case 6:
                    i = i3 * 53;
                    iK = vwl.d(obj, jW);
                    i3 = i + iK;
                    break;
                case 7:
                    i = i3 * 53;
                    boolean zW = vwl.w(obj, jW);
                    Charset charset5 = vuo.a;
                    iK = a.q(zW);
                    i3 = i + iK;
                    break;
                case 8:
                    i = i3 * 53;
                    iK = ((String) vwl.h(obj, jW)).hashCode();
                    i3 = i + iK;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objH = vwl.h(obj, jW);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iK = vwl.h(obj, jW).hashCode();
                    i3 = i + iK;
                    break;
                case 11:
                    i = i3 * 53;
                    iK = vwl.d(obj, jW);
                    i3 = i + iK;
                    break;
                case 12:
                    i = i3 * 53;
                    iK = vwl.d(obj, jW);
                    i3 = i + iK;
                    break;
                case 13:
                    i = i3 * 53;
                    iK = vwl.d(obj, jW);
                    i3 = i + iK;
                    break;
                case 14:
                    i = i3 * 53;
                    long jF4 = vwl.f(obj, jW);
                    Charset charset6 = vuo.a;
                    iK = a.k(jF4);
                    i3 = i + iK;
                    break;
                case 15:
                    i = i3 * 53;
                    iK = vwl.d(obj, jW);
                    i3 = i + iK;
                    break;
                case 16:
                    i = i3 * 53;
                    long jF5 = vwl.f(obj, jW);
                    Charset charset7 = vuo.a;
                    iK = a.k(jF5);
                    i3 = i + iK;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objH2 = vwl.h(obj, jW);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iK = vwl.h(obj, jW).hashCode();
                    i3 = i + iK;
                    break;
                case 50:
                    i = i3 * 53;
                    iK = vwl.h(obj, jW).hashCode();
                    i3 = i + iK;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jDoubleToLongBits2 = Double.doubleToLongBits(n(obj, jW));
                        Charset charset8 = vuo.a;
                        iK = a.k(jDoubleToLongBits2);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = Float.floatToIntBits(o(obj, jW));
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX = x(obj, jW);
                        Charset charset9 = vuo.a;
                        iK = a.k(jX);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX2 = x(obj, jW);
                        Charset charset10 = vuo.a;
                        iK = a.k(jX2);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = q(obj, jW);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX3 = x(obj, jW);
                        Charset charset11 = vuo.a;
                        iK = a.k(jX3);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = q(obj, jW);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        boolean zS = S(obj, jW);
                        Charset charset12 = vuo.a;
                        iK = a.q(zS);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = ((String) vwl.h(obj, jW)).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = vwl.h(obj, jW).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = vwl.h(obj, jW).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = q(obj, jW);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = q(obj, jW);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = q(obj, jW);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX4 = x(obj, jW);
                        Charset charset13 = vuo.a;
                        iK = a.k(jX4);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = q(obj, jW);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        long jX5 = x(obj, jW);
                        Charset charset14 = vuo.a;
                        iK = a.k(jX5);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (R(obj, iP, i4)) {
                        i = i3 * 53;
                        iK = vwl.h(obj, jW).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + vwg.f(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + vxr.W(obj).hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.vsm r40) {
        /*
            Method dump skipped, instructions count: 3906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvm.c(java.lang.Object, byte[], int, int, int, vsm):int");
    }

    @Override // defpackage.vvy
    public final Object e() {
        return ((vuc) this.g).o();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // defpackage.vvy
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
            boolean r0 = r8 instanceof defpackage.vuc
            r1 = 0
            if (r0 == 0) goto L20
            r0 = r8
            vuc r0 = (defpackage.vuc) r0
            int r2 = r0.O
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r3
            r0.O = r2
            r0.M = r1
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
            sun.misc.Unsafe r2 = defpackage.vvm.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L86
            r6 = r5
            vve r6 = (defpackage.vve) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L86
        L53:
            vun r2 = defpackage.vxr.U(r8, r3)
            r2.b()
            goto L86
        L5b:
            int r2 = r7.p(r1)
            boolean r2 = r7.R(r8, r2, r1)
            if (r2 == 0) goto L86
            vvy r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.vvm.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
            goto L86
        L73:
            boolean r2 = r7.N(r8, r1)
            if (r2 == 0) goto L86
            vvy r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.vvm.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
        L86:
            int r1 = r1 + 3
            goto L22
        L89:
            vwg r0 = r7.m
            r0.e(r8)
            boolean r0 = r7.h
            if (r0 == 0) goto L95
            defpackage.vxr.Z(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvm.g(java.lang.Object):void");
    }

    @Override // defpackage.vvy
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
                        vwl.q(obj, jW, vwl.b(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (N(obj2, i)) {
                        vwl.r(obj, jW, vwl.c(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (N(obj2, i)) {
                        vwl.t(obj, jW, vwl.f(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (N(obj2, i)) {
                        vwl.t(obj, jW, vwl.f(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (N(obj2, i)) {
                        vwl.s(obj, jW, vwl.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (N(obj2, i)) {
                        vwl.t(obj, jW, vwl.f(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (N(obj2, i)) {
                        vwl.s(obj, jW, vwl.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (N(obj2, i)) {
                        vwl.m(obj, jW, vwl.w(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (N(obj2, i)) {
                        vwl.u(obj, jW, vwl.h(obj2, jW));
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
                        vwl.u(obj, jW, vwl.h(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (N(obj2, i)) {
                        vwl.s(obj, jW, vwl.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (N(obj2, i)) {
                        vwl.s(obj, jW, vwl.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (N(obj2, i)) {
                        vwl.s(obj, jW, vwl.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (N(obj2, i)) {
                        vwl.t(obj, jW, vwl.f(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (N(obj2, i)) {
                        vwl.s(obj, jW, vwl.d(obj2, jW));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (N(obj2, i)) {
                        vwl.t(obj, jW, vwl.f(obj2, jW));
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
                    vun vunVarU = vxr.U(obj, jW);
                    vun vunVarU2 = vxr.U(obj2, jW);
                    int size = vunVarU.size();
                    int size2 = vunVarU2.size();
                    if (size > 0 && size2 > 0) {
                        if (!vunVarU.c()) {
                            vunVarU = vunVarU.d(size2 + size);
                        }
                        vunVarU.addAll(vunVarU2);
                    }
                    if (size > 0) {
                        vunVarU2 = vunVarU;
                    }
                    vwl.u(obj, jW, vunVarU2);
                    break;
                case 50:
                    vwg vwgVar = vvz.a;
                    vwl.u(obj, jW, vxr.S(vwl.h(obj, jW), vwl.h(obj2, jW)));
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
                    if (R(obj2, iP, i)) {
                        vwl.u(obj, jW, vwl.h(obj2, jW));
                        I(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    G(obj, obj2, i);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (R(obj2, iP, i)) {
                        vwl.u(obj, jW, vwl.h(obj2, jW));
                        I(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    G(obj, obj2, i);
                    break;
            }
        }
        vvz.n(obj, obj2);
        if (this.h) {
            vvz.m(obj, obj2);
        }
    }

    @Override // defpackage.vvy
    public final void i(Object obj, byte[] bArr, int i, int i2, vsm vsmVar) {
        c(obj, bArr, i, i2, 0, vsmVar);
    }

    @Override // defpackage.vvy
    public final boolean j(Object obj, Object obj2) {
        boolean zQ;
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            switch (u(iV)) {
                case 0:
                    if (!L(obj, obj2, i) || Double.doubleToLongBits(vwl.b(obj, jW)) != Double.doubleToLongBits(vwl.b(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!L(obj, obj2, i) || Float.floatToIntBits(vwl.c(obj, jW)) != Float.floatToIntBits(vwl.c(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!L(obj, obj2, i) || vwl.f(obj, jW) != vwl.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!L(obj, obj2, i) || vwl.f(obj, jW) != vwl.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!L(obj, obj2, i) || vwl.d(obj, jW) != vwl.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!L(obj, obj2, i) || vwl.f(obj, jW) != vwl.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!L(obj, obj2, i) || vwl.d(obj, jW) != vwl.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!L(obj, obj2, i) || vwl.w(obj, jW) != vwl.w(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (L(obj, obj2, i)) {
                        Object objH = vwl.h(obj, jW);
                        Object objH2 = vwl.h(obj2, jW);
                        vwg vwgVar = vvz.a;
                        if (a.Q(objH, objH2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (L(obj, obj2, i)) {
                        Object objH3 = vwl.h(obj, jW);
                        Object objH4 = vwl.h(obj2, jW);
                        vwg vwgVar2 = vvz.a;
                        if (a.Q(objH3, objH4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (L(obj, obj2, i)) {
                        Object objH5 = vwl.h(obj, jW);
                        Object objH6 = vwl.h(obj2, jW);
                        vwg vwgVar3 = vvz.a;
                        if (a.Q(objH5, objH6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!L(obj, obj2, i) || vwl.d(obj, jW) != vwl.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!L(obj, obj2, i) || vwl.d(obj, jW) != vwl.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!L(obj, obj2, i) || vwl.d(obj, jW) != vwl.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!L(obj, obj2, i) || vwl.f(obj, jW) != vwl.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!L(obj, obj2, i) || vwl.d(obj, jW) != vwl.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!L(obj, obj2, i) || vwl.f(obj, jW) != vwl.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (L(obj, obj2, i)) {
                        Object objH7 = vwl.h(obj, jW);
                        Object objH8 = vwl.h(obj2, jW);
                        vwg vwgVar4 = vvz.a;
                        if (a.Q(objH7, objH8)) {
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
                    Object objH9 = vwl.h(obj, jW);
                    Object objH10 = vwl.h(obj2, jW);
                    vwg vwgVar5 = vvz.a;
                    zQ = a.Q(objH9, objH10);
                    break;
                case 50:
                    Object objH11 = vwl.h(obj, jW);
                    Object objH12 = vwl.h(obj2, jW);
                    vwg vwgVar6 = vvz.a;
                    zQ = a.Q(objH11, objH12);
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
                    long jS = s(i) & 1048575;
                    if (vwl.d(obj, jS) == vwl.d(obj2, jS)) {
                        Object objH13 = vwl.h(obj, jW);
                        Object objH14 = vwl.h(obj2, jW);
                        vwg vwgVar7 = vvz.a;
                        if (a.Q(objH13, objH14)) {
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
        if (!vwg.f(obj).equals(vwg.f(obj2))) {
            return false;
        }
        if (this.h) {
            return vxr.W(obj).equals(vxr.W(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    @Override // defpackage.vvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvm.k(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0408, code lost:
    
        r3.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x040b, code lost:
    
        r22.a.A(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0412, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0416, code lost:
    
        r22.a.A(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x041b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0823 A[LOOP:3: B:283:0x081f->B:285:0x0823, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187 A[Catch: all -> 0x01b8, TryCatch #8 {all -> 0x01b8, blocks: (B:19:0x0054, B:20:0x0058, B:22:0x0060, B:23:0x0068, B:56:0x0176, B:64:0x01a3, B:61:0x0187, B:63:0x0191, B:25:0x006e, B:26:0x0078, B:27:0x0082, B:28:0x008c, B:29:0x0096, B:30:0x009d, B:31:0x009e, B:32:0x00a8, B:33:0x00ae, B:35:0x00bb, B:37:0x00ca, B:38:0x00d7, B:39:0x00dc, B:40:0x00e8, B:42:0x00f5, B:44:0x0104, B:45:0x0111, B:46:0x0116, B:47:0x012a, B:48:0x012f, B:49:0x0138, B:50:0x0141, B:51:0x014a, B:52:0x0153, B:53:0x015c, B:54:0x0165, B:55:0x016e, B:66:0x01ad, B:67:0x01b0, B:69:0x01b3), top: B:299:0x0054 }] */
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
    @Override // defpackage.vvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r21, defpackage.vtf r22, defpackage.vtp r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvm.l(java.lang.Object, vtf, vtp):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // defpackage.vvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r21, defpackage.ulp r22) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvm.m(java.lang.Object, ulp):void");
    }
}
