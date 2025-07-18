package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.support.v7.widget.ActivityChooserView;
import j$.nio.channels.DesugarChannels;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wcq {
    private static volatile xsq a;
    private static volatile xsq b;

    public wcq() {
    }

    public static final void B(wfo wfoVar) {
        int i = wfoVar.j;
    }

    public static /* synthetic */ String C(int i) {
        return i != 1 ? "SPEC_2025" : "SPEC_2021";
    }

    public static /* synthetic */ wfn D(wfh wfhVar, wfo wfoVar) {
        int i = wfoVar.k;
        return wfoVar.b ? wfhVar.o() : wfhVar.q();
    }

    public static /* synthetic */ wfn E(wfh wfhVar, wfo wfoVar) {
        int i = wfoVar.k;
        return wfoVar.b ? wfhVar.o() : wfhVar.q();
    }

    public static /* synthetic */ Double F(wfo wfoVar) {
        int i = wfoVar.k;
        int i2 = wfoVar.j;
        return i2 == 2 ? Double.valueOf(2.2d) : i2 == 3 ? Double.valueOf(1.7d) : Double.valueOf(1.0d);
    }

    public static /* synthetic */ void G(wfo wfoVar) {
        int i = wfoVar.k;
        double d = wfoVar.c;
    }

    public static /* synthetic */ wnn H(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wnn) vucVarO;
    }

    public static /* synthetic */ wnl I(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wnl) vucVarO;
    }

    public static void J(String str, vtw vtwVar) {
        str.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnl wnlVar = (wnl) vtwVar.b;
        wnl wnlVar2 = wnl.a;
        wnlVar.b = str;
    }

    public static void K(int i, vtw vtwVar) {
        if (i == 0) {
            throw null;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wnl wnlVar = (wnl) vtwVar.b;
        wnl wnlVar2 = wnl.a;
        wnlVar.c = a.aF(i);
    }

    public static /* synthetic */ wni L(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wni) vucVarO;
    }

    public static void M(String str, vtw vtwVar) {
        str.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wni wniVar = (wni) vtwVar.b;
        wni wniVar2 = wni.a;
        wniVar.b = str;
    }

    public static void N(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wni wniVar = (wni) vtwVar.b;
        wni wniVar2 = wni.a;
        wniVar.c = a.aJ(i);
    }

    public static /* synthetic */ String O(int i) {
        switch (i) {
            case 2:
                return "TYPE_UNSPECIFIED";
            case 3:
                return "MOVIE";
            case 4:
                return "SHOW";
            case 5:
                return "SEASON";
            case 6:
                return "EPISODE";
            case 7:
                return "TRAILER";
            default:
                return "UNRECOGNIZED";
        }
    }

    public static yja P(Enum[] enumArr) {
        enumArr.getClass();
        return new yjb(enumArr);
    }

    public static Object Q(yjz yjzVar, Object obj, yih yihVar) {
        yjzVar.getClass();
        yil context = yihVar.getContext();
        Object yirVar = context == yim.a ? new yir(yihVar) : new yis(yihVar, context);
        ylh.d(yjzVar, 2);
        return yjzVar.a(obj, yirVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yih R(yjz yjzVar, Object obj, yih yihVar) {
        yjzVar.getClass();
        if (yjzVar instanceof yit) {
            return ((yit) yjzVar).create(obj, yihVar);
        }
        yil context = yihVar.getContext();
        return context == yim.a ? new yip(yihVar, yjzVar, obj) : new yiq(yihVar, context, yjzVar, obj);
    }

    public static yih S(yih yihVar) {
        yihVar.getClass();
        yiv yivVar = yihVar instanceof yiv ? (yiv) yihVar : null;
        return yivVar != null ? yivVar.intercepted() : yihVar;
    }

    public static Object T(yij yijVar, Object obj, yjz yjzVar) {
        yjzVar.getClass();
        return yjzVar.a(obj, yijVar);
    }

    public static yij U(yij yijVar, yik yikVar) {
        yikVar.getClass();
        if (yks.e(yijVar.getKey(), yikVar)) {
            return yijVar;
        }
        return null;
    }

    public static yil V(yij yijVar, yik yikVar) {
        yikVar.getClass();
        return yks.e(yijVar.getKey(), yikVar) ? yim.a : yijVar;
    }

    public static yil W(yij yijVar, yil yilVar) {
        yilVar.getClass();
        return X(yijVar, yilVar);
    }

    public static yil X(yil yilVar, yil yilVar2) {
        yilVar2.getClass();
        return yilVar2 == yim.a ? yilVar : (yil) yilVar2.fold(yilVar, new dsc(14));
    }

    public static int Y(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int Z(int i) {
        return Integer.highestOneBit(ykn.j(i, 1) * 3);
    }

    public static xsq a() {
        xsq xsqVarA;
        xsq xsqVar = a;
        if (xsqVar != null) {
            return xsqVar;
        }
        synchronized (wcq.class) {
            xsqVarA = a;
            if (xsqVarA == null) {
                xsn xsnVarA = xsq.a();
                xsnVarA.d = xsp.UNARY;
                xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.userdata.UserDataService", "Fetch");
                xsnVarA.b();
                wbj wbjVar = wbj.a;
                vtp vtpVar = yer.a;
                xsnVarA.b = new yep(wbjVar);
                xsnVarA.c = new yep(wby.a);
                xsqVarA = xsnVarA.a();
                a = xsqVarA;
            }
        }
        return xsqVarA;
    }

    public static /* synthetic */ zhe aA(File file) {
        String string = file.toString();
        string.getClass();
        return az(string);
    }

    public static zgn aC(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((zht.a(str.charAt(i2)) << 4) + zht.a(str.charAt(i2 + 1)));
        }
        return new zgn(bArr);
    }

    public static zgn aD(String str) {
        str.getClass();
        zgn zgnVar = new zgn(ay(str));
        zgnVar.d = str;
        return zgnVar;
    }

    public static int aE(zgn zgnVar, int i) {
        return i == -1234567890 ? zgnVar.c() : i;
    }

    public static String aF(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = zht.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.cd(i2, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        throw new IllegalArgumentException(a.cd(i2, "startIndex: ", " > endIndex: 8"));
    }

    public static void aG(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static boolean aH(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static String aI(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int iX;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 >= 0 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            boolean z = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iX = (z ? 46 : zcr.x(bArr2[i8][i9])) - zcr.x(bArr[i5 + i10]);
                if (iX != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 == i7) {
                    break;
                }
                if (bArr2[i8].length != i9) {
                    z = false;
                } else {
                    if (i8 == bArr2.length - 1) {
                        break;
                    }
                    i8++;
                    z = true;
                    i9 = -1;
                }
            }
            iX = 0;
            if (iX >= 0) {
                if (iX <= 0) {
                    int i11 = i7 - i10;
                    int length2 = bArr2[i8].length - i9;
                    int length3 = bArr2.length;
                    for (int i12 = i8 + 1; i12 < length3; i12++) {
                        length2 += bArr2[i12].length;
                    }
                    if (length2 >= i11) {
                        if (length2 <= i11) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i5, i7, charset);
                        }
                    }
                }
                i3 = i2 + 1;
            }
            length = i4;
        }
        return null;
    }

    public static zfq aJ(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new zfq(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public static boolean aK() {
        zfo zfoVar = zfo.b;
        return aM() && Build.VERSION.SDK_INT >= 29;
    }

    public static List aL(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zci) obj) != zci.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zci) it.next()).g);
        }
        return arrayList2;
    }

    public static boolean aM() {
        return yks.e("Dalvik", System.getProperty("java.vm.name"));
    }

    public static int aN(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(a.ce(i, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    private final void aO(long j, zgk zgkVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        long j2;
        List list3;
        int i5;
        int i6 = i;
        int i7 = i2;
        List list4 = list2;
        if (i7 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (((zgn) list.get(i8)).c() < i6) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        zgn zgnVar = (zgn) list.get(i2);
        zgn zgnVar2 = (zgn) list.get(i3 - 1);
        if (i6 == zgnVar.c()) {
            int iIntValue = ((Number) list4.get(i7)).intValue();
            i7++;
            i4 = iIntValue;
            zgnVar = (zgn) list.get(i7);
        } else {
            i4 = -1;
        }
        int i9 = i7 + 1;
        long j3 = 2;
        if (zgnVar.a(i6) == zgnVar2.a(i6)) {
            int iMin = Math.min(zgnVar.c(), zgnVar2.c());
            int i10 = 0;
            int i11 = i6;
            while (true) {
                if (i11 >= iMin) {
                    j2 = j3;
                    break;
                }
                j2 = j3;
                if (zgnVar.a(i11) != zgnVar2.a(i11)) {
                    break;
                }
                i10++;
                i11++;
                j3 = j2;
            }
            long jAP = j + aP(zgkVar) + j2;
            long j4 = i10;
            zgkVar.N(-i10);
            zgkVar.N(i4);
            int i12 = i6 + i10;
            while (i6 < i12) {
                zgkVar.N(zgnVar.a(i6) & 255);
                i6++;
            }
            if (i9 == i3) {
                if (i12 != ((zgn) list.get(i7)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                zgkVar.N(((Number) list4.get(i7)).intValue());
                return;
            } else {
                long j5 = jAP + j4 + 1;
                zgk zgkVar2 = new zgk();
                zgkVar.N(-((int) (aP(zgkVar2) + j5)));
                aO(j5, zgkVar2, i12, list, i7, i3, list4);
                zgkVar.L(zgkVar2);
                return;
            }
        }
        int i13 = 1;
        while (i9 < i3) {
            if (((zgn) list.get(i9 - 1)).a(i6) != ((zgn) list.get(i9)).a(i6)) {
                i13++;
            }
            i9++;
        }
        long jAP2 = j + aP(zgkVar) + 2;
        int i14 = i13 + i13;
        zgkVar.N(i13);
        zgkVar.N(i4);
        for (int i15 = i7; i15 < i3; i15++) {
            byte bA = ((zgn) list.get(i15)).a(i6);
            if (i15 == i7 || bA != ((zgn) list.get(i15 - 1)).a(i6)) {
                zgkVar.N(bA & 255);
            }
        }
        zgk zgkVar3 = new zgk();
        int i16 = i7;
        while (i16 < i3) {
            int i17 = i6 + 1;
            byte bA2 = ((zgn) list.get(i16)).a(i6);
            int i18 = i16 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (bA2 != ((zgn) list.get(i19)).a(i6)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i17 == ((zgn) list.get(i16)).c()) {
                zgkVar.N(((Number) list4.get(i16)).intValue());
                list3 = list4;
                i5 = i19;
            } else {
                long j6 = i14 + jAP2;
                zgkVar.N(-((int) (j6 + aP(zgkVar3))));
                list3 = list4;
                i5 = i19;
                aO(j6, zgkVar3, i17, list, i16, i5, list3);
            }
            i16 = i5;
            list4 = list3;
        }
        zgkVar.L(zgkVar3);
    }

    private static long aP(zgk zgkVar) {
        return zgkVar.b / 4;
    }

    public static int aa(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    public static int ab(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static String ac(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void ad(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static void ae(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            ad(objArr, i);
            i++;
        }
    }

    public static boolean af(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!yks.e(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static Object[] ag(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static Object[] ah(Object[] objArr, int i) {
        objArr.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static Set ai(Set set) {
        ((yia) set).b.e();
        return ((ygu) set).a() > 0 ? set : yia.a;
    }

    public static Set aj(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static Set ak(Set set, Iterable iterable) {
        set.getClass();
        Collection<?> collectionF = yfm.F(iterable);
        if (collectionF.isEmpty()) {
            return yfm.aq(set);
        }
        if (!(collectionF instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionF);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionF).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set al(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(yfm.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String am(Object obj) {
        if (!(obj instanceof zjh)) {
            if (!(obj instanceof zih)) {
                return "unknown object type ".concat(String.valueOf(obj.toString()));
            }
            obj.p();
        }
        StringBuffer stringBuffer = new StringBuffer();
        an("", (zjh) obj, stringBuffer);
        return stringBuffer.toString();
    }

    static void an(String str, zjh zjhVar, StringBuffer stringBuffer) {
        boolean z = zjhVar instanceof ziv;
        String str2 = zxr.a;
        if (z) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(str2);
            return;
        }
        int i = 0;
        if (zjhVar instanceof zjm) {
            stringBuffer.append(str);
            if (zjhVar instanceof zkc) {
                stringBuffer.append("BER Sequence");
            } else if (zjhVar instanceof zkq) {
                stringBuffer.append("DER Sequence");
            } else {
                stringBuffer.append("Sequence");
            }
            stringBuffer.append(str2);
            zjm zjmVar = (zjm) zjhVar;
            int iB = zjmVar.b();
            while (i < iB) {
                an(str.concat("    "), zjmVar.h(i).p(), stringBuffer);
                i++;
            }
            return;
        }
        if (zjhVar instanceof zjo) {
            stringBuffer.append(str);
            if (zjhVar instanceof zkd) {
                stringBuffer.append("BER Set");
            } else if (zjhVar instanceof zkr) {
                stringBuffer.append("DER Set");
            } else {
                stringBuffer.append("Set");
            }
            stringBuffer.append(str2);
            zjo zjoVar = (zjo) zjhVar;
            int iB2 = zjoVar.b();
            while (i < iB2) {
                an(str.concat("    "), zjoVar.f(i).p(), stringBuffer);
                i++;
            }
            return;
        }
        if (zjhVar instanceof zjr) {
            stringBuffer.append(str);
            if (zjhVar instanceof zkf) {
                stringBuffer.append("BER Tagged ");
            } else if (zjhVar instanceof zks) {
                stringBuffer.append("DER Tagged ");
            } else {
                stringBuffer.append("Tagged ");
            }
            zjr zjrVar = (zjr) zjhVar;
            stringBuffer.append(ap(zjrVar));
            if (!zjrVar.n()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str2);
            an(str.concat("    "), zjrVar.b().p(), stringBuffer);
            return;
        }
        if (zjhVar instanceof zjd) {
            zjd zjdVar = (zjd) zjhVar;
            if (zjhVar instanceof zkb) {
                stringBuffer.append(str + "BER Constructed Octet String[" + zjdVar.b.length + "] ");
            } else {
                stringBuffer.append(str + "DER Octet String[" + zjdVar.b.length + "] ");
            }
            stringBuffer.append(str2);
            return;
        }
        if (zjhVar instanceof zjb) {
            stringBuffer.append(str + "ObjectIdentifier(" + ((zjb) zjhVar).b() + ")" + str2);
            return;
        }
        if (zjhVar instanceof zjj) {
            stringBuffer.append(str + "RelativeOID(" + ((zjj) zjhVar).b() + ")" + str2);
            return;
        }
        if (zjhVar instanceof zif) {
            stringBuffer.append(str + "Boolean(" + ((zif) zjhVar).h() + ")" + str2);
            return;
        }
        if (zjhVar instanceof ziu) {
            stringBuffer.append(str + "Integer(" + ((ziu) zjhVar).j().toString() + ")" + str2);
            return;
        }
        if (zjhVar instanceof zic) {
            zic zicVar = (zic) zjhVar;
            byte[] bArrM = zicVar.m();
            int iF = zicVar.f();
            if (zicVar instanceof zkj) {
                stringBuffer.append(str + "DER Bit String[" + bArrM.length + ", " + iF + "] ");
            } else if (zicVar instanceof zkt) {
                stringBuffer.append(str + "DL Bit String[" + bArrM.length + ", " + iF + "] ");
            } else {
                stringBuffer.append(str + "BER Bit String[" + bArrM.length + ", " + iF + "] ");
            }
            stringBuffer.append(str2);
            return;
        }
        if (zjhVar instanceof zir) {
            stringBuffer.append(str + "IA5String(" + ((zir) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zju) {
            stringBuffer.append(str + "UTF8String(" + ((zju) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof ziw) {
            stringBuffer.append(str + "NumericString(" + ((ziw) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zji) {
            stringBuffer.append(str + "PrintableString(" + ((zji) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zjx) {
            stringBuffer.append(str + "VisibleString(" + ((zjx) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zia) {
            stringBuffer.append(str + "BMPString(" + ((zia) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zjq) {
            stringBuffer.append(str + "T61String(" + ((zjq) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zip) {
            stringBuffer.append(str + "GraphicString(" + ((zip) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zjw) {
            stringBuffer.append(str + "VideotexString(" + ((zjw) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zjt) {
            stringBuffer.append(str + "UTCTime(" + ((zjt) zjhVar).f() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zio) {
            stringBuffer.append(str + "GeneralizedTime(" + ((zio) zjhVar).b() + ") " + str2);
            return;
        }
        if (zjhVar instanceof zik) {
            stringBuffer.append(str + "DER Enumerated(" + ((zik) zjhVar).b().toString() + ")" + str2);
            return;
        }
        if (zjhVar instanceof ziy) {
            stringBuffer.append(str + "ObjectDescriptor(" + ((ziy) zjhVar).a.b() + ") " + str2);
            return;
        }
        if (!(zjhVar instanceof zim)) {
            stringBuffer.append(str + zjhVar.toString() + str2);
            return;
        }
        zim zimVar = (zim) zjhVar;
        stringBuffer.append(a.cq(str2, str, "External "));
        zjb zjbVar = zimVar.a;
        String strConcat = str.concat("    ");
        if (zjbVar != null) {
            stringBuffer.append(strConcat + "Direct Reference: " + zjbVar.b() + str2);
        }
        ziu ziuVar = zimVar.b;
        if (ziuVar != null) {
            stringBuffer.append(strConcat + "Indirect Reference: " + ziuVar.toString() + str2);
        }
        zjh zjhVar2 = zimVar.c;
        if (zjhVar2 != null) {
            an(strConcat, zjhVar2, stringBuffer);
        }
        stringBuffer.append(strConcat + "Encoding: " + zimVar.d + str2);
        an(strConcat, zimVar.e, stringBuffer);
    }

    public static int ao(InputStream inputStream) {
        if (inputStream instanceof zlh) {
            return ((zlh) inputStream).d;
        }
        if (inputStream instanceof zis) {
            return ((zis) inputStream).a;
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
        return jMaxMemory > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) jMaxMemory;
    }

    public static String ap(zjr zjrVar) {
        return aq(zjrVar.b, zjrVar.c);
    }

    public static String aq(int i, int i2) {
        return i != 64 ? i != 128 ? i != 192 ? a.cd(i2, "[UNIVERSAL ", "]") : a.cd(i2, "[PRIVATE ", "]") : a.cd(i2, "[CONTEXT ", "]") : a.cd(i2, "[APPLICATION ", "]");
    }

    public static void ar(zjr zjrVar) {
        int i = zjrVar.b;
        if (i != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i != 64 ? i != 128 ? i != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
    }

    public static long as(long j) {
        return (j / 10000) - 11644473600000L;
    }

    public static String at(int i) {
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static void au(zgm zgmVar, int i, yjz yjzVar) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            char cY = (char) zgmVar.y();
            long j2 = j - 4;
            long jY = zgmVar.y() & 65535;
            if (j2 < jY) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            zgmVar.A(jY);
            zgk zgkVar = ((zhi) zgmVar).b;
            long j3 = zgkVar.b;
            yjzVar.a(Integer.valueOf(cY), Long.valueOf(jY));
            long j4 = (zgkVar.b + jY) - j3;
            if (j4 < 0) {
                throw new IOException(a.cf(cY, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                zgkVar.B(j4);
            }
            j = j2 - jY;
        }
    }

    public static boolean av(zhe zheVar) {
        int iA = zhu.a(zheVar);
        return !ylh.x((iA != -1 ? zgn.s(zheVar.b, iA + 1, 0, 2) : (zheVar.c() == null || zheVar.b.c() != 2) ? zheVar.b : zgn.a).h(), ".class", true);
    }

    public static int aw(zhl zhlVar, int i) {
        int i2;
        int length = zhlVar.e.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = zhlVar.f[i2];
                if (i5 >= i4) {
                    if (i5 <= i4) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i3 = i2 + 1;
                }
            } else {
                i2 = (-i3) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static String ax(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, ynd.a);
    }

    public static byte[] ay(String str) {
        byte[] bytes = str.getBytes(ynd.a);
        bytes.getClass();
        return bytes;
    }

    public static zhe az(String str) {
        str.getClass();
        zgn zgnVar = zhu.a;
        zgk zgkVar = new zgk();
        zgkVar.V(str);
        return zhu.f(zgkVar, false);
    }

    public static xsq b() {
        xsq xsqVarA;
        xsq xsqVar = b;
        if (xsqVar != null) {
            return xsqVar;
        }
        synchronized (wcq.class) {
            xsqVarA = b;
            if (xsqVarA == null) {
                xsn xsnVarA = xsq.a();
                xsnVarA.d = xsp.UNARY;
                xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.userdata.UserDataService", "Update");
                xsnVarA.b();
                wcl wclVar = wcl.a;
                vtp vtpVar = yer.a;
                xsnVarA.b = new yep(wclVar);
                xsnVarA.c = new yep(wcm.a);
                xsqVarA = xsnVarA.a();
                b = xsqVarA;
            }
        }
        return xsqVarA;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
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
            default:
                return 0;
            case 13:
                return 15;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 3;
        }
    }

    public static boolean u(wfo wfoVar) {
        return wfoVar.j == 1;
    }

    public wfv A(wfs wfsVar) {
        return wfv.b(vyf.g(wfsVar.a + 60.0d), 24.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zhc aB(defpackage.zgn... r11) {
        /*
            r10 = this;
            java.util.List r5 = defpackage.yfm.aY(r11)
            defpackage.yfm.B(r5)
            int r0 = r5.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r9 = 0
            r1 = r9
        L12:
            if (r1 >= r0) goto L1f
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.add(r2)
            int r1 = r1 + 1
            goto L12
        L1f:
            int r0 = r11.length
            r1 = r9
            r2 = r1
        L22:
            if (r1 >= r0) goto L37
            r3 = r11[r1]
            int r4 = r2 + 1
            int r3 = defpackage.yfm.x(r5, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.set(r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L22
        L37:
            java.lang.Object r0 = r5.get(r9)
            zgn r0 = (defpackage.zgn) r0
            int r0 = r0.c()
            if (r0 <= 0) goto Ldd
            r0 = r9
        L44:
            int r1 = r5.size()
            if (r0 >= r1) goto Laa
            java.lang.Object r1 = r5.get(r0)
            zgn r1 = (defpackage.zgn) r1
            int r2 = r0 + 1
            r3 = r2
        L53:
            int r4 = r5.size()
            if (r3 >= r4) goto La8
            java.lang.Object r4 = r5.get(r3)
            zgn r4 = (defpackage.zgn) r4
            boolean r6 = r4.m(r1)
            if (r6 == 0) goto La8
            int r6 = r4.c()
            int r7 = r1.c()
            if (r6 == r7) goto L95
            java.lang.Object r4 = r8.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r8.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r4 <= r6) goto L92
            r5.remove(r3)
            java.lang.Object r4 = r8.remove(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            goto L53
        L92:
            int r3 = r3 + 1
            goto L53
        L95:
            java.util.Objects.toString(r4)
            java.lang.String r11 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "duplicate option: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        La8:
            r0 = r2
            goto L44
        Laa:
            zgk r3 = new zgk
            r3.<init>()
            r6 = 0
            int r7 = r5.size()
            r1 = 0
            r4 = 0
            r0 = r10
            r0.aO(r1, r3, r4, r5, r6, r7, r8)
            long r0 = aP(r3)
            int r0 = (int) r0
            int[] r1 = new int[r0]
        Lc2:
            if (r9 >= r0) goto Lcd
            int r2 = r3.f()
            r1[r9] = r2
            int r9 = r9 + 1
            goto Lc2
        Lcd:
            int r0 = r11.length
            zhc r2 = new zhc
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            r11.getClass()
            zgn[] r11 = (defpackage.zgn[]) r11
            r2.<init>(r11, r1)
            return r2
        Ldd:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcq.aB(zgn[]):zhc");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.function.Function] */
    public double d(wfo wfoVar, wfn wfnVar) {
        ?? r6;
        double dMin;
        ?? r3;
        ?? r4;
        double d = wfoVar.c;
        ?? r2 = wfnVar.i;
        wfq wfqVar = r2 == 0 ? null : (wfq) r2.apply(wfoVar);
        double dMax = 49.0d;
        if (wfqVar == null) {
            double dDoubleValue = ((Double) wfnVar.d.apply(wfoVar)).doubleValue();
            ?? r22 = wfnVar.f;
            if (r22 == 0 || r22.apply(wfoVar) == null || (r6 = wfnVar.h) == 0 || r6.apply(wfoVar) == null) {
                return dDoubleValue;
            }
            double dB = ((wfn) r22.apply(wfoVar)).b(wfoVar);
            double dA = ((wfj) r6.apply(wfoVar)).a();
            if (wbb.m(dB, dDoubleValue) < dA) {
                dDoubleValue = wfn.a(dB, dA);
            }
            if (!wfnVar.a || dDoubleValue < 50.0d || dDoubleValue >= 60.0d) {
                dMax = dDoubleValue;
            } else if (wbb.m(49.0d, dB) < dA) {
                dMax = 60.0d;
            }
            ?? r1 = wfnVar.g;
            if (r1 != 0 && r1.apply(wfoVar) != null) {
                double dB2 = ((wfn) r22.apply(wfoVar)).b(wfoVar);
                double dB3 = ((wfn) r1.apply(wfoVar)).b(wfoVar);
                double dMax2 = Math.max(dB2, dB3);
                double dMin2 = Math.min(dB2, dB3);
                if (wbb.m(dMax2, dMax) < dA || wbb.m(dMin2, dMax) < dA) {
                    double dL = wbb.l(dMax2, dA);
                    double dK = wbb.k(dMin2, dA);
                    ArrayList arrayList = new ArrayList();
                    if (dL != -1.0d) {
                        arrayList.add(Double.valueOf(dL));
                    }
                    if (dK != -1.0d) {
                        arrayList.add(Double.valueOf(dK));
                    }
                    if (wfn.g(dB2) || wfn.g(dB3)) {
                        if (dL == -1.0d) {
                            return 100.0d;
                        }
                        return dL;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (dK == -1.0d) {
                        return 0.0d;
                    }
                    return dK;
                }
            }
            return dMax;
        }
        int i = wfqVar.e;
        Object obj = wfnVar.b;
        wfn wfnVar2 = wfqVar.a;
        wfn wfnVar3 = wfqVar.b;
        wfn wfnVar4 = i != 5 ? wfnVar3 : wfnVar2;
        boolean zEquals = ((String) obj).equals(wfnVar4.b);
        double d2 = true == wfoVar.b ? 1.0d : -1.0d;
        double dDoubleValue2 = ((Double) wfnVar4.d.apply(wfoVar)).doubleValue();
        if (i == 5) {
            wfnVar2 = wfnVar3;
        }
        double dDoubleValue3 = ((Double) wfnVar2.d.apply(wfoVar)).doubleValue();
        ?? r12 = wfnVar.f;
        if (r12 != 0 && (r3 = wfnVar4.h) != 0 && (r4 = wfnVar2.h) != 0) {
            wfn wfnVar5 = (wfn) r12.apply(wfoVar);
            wfj wfjVar = (wfj) r3.apply(wfoVar);
            wfj wfjVar2 = (wfj) r4.apply(wfoVar);
            if (wfnVar5 != null && wfjVar != null && wfjVar2 != null) {
                double dA2 = wfjVar.a();
                double dA3 = wfjVar2.a();
                double dB4 = wfnVar5.b(wfoVar);
                if (wbb.m(dB4, dDoubleValue2) < dA2) {
                    dDoubleValue2 = wfn.a(dB4, dA2);
                }
                if (wbb.m(dB4, dDoubleValue3) < dA3) {
                    dDoubleValue3 = wfn.a(dB4, dA3);
                }
            }
        }
        double d3 = wfqVar.c;
        if ((dDoubleValue3 - dDoubleValue2) * d2 < d3) {
            double d4 = d3 * d2;
            dDoubleValue3 = vyf.e(0.0d, 100.0d, dDoubleValue2 + d4);
            if ((dDoubleValue3 - dDoubleValue2) * d2 < d3) {
                dDoubleValue2 = vyf.e(0.0d, 100.0d, dDoubleValue3 - d4);
            }
        }
        if (dDoubleValue2 >= 50.0d && dDoubleValue2 < 60.0d) {
            double d5 = d3 * d2;
            if (d2 > 0.0d) {
                dMax = Math.max(dDoubleValue3, d5 + 60.0d);
                dDoubleValue2 = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, d5 + 49.0d);
                dDoubleValue2 = 49.0d;
                dMax = dMin;
            }
        } else if (dDoubleValue3 < 50.0d || dDoubleValue3 >= 60.0d) {
            dMax = dDoubleValue3;
        } else if (wfqVar.d) {
            double d6 = d3 * d2;
            if (d2 > 0.0d) {
                dMax = Math.max(dDoubleValue3, d6 + 60.0d);
                dDoubleValue2 = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, d6 + 49.0d);
                dDoubleValue2 = 49.0d;
                dMax = dMin;
            }
        } else if (d2 > 0.0d) {
            dMax = 60.0d;
        }
        return zEquals ? dDoubleValue2 : dMax;
    }

    public wfn e() {
        throw null;
    }

    public wfn f() {
        wfm wfmVar = new wfm();
        wfmVar.a = "error";
        wfmVar.b = new wew(5);
        wfmVar.c = new wew(6);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wew(7);
        wfmVar.i = new ssj(this, 4);
        return wfmVar.a();
    }

    public wfn g() {
        wfm wfmVar = new wfm();
        wfmVar.a = "error_container";
        wfmVar.b = new wfa(17);
        wfmVar.c = new wfa(18);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wfa(19);
        wfmVar.i = new ssj(this, 2);
        return wfmVar.a();
    }

    public wfn h() {
        throw null;
    }

    public wfn i() {
        throw null;
    }

    public wfn j() {
        wfm wfmVar = new wfm();
        wfmVar.a = "primary";
        wfmVar.b = new wex(15);
        wfmVar.c = new wex(16);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wex(17);
        wfmVar.i = new ssj(this, 10);
        return wfmVar.a();
    }

    public wfn k() {
        wfm wfmVar = new wfm();
        wfmVar.a = "primary_container";
        wfmVar.b = new wew(15);
        wfmVar.c = new wew(16);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wew(17);
        wfmVar.i = new ssj(this, 7);
        return wfmVar.a();
    }

    public wfn l() {
        wfm wfmVar = new wfm();
        wfmVar.a = "secondary";
        wfmVar.b = new wfa(6);
        wfmVar.c = new wfa(7);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wfa(8);
        wfmVar.i = new ssj(this, 20);
        return wfmVar.a();
    }

    public wfn m() {
        wfm wfmVar = new wfm();
        wfmVar.a = "secondary_container";
        wfmVar.b = new wew(9);
        wfmVar.c = new wew(10);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wew(11);
        wfmVar.i = new ssj(this, 5);
        return wfmVar.a();
    }

    public wfn n() {
        throw null;
    }

    public wfn o() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_bright";
        wfmVar.b = new wex(3);
        wfmVar.c = new wex(4);
        wfmVar.d = true;
        return wfmVar.a();
    }

    public wfn p() {
        throw null;
    }

    public wfn q() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_dim";
        wfmVar.b = new wez(1);
        wfmVar.c = new wez(0);
        wfmVar.d = true;
        return wfmVar.a();
    }

    public wfn r() {
        wfm wfmVar = new wfm();
        wfmVar.a = "tertiary";
        int i = 19;
        wfmVar.b = new wez(i);
        wfmVar.c = new wez(20);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wfa(1);
        wfmVar.i = new ssj(this, i);
        return wfmVar.a();
    }

    public wfn s() {
        wfm wfmVar = new wfm();
        wfmVar.a = "tertiary_container";
        wfmVar.b = new wfa(10);
        wfmVar.c = new wfa(20);
        wfmVar.d = true;
        wfmVar.f = new ssj(this, 3);
        wfmVar.h = new wew(8);
        wfmVar.i = new ssj(this, 6);
        return wfmVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.function.Function] */
    public wfs t(wfo wfoVar, wfn wfnVar) {
        ?? r0 = wfnVar.c;
        double d = d(wfoVar, wfnVar);
        wfv wfvVar = (wfv) r0.apply(wfoVar);
        return wfs.a(wfvVar.b, wfvVar.c, d);
    }

    public Optional v(wfs wfsVar) {
        return Optional.empty();
    }

    public wfv w(wfs wfsVar) {
        return wfv.b(wfsVar.a, 6.0d);
    }

    public wfv x(wfs wfsVar) {
        return wfv.b(wfsVar.a, 8.0d);
    }

    public wfv y(wfs wfsVar, boolean z) {
        return wfv.b(wfsVar.a, 36.0d);
    }

    public wfv z(wfs wfsVar) {
        return wfv.b(wfsVar.a, 16.0d);
    }

    public wcq(byte[] bArr) {
    }
}
