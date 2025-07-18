package defpackage;

import j$.nio.channels.DesugarChannels;
import j$.time.Duration;
import j$.time.Instant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dnx {
    public dnx() {
        throw null;
    }

    public static short[][] A(SecureRandom secureRandom, int i, int i2) {
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

    public static short[][][] B(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = dos.u(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public static short[][][] C(SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
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

    public static short[][] D(short[][] sArr, short[][] sArr2) {
        int length;
        int length2 = sArr.length;
        if (length2 != sArr2.length || (length = sArr[0].length) != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr3[i][i2] = djn.a(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    public static short[][] E(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short sB = djn.b(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr4 = sArr3[i];
                    sArr4[i3] = djn.a(sArr4[i3], sB);
                }
            }
        }
        return sArr3;
    }

    public static short[][][] F(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
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
                                short sB = djn.b(sArr[i3][i4], sArr2[i4][i][i2]);
                                short[] sArr7 = sArr6[i3][i];
                                sArr7[i2] = djn.a(sArr7[i2], sB);
                            }
                            short[] sArr8 = sArr6[i3][i];
                            sArr8[i2] = djn.a(sArr3[i3][i][i2], sArr8[i2]);
                        }
                    }
                }
                return sArr6;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public static short[][] G(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i2][i] = sArr[i][i2];
            }
        }
        return sArr2;
    }

    public static short[][] H(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return D(sArr, G(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public static void I(byte[] bArr, deh dehVar) {
        dehVar.e(bArr, 0, bArr.length);
    }

    public static void J(short s, deh dehVar) {
        dehVar.d((byte) (s >>> 8));
        dehVar.d((byte) s);
    }

    public static void K(int i, deh dehVar) {
        dehVar.d((byte) (i >> 24));
        dehVar.d((byte) (i >>> 16));
        dehVar.d((byte) (i >>> 8));
        dehVar.d((byte) i);
    }

    public static deh L(czv czvVar, int i) {
        deh desVar;
        if (czvVar.w(dcg.c)) {
            desVar = new deo();
        } else {
            if (!czvVar.w(dcg.o)) {
                throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(String.valueOf(czvVar))));
            }
            desVar = new des(256);
        }
        return (dcg.o.w(czvVar) || desVar.b() != i) ? new dij(desVar, i) : desVar;
    }

    public static deh M(dim dimVar) {
        return L(dimVar.u, dimVar.r);
    }

    public static void N(dof dofVar, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(dofVar.s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void O(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static void P(int i, ByteArrayOutputStream byteArrayOutputStream) {
        while (byteArrayOutputStream.size() < i) {
            byteArrayOutputStream.write(0);
        }
    }

    public static void Q(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(i >> 24);
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public static void R(long j, ByteArrayOutputStream byteArrayOutputStream) {
        Q((int) (j >>> 32), byteArrayOutputStream);
        Q((int) j, byteArrayOutputStream);
    }

    public static dmc S(dlr dlrVar, att attVar, dlo dloVar) {
        double d;
        int iCeil = dlrVar.a.b;
        byte[][] bArrP = p((byte[][]) attVar.a);
        dmc[] dmcVarArr = new dmc[bArrP.length];
        for (int i = 0; i < bArrP.length; i++) {
            dmcVarArr[i] = new dmc(0, bArrP[i]);
        }
        dlp dlpVar = new dlp(null);
        dlpVar.e = dloVar.d;
        dlpVar.f = dloVar.e;
        dlpVar.b = dloVar.a;
        dlpVar.c = 0;
        dlpVar.a = dloVar.c;
        dlpVar.g = dloVar.f;
        dlo dloVar2 = new dlo(dlpVar);
        while (iCeil > 1) {
            int i2 = 0;
            while (true) {
                d = iCeil >> 1;
                if (i2 >= ((int) Math.floor(d))) {
                    break;
                }
                dlp dlpVar2 = new dlp(null);
                dlpVar2.e = dloVar2.d;
                dlpVar2.f = dloVar2.e;
                dlpVar2.b = dloVar2.a;
                dlpVar2.c = dloVar2.b;
                dlpVar2.a = i2;
                dlpVar2.g = dloVar2.f;
                dloVar2 = new dlo(dlpVar2);
                int i3 = i2 + i2;
                dmcVarArr[i2] = r(dlrVar, dmcVarArr[i3], dmcVarArr[i3 + 1], dloVar2);
                i2++;
            }
            if ((iCeil & 1) == 1) {
                dmcVarArr[(int) Math.floor(d)] = dmcVarArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(iCeil / 2.0d);
            dlp dlpVar3 = new dlp(null);
            dlpVar3.e = dloVar2.d;
            dlpVar3.f = dloVar2.e;
            dlpVar3.b = dloVar2.a;
            dlpVar3.c = dloVar2.b + 1;
            dlpVar3.a = dloVar2.c;
            dlpVar3.g = dloVar2.f;
            dloVar2 = new dlo(dlpVar3);
        }
        return dmcVarArr[0];
    }

    public static void T(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static int U(int i, int i2, int i3) {
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

    public static int V(int i) {
        char c = (char) i;
        int i2 = (c | (c << '\b')) & 16711935;
        int i3 = (i2 | (i2 << 4)) & 252645135;
        int i4 = (i3 | (i3 << 2)) & 858993459;
        return (i4 | (i4 + i4)) & 1431655765;
    }

    public static Class W(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new dog(str, 1));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void X(deh dehVar) {
        dehVar.c();
    }

    public static /* synthetic */ void Y(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static int Z(char c) {
        return (c < '0' || c > '9') ? (c < 'a' || c > 'f') ? c - '7' : c - 'W' : c - '0';
    }

    public static boolean a(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        if (length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = length - 1; i >= 0; i--) {
            z &= iArr[i] == iArr2[i];
        }
        return z;
    }

    public static int aA(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static boolean aB(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static Class aC(cuv cuvVar) {
        String name;
        cuvVar.getClass();
        Class clsA = ((cuh) cuvVar).a();
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

    public static ctf aD(Enum[] enumArr) {
        enumArr.getClass();
        return new ctg(enumArr);
    }

    public static cta aE(cta ctaVar, cta ctaVar2) {
        ctaVar2.getClass();
        return ctaVar2 == ctb.a ? ctaVar : (cta) ctaVar2.fold(ctaVar, new csx(0));
    }

    public static int aF(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map aG(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return cso.a;
        }
        if (size == 1) {
            csa csaVar = (csa) iterable.get(0);
            csaVar.getClass();
            Map mapSingletonMap = Collections.singletonMap(csaVar.a, csaVar.b);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(aF(iterable.size()));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            csa csaVar2 = (csa) it.next();
            linkedHashMap.put(csaVar2.a, csaVar2.b);
        }
        return linkedHashMap;
    }

    public static Map aH(Map map) {
        int size = map.size();
        if (size == 0) {
            return cso.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static List aI(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static int aJ(List list) {
        return list.size() - 1;
    }

    public static Object aK(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(aJ(list));
    }

    public static List aL(Collection collection, Iterable iterable) {
        ArrayList arrayList = new ArrayList(((csl) collection).a + ((csl) iterable).a);
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List aM(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList();
            aR(iterable, arrayList);
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : aI(arrayList.get(0)) : csn.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return csn.a;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return aI(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set aN(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return csp.a;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(aF(iterable.size()));
            aR(iterable, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(iterable.get(0));
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean aO(Iterable iterable, Object obj) {
        return iterable.contains(obj);
    }

    public static void aP(Collection collection, Iterable iterable) {
        collection.addAll(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int aQ(Iterable iterable) {
        return iterable.size();
    }

    public static void aR(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static int aS(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Object aT(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static void aU(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void aV(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void aX(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        aV(objArr, objArr2, 0, i, i2);
    }

    public static void aY(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static /* synthetic */ boolean aZ() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static String aa(czb czbVar) {
        String strAd = ad(czbVar);
        if (strAd.length() > 0 && strAd.charAt(0) == '#') {
            try {
                czb czbVarV = dab.v(dop.f(strAd, strAd.length() - 1));
                if (czbVarV instanceof daj) {
                    strAd = ((daj) czbVarV).b();
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e.toString()));
            }
        }
        String strB = doj.b(strAd);
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

    public static String ab(dcv dcvVar, boolean z) {
        String strA = dcvVar.a();
        if (strA == null || dcvVar.b() != z) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        return strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ac(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnx.ac(java.lang.String):java.lang.String");
    }

    public static String ad(czb czbVar) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(czbVar instanceof daj) || (czbVar instanceof dap)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(dop.a(czbVar.p().u()));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strB = ((daj) czbVar).b();
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
                    case ';':
                    case '<':
                    case '=':
                    case '>':
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

    /* JADX WARN: Type inference failed for: r0v2, types: [dcr, java.lang.Object] */
    public static void ae(dcr dcrVar, dcq dcqVar, String str) {
        dcv dcvVar = new dcv(str, '=');
        String strAb = ab(dcvVar, true);
        String strAb2 = ab(dcvVar, false);
        czv czvVarD = dcrVar.d(strAb.trim());
        czb czbVarC = dcqVar.a.c(czvVarD, ac(strAb2));
        ((Vector) dcqVar.b).addElement(new dco(czvVarD, czbVarC));
    }

    public static void af(StringBuffer stringBuffer, dco dcoVar, Hashtable hashtable) {
        if (!dcoVar.c()) {
            if (dcoVar.b() != null) {
                ag(stringBuffer, dcoVar.b(), hashtable);
                return;
            }
            return;
        }
        dcn[] dcnVarArrD = dcoVar.d();
        boolean z = true;
        int i = 0;
        while (i != dcnVarArrD.length) {
            if (!z) {
                stringBuffer.append('+');
            }
            ag(stringBuffer, dcnVarArrD[i], hashtable);
            i++;
            z = false;
        }
    }

    public static void ag(StringBuffer stringBuffer, dcn dcnVar, Hashtable hashtable) {
        czv czvVar = dcnVar.a;
        String str = (String) hashtable.get(czvVar);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(czvVar.b());
        }
        stringBuffer.append('=');
        stringBuffer.append(ad(dcnVar.b));
    }

    public static boolean ah(dco dcoVar, dco dcoVar2) {
        if (dcoVar.a() != dcoVar2.a()) {
            return false;
        }
        dcn[] dcnVarArrD = dcoVar.d();
        dcn[] dcnVarArrD2 = dcoVar2.d();
        if (dcnVarArrD.length != dcnVarArrD2.length) {
            return false;
        }
        for (int i = 0; i != dcnVarArrD.length; i++) {
            dcn dcnVar = dcnVarArrD[i];
            dcn dcnVar2 = dcnVarArrD2[i];
            if (dcnVar != dcnVar2) {
                if (dcnVar != null && dcnVar2 != null) {
                    if (dcnVar.a.w(dcnVar2.a)) {
                        if (!aa(dcnVar.b).equals(aa(dcnVar2.b))) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String ai(Object obj) {
        if (!(obj instanceof dab)) {
            if (!(obj instanceof czb)) {
                return "unknown object type ".concat(String.valueOf(obj.toString()));
            }
            obj.p();
        }
        StringBuffer stringBuffer = new StringBuffer();
        aj("", (dab) obj, stringBuffer);
        return stringBuffer.toString();
    }

    static void aj(String str, dab dabVar, StringBuffer stringBuffer) {
        boolean z = dabVar instanceof czp;
        String str2 = doj.a;
        if (z) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(str2);
            return;
        }
        int i = 0;
        if (dabVar instanceof dag) {
            stringBuffer.append(str);
            if (dabVar instanceof daw) {
                stringBuffer.append("BER Sequence");
            } else if (dabVar instanceof dbk) {
                stringBuffer.append("DER Sequence");
            } else {
                stringBuffer.append("Sequence");
            }
            stringBuffer.append(str2);
            dag dagVar = (dag) dabVar;
            int iB = dagVar.b();
            while (i < iB) {
                aj(str.concat("    "), dagVar.h(i).p(), stringBuffer);
                i++;
            }
            return;
        }
        if (dabVar instanceof dai) {
            stringBuffer.append(str);
            if (dabVar instanceof dax) {
                stringBuffer.append("BER Set");
            } else if (dabVar instanceof dbl) {
                stringBuffer.append("DER Set");
            } else {
                stringBuffer.append("Set");
            }
            stringBuffer.append(str2);
            dai daiVar = (dai) dabVar;
            int iB2 = daiVar.b();
            while (i < iB2) {
                aj(str.concat("    "), daiVar.f(i).p(), stringBuffer);
                i++;
            }
            return;
        }
        if (dabVar instanceof dal) {
            stringBuffer.append(str);
            if (dabVar instanceof daz) {
                stringBuffer.append("BER Tagged ");
            } else if (dabVar instanceof dbm) {
                stringBuffer.append("DER Tagged ");
            } else {
                stringBuffer.append("Tagged ");
            }
            dal dalVar = (dal) dabVar;
            stringBuffer.append(al(dalVar));
            if (!dalVar.n()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str2);
            aj(str.concat("    "), dalVar.b().p(), stringBuffer);
            return;
        }
        if (dabVar instanceof czx) {
            czx czxVar = (czx) dabVar;
            if (dabVar instanceof dav) {
                stringBuffer.append(str + "BER Constructed Octet String[" + czxVar.b.length + "] ");
            } else {
                stringBuffer.append(str + "DER Octet String[" + czxVar.b.length + "] ");
            }
            stringBuffer.append(str2);
            return;
        }
        if (dabVar instanceof czv) {
            stringBuffer.append(str + "ObjectIdentifier(" + ((czv) dabVar).b() + ")" + str2);
            return;
        }
        if (dabVar instanceof dad) {
            stringBuffer.append(str + "RelativeOID(" + ((dad) dabVar).b() + ")" + str2);
            return;
        }
        if (dabVar instanceof cyz) {
            stringBuffer.append(str + "Boolean(" + ((cyz) dabVar).h() + ")" + str2);
            return;
        }
        if (dabVar instanceof czo) {
            stringBuffer.append(str + "Integer(" + ((czo) dabVar).j().toString() + ")" + str2);
            return;
        }
        if (dabVar instanceof cyw) {
            cyw cywVar = (cyw) dabVar;
            byte[] bArrM = cywVar.m();
            int iF = cywVar.f();
            if (cywVar instanceof dbd) {
                stringBuffer.append(str + "DER Bit String[" + bArrM.length + ", " + iF + "] ");
            } else if (cywVar instanceof dbn) {
                stringBuffer.append(str + "DL Bit String[" + bArrM.length + ", " + iF + "] ");
            } else {
                stringBuffer.append(str + "BER Bit String[" + bArrM.length + ", " + iF + "] ");
            }
            stringBuffer.append(str2);
            return;
        }
        if (dabVar instanceof czl) {
            stringBuffer.append(str + "IA5String(" + ((czl) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof dao) {
            stringBuffer.append(str + "UTF8String(" + ((dao) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof czq) {
            stringBuffer.append(str + "NumericString(" + ((czq) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof dac) {
            stringBuffer.append(str + "PrintableString(" + ((dac) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof dar) {
            stringBuffer.append(str + "VisibleString(" + ((dar) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof cyu) {
            stringBuffer.append(str + "BMPString(" + ((cyu) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof dak) {
            stringBuffer.append(str + "T61String(" + ((dak) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof czj) {
            stringBuffer.append(str + "GraphicString(" + ((czj) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof daq) {
            stringBuffer.append(str + "VideotexString(" + ((daq) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof dan) {
            stringBuffer.append(str + "UTCTime(" + ((dan) dabVar).f() + ") " + str2);
            return;
        }
        if (dabVar instanceof czi) {
            stringBuffer.append(str + "GeneralizedTime(" + ((czi) dabVar).b() + ") " + str2);
            return;
        }
        if (dabVar instanceof cze) {
            stringBuffer.append(str + "DER Enumerated(" + ((cze) dabVar).b().toString() + ")" + str2);
            return;
        }
        if (dabVar instanceof czs) {
            stringBuffer.append(str + "ObjectDescriptor(" + ((czs) dabVar).a.b() + ") " + str2);
            return;
        }
        if (!(dabVar instanceof czg)) {
            stringBuffer.append(str + dabVar.toString() + str2);
            return;
        }
        czg czgVar = (czg) dabVar;
        stringBuffer.append(str + "External " + str2);
        czv czvVar = czgVar.a;
        String strConcat = str.concat("    ");
        if (czvVar != null) {
            stringBuffer.append(strConcat + "Direct Reference: " + czvVar.b() + str2);
        }
        czo czoVar = czgVar.b;
        if (czoVar != null) {
            stringBuffer.append(strConcat + "Indirect Reference: " + czoVar.toString() + str2);
        }
        dab dabVar2 = czgVar.c;
        if (dabVar2 != null) {
            aj(strConcat, dabVar2, stringBuffer);
        }
        stringBuffer.append(strConcat + "Encoding: " + czgVar.d + str2);
        aj(strConcat, czgVar.e, stringBuffer);
    }

    public static int ak(InputStream inputStream) {
        if (inputStream instanceof dcb) {
            return ((dcb) inputStream).d;
        }
        if (inputStream instanceof czm) {
            return ((czm) inputStream).a;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel());
                long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary != null ? fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jMaxMemory;
    }

    public static String al(dal dalVar) {
        return am(dalVar.b, dalVar.c);
    }

    public static String am(int i, int i2) {
        return i != 64 ? i != 128 ? i != 192 ? b.h(i2, "[UNIVERSAL ", "]") : b.h(i2, "[PRIVATE ", "]") : b.h(i2, "[CONTEXT ", "]") : b.h(i2, "[APPLICATION ", "]");
    }

    public static void an(dal dalVar) {
        int i = dalVar.b;
        if (i != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i != 64 ? i != 128 ? i != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
    }

    public static int ao(int i) {
        if (i == 99) {
            return 100;
        }
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
            default:
                return 0;
        }
    }

    public static /* synthetic */ int ap(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int aq(int i) {
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
            default:
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0066 A[PHI: r15
  0x0066: PHI (r15v3 long) = (r15v2 long), (r15v4 long) binds: [B:81:0x0056, B:85:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long ar(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            java.lang.String r5 = defpackage.cvy.a(r0)
            if (r5 != 0) goto Ld
            return r22
        Ld:
            int r6 = r5.length()
            if (r6 != 0) goto L16
        L13:
            r7 = 0
            goto L81
        L16:
            r8 = 0
            char r9 = r5.charAt(r8)
            r10 = 48
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r10) goto L35
            r10 = 1
            if (r6 != r10) goto L28
            goto L13
        L28:
            r13 = 43
            if (r9 == r13) goto L36
            r8 = 45
            if (r9 == r8) goto L31
            goto L13
        L31:
            r11 = -9223372036854775808
            r8 = r10
            goto L36
        L35:
            r10 = r8
        L36:
            r15 = 0
            r23 = r8
            r7 = r15
            r15 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L40:
            if (r10 >= r6) goto L75
            char r9 = r5.charAt(r10)
            r17 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r13 = 10
            int r9 = java.lang.Character.digit(r9, r13)
            if (r9 >= 0) goto L54
            goto L13
        L54:
            int r13 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 != 0) goto L13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            goto L13
        L66:
            r13 = 10
            long r7 = r7 * r13
            long r13 = (long) r9
            long r19 = r11 + r13
            int r9 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r9 >= 0) goto L71
            goto L13
        L71:
            long r7 = r7 - r13
            int r10 = r10 + 1
            goto L40
        L75:
            if (r23 == 0) goto L7c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L81
        L7c:
            long r6 = -r7
            java.lang.Long r7 = java.lang.Long.valueOf(r6)
        L81:
            java.lang.String r6 = "'"
            java.lang.String r8 = "System property '"
            if (r7 == 0) goto Lc1
            long r9 = r7.longValue()
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 > 0) goto L94
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L94
            return r9
        L94:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' should be in range "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ".."
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ", but is '"
            r7.append(r0)
            r7.append(r9)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            r5.<init>(r0)
            throw r5
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnx.ar(java.lang.String, long, long, long):long");
    }

    public static /* synthetic */ int as(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) ar(str, i, i5, i3);
    }

    public static void au(String str) {
        String strA = cvy.a(str);
        if (strA != null) {
            Boolean.parseBoolean(strA);
        }
    }

    public static long av(long j, long j2) {
        return j & (~j2);
    }

    public static String aw(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String ax(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static /* synthetic */ String ay(String str) {
        str.getClass();
        str.getClass();
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static int az(CharSequence charSequence, int i) {
        return ((String) charSequence).indexOf(".", i);
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public static Object bA() {
        return cmu.a.a();
    }

    public static cme bB(Object obj, long j) {
        return (cme) cod.f(obj, j);
    }

    public static List bC(Object obj, long j) {
        cme cmeVarBB = bB(obj, j);
        if (cmeVarBB.c()) {
            return cmeVarBB;
        }
        int size = cmeVarBB.size();
        cme cmeVarD = cmeVarBB.d(size == 0 ? 10 : size + size);
        cod.r(obj, j, cmeVarD);
        return cmeVarD;
    }

    public static clk bD(Object obj) {
        return ((clr) obj).d;
    }

    public static clk bE(Object obj) {
        return ((clr) obj).h();
    }

    public static void bF(ckz ckzVar, Object obj, cli cliVar, clk clkVar) {
        cmt cmtVar = (cmt) obj;
        clkVar.l((cls) cmtVar.d, ckzVar.t(cmtVar.a.getClass(), cliVar));
    }

    public static void bG(Object obj) {
        bD(obj).e();
    }

    public static ckv bH(cld cldVar, byte[] bArr) {
        cldVar.ah();
        return new ckt(bArr);
    }

    public static Object bI(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static String bJ(Object... objArr) {
        return String.format(Locale.ROOT, "ConsentVerifierLibraryThread-%d", objArr);
    }

    public static void bK(asv asvVar, Map.Entry entry) {
        cls clsVar = (cls) entry.getKey();
        cog cogVar = cog.DOUBLE;
        switch (clsVar.b.ordinal()) {
            case 0:
                asvVar.t(clsVar.a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                asvVar.x(clsVar.a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                asvVar.A(clsVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                asvVar.J(clsVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                asvVar.z(clsVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                asvVar.w(clsVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                asvVar.v(clsVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                asvVar.r(clsVar.a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                asvVar.H(clsVar.a, (String) entry.getValue());
                break;
            case 9:
                asvVar.y(clsVar.a, entry.getValue(), cni.a.a(entry.getValue().getClass()));
                break;
            case 10:
                asvVar.B(clsVar.a, entry.getValue(), cni.a.a(entry.getValue().getClass()));
                break;
            case 11:
                asvVar.s(clsVar.a, (ckv) entry.getValue());
                break;
            case 12:
                asvVar.I(clsVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                asvVar.z(clsVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                asvVar.D(clsVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                asvVar.E(clsVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                asvVar.F(clsVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                asvVar.G(clsVar.a, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    private static int bL(int i) {
        int iBinarySearch = Arrays.binarySearch(cnn.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public static /* synthetic */ boolean ba() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void bb() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static void bc(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(b.f(i2, i, "index: ", ", size: "));
        }
    }

    public static void bd(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b.f(i2, i, "index: ", ", size: "));
        }
    }

    public static void be(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(b.f(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static void bf(Object obj) throws Throwable {
        if (obj instanceof csb) {
            throw ((csb) obj).a;
        }
    }

    public static /* synthetic */ Object bg(Object obj) throws cmh {
        cxs cxsVar = cxs.a;
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        cli cliVar = cli.a;
        cni cniVar = cni.a;
        clt cltVarQ = clt.q(cxsVar, bArr, 0, length, cli.a);
        clt.B(cltVarQ);
        return (cxs) cltVarQ;
    }

    public static void bh(cpm cpmVar, List list) {
        list.add(cpmVar);
    }

    public static void bi(cpm cpmVar, List list) {
        list.add(cpmVar);
    }

    public static int bj(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap bk(int i) {
        return new LinkedHashMap(bj(i));
    }

    public static List bl(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    public static void bm(Object obj, cpm cpmVar, LinkedHashMap linkedHashMap) {
        obj.getClass();
        cpmVar.getClass();
        linkedHashMap.put(obj, cpmVar);
    }

    public static void bn(Object obj, cpd cpdVar) {
        cox coxVarE = cpdVar.e();
        cpdVar.getClass();
        coxVarE.getClass();
        coxVarE.b(obj);
    }

    public static Duration bo(clf clfVar) {
        return Duration.ofSeconds(col.a(clfVar.b, clfVar.c).b, r4.c);
    }

    public static Instant bp(cnv cnvVar) {
        return Instant.ofEpochSecond(con.b(cnvVar.b, cnvVar.c).b, r4.c);
    }

    public static String bq(byte[] bArr, int i, int i2) throws cmh {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!bu(b)) {
                break;
            }
            i++;
            bs(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (bu(b2)) {
                bs(b2, cArr, i4);
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (bu(b3)) {
                        i++;
                        bs(b3, cArr, i4);
                        i4++;
                    }
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw new cmh("Protocol message had invalid UTF-8.");
                }
                int i6 = i4 + 1;
                i += 2;
                byte b4 = bArr[i5];
                if (b2 < -62 || bt(b4)) {
                    throw new cmh("Protocol message had invalid UTF-8.");
                }
                cArr[i4] = (char) (br(b4) | ((b2 & 31) << 6));
                i4 = i6;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw new cmh("Protocol message had invalid UTF-8.");
                    }
                    int i7 = i4 + 1;
                    int i8 = i + 2;
                    byte b5 = bArr[i5];
                    i += 3;
                    byte b6 = bArr[i8];
                    if (!bt(b5)) {
                        if (b2 == -32) {
                            if (b5 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b5 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!bt(b6)) {
                            cArr[i4] = (char) ((br(b5) << 6) | ((b2 & 15) << 12) | br(b6));
                            i4 = i7;
                        }
                    }
                    throw new cmh("Protocol message had invalid UTF-8.");
                }
                if (i5 >= i3 - 2) {
                    throw new cmh("Protocol message had invalid UTF-8.");
                }
                byte b7 = bArr[i5];
                int i9 = i + 3;
                byte b8 = bArr[i + 2];
                i += 4;
                byte b9 = bArr[i9];
                if (bt(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || bt(b8) || bt(b9)) {
                    throw new cmh("Protocol message had invalid UTF-8.");
                }
                int iBr = (br(b7) << 12) | ((b2 & 7) << 18) | (br(b8) << 6) | br(b9);
                cArr[i4] = (char) ((iBr >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((iBr & 1023) + 56320);
                i4 += 2;
            }
        }
        return new String(cArr, 0, i4);
    }

    public static int br(byte b) {
        return b & 63;
    }

    public static void bs(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean bt(byte b) {
        return b > -65;
    }

    public static boolean bu(byte b) {
        return b >= 0;
    }

    public static String bv(ckv ckvVar) {
        StringBuilder sb = new StringBuilder(ckvVar.d());
        for (int i = 0; i < ckvVar.d(); i++) {
            byte bA = ckvVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void bw(ckv ckvVar, ArrayDeque arrayDeque) {
        if (!ckvVar.h()) {
            if (!(ckvVar instanceof cnn)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(ckvVar.getClass()))));
            }
            cnn cnnVar = (cnn) ckvVar;
            int[] iArr = cnn.a;
            bw(cnnVar.e, arrayDeque);
            bw(cnnVar.f, arrayDeque);
            return;
        }
        int iBL = bL(ckvVar.d());
        int iC = cnn.c(iBL + 1);
        if (arrayDeque.isEmpty() || ((ckv) arrayDeque.peek()).d() >= iC) {
            arrayDeque.push(ckvVar);
            return;
        }
        int iC2 = cnn.c(iBL);
        ckv cnnVar2 = (ckv) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ckv) arrayDeque.peek()).d() < iC2) {
            cnnVar2 = new cnn((ckv) arrayDeque.pop(), cnnVar2);
        }
        cnn cnnVar3 = new cnn(cnnVar2, ckvVar);
        while (!arrayDeque.isEmpty()) {
            if (((ckv) arrayDeque.peek()).d() >= cnn.c(bL(cnnVar3.d) + 1)) {
                break;
            } else {
                cnnVar3 = new cnn((ckv) arrayDeque.pop(), cnnVar3);
            }
        }
        arrayDeque.push(cnnVar3);
    }

    public static cmt bx(Object obj) {
        return (cmt) ((asv) obj).a;
    }

    public static boolean by(Object obj) {
        return !((cmu) obj).b;
    }

    public static Object bz(Object obj, Object obj2) {
        cmu cmuVarA = (cmu) obj;
        cmu cmuVar = (cmu) obj2;
        if (!cmuVar.isEmpty()) {
            if (!cmuVarA.b) {
                cmuVarA = cmuVarA.a();
            }
            cmuVarA.b();
            if (!cmuVar.isEmpty()) {
                cmuVarA.putAll(cmuVar);
            }
        }
        return cmuVarA;
    }

    public static czv c(String str) {
        if (str.equals("SHA-256")) {
            return dcg.c;
        }
        if (str.equals("SHA-512")) {
            return dcg.e;
        }
        if (str.equals("SHAKE128")) {
            return dcg.m;
        }
        if (str.equals("SHAKE256")) {
            return dcg.n;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static byte[] d(deu deuVar, dai daiVar) {
        if (!deuVar.a) {
            throw new IllegalArgumentException("public key found");
        }
        try {
            return t(deuVar, daiVar).u();
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] e(deu deuVar) {
        if (deuVar.a) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return s(deuVar).u();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int f(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static int g(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static Object h(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        dmj dmjVar = new dmj(cls, new ByteArrayInputStream(bArr));
        Object object = dmjVar.readObject();
        if (dmjVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static void i(byte[] bArr, byte[] bArr2, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static boolean j(byte[][] bArr) {
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static byte[] l(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static byte[] m(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static byte[] n(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] o(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static byte[][] p(byte[][] bArr) {
        if (j(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr3 = new byte[bArr[i].length];
            bArr2[i] = bArr3;
            byte[] bArr4 = bArr[i];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }

    public static long q(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static dmc r(dlr dlrVar, dmc dmcVar, dmc dmcVar2, dlv dlvVar) {
        if (dmcVar == null) {
            throw new NullPointerException("left == null");
        }
        if (dmcVar2 == null) {
            throw new NullPointerException("right == null");
        }
        int i = dmcVar.a;
        if (i != dmcVar2.a) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] bArrP = dos.p(dlrVar.c);
        if (dlvVar instanceof dlo) {
            dlo dloVar = (dlo) dlvVar;
            dlp dlpVar = new dlp(null);
            dlpVar.e = dloVar.d;
            dlpVar.f = dloVar.e;
            dlpVar.b = dloVar.a;
            dlpVar.c = dloVar.b;
            dlpVar.a = dloVar.c;
            dlpVar.g = 0;
            dlvVar = new dlo(dlpVar);
        } else if (dlvVar instanceof dlm) {
            dlm dlmVar = (dlm) dlvVar;
            dll dllVar = new dll();
            dllVar.e = dlmVar.d;
            dllVar.f = dlmVar.e;
            dllVar.a = dlmVar.a;
            dllVar.b = dlmVar.b;
            dllVar.g = 0;
            dlvVar = new dlm(dllVar);
        }
        dln dlnVar = dlrVar.b;
        byte[] bArrA = dlnVar.a(bArrP, dlvVar.a());
        if (dlvVar instanceof dlo) {
            dlo dloVar2 = (dlo) dlvVar;
            dlp dlpVar2 = new dlp(null);
            dlpVar2.e = dloVar2.d;
            dlpVar2.f = dloVar2.e;
            dlpVar2.b = dloVar2.a;
            dlpVar2.c = dloVar2.b;
            dlpVar2.a = dloVar2.c;
            dlpVar2.g = 1;
            dlvVar = new dlo(dlpVar2);
        } else if (dlvVar instanceof dlm) {
            dlm dlmVar2 = (dlm) dlvVar;
            dll dllVar2 = new dll();
            dllVar2.e = dlmVar2.d;
            dllVar2.f = dlmVar2.e;
            dllVar2.a = dlmVar2.a;
            dllVar2.b = dlmVar2.b;
            dllVar2.g = 1;
            dlvVar = new dlm(dllVar2);
        }
        byte[] bArrA2 = dlnVar.a(bArrP, dlvVar.a());
        if (dlvVar instanceof dlo) {
            dlo dloVar3 = (dlo) dlvVar;
            dlp dlpVar3 = new dlp(null);
            dlpVar3.e = dloVar3.d;
            dlpVar3.f = dloVar3.e;
            dlpVar3.b = dloVar3.a;
            dlpVar3.c = dloVar3.b;
            dlpVar3.a = dloVar3.c;
            dlpVar3.g = 2;
            dlvVar = new dlo(dlpVar3);
        } else if (dlvVar instanceof dlm) {
            dlm dlmVar3 = (dlm) dlvVar;
            dll dllVar3 = new dll();
            dllVar3.e = dlmVar3.d;
            dllVar3.f = dlmVar3.e;
            dllVar3.a = dlmVar3.a;
            dllVar3.b = dlmVar3.b;
            dllVar3.g = 2;
            dlvVar = new dlm(dllVar3);
        }
        byte[] bArrA3 = dlnVar.a(bArrP, dlvVar.a());
        int i2 = dlrVar.a.a;
        int i3 = i2 + i2;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) (dmcVar.a()[i4] ^ bArrA2[i4]);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5 + i2] = (byte) (dmcVar2.a()[i5] ^ bArrA3[i5]);
        }
        int length = bArrA.length;
        int i6 = dlnVar.a;
        if (length != i6) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i3 == i6 + i6) {
            return new dmc(i, dlnVar.b(1, bArrA, bArr));
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public static ddp s(deu deuVar) throws IOException {
        if (deuVar instanceof dnv) {
            dnv dnvVar = (dnv) deuVar;
            return new ddp(dle.s(dnvVar.b), dos.p(dnvVar.c));
        }
        if (deuVar instanceof djz) {
            djz djzVar = (djz) deuVar;
            return new ddp(new dcw(dgr.d, new dgs(dle.t(djzVar.b))), djzVar.a());
        }
        if (deuVar instanceof diw) {
            return new ddp(new dcw(dgr.e), ((diw) deuVar).a());
        }
        if (deuVar instanceof dir) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Q(1, byteArrayOutputStream);
            N((dir) deuVar, byteArrayOutputStream);
            return new ddp(new dcw(dci.C), new dbh(byteArrayOutputStream.toByteArray()));
        }
        if (deuVar instanceof dil) {
            dil dilVar = (dil) deuVar;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Q(dilVar.b, byteArrayOutputStream2);
            N(dilVar.c, byteArrayOutputStream2);
            return new ddp(new dcw(dci.C), new dbh(byteArrayOutputStream2.toByteArray()));
        }
        if (deuVar instanceof dkg) {
            dkg dkgVar = (dkg) deuVar;
            return new ddp(new dcw(dle.q(dkgVar.b)), dkgVar.a());
        }
        if (deuVar instanceof dhj) {
            dhj dhjVar = (dhj) deuVar;
            return new ddp(new dcw(dle.j(dhjVar.b)), dhjVar.a());
        }
        if (deuVar instanceof dmi) {
            dmi dmiVar = (dmi) deuVar;
            byte[] bArrL = l(dmiVar.e);
            byte[] bArrL2 = l(dmiVar.d);
            byte[] bArrA = dmiVar.a();
            if (bArrA.length > bArrL.length + bArrL2.length) {
                return new ddp(new dcw(dfb.a), new dbh(bArrA));
            }
            return new ddp(new dcw(dgr.f, new dgv(dmiVar.c.c, dle.u(dmiVar.b))), new dha(bArrL, bArrL2));
        }
        if (deuVar instanceof dmb) {
            dmb dmbVar = (dmb) deuVar;
            byte[] bArrA2 = dmbVar.a();
            byte[] bArrB = dmbVar.b();
            byte[] bArrC = dmbVar.c();
            if (bArrC.length > bArrA2.length + bArrB.length) {
                return new ddp(new dcw(dfb.b), new dbh(bArrC));
            }
            dly dlyVar = dmbVar.c;
            return new ddp(new dcw(dgr.g, new dgw(dlyVar.d, dlyVar.e, dle.u(dmbVar.b))), new dgy(dmbVar.a(), dmbVar.b()));
        }
        if (deuVar instanceof dnt) {
            dnt dntVar = (dnt) deuVar;
            return new ddp(new dcw(dgr.c), new dgq(dntVar.c, dntVar.d, dntVar.e, dle.r(dntVar.b)));
        }
        if (deuVar instanceof die) {
            die dieVar = (die) deuVar;
            return new ddp(new dcw(dle.g(dieVar.b)), new dbh(dos.p(dieVar.c)));
        }
        if (deuVar instanceof djw) {
            djw djwVar = (djw) deuVar;
            return new ddp(new dcw(dle.o(djwVar.b)), new dbk(new dbh(dos.p(djwVar.c))));
        }
        if (deuVar instanceof djm) {
            djm djmVar = (djm) deuVar;
            return new ddp(new dcw(dle.m(djmVar.b)), new dbh(djmVar.a()));
        }
        if (deuVar instanceof dja) {
            dja djaVar = (dja) deuVar;
            return new ddp(new dcw(dle.k(djaVar.b)), new dbh(djaVar.a()));
        }
        if (deuVar instanceof dia) {
            dia diaVar = (dia) deuVar;
            byte[] bArrP = dos.p(diaVar.c);
            dhy dhyVar = diaVar.b;
            dcw dcwVar = new dcw(dle.f(dhyVar));
            int length = bArrP.length;
            byte[] bArr = new byte[length + 1];
            bArr[0] = (byte) dhyVar.d;
            System.arraycopy(bArrP, 0, bArr, 1, length);
            return new ddp(dcwVar, bArr);
        }
        if (deuVar instanceof dhw) {
            dhw dhwVar = (dhw) deuVar;
            return new ddp(new dcw(dle.i(dhwVar.b)), dos.r(dhwVar.c, dhwVar.d));
        }
        if (deuVar instanceof dje) {
            dje djeVar = (dje) deuVar;
            djc djcVar = djeVar.b;
            byte[] bArr2 = new byte[djcVar.g];
            byte[] bArr3 = djeVar.c;
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, 0, length2);
            byte[] bArr4 = djeVar.d;
            System.arraycopy(bArr4, 0, bArr2, length2, bArr4.length);
            return new ddp(new dcw(dle.l(djcVar)), new dbh(bArr2));
        }
        if (deuVar instanceof dji) {
            dji djiVar = (dji) deuVar;
            return new ddp(new dcw(dle.p(djiVar.b)), new dbh(dos.p(djiVar.c)));
        }
        if (deuVar instanceof dhr) {
            dhr dhrVar = (dhr) deuVar;
            return new ddp(new dcw(dle.e(dhrVar.b)), dhrVar.a());
        }
        if (deuVar instanceof dhe) {
            dhe dheVar = (dhe) deuVar;
            return new ddp(new dcw(dle.d(dheVar.b)), dheVar.a());
        }
        if (deuVar instanceof dii) {
            dii diiVar = (dii) deuVar;
            return new ddp(new dcw(dle.h(diiVar.b)), diiVar.a());
        }
        if (!(deuVar instanceof djs)) {
            throw new IOException("key parameters not recognized");
        }
        djs djsVar = (djs) deuVar;
        djq djqVar = djsVar.b;
        return new ddp(new dcw(dle.n(djqVar)), new dbh(djqVar.m != 1 ? dos.r(dos.r(dos.r(dos.r(dos.r(djsVar.d, y(djsVar.e, false)), y(djsVar.f, true)), y(djsVar.g, false)), y(djsVar.h, true)), y(djsVar.i, true)) : y(djsVar.c, true)));
    }

    public static dcj t(deu deuVar, dai daiVar) throws IOException {
        int i;
        int i2;
        int i3;
        byte[][] bArr;
        int i4;
        int i5;
        long jE;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        dhh dhhVar;
        if (deuVar instanceof dnu) {
            dnu dnuVar = (dnu) deuVar;
            return new dcj(dle.s(dnuVar.b), new dbh(dos.p(dnuVar.c)), daiVar);
        }
        if (deuVar instanceof djy) {
            djy djyVar = (djy) deuVar;
            return new dcj(new dcw(dgr.d, new dgs(dle.t(djyVar.b))), new dbh(djyVar.a()));
        }
        if (deuVar instanceof div) {
            dcw dcwVar = new dcw(dgr.e);
            short[] sArrA = ((div) deuVar).a();
            int length = sArrA.length;
            byte[] bArr2 = new byte[length + length];
            for (int i12 = 0; i12 != sArrA.length; i12++) {
                short s = sArrA[i12];
                int i13 = i12 + i12;
                bArr2[i13] = (byte) s;
                bArr2[i13 + 1] = (byte) (s >>> 8);
            }
            return new dcj(dcwVar, new dbh(bArr2));
        }
        if (deuVar instanceof diq) {
            diq diqVar = (diq) deuVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Q(1, byteArrayOutputStream);
            N(diqVar, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Q(1, byteArrayOutputStream2);
            N(diqVar.b(), byteArrayOutputStream2);
            return new dcj(new dcw(dci.C), new dbh(byteArray), daiVar, byteArrayOutputStream2.toByteArray());
        }
        if (deuVar instanceof dik) {
            dik dikVar = (dik) deuVar;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = dikVar.b;
            Q(i14, byteArrayOutputStream3);
            N(dikVar, byteArrayOutputStream3);
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            Q(i14, byteArrayOutputStream4);
            N(dikVar.b().c, byteArrayOutputStream4);
            return new dcj(new dcw(dci.C), new dbh(byteArray2), daiVar, byteArrayOutputStream4.toByteArray());
        }
        if (deuVar instanceof dkf) {
            dkf dkfVar = (dkf) deuVar;
            dcw dcwVar2 = new dcw(dle.q(dkfVar.b));
            dbh dbhVar = new dbh(dkfVar.a());
            dka dkaVar = dkfVar.d;
            return new dcj(dcwVar2, dbhVar, daiVar, dos.r((byte[]) dkaVar.a, (byte[]) dkaVar.b));
        }
        if (deuVar instanceof djl) {
            djl djlVar = (djl) deuVar;
            return new dcj(new dcw(dle.m(djlVar.b)), new dbh(djlVar.a()), daiVar);
        }
        if (!(deuVar instanceof dhi)) {
            if (deuVar instanceof dmg) {
                dmg dmgVar = (dmg) deuVar;
                dme dmeVar = dmgVar.c;
                int i15 = dmeVar.c;
                dcw dcwVar3 = new dcw(dgr.f, new dgv(i15, dle.u(dmgVar.b)));
                byte[] bArrS = dmgVar.s();
                int i16 = dmeVar.f;
                int iQ = (int) q(bArrS, 4);
                if (!k(i15, iQ)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] bArrM = m(bArrS, 4, i16);
                int i17 = i16 + 4;
                byte[] bArrM2 = m(bArrS, i17, i16);
                int i18 = i17 + i16;
                byte[] bArrM3 = m(bArrS, i18, i16);
                int i19 = i18 + i16;
                byte[] bArrM4 = m(bArrS, i19, i16);
                int i20 = i19 + i16;
                byte[] bArrM5 = m(bArrS, i20, bArrS.length - i20);
                try {
                    int i21 = ((dlf) h(bArrM5, dlf.class)).b;
                    return new dcj(dcwVar3, i21 != (1 << i15) + (-1) ? new dgz(iQ, bArrM, bArrM2, bArrM3, bArrM4, bArrM5, i21) : new dgz(iQ, bArrM, bArrM2, bArrM3, bArrM4, bArrM5), daiVar);
                } catch (ClassNotFoundException e) {
                    throw new IOException("cannot parse BDS: ".concat(String.valueOf(e.getMessage())));
                }
            }
            if (deuVar instanceof dma) {
                dma dmaVar = (dma) deuVar;
                dly dlyVar = dmaVar.c;
                int i22 = dlyVar.d;
                dcw dcwVar4 = new dcw(dgr.g, new dgw(i22, dlyVar.e, dle.u(dmaVar.b)));
                byte[] bArrS2 = dmaVar.s();
                int iA = dlyVar.a();
                int i23 = (i22 + 7) / 8;
                long jQ = (int) q(bArrS2, i23);
                if (!k(i22, jQ)) {
                    throw new IllegalArgumentException("index out of bounds");
                }
                byte[] bArrM6 = m(bArrS2, i23, iA);
                int i24 = i23 + iA;
                byte[] bArrM7 = m(bArrS2, i24, iA);
                int i25 = i24 + iA;
                byte[] bArrM8 = m(bArrS2, i25, iA);
                int i26 = i25 + iA;
                byte[] bArrM9 = m(bArrS2, i26, iA);
                int i27 = i26 + iA;
                byte[] bArrM10 = m(bArrS2, i27, bArrS2.length - i27);
                try {
                    long j = ((dlg) h(bArrM10, dlg.class)).b;
                    return new dcj(dcwVar4, j != (1 << i22) + (-1) ? new dgx(jQ, bArrM6, bArrM7, bArrM8, bArrM9, bArrM10, j) : new dgx(jQ, bArrM6, bArrM7, bArrM8, bArrM9, bArrM10), daiVar);
                } catch (ClassNotFoundException e2) {
                    throw new IOException("cannot parse BDSStateMap: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (deuVar instanceof dns) {
                dns dnsVar = (dns) deuVar;
                return new dcj(new dcw(dgr.c), new dgp(dnsVar.c, dnsVar.d, dnsVar.e, dnsVar.f, dnsVar.g, dle.r(dnsVar.b)));
            }
            if (deuVar instanceof did) {
                did didVar = (did) deuVar;
                return new dcj(new dcw(dle.g(didVar.b)), new dbh(dos.p(didVar.c)), daiVar);
            }
            if (deuVar instanceof djv) {
                djv djvVar = (djv) deuVar;
                return new dcj(new dcw(dle.o(djvVar.b)), new dbh(dos.p(djvVar.c)), daiVar);
            }
            if (deuVar instanceof diz) {
                diz dizVar = (diz) deuVar;
                return new dcj(new dcw(dle.k(dizVar.b)), new dbh(dizVar.a()), daiVar);
            }
            if (deuVar instanceof dhz) {
                dhz dhzVar = (dhz) deuVar;
                return new dcj(new dcw(dle.f(dhzVar.b)), new dgm(dos.p(dhzVar.d), dos.p(dhzVar.e), dos.p(dhzVar.f), new dgn(dos.p(dhzVar.c))), daiVar);
            }
            if (deuVar instanceof dhv) {
                dhv dhvVar = (dhv) deuVar;
                return new dcj(new dcw(dle.i(dhvVar.b)), new dbh(dos.q(new byte[][]{dhvVar.c, dhvVar.f, dhvVar.g, dhvVar.d, dhvVar.e})), daiVar);
            }
            if (deuVar instanceof djd) {
                djd djdVar = (djd) deuVar;
                czc czcVar = new czc();
                czcVar.b(new dbh(dos.p(djdVar.c)));
                czcVar.b(new dbh(dos.p(djdVar.d)));
                czcVar.b(new dbh(dos.p(djdVar.e)));
                czcVar.b(new dbh(dos.p(djdVar.f)));
                return new dcj(new dcw(dle.l(djdVar.b)), new dbk(czcVar), daiVar);
            }
            if (deuVar instanceof djh) {
                djh djhVar = (djh) deuVar;
                czc czcVar2 = new czc();
                czcVar2.b(new dbh(dos.p(djhVar.c)));
                czcVar2.b(new dbh(dos.p(djhVar.d)));
                czcVar2.b(new dbh(dos.p(djhVar.e)));
                czcVar2.b(new dbh(dos.p(djhVar.f)));
                czcVar2.b(new dbh(dos.p(djhVar.g)));
                return new dcj(new dcw(dle.p(djhVar.b)), new dbk(czcVar2), daiVar);
            }
            if (deuVar instanceof dhq) {
                dhq dhqVar = (dhq) deuVar;
                dhp dhpVar = dhqVar.b;
                dcw dcwVar5 = new dcw(dle.e(dhpVar));
                byte[] bArr3 = dhqVar.c;
                return new dcj(dcwVar5, new dbh(dos.q(new byte[][]{bArr3, dhqVar.d, dhqVar.e, dhqVar.f, dhqVar.g, dhqVar.h})), daiVar, new dhr(dhpVar, bArr3, dhqVar.i).a());
            }
            if (deuVar instanceof dhd) {
                dhd dhdVar = (dhd) deuVar;
                return new dcj(new dcw(dle.d(dhdVar.b)), new dbh(dhdVar.a()), daiVar);
            }
            if (deuVar instanceof dih) {
                dih dihVar = (dih) deuVar;
                return new dcj(new dcw(dle.h(dihVar.b)), new dbh(dihVar.a()), daiVar);
            }
            if (!(deuVar instanceof djr)) {
                throw new IOException("key parameters not recognized");
            }
            djr djrVar = (djr) deuVar;
            djq djqVar = djrVar.b;
            return new dcj(new dcw(dle.n(djqVar)), new dbh(djqVar.m == 3 ? dos.r(djrVar.o, djrVar.c) : dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(dos.r(djrVar.c, x(djrVar.d)), x(djrVar.e)), x(djrVar.g)), x(djrVar.f)), y(djrVar.h, true)), y(djrVar.i, false)), y(djrVar.j, true)), y(djrVar.k, false)), y(djrVar.l, false)), y(djrVar.m, true)), y(djrVar.n, false)), djrVar.p)), daiVar);
        }
        dhi dhiVar = (dhi) deuVar;
        dhh dhhVar2 = dhiVar.b;
        dcw dcwVar6 = new dcw(dle.j(dhhVar2));
        dhf dhfVar = dhhVar2.m;
        byte[] bArr4 = new byte[dhfVar.a()];
        byte[] bArr5 = dhiVar.c;
        byte[] bArr6 = new byte[dhfVar.a()];
        int i28 = dhfVar.c;
        int i29 = 1 << i28;
        short[] sArr = new short[i29];
        long[] jArr = {0};
        int i30 = dhfVar.a;
        int i31 = 8;
        int i32 = i30 >> 3;
        int[] iArr = new int[i29];
        int i33 = i29 * 4;
        int i34 = i32 + i33;
        byte[] bArr7 = new byte[i34];
        int i35 = dhfVar.d;
        des desVar = new des(256);
        desVar.f((byte) 64);
        desVar.g(bArr5, 0, 32);
        desVar.l(bArr7, 0, i34);
        for (int i36 = 0; i36 < i29; i36++) {
            iArr[i36] = dos.d(bArr7, (((i34 - 32) - i35) - i33) + (i36 * 4));
        }
        int i37 = dhfVar.b;
        short[] sArr2 = new short[i37 + 1];
        sArr2[i37] = 1;
        for (int i38 = 0; i38 < i37; i38++) {
            sArr2[i38] = (short) (dos.f(bArr5, i38 + i38 + 40) & dhfVar.f);
        }
        long[] jArr2 = new long[i29];
        int i39 = 0;
        while (i39 < i29) {
            long[] jArr3 = jArr2;
            long j2 = iArr[i39];
            jArr3[i39] = j2;
            long j3 = j2 << 31;
            jArr3[i39] = j3;
            long j4 = j3 | i39;
            jArr3[i39] = j4;
            jArr3[i39] = j4 & Long.MAX_VALUE;
            i39++;
            jArr2 = jArr3;
        }
        long[] jArr4 = jArr2;
        int i40 = 1;
        while (i40 < i29 - i40) {
            i40 += i40;
        }
        int i41 = i40;
        while (i41 > 0) {
            short[] sArr3 = sArr2;
            int i42 = 0;
            while (i42 < i29 - i41) {
                if ((i42 & i41) == 0) {
                    int i43 = i42 + i41;
                    long j5 = jArr4[i43];
                    long j6 = jArr4[i42];
                    i11 = i42;
                    dhhVar = dhhVar2;
                    long j7 = (-((j5 - j6) >>> 63)) & (j6 ^ j5);
                    jArr4[i11] = j6 ^ j7;
                    jArr4[i43] = jArr4[i43] ^ j7;
                } else {
                    i11 = i42;
                    dhhVar = dhhVar2;
                }
                i42 = i11 + 1;
                dhhVar2 = dhhVar;
            }
            dhh dhhVar3 = dhhVar2;
            int i44 = 0;
            for (int i45 = i40; i45 > i41; i45 >>>= 1) {
                while (i44 < i29 - i45) {
                    if ((i44 & i41) == 0) {
                        int i46 = i44 + i41;
                        long j8 = jArr4[i46];
                        i8 = i44;
                        int i47 = i45;
                        while (i47 > i41) {
                            int i48 = i8 + i47;
                            long j9 = jArr4[i48];
                            int i49 = i40;
                            long j10 = (-((j9 - j8) >>> 63)) & (j8 ^ j9);
                            j8 ^= j10;
                            jArr4[i48] = j9 ^ j10;
                            i47 >>>= 1;
                            i40 = i49;
                            i41 = i41;
                        }
                        i9 = i40;
                        i10 = i41;
                        jArr4[i46] = j8;
                    } else {
                        i8 = i44;
                        i9 = i40;
                        i10 = i41;
                    }
                    i44 = i8 + 1;
                    i40 = i9;
                    i41 = i10;
                }
            }
            i41 >>>= 1;
            sArr2 = sArr3;
            dhhVar2 = dhhVar3;
        }
        short[] sArr4 = sArr2;
        dhh dhhVar4 = dhhVar2;
        int i50 = 1;
        while (true) {
            if (i50 >= i29) {
                short[] sArr5 = new short[i30];
                int i51 = 0;
                while (i51 < i29) {
                    int i52 = i51;
                    sArr[i52] = (short) (dhfVar.f & jArr4[i51]);
                    i51 = i52 + 1;
                    i29 = i29;
                }
                for (int i53 = 0; i53 < i30; i53++) {
                    short s2 = sArr[i53];
                    short s3 = (short) (((s2 >> 8) & 255) | ((s2 & 255) << 8));
                    short s4 = (short) (((s3 & 3855) << 4) | ((s3 >> 4) & 3855));
                    short s5 = (short) (((s4 & 13107) << 2) | ((s4 >> 2) & 13107));
                    int i54 = s5 >> 1;
                    int i55 = s5 & 21845;
                    short s6 = (short) ((i55 + i55) | (i54 & 21845));
                    sArr5[i53] = (short) (i28 == 12 ? s6 >> 4 : s6 >> 3);
                }
                short[] sArr6 = new short[i30];
                for (int i56 = 0; i56 < i30; i56++) {
                    short s7 = sArr5[i56];
                    short sB = sArr4[i37];
                    int i57 = i37 - 1;
                    while (i57 >= 0) {
                        sB = (short) (dhfVar.g.b(sB, s7) ^ sArr4[i57]);
                        i57--;
                        sArr5 = sArr5;
                    }
                    sArr6[i56] = sB;
                }
                short[] sArr7 = sArr5;
                for (int i58 = 0; i58 < i30; i58++) {
                    sArr6[i58] = dhfVar.g.a(sArr6[i58]);
                }
                int i59 = dhfVar.e;
                byte b = 0;
                byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i59, i32);
                int i60 = 0;
                while (i60 < i59) {
                    int i61 = b;
                    while (i61 < i32) {
                        bArr8[i60][i61] = b;
                        i61++;
                        b = 0;
                    }
                    i60++;
                    b = 0;
                }
                int i62 = 0;
                while (i62 < i37) {
                    for (int i63 = 0; i63 < i30; i63 += 8) {
                        int i64 = 0;
                        while (i64 < i28) {
                            int i65 = (sArr6[i63 + 7] >>> i64) & 1;
                            int i66 = (sArr6[i63 + 6] >>> i64) & 1;
                            int i67 = (i65 + i65) | i66;
                            int i68 = (i67 + i67) | ((sArr6[i63 + 5] >>> i64) & 1);
                            int i69 = (i68 + i68) | ((sArr6[i63 + 4] >>> i64) & 1);
                            int i70 = (i69 + i69) | ((sArr6[i63 + 3] >>> i64) & 1);
                            int i71 = (i70 + i70) | ((sArr6[i63 + 2] >>> i64) & 1);
                            int i72 = (i71 + i71) | ((sArr6[i63 + 1] >>> i64) & 1);
                            bArr8[(i62 * i28) + i64][i63 / 8] = (byte) (((byte) (i72 + i72)) | ((sArr6[i63] >>> i64) & 1));
                            i64++;
                            i37 = i37;
                        }
                    }
                    int i73 = i37;
                    int i74 = 0;
                    while (i74 < i30) {
                        int i75 = i74;
                        sArr6[i75] = dhfVar.g.b(sArr6[i74], sArr7[i75]);
                        i74 = i75 + 1;
                    }
                    i62++;
                    i37 = i73;
                }
                int i76 = 0;
                loop22: while (true) {
                    if (i76 < i59) {
                        int i77 = i76 >>> 3;
                        int i78 = i76 & 7;
                        if (dhfVar.i && i76 == i59 - 32) {
                            long[] jArr5 = new long[64];
                            i2 = i30;
                            long[] jArr6 = new long[32];
                            boolean z = dhfVar.h;
                            int i79 = i5 & 7;
                            int i80 = i5 >> 3;
                            i3 = i78;
                            byte[] bArr9 = new byte[9];
                            if (z) {
                                bArr = bArr8;
                                int i81 = 0;
                                while (i81 < 32) {
                                    int i82 = i81;
                                    for (int i83 = 0; i83 < 9; i83++) {
                                        bArr9[i83] = bArr[i5 + i82][i80 + i83];
                                    }
                                    int i84 = 0;
                                    for (int i85 = i31; i84 < i85; i85 = 8) {
                                        int i86 = i84;
                                        int i87 = i86 + 1;
                                        bArr9[i86] = (byte) (((bArr9[i86] & 255) >> i79) | (bArr9[i87] << (8 - i79)));
                                        i84 = i87;
                                    }
                                    jArr5[i82] = dos.e(bArr9, 0);
                                    i81 = i82 + 1;
                                    i31 = 8;
                                }
                            } else {
                                bArr = bArr8;
                                for (int i88 = 0; i88 < 32; i88++) {
                                    jArr5[i88] = dos.e(bArr[i5 + i88], i80);
                                }
                            }
                            jArr[0] = 0;
                            int i89 = 0;
                            int i90 = 32;
                            while (i89 < i90) {
                                int i91 = i89 + 1;
                                int i92 = i77;
                                int i93 = i5;
                                long j11 = jArr5[i89];
                                int i94 = i89;
                                int i95 = i91;
                                while (i95 < i90) {
                                    j11 |= jArr5[i95];
                                    i95++;
                                    i90 = 32;
                                }
                                if (j11 == 0) {
                                    break loop22;
                                }
                                long j12 = ~j11;
                                long j13 = 72340172838076673L;
                                long j14 = 0;
                                for (int i96 = 0; i96 < 8; i96++) {
                                    j13 &= j12 >>> i96;
                                    j14 += j13;
                                }
                                long j15 = j14 & 578721382704613384L;
                                long j16 = j15 | (j15 >>> 1);
                                long j17 = j14 >>> 8;
                                long j18 = j16 | (j16 >>> 2);
                                long j19 = j18;
                                long j20 = j14 + (j17 & j18);
                                int i97 = 2;
                                for (int i98 = 8; i97 < i98; i98 = 8) {
                                    j19 &= j19 >>> i98;
                                    j17 >>>= i98;
                                    j20 += j17 & j19;
                                    i97++;
                                }
                                int i99 = ((int) j20) & 255;
                                long j21 = i99;
                                jArr6[i94] = j21;
                                jArr[0] = jArr[0] | (1 << ((int) j21));
                                int i100 = i91;
                                while (true) {
                                    i7 = 32;
                                    if (i100 >= 32) {
                                        break;
                                    }
                                    jArr5[i94] = jArr5[i94] ^ (jArr5[i100] & (((r11 >> i99) & 1) - 1));
                                    i100++;
                                }
                                int i101 = i91;
                                while (i101 < i7) {
                                    long j22 = jArr5[i101];
                                    int i102 = i101;
                                    jArr5[i102] = j22 ^ (jArr5[i94] & (-((j22 >> i99) & 1)));
                                    i101 = i102 + 1;
                                    i7 = 32;
                                }
                                i90 = i7;
                                i89 = i91;
                                i77 = i92;
                                i5 = i93;
                            }
                            i4 = i77;
                            int i103 = i5;
                            int i104 = 0;
                            while (i104 < i90) {
                                int i105 = i104 + 1;
                                int i106 = i105;
                                while (i106 < 64) {
                                    int i107 = i103 + i104;
                                    short s8 = sArr[i107];
                                    int i108 = i105;
                                    long j23 = (-(((((short) i106) ^ ((short) jArr6[r43])) - 1) >>> 63)) & (s8 ^ sArr[r40]);
                                    sArr[i107] = (short) (s8 ^ j23);
                                    sArr[i103 + i106] = (short) (j23 ^ sArr[r40]);
                                    i106++;
                                    i105 = i108;
                                    i104 = i104;
                                    z = z;
                                }
                                i104 = i105;
                                i90 = 32;
                            }
                            boolean z2 = z;
                            int i109 = 0;
                            while (i109 < i59) {
                                if (z2) {
                                    for (int i110 = 0; i110 < 9; i110++) {
                                        bArr9[i110] = bArr[i109][i80 + i110];
                                    }
                                    int i111 = 0;
                                    while (i111 < 8) {
                                        int i112 = i111 + 1;
                                        bArr9[i111] = (byte) ((bArr9[i112] << (8 - i79)) | ((bArr9[i111] & 255) >> i79));
                                        i111 = i112;
                                    }
                                    jE = dos.e(bArr9, 0);
                                } else {
                                    jE = dos.e(bArr[i109], i80);
                                }
                                int i113 = 0;
                                while (i113 < 32) {
                                    long j24 = jE >> i113;
                                    int i114 = i113;
                                    int i115 = (int) jArr6[i114];
                                    long j25 = (j24 ^ (jE >> i115)) & 1;
                                    long j26 = ((j25 << i115) ^ jE) ^ (j25 << i114);
                                    i113 = i114 + 1;
                                    jE = j26;
                                }
                                if (z2) {
                                    int i116 = 8 - i79;
                                    T(bArr9, 0, jE);
                                    byte[] bArr10 = bArr[i109];
                                    int i117 = i80 + 8;
                                    i6 = i109;
                                    bArr10[i117] = (byte) (((bArr9[7] & 255) >>> i116) | (((bArr10[i117] & 255) >>> i79) << i79));
                                    bArr10[i80] = (byte) (((bArr9[0] & 255) << i79) | (((bArr10[i80] & 255) << i116) >>> i116));
                                    int i118 = 7;
                                    while (i118 > 0) {
                                        byte[] bArr11 = bArr[i6];
                                        int i119 = i80 + i118;
                                        int i120 = (bArr9[i118] & 255) << i79;
                                        int i121 = i118 - 1;
                                        bArr11[i119] = (byte) (((bArr9[i121] & 255) >>> i116) | i120);
                                        i118 = i121;
                                    }
                                } else {
                                    i6 = i109;
                                    T(bArr[i6], i80, jE);
                                }
                                i109 = i6 + 1;
                            }
                        } else {
                            i2 = i30;
                            i3 = i78;
                            bArr = bArr8;
                            i4 = i77;
                        }
                        int i122 = i76 + 1;
                        for (int i123 = i122; i123 < i59; i123++) {
                            int i124 = (((byte) (bArr[i76][i4] ^ bArr[i123][i4])) >> i3) & 1;
                            for (int i125 = 0; i125 < i32; i125++) {
                                byte[] bArr12 = bArr[i76];
                                bArr12[i125] = (byte) ((bArr[i123][i125] & (-i124)) ^ bArr12[i125]);
                            }
                        }
                        if (((bArr[i76][i4] >> i3) & 1) == 0) {
                            break;
                        }
                        for (int i126 = 0; i126 < i59; i126++) {
                            if (i126 != i76) {
                                int i127 = (bArr[i126][i4] >> i3) & 1;
                                for (int i128 = 0; i128 < i32; i128++) {
                                    byte[] bArr13 = bArr[i126];
                                    bArr13[i128] = (byte) ((bArr[i76][i128] & (-i127)) ^ bArr13[i128]);
                                }
                            }
                        }
                        i76 = i122;
                        i30 = i2;
                        bArr8 = bArr;
                        i62 = i4;
                        i31 = 8;
                    } else {
                        int i129 = i30;
                        byte[][] bArr14 = bArr8;
                        if (dhfVar.h) {
                            int i130 = i59 & 7;
                            if (i130 == 0) {
                                System.arraycopy(bArr14[i62], (i59 - 1) >> 3, bArr6, 0, i32);
                            } else {
                                int i131 = 0;
                                int i132 = 0;
                                while (i131 < i59) {
                                    int i133 = (i59 - 1) >> 3;
                                    while (true) {
                                        i = i132 + 1;
                                        if (i133 < i32 - 1) {
                                            byte[] bArr15 = bArr14[i131];
                                            int i134 = (bArr15[i133] & 255) >>> i130;
                                            i133++;
                                            bArr6[i132] = (byte) ((bArr15[i133] << (8 - i130)) | i134);
                                            i132 = i;
                                        }
                                    }
                                    bArr6[i132] = (byte) ((bArr14[i131][i133] & 255) >>> i130);
                                    i131++;
                                    i132 = i;
                                }
                            }
                        } else {
                            int i135 = ((i129 - i59) + 7) >> 3;
                            for (int i136 = 0; i136 < i59; i136++) {
                                System.arraycopy(bArr14[i136], i59 >> 3, bArr6, i135 * i136, i135);
                            }
                        }
                    }
                }
            } else {
                if ((jArr4[i50 - 1] >> 31) == (jArr4[i50] >> 31)) {
                    break;
                }
                i50++;
            }
        }
        dgl dglVar = new dgl(bArr4);
        byte[] bArrT = dos.t(bArr5, 0, 32);
        byte[] bArrT2 = dos.t(bArr5, 32, 40);
        int i137 = dhhVar4.l;
        int i138 = i137 + i137 + 40;
        byte[] bArrT3 = dos.t(bArr5, 40, i138);
        int length2 = bArr5.length;
        int i139 = length2 - 32;
        return new dcj(dcwVar6, new dgk(bArrT, bArrT2, bArrT3, dos.t(bArr5, i138, i139), dos.t(bArr5, i139, length2), dglVar), daiVar);
    }

    public static deu u(dcj dcjVar) throws IOException {
        if (dcjVar == null) {
            throw new IllegalArgumentException("keyInfo array null");
        }
        dcw dcwVar = dcjVar.a;
        czv czvVar = dcwVar.a;
        if (czvVar.n(dgr.h)) {
            return new dnu(dle.a(dcwVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.w(dgr.d)) {
            return new djy(czx.f(dcjVar.a()).b, dle.c(dgs.a(dcwVar.b)));
        }
        int i = 0;
        int i2 = 1;
        if (czvVar.w(dgr.e)) {
            byte[] bArr = czx.f(dcjVar.a()).b;
            int length = bArr.length >> 1;
            short[] sArr = new short[length];
            while (i != length) {
                sArr[i] = dos.f(bArr, i + i);
                i++;
            }
            return new div(sArr);
        }
        if (czvVar.w(dci.C)) {
            byte[] bArr2 = czx.f(dcjVar.a()).b;
            cyw cywVar = dcjVar.c;
            if (dos.c(bArr2, 0) != 1) {
                if (cywVar == null) {
                    return dik.a(dos.t(bArr2, 4, bArr2.length));
                }
                byte[] bArrN = cywVar.n();
                dik dikVarA = dik.a(dos.t(bArr2, 4, bArr2.length));
                dikVarA.c = dil.a(bArrN);
                return dikVarA;
            }
            if (cywVar == null) {
                return diq.a(dos.t(bArr2, 4, bArr2.length));
            }
            byte[] bArrN2 = cywVar.n();
            byte[] bArrT = dos.t(bArr2, 4, bArr2.length);
            byte[] bArrT2 = dos.t(bArrN2, 4, bArrN2.length);
            diq diqVarA = diq.a(bArrT);
            diqVarA.b = dir.a(bArrT2);
            return diqVarA;
        }
        if (czvVar.n(dcd.n) || czvVar.n(dcd.Y)) {
            dke dkeVarJ = dle.J(czvVar);
            czb czbVarA = dcjVar.a();
            if (!(czbVarA instanceof dag)) {
                return new dkf(dkeVarJ, czx.f(czbVarA).b);
            }
            dgt dgtVar = czbVarA != null ? new dgt(dag.j(czbVarA)) : null;
            dgu dguVar = dgtVar.c;
            return new dkf(dkeVarJ, dos.p(dgtVar.a), dos.p(dgtVar.b), dguVar.b(), dguVar.a());
        }
        if (czvVar.n(dcd.al)) {
            return new djl(dle.G(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.n(dcd.aT)) {
            czb czbVarA2 = dcjVar.a();
            dgk dgkVar = czbVarA2 != null ? new dgk(dag.j(czbVarA2)) : null;
            return new dhi(dle.x(czvVar), dos.p(dgkVar.a), dos.p(dgkVar.b), dos.p(dgkVar.c), dos.p(dgkVar.d), dos.p(dgkVar.e));
        }
        if (czvVar.n(dcd.be)) {
            return new did(dle.B(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.n(dcd.bl)) {
            return new djv(dle.I(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.n(dcd.bF)) {
            return new diz(dle.D(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.n(dcd.bM)) {
            return new dhv(dle.z(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.n(dcd.bU)) {
            dag dagVarJ = dag.j(dcjVar.a());
            return new djd(dle.E(czvVar), czx.f(dagVarJ.h(0)).b, czx.f(dagVarJ.h(1)).b, czx.f(dagVarJ.h(2)).b, czx.f(dagVarJ.h(3)).b);
        }
        if (czvVar.n(dcd.cb)) {
            dag dagVarJ2 = dag.j(dcjVar.a());
            return new djh(dle.F(czvVar), czx.f(dagVarJ2.h(0)).b, czx.f(dagVarJ2.h(1)).b, czx.f(dagVarJ2.h(2)).b, czx.f(dagVarJ2.h(3)).b, czx.f(dagVarJ2.h(4)).b);
        }
        if (czvVar.w(dcd.aC) || czvVar.w(dcd.aD) || czvVar.w(dcd.aE)) {
            czb czbVarA3 = dcjVar.a();
            dhp dhpVarY = dle.y(czvVar);
            if (!(czbVarA3 instanceof dag)) {
                if (!(czbVarA3 instanceof dbh)) {
                    throw new IOException("not supported");
                }
                byte[] bArr3 = czx.f(czbVarA3).b;
                cyw cywVar2 = dcjVar.c;
                return cywVar2 != null ? new dhq(dhpVarY, bArr3, dkj.b(dhpVarY, cywVar2)) : new dhq(dhpVarY, bArr3, null);
            }
            dag dagVarJ3 = dag.j(czbVarA3);
            int iF = czo.m(dagVarJ3.h(0)).f();
            if (iF != 0) {
                throw new IOException(b.e(iF, "unknown private key version: "));
            }
            cyw cywVar3 = dcjVar.c;
            return cywVar3 != null ? new dhq(dhpVarY, cyw.i(dagVarJ3.h(1)).n(), cyw.i(dagVarJ3.h(2)).n(), cyw.i(dagVarJ3.h(3)).n(), cyw.i(dagVarJ3.h(4)).n(), cyw.i(dagVarJ3.h(5)).n(), cyw.i(dagVarJ3.h(6)).n(), dkj.b(dhpVarY, cywVar3).b()) : new dhq(dhpVarY, cyw.i(dagVarJ3.h(1)).n(), cyw.i(dagVarJ3.h(2)).n(), cyw.i(dagVarJ3.h(3)).n(), cyw.i(dagVarJ3.h(4)).n(), cyw.i(dagVarJ3.h(5)).n(), cyw.i(dagVarJ3.h(6)).n(), null);
        }
        if (czvVar.w(dcd.aA) || czvVar.w(dcd.aB)) {
            czb czbVarA4 = dcjVar.a();
            dgm dgmVar = czbVarA4 != null ? new dgm(dag.j(czbVarA4)) : null;
            return new dhz(dle.A(czvVar), dos.p(dgmVar.a), dos.p(dgmVar.b), dos.p(dgmVar.c), dgmVar.d.a);
        }
        if (czvVar.n(dcd.ci)) {
            byte[] bArr4 = czx.f(dcjVar.a()).b;
            dhc dhcVarW = dle.w(czvVar);
            byte[] bArrT3 = dos.t(bArr4, 0, dhcVarW.a());
            int iA = dhcVarW.a();
            int iA2 = dhcVarW.a();
            byte[] bArrT4 = dos.t(bArr4, iA, iA2 + iA2);
            int iA3 = dhcVarW.a();
            return new dhd(dhcVarW, bArrT3, bArrT4, dos.t(bArr4, iA3 + iA3, bArr4.length));
        }
        if (czvVar.n(dcd.cm)) {
            return new dih(dle.C(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.n(dcd.aI)) {
            return new djr(dle.H(czvVar), czx.f(dcjVar.a()).b);
        }
        if (czvVar.w(dgr.f)) {
            dgv dgvVarA = dgv.a(dcwVar.b);
            czv czvVar2 = dgvVarA.b.a;
            czb czbVarA5 = dcjVar.a();
            dgz dgzVar = czbVarA5 != null ? new dgz(dag.j(czbVarA5)) : null;
            try {
                dmf dmfVar = new dmf(new dme(dgvVarA.a, dle.v(czvVar2)));
                dmfVar.b = dgzVar.b;
                dmfVar.d = l(dos.p(dgzVar.c));
                dmfVar.e = l(dos.p(dgzVar.d));
                dmfVar.f = l(dos.p(dgzVar.e));
                dmfVar.g = l(dos.p(dgzVar.f));
                if (dgzVar.a != 0) {
                    dmfVar.c = dgzVar.g;
                }
                if (dgzVar.a() != null) {
                    dmfVar.h = new dlf((dlf) h(dgzVar.a(), dlf.class), czvVar2);
                }
                return new dmg(dmfVar);
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e.getMessage())));
            }
        }
        if (czvVar.w(dgr.g)) {
            dgw dgwVarA = dgw.a(dcwVar.b);
            czv czvVar3 = dgwVarA.c.a;
            try {
                czb czbVarA6 = dcjVar.a();
                dgx dgxVar = czbVarA6 != null ? new dgx(dag.j(czbVarA6)) : null;
                dlz dlzVar = new dlz(new dly(dgwVarA.a, dgwVarA.b, dle.v(czvVar3)));
                dlzVar.b = dgxVar.b;
                dlzVar.d = l(dos.p(dgxVar.d));
                dlzVar.e = l(dos.p(dgxVar.e));
                dlzVar.f = l(dos.p(dgxVar.f));
                dlzVar.g = l(dos.p(dgxVar.g));
                if (dgxVar.a != 0) {
                    dlzVar.c = dgxVar.c;
                }
                if (dgxVar.a() != null) {
                    dlg dlgVar = (dlg) h(dgxVar.a(), dlg.class);
                    dlg dlgVar2 = new dlg(dlgVar.b);
                    Map map = dlgVar.a;
                    for (Integer num : map.keySet()) {
                        dlgVar2.a.put(num, new dlf((dlf) map.get(num), czvVar3));
                    }
                    if (dlgVar2.b == 0) {
                        dlzVar.h = new dlg(dlgVar2, (1 << dlzVar.a.d) - 1);
                    } else {
                        dlzVar.h = dlgVar2;
                    }
                }
                return new dma(dlzVar);
            } catch (ClassNotFoundException e2) {
                throw new IOException("ClassNotFoundException processing BDS state: ".concat(String.valueOf(e2.getMessage())));
            }
        }
        if (!czvVar.w(dgr.c)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        czb czbVarA7 = dcjVar.a();
        dgp dgpVar = czbVarA7 != null ? new dgp(dag.j(czbVarA7)) : null;
        int i3 = dgpVar.a;
        int i4 = dgpVar.b;
        dnw dnwVarA = dgpVar.a();
        dob dobVar = new dob(dgpVar.a(), dgpVar.c);
        doa doaVar = new doa(dgpVar.d);
        String strB = dle.b(dgpVar.e.a);
        int i5 = dnwVarA.a;
        int i6 = 1 << i5;
        int iC = dobVar.c();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iC, i6);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iC, i6);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr3 = iArr2[i];
            int[] iArr4 = dobVar.c;
            int i8 = i2;
            int i9 = dobVar.b;
            int iB = iArr4[i9];
            int i10 = i9 - 1;
            while (i10 >= 0) {
                iB = dobVar.c[i10] ^ dobVar.a.b(iB, i7);
                i10--;
                i = i;
            }
            iArr3[i7] = dnwVarA.a(iB);
            i7++;
            i2 = i8;
            i = i;
        }
        int i11 = i;
        int i12 = i2;
        for (int i13 = i12; i13 < iC; i13++) {
            for (int i14 = i11; i14 < i6; i14++) {
                iArr2[i13][i14] = dnwVarA.b(iArr2[i13 - 1][i14], i14);
            }
        }
        for (int i15 = i11; i15 < iC; i15++) {
            for (int i16 = i11; i16 < i6; i16++) {
                int i17 = i11;
                while (i17 <= i15) {
                    int[] iArr5 = iArr[i15];
                    iArr5[i16] = iArr5[i16] ^ dnwVarA.b(iArr2[i17][i16], dobVar.b((iC + i17) - i15));
                    i17++;
                    doaVar = doaVar;
                }
            }
        }
        doa doaVar2 = doaVar;
        int[] iArr6 = new int[2];
        iArr6[i12] = (i6 + 31) >>> 5;
        iArr6[i11] = iC * i5;
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr6);
        for (int i18 = i11; i18 < i6; i18++) {
            int i19 = i18 >>> 5;
            int i20 = i12 << (i18 & 31);
            int i21 = i11;
            while (i21 < iC) {
                int i22 = i21 + 1;
                int i23 = iArr[i21][i18];
                for (int i24 = i11; i24 < i5; i24++) {
                    if (((i23 >>> i24) & 1) != 0) {
                        int[] iArr8 = iArr7[((i22 * i5) - i24) - 1];
                        iArr8[i19] = iArr8[i19] ^ i20;
                    }
                }
                i21 = i22;
            }
        }
        new dnz(i6, iArr7);
        return new dns(i3, i4, dnwVarA, dobVar, doaVar2, strB);
    }

    public static int v(short[][] sArr, byte[] bArr, int i) {
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

    public static int w(short[][][] sArr, byte[] bArr, int i, boolean z) {
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

    public static byte[] x(short[][] sArr) {
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

    public static byte[] y(short[][][] sArr, boolean z) {
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

    public static short[][] z(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = dos.u(sArr[i]);
        }
        return sArr2;
    }

    public dnx(byte[] bArr, byte[] bArr2) {
    }

    public dnx(boolean[] zArr) {
    }

    public dnx(int[] iArr) {
        new des(128);
        new des(256);
    }

    public dnx(short[] sArr) {
        new des(128);
        new des(256);
        new deq(256);
        new deq(512);
    }

    public dnx(boolean z) {
        if (z) {
            new dnx((byte[]) null);
        } else {
            new dnx((char[]) null);
        }
    }

    public dnx(byte[] bArr) {
        new deo();
        new der();
        byte[] bArr2 = det.a;
        def.a();
    }

    public dnx(char[] cArr) {
        new des(128);
        new deq(256);
        new deq(512);
    }
}
