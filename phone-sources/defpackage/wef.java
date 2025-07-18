package defpackage;

import android.support.v7.appcompat.R;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wef {
    public static volatile xsq a;
    public static volatile xsq b;
    public static volatile xsq c;
    public static volatile xsq d;

    public wef() {
    }

    public static byte[] A(short[][] sArr) {
        int length = sArr[0].length;
        int length2 = sArr.length;
        byte[] bArr = new byte[length2 * length];
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                bArr[(i * length2) + i2] = (byte) sArr[i2][i];
            }
        }
        return bArr;
    }

    public static byte[] B(short[][][] sArr, boolean z) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length3; i3++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i2 <= i3) {
                        bArr[i] = (byte) sArr3[i2][i3];
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    public static short[][] C(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = vxr.bi(sArr[i]);
        }
        return sArr2;
    }

    public static short[][] D(SecureRandom secureRandom, int i, int i2) {
        byte[] bArr = new byte[i * i2];
        secureRandom.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4][i3] = (short) (bArr[(i3 * i) + i4] & 255);
            }
        }
        return sArr;
    }

    public static short[][][] E(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = vxr.bi(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public static short[][][] F(SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
        byte[] bArr = new byte[z ? (((i2 + 1) * i2) >> 1) * i : i * i2 * i3];
        secureRandom.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i3);
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                for (int i7 = 0; i7 < i; i7++) {
                    if (!z || i5 <= i6) {
                        sArr[i7][i5][i6] = (short) (bArr[i4] & 255);
                        i4++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] G(short[][] sArr, short[][] sArr2) {
        int length;
        int length2 = sArr.length;
        if (length2 != sArr2.length || (length = sArr[0].length) != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr3[i][i2] = zsw.a(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    public static short[][] H(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short sB = zsw.b(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr4 = sArr3[i];
                    sArr4[i3] = zsw.a(sArr4[i3], sB);
                }
            }
        }
        return sArr3;
    }

    public static short[][][] I(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        int length;
        short[][] sArr4 = sArr2[0];
        int length2 = sArr4.length;
        short[][] sArr5 = sArr3[0];
        int length3 = sArr5.length;
        if (length2 == length3) {
            int length4 = sArr4[0].length;
            int length5 = sArr5[0].length;
            if (length4 == length5 && sArr2.length == sArr[0].length && (length = sArr3.length) == sArr.length) {
                short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, length, length3, length5);
                for (int i = 0; i < sArr2[0].length; i++) {
                    for (int i2 = 0; i2 < sArr2[0][0].length; i2++) {
                        for (int i3 = 0; i3 < sArr.length; i3++) {
                            for (int i4 = 0; i4 < sArr[0].length; i4++) {
                                short sB = zsw.b(sArr[i3][i4], sArr2[i4][i][i2]);
                                short[] sArr7 = sArr6[i3][i];
                                sArr7[i2] = zsw.a(sArr7[i2], sB);
                            }
                            short[] sArr8 = sArr6[i3][i];
                            sArr8[i2] = zsw.a(sArr3[i3][i][i2], sArr8[i2]);
                        }
                    }
                }
                return sArr6;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public static short[][] J(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    public static short[][] K(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return G(sArr, J(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public static void L(byte[] bArr, znp znpVar) {
        znpVar.e(bArr, 0, bArr.length);
    }

    public static void M(short s, znp znpVar) {
        znpVar.d((byte) (s >>> 8));
        znpVar.d((byte) s);
    }

    public static void N(int i, znp znpVar) {
        znpVar.d((byte) (i >> 24));
        znpVar.d((byte) (i >>> 16));
        znpVar.d((byte) (i >>> 8));
        znpVar.d((byte) i);
    }

    public static znp O(zjb zjbVar, int i) {
        znp zoaVar;
        if (zjbVar.w(zln.c)) {
            zoaVar = new znw();
        } else {
            if (!zjbVar.w(zln.o)) {
                throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(String.valueOf(zjbVar))));
            }
            zoaVar = new zoa(256);
        }
        return (zln.o.w(zjbVar) || zoaVar.b() != i) ? new zrs(zoaVar, i) : zoaVar;
    }

    public static znp P(zrv zrvVar) {
        return O(zrvVar.u, zrvVar.r);
    }

    public static void Q(zxn zxnVar, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(zxnVar.s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void R(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void S(int i, ByteArrayOutputStream byteArrayOutputStream) {
        while (byteArrayOutputStream.size() < i) {
            byteArrayOutputStream.write(0);
        }
    }

    public static void T(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(i >> 24);
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public static void U(long j, ByteArrayOutputStream byteArrayOutputStream) {
        T((int) (j >>> 32), byteArrayOutputStream);
        T((int) j, byteArrayOutputStream);
    }

    public static void V(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static int W(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((4294967295L & (i4 * i2)) * i) + i4) >>> 32);
            i3 -= 32;
        }
        if (i3 <= 0) {
            return i4;
        }
        return (int) (((((((-1) >>> (-i3)) & (i2 * i4)) & 4294967295L) * i) + i4) >>> i3);
    }

    public static int X(int i) {
        char c2 = (char) i;
        int i2 = (c2 | (c2 << '\b')) & 16711935;
        int i3 = (i2 | (i2 << 4)) & 252645135;
        int i4 = (i3 | (i3 << 2)) & 858993459;
        return (i4 | (i4 + i4)) & 1431655765;
    }

    public static Class Y(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new zxo(str, 1));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static znk Z(znp znpVar) {
        return new zob(znpVar.c(), 0);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 31;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 32;
            case 32:
                return 33;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 34;
            case 34:
                return 35;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 36;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 37;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 38;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 39;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 40;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return 41;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 42;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 43;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return 44;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return 45;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return 46;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 47;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 48;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 49;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 50;
            case 50:
                return 51;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 52;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return 53;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 54;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                return 55;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                return 56;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void aa(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static int ab(char c2) {
        return (c2 < '0' || c2 > '9') ? (c2 < 'a' || c2 > 'f') ? c2 - '7' : c2 - 'W' : c2 - '0';
    }

    public static String ac(zih zihVar) {
        String strAf = af(zihVar);
        if (strAf.length() > 0 && strAf.charAt(0) == '#') {
            try {
                zxn zxnVarV = zjh.v(zxx.f(strAf, strAf.length() - 1));
                if (zxnVarV instanceof zjp) {
                    strAf = ((zjp) zxnVarV).b();
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e.toString()));
            }
        }
        String strB = zxr.b(strAf);
        int length = strB.length();
        if (length < 2) {
            return strB;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && strB.charAt(i2) == '\\' && strB.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && strB.charAt(i4 - 1) == '\\' && strB.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            strB = strB.substring(i2, i4 + 1);
        }
        if (strB.indexOf("  ") < 0) {
            return strB;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char cCharAt = strB.charAt(0);
        stringBuffer.append(cCharAt);
        for (int i5 = 1; i5 < strB.length(); i5++) {
            char cCharAt2 = strB.charAt(i5);
            if (cCharAt == ' ' && cCharAt2 == ' ') {
                cCharAt = ' ';
            } else {
                stringBuffer.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String ad(zmc zmcVar, boolean z) {
        String strA = zmcVar.a();
        if (strA == null || zmcVar.b() != z) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        return strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ae(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wef.ae(java.lang.String):java.lang.String");
    }

    public static String af(zih zihVar) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(zihVar instanceof zjp) || (zihVar instanceof zjv)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(zxx.a(zihVar.p().u()));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strB = ((zjp) zihVar).b();
            if (strB.length() > 0 && strB.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(strB);
        }
        int length = stringBuffer.length();
        int i2 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i2 != length) {
            char cCharAt = stringBuffer.charAt(i2);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        break;
                    default:
                        i2++;
                }
            }
            stringBuffer.insert(i2, "\\");
            length++;
            i2 += 2;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        int length2 = stringBuffer.length();
        while (true) {
            length2--;
            if (length2 >= i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zly] */
    public static void ag(zly zlyVar, zlx zlxVar, String str) {
        zmc zmcVar = new zmc(str, '=');
        String strAd = ad(zmcVar, true);
        String strAd2 = ad(zmcVar, false);
        zjb zjbVarD = zlyVar.d(strAd.trim());
        zih zihVarC = zlxVar.a.c(zjbVarD, ae(strAd2));
        ((Vector) zlxVar.b).addElement(new zlv(zjbVarD, zihVarC));
    }

    public static void ah(StringBuffer stringBuffer, zlv zlvVar, Hashtable hashtable) {
        if (!zlvVar.c()) {
            if (zlvVar.b() != null) {
                ai(stringBuffer, zlvVar.b(), hashtable);
                return;
            }
            return;
        }
        zlu[] zluVarArrD = zlvVar.d();
        boolean z = true;
        int i = 0;
        while (i != zluVarArrD.length) {
            if (!z) {
                stringBuffer.append('+');
            }
            ai(stringBuffer, zluVarArrD[i], hashtable);
            i++;
            z = false;
        }
    }

    public static void ai(StringBuffer stringBuffer, zlu zluVar, Hashtable hashtable) {
        zjb zjbVar = zluVar.a;
        String str = (String) hashtable.get(zjbVar);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(zjbVar.b());
        }
        stringBuffer.append('=');
        stringBuffer.append(af(zluVar.b));
    }

    public static boolean aj(zlv zlvVar, zlv zlvVar2) {
        if (zlvVar.a() != zlvVar2.a()) {
            return false;
        }
        zlu[] zluVarArrD = zlvVar.d();
        zlu[] zluVarArrD2 = zlvVar2.d();
        if (zluVarArrD.length != zluVarArrD2.length) {
            return false;
        }
        for (int i = 0; i != zluVarArrD.length; i++) {
            zlu zluVar = zluVarArrD[i];
            zlu zluVar2 = zluVarArrD2[i];
            if (zluVar != zluVar2) {
                if (zluVar != null && zluVar2 != null) {
                    if (zluVar.a.w(zluVar2.a)) {
                        if (!ac(zluVar.b).equals(ac(zluVar2.b))) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private static int ak(int i, int i2, int i3) {
        return al(al(i, i3) - al(i2, i3), i3);
    }

    private static int al(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static double b(double[] dArr, double[] dArr2) {
        double d2 = dArr[0] - dArr2[0];
        double d3 = dArr[1] - dArr2[1];
        double d4 = dArr[2] - dArr2[2];
        return (d2 * d2) + (d3 * d3) + (d4 * d4);
    }

    public static double[] c(int i) {
        double dC = wga.c(wga.k(i));
        int iH = wga.h(i);
        double dC2 = wga.c(wga.j(i));
        double dC3 = wga.c(iH);
        double[][] dArr = wga.a;
        double[] dArr2 = dArr[0];
        double d2 = dArr2[0] * dC;
        double d3 = dArr2[1] * dC2;
        double d4 = dArr2[2] * dC3;
        double[] dArr3 = dArr[1];
        double d5 = dArr3[0] * dC;
        double d6 = dArr3[1] * dC2;
        double d7 = dArr3[2] * dC3;
        double[] dArr4 = dArr[2];
        double d8 = dArr4[0] * dC;
        double d9 = dArr4[1] * dC2;
        double d10 = dArr4[2] * dC3;
        double[] dArr5 = wga.c;
        double d11 = ((d2 + d3) + d4) / dArr5[0];
        double d12 = ((d5 + d6) + d7) / dArr5[1];
        double d13 = ((d8 + d9) + d10) / dArr5[2];
        double dA = wga.a(d11);
        double dA2 = wga.a(d12);
        double[] dArr6 = {(116.0d * dA2) - 16.0d, (dA - dA2) * 500.0d, (dA2 - wga.a(d13)) * 200.0d};
        return new double[]{dArr6[0], dArr6[1], dArr6[2]};
    }

    public static double d(int i, double d2, Map map) {
        Integer numValueOf = Integer.valueOf(i);
        if (map.get(numValueOf) == null) {
            map.put(numValueOf, Double.valueOf(wfs.a(d2, 200.0d, i).b));
        }
        return ((Double) map.get(numValueOf)).doubleValue();
    }

    public static /* synthetic */ wnw e(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wnw) vucVarO;
    }

    public static void f(wnx wnxVar, vtw vtwVar) {
        wnxVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnw wnwVar = (wnw) vtwVar.b;
        wnw wnwVar2 = wnw.a;
        wnwVar.c = Integer.valueOf(wnxVar.a());
        wnwVar.b = 1;
    }

    public static /* synthetic */ wns g(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wns) vucVarO;
    }

    public static void h(vwe vweVar, vtw vtwVar) {
        vweVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wns wnsVar = (wns) vtwVar.b;
        wns wnsVar2 = wns.a;
        wnsVar.c = vweVar;
        wnsVar.b |= 1;
    }

    public static /* synthetic */ wnr i(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wnr) vucVarO;
    }

    public static void j(wnn wnnVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnr wnrVar = (wnr) vtwVar.b;
        wnr wnrVar2 = wnr.a;
        wnrVar.c = wnnVar;
        wnrVar.b |= 1;
    }

    public static /* synthetic */ wnt k(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wnt) vucVarO;
    }

    public static void l(wnr wnrVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnt wntVar = (wnt) vtwVar.b;
        wnt wntVar2 = wnt.a;
        wntVar.d = wnrVar;
        wntVar.c = 2;
    }

    public static void m(vwe vweVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnt wntVar = (wnt) vtwVar.b;
        wnt wntVar2 = wnt.a;
        wntVar.e = vweVar;
        wntVar.b |= 1;
    }

    public static void n(wns wnsVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnt wntVar = (wnt) vtwVar.b;
        wnt wntVar2 = wnt.a;
        wntVar.d = wnsVar;
        wntVar.c = 3;
    }

    public static Class o(ymh ymhVar) {
        ymhVar.getClass();
        return ((ykk) ymhVar).a();
    }

    public static Class p(ymh ymhVar) {
        String name;
        ymhVar.getClass();
        Class clsA = ((ykk) ymhVar).a();
        if (!clsA.isPrimitive() || (name = clsA.getName()) == null) {
            return clsA;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : clsA;
            case 104431:
                return name.equals("int") ? Integer.class : clsA;
            case 3039496:
                return name.equals("byte") ? Byte.class : clsA;
            case 3052374:
                return name.equals("char") ? Character.class : clsA;
            case 3327612:
                return name.equals("long") ? Long.class : clsA;
            case 3625364:
                return name.equals("void") ? Void.class : clsA;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : clsA;
            case 97526364:
                return name.equals("float") ? Float.class : clsA;
            case 109413500:
                return name.equals("short") ? Short.class : clsA;
            default:
                return clsA;
        }
    }

    public static ymh q(Class cls) {
        cls.getClass();
        int i = ylg.a;
        return new ykl(cls);
    }

    public static void r(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            ybn.h(th, th2);
        }
    }

    public static byte[] t(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                bArrCopyOf.getClass();
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    yjh yjhVar = new yjh();
                    yjhVar.write(i5);
                    w(fileInputStream, yjhVar);
                    int size = yjhVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError(a.cj(file, "File ", " is too big to fit in memory."));
                    }
                    byte[] bArrA = yjhVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    bArrCopyOf.getClass();
                    yfm.be(bArrA, bArrCopyOf, i, 0, yjhVar.size());
                }
            }
            v(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                v(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String u(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return ylh.H(name, '.', "");
    }

    public static void v(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ybn.h(th, th2);
            }
        }
    }

    public static /* synthetic */ void w(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static int x(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - ak(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + ak(i, i2, -i3);
            }
        }
        return i2;
    }

    public static int y(short[][] sArr, byte[] bArr, int i) {
        int length = sArr[0].length;
        int i2 = 0;
        while (true) {
            int length2 = sArr.length;
            if (i2 >= length) {
                return length2 * length;
            }
            for (int i3 = 0; i3 < length2; i3++) {
                sArr[i3][i2] = (short) (bArr[(i2 * length2) + i + i3] & 255);
            }
            i2++;
        }
    }

    public static int z(short[][][] sArr, byte[] bArr, int i, boolean z) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        sArr3[i3][i4] = (short) (bArr[i2 + i] & 255);
                        i2++;
                    }
                }
            }
        }
        return i2;
    }

    public wef(byte[] bArr, byte[] bArr2) {
        new zoa(128);
        new zoa(256);
    }

    public wef(byte[] bArr) {
        new zoa(128);
        new zoa(256);
        new zny(256);
        new zny(512);
    }

    public wef(boolean z) {
        if (z) {
            new vxr((byte[]) null, (char[]) null, (byte[]) null);
        } else {
            new vxr((char[]) null, (byte[]) null, (byte[]) null);
        }
    }
}
