package defpackage;

import android.support.v7.appcompat.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfk implements dfs {
    private static final int[] a = new int[0];
    private static final Unsafe b = dgf.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final dfh g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final dfz m;

    private dfk(int[] iArr, Object[] objArr, int i, int i2, dfh dfhVar, int[] iArr2, int i3, int i4, dfz dfzVar, cwt cwtVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = dfhVar instanceof dek;
        boolean z = false;
        if (cwtVar != null && (dfhVar instanceof dej)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = dfzVar;
        this.g = dfhVar;
    }

    private final void A(Object obj, Object obj2, int i) {
        if (I(obj2, i)) {
            long jR = r(q(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m(i) + " is present but null: " + obj2);
            }
            dfs dfsVarU = u(i);
            if (!I(obj, i)) {
                if (L(object)) {
                    Object objC = dfsVarU.c();
                    dfsVarU.e(objC, object);
                    unsafe.putObject(obj, jR, objC);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                C(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!L(object2)) {
                Object objC2 = dfsVarU.c();
                dfsVarU.e(objC2, object2);
                unsafe.putObject(obj, jR, objC2);
                object2 = objC2;
            }
            dfsVarU.e(object2, object);
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
            dfs dfsVarU = u(i);
            if (!M(obj, iM, i)) {
                if (L(object)) {
                    Object objC = dfsVarU.c();
                    dfsVarU.e(objC, object);
                    unsafe.putObject(obj, jR, objC);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                D(obj, iM, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!L(object2)) {
                Object objC2 = dfsVarU.c();
                dfsVarU.e(objC2, object2);
                unsafe.putObject(obj, jR, objC2);
                object2 = objC2;
            }
            dfsVarU.e(object2, object);
        }
    }

    private final void C(Object obj, int i) {
        int iO = o(i);
        long j = 1048575 & iO;
        if (j == 1048575) {
            return;
        }
        dgf.p(obj, j, (1 << (iO >>> 20)) | dgf.c(obj, j));
    }

    private final void D(Object obj, int i, int i2) {
        dgf.p(obj, o(i2) & 1048575, i);
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
            return (dgf.c(obj, j) & (1 << (iO >>> 20))) != 0;
        }
        int iQ = q(i);
        long jR = r(iQ);
        switch (p(iQ)) {
            case 0:
                return Double.doubleToRawLongBits(dgf.a(obj, jR)) != 0;
            case 1:
                return Float.floatToRawIntBits(dgf.b(obj, jR)) != 0;
            case 2:
                return dgf.d(obj, jR) != 0;
            case 3:
                return dgf.d(obj, jR) != 0;
            case 4:
                return dgf.c(obj, jR) != 0;
            case 5:
                return dgf.d(obj, jR) != 0;
            case 6:
                return dgf.c(obj, jR) != 0;
            case 7:
                return dgf.t(obj, jR);
            case 8:
                Object objF = dgf.f(obj, jR);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof dds) {
                    return !dds.b.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return dgf.f(obj, jR) != null;
            case 10:
                return !dds.b.equals(dgf.f(obj, jR));
            case 11:
                return dgf.c(obj, jR) != 0;
            case 12:
                return dgf.c(obj, jR) != 0;
            case 13:
                return dgf.c(obj, jR) != 0;
            case 14:
                return dgf.d(obj, jR) != 0;
            case 15:
                return dgf.c(obj, jR) != 0;
            case 16:
                return dgf.d(obj, jR) != 0;
            case 17:
                return dgf.f(obj, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean J(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? I(obj, i) : (i3 & i4) != 0;
    }

    private static boolean K(Object obj, int i, dfs dfsVar) {
        return dfsVar.g(dgf.f(obj, r(i)));
    }

    private static boolean L(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof dek) {
            return ((dek) obj).t();
        }
        return true;
    }

    private final boolean M(Object obj, int i, int i2) {
        return dgf.c(obj, (long) (o(i2) & 1048575)) == i;
    }

    private static boolean N(Object obj, long j) {
        return ((Boolean) dgf.f(obj, j)).booleanValue();
    }

    private final void O(Object obj, int i, som somVar) {
        if (H(i)) {
            dgf.r(obj, r(i), somVar.v());
        } else if (this.i) {
            dgf.r(obj, r(i), somVar.u());
        } else {
            dgf.r(obj, r(i), somVar.r());
        }
    }

    private static final void P(int i, Object obj, cxe cxeVar) {
        if (!(obj instanceof String)) {
            cxeVar.o(i, (dds) obj);
        } else {
            ((ddz) cxeVar.a).x(i, (String) obj);
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
    static defpackage.dfk i(defpackage.dfe r35, defpackage.dfz r36, defpackage.cwt r37) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfk.i(dfe, dfz, cwt):dfk");
    }

    private static double k(Object obj, long j) {
        return ((Double) dgf.f(obj, j)).doubleValue();
    }

    private static float l(Object obj, long j) {
        return ((Float) dgf.f(obj, j)).floatValue();
    }

    private final int m(int i) {
        return this.c[i];
    }

    private static int n(Object obj, long j) {
        return ((Integer) dgf.f(obj, j)).intValue();
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
        return ((Long) dgf.f(obj, j)).longValue();
    }

    private final den t(int i) {
        int i2 = i / 3;
        return (den) this.d[i2 + i2 + 1];
    }

    private final dfs u(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        dfs dfsVar = (dfs) objArr[i3];
        if (dfsVar != null) {
            return dfsVar;
        }
        dfs dfsVarA = dfp.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = dfsVarA;
        return dfsVarA;
    }

    private final Object v(Object obj, int i, Object obj2, dfz dfzVar, Object obj3) {
        den denVarT;
        int iM = m(i);
        Object objF = dgf.f(obj, r(q(i)));
        if (objF == null || (denVarT = t(i)) == null) {
            return obj2;
        }
        dfb dfbVarC = cyf.c(w(i));
        Iterator it = ((dfc) objF).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!denVarT.a()) {
                if (obj2 == null) {
                    obj2 = dfzVar.a(obj3);
                }
                int iL = cxe.l(dfbVarC, entry.getKey(), entry.getValue());
                dds ddsVar = dds.b;
                byte[] bArr = new byte[iL];
                boolean z = ddz.e;
                ddx ddxVar = new ddx(bArr, iL);
                try {
                    cxe.m(ddxVar, dfbVarC, entry.getKey(), entry.getValue());
                    dfzVar.b(obj2, iM, cws.e(ddxVar, bArr));
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
        dfs dfsVarU = u(i);
        long jR = r(q(i));
        if (!I(obj, i)) {
            return dfsVarU.c();
        }
        Object object = b.getObject(obj, jR);
        if (L(object)) {
            return object;
        }
        Object objC = dfsVarU.c();
        if (object != null) {
            dfsVarU.e(objC, object);
        }
        return objC;
    }

    private final Object y(Object obj, int i, int i2) {
        dfs dfsVarU = u(i2);
        if (!M(obj, i, i2)) {
            return dfsVarU.c();
        }
        Object object = b.getObject(obj, r(q(i2)));
        if (L(object)) {
            return object;
        }
        Object objC = dfsVarU.c();
        if (object != null) {
            dfsVarU.e(objC, object);
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

    /* JADX WARN: Removed duplicated region for block: B:163:0x03cc  */
    @Override // defpackage.dfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfk.a(java.lang.Object):int");
    }

    @Override // defpackage.dfs
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
                    long jDoubleToLongBits = Double.doubleToLongBits(dgf.a(obj, jR));
                    Charset charset = dep.a;
                    iK = a.k(jDoubleToLongBits);
                    i3 = i + iK;
                    break;
                case 1:
                    i = i3 * 53;
                    iK = Float.floatToIntBits(dgf.b(obj, jR));
                    i3 = i + iK;
                    break;
                case 2:
                    i = i3 * 53;
                    long jD = dgf.d(obj, jR);
                    Charset charset2 = dep.a;
                    iK = a.k(jD);
                    i3 = i + iK;
                    break;
                case 3:
                    i = i3 * 53;
                    long jD2 = dgf.d(obj, jR);
                    Charset charset3 = dep.a;
                    iK = a.k(jD2);
                    i3 = i + iK;
                    break;
                case 4:
                    i = i3 * 53;
                    iK = dgf.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 5:
                    i = i3 * 53;
                    long jD3 = dgf.d(obj, jR);
                    Charset charset4 = dep.a;
                    iK = a.k(jD3);
                    i3 = i + iK;
                    break;
                case 6:
                    i = i3 * 53;
                    iK = dgf.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 7:
                    i = i3 * 53;
                    boolean zT = dgf.t(obj, jR);
                    Charset charset5 = dep.a;
                    iK = a.q(zT);
                    i3 = i + iK;
                    break;
                case 8:
                    i = i3 * 53;
                    iK = ((String) dgf.f(obj, jR)).hashCode();
                    i3 = i + iK;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objF = dgf.f(obj, jR);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iK = dgf.f(obj, jR).hashCode();
                    i3 = i + iK;
                    break;
                case 11:
                    i = i3 * 53;
                    iK = dgf.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 12:
                    i = i3 * 53;
                    iK = dgf.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 13:
                    i = i3 * 53;
                    iK = dgf.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 14:
                    i = i3 * 53;
                    long jD4 = dgf.d(obj, jR);
                    Charset charset6 = dep.a;
                    iK = a.k(jD4);
                    i3 = i + iK;
                    break;
                case 15:
                    i = i3 * 53;
                    iK = dgf.c(obj, jR);
                    i3 = i + iK;
                    break;
                case 16:
                    i = i3 * 53;
                    long jD5 = dgf.d(obj, jR);
                    Charset charset7 = dep.a;
                    iK = a.k(jD5);
                    i3 = i + iK;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objF2 = dgf.f(obj, jR);
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
                    iK = dgf.f(obj, jR).hashCode();
                    i3 = i + iK;
                    break;
                case 50:
                    i = i3 * 53;
                    iK = dgf.f(obj, jR).hashCode();
                    i3 = i + iK;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jDoubleToLongBits2 = Double.doubleToLongBits(k(obj, jR));
                        Charset charset8 = dep.a;
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
                        Charset charset9 = dep.a;
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
                        Charset charset10 = dep.a;
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
                        Charset charset11 = dep.a;
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
                        Charset charset12 = dep.a;
                        iK = a.q(zN);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = ((String) dgf.f(obj, jR)).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = dgf.f(obj, jR).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = dgf.f(obj, jR).hashCode();
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
                        Charset charset13 = dep.a;
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
                        Charset charset14 = dep.a;
                        iK = a.k(jS5);
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iK = dgf.f(obj, jR).hashCode();
                        i3 = i + iK;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + dfz.e(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + cwt.g(obj).hashCode() : iHashCode2;
    }

    @Override // defpackage.dfs
    public final Object c() {
        return ((dek) this.g).l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    @Override // defpackage.dfs
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
            boolean r0 = r8 instanceof defpackage.dek
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            dek r0 = (defpackage.dek) r0
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
            sun.misc.Unsafe r2 = defpackage.dfk.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            r6 = r5
            dfc r6 = (defpackage.dfc) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L81
        L4e:
            deo r2 = defpackage.cyf.f(r8, r3)
            r2.b()
            goto L81
        L56:
            int r2 = r7.m(r1)
            boolean r2 = r7.M(r8, r2, r1)
            if (r2 == 0) goto L81
            dfs r2 = r7.u(r1)
            sun.misc.Unsafe r5 = defpackage.dfk.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L81
        L6e:
            boolean r2 = r7.I(r8, r1)
            if (r2 == 0) goto L81
            dfs r2 = r7.u(r1)
            sun.misc.Unsafe r5 = defpackage.dfk.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L81:
            int r1 = r1 + 3
            goto L1d
        L84:
            dfz r0 = r7.m
            r0.d(r8)
            boolean r0 = r7.h
            if (r0 == 0) goto L90
            defpackage.cwt.i(r8)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfk.d(java.lang.Object):void");
    }

    @Override // defpackage.dfs
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
                        dgf.n(obj, jR, dgf.a(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(obj2, i)) {
                        dgf.o(obj, jR, dgf.b(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (I(obj2, i)) {
                        dgf.q(obj, jR, dgf.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (I(obj2, i)) {
                        dgf.q(obj, jR, dgf.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (I(obj2, i)) {
                        dgf.p(obj, jR, dgf.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (I(obj2, i)) {
                        dgf.q(obj, jR, dgf.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (I(obj2, i)) {
                        dgf.p(obj, jR, dgf.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (I(obj2, i)) {
                        dgf.j(obj, jR, dgf.t(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (I(obj2, i)) {
                        dgf.r(obj, jR, dgf.f(obj2, jR));
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
                        dgf.r(obj, jR, dgf.f(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (I(obj2, i)) {
                        dgf.p(obj, jR, dgf.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (I(obj2, i)) {
                        dgf.p(obj, jR, dgf.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (I(obj2, i)) {
                        dgf.p(obj, jR, dgf.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (I(obj2, i)) {
                        dgf.q(obj, jR, dgf.d(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (I(obj2, i)) {
                        dgf.p(obj, jR, dgf.c(obj2, jR));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (I(obj2, i)) {
                        dgf.q(obj, jR, dgf.d(obj2, jR));
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
                    deo deoVarF = cyf.f(obj, jR);
                    deo deoVarF2 = cyf.f(obj2, jR);
                    int size = deoVarF.size();
                    int size2 = deoVarF2.size();
                    if (size > 0 && size2 > 0) {
                        if (!deoVarF.c()) {
                            deoVarF = deoVarF.d(size2 + size);
                        }
                        deoVarF.addAll(deoVarF2);
                    }
                    if (size > 0) {
                        deoVarF2 = deoVarF;
                    }
                    dgf.r(obj, jR, deoVarF2);
                    break;
                case 50:
                    Class cls = dft.a;
                    dgf.r(obj, jR, cyf.d(dgf.f(obj, jR), dgf.f(obj2, jR)));
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
                        dgf.r(obj, jR, dgf.f(obj2, jR));
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
                        dgf.r(obj, jR, dgf.f(obj2, jR));
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
        dft.n(obj, obj2);
        if (this.h) {
            dft.m(obj, obj2);
        }
    }

    @Override // defpackage.dfs
    public final boolean f(Object obj, Object obj2) {
        boolean zQ;
        for (int i = 0; i < this.c.length; i += 3) {
            int iQ = q(i);
            long jR = r(iQ);
            switch (p(iQ)) {
                case 0:
                    if (!G(obj, obj2, i) || Double.doubleToLongBits(dgf.a(obj, jR)) != Double.doubleToLongBits(dgf.a(obj2, jR))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!G(obj, obj2, i) || Float.floatToIntBits(dgf.b(obj, jR)) != Float.floatToIntBits(dgf.b(obj2, jR))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!G(obj, obj2, i) || dgf.d(obj, jR) != dgf.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!G(obj, obj2, i) || dgf.d(obj, jR) != dgf.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!G(obj, obj2, i) || dgf.c(obj, jR) != dgf.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!G(obj, obj2, i) || dgf.d(obj, jR) != dgf.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!G(obj, obj2, i) || dgf.c(obj, jR) != dgf.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!G(obj, obj2, i) || dgf.t(obj, jR) != dgf.t(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (G(obj, obj2, i)) {
                        Object objF = dgf.f(obj, jR);
                        Object objF2 = dgf.f(obj2, jR);
                        Class cls = dft.a;
                        if (a.Q(objF, objF2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (G(obj, obj2, i)) {
                        Object objF3 = dgf.f(obj, jR);
                        Object objF4 = dgf.f(obj2, jR);
                        Class cls2 = dft.a;
                        if (a.Q(objF3, objF4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (G(obj, obj2, i)) {
                        Object objF5 = dgf.f(obj, jR);
                        Object objF6 = dgf.f(obj2, jR);
                        Class cls3 = dft.a;
                        if (a.Q(objF5, objF6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!G(obj, obj2, i) || dgf.c(obj, jR) != dgf.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!G(obj, obj2, i) || dgf.c(obj, jR) != dgf.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!G(obj, obj2, i) || dgf.c(obj, jR) != dgf.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!G(obj, obj2, i) || dgf.d(obj, jR) != dgf.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!G(obj, obj2, i) || dgf.c(obj, jR) != dgf.c(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!G(obj, obj2, i) || dgf.d(obj, jR) != dgf.d(obj2, jR)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (G(obj, obj2, i)) {
                        Object objF7 = dgf.f(obj, jR);
                        Object objF8 = dgf.f(obj2, jR);
                        Class cls4 = dft.a;
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
                    Object objF9 = dgf.f(obj, jR);
                    Object objF10 = dgf.f(obj2, jR);
                    Class cls5 = dft.a;
                    zQ = a.Q(objF9, objF10);
                    break;
                case 50:
                    Object objF11 = dgf.f(obj, jR);
                    Object objF12 = dgf.f(obj2, jR);
                    Class cls6 = dft.a;
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
                    if (dgf.c(obj, jO) == dgf.c(obj2, jO)) {
                        Object objF13 = dgf.f(obj, jR);
                        Object objF14 = dgf.f(obj2, jR);
                        Class cls7 = dft.a;
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
        if (!dfz.e(obj).equals(dfz.e(obj2))) {
            return false;
        }
        if (this.h) {
            return cwt.g(obj).equals(cwt.g(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    @Override // defpackage.dfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfk.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02cb, code lost:
    
        r13.put(r14, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ce, code lost:
    
        ((defpackage.ddv) r22.c).k(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02db, code lost:
    
        ((defpackage.ddv) r22.c).k(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02e2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0375, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06f2, code lost:
    
        r5 = r6.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06fe, code lost:
    
        r0 = r1.k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0705, code lost:
    
        r5 = r6;
        r4 = r1.v(r2, r1.j[r0], r4, r5, r21);
        r6 = r5;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x071c, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x071f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x072f A[LOOP:4: B:253:0x072b->B:255:0x072f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [dfk] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [int] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // defpackage.dfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r21, defpackage.som r22, defpackage.ded r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfk.h(java.lang.Object, som, ded):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // defpackage.dfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.Object r20, defpackage.cxe r21) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfk.j(java.lang.Object, cxe):void");
    }
}
