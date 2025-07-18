package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylh {
    public static boolean A(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : z(str, 0, str2, 0, str2.length(), true);
    }

    public static boolean B(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : z(str, i, str2, 0, str2.length(), true);
    }

    public static int C(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int D(CharSequence charSequence, String str, int i, boolean z) {
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        ymd ymdVar = new ymd(ykn.j(i, 0), ykn.k(charSequence.length(), charSequence.length()));
        if (charSequence instanceof String) {
            int i2 = ymdVar.a;
            int i3 = ymdVar.b;
            int i4 = ymdVar.c;
            if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
                return -1;
            }
            int i5 = i2;
            while (!z(str, 0, (String) charSequence, i5, str.length(), z)) {
                if (i5 == i3) {
                    return -1;
                }
                i5 += i4;
            }
            return i5;
        }
        int i6 = ymdVar.a;
        int i7 = ymdVar.b;
        int i8 = ymdVar.c;
        if ((i8 <= 0 || i6 > i7) && (i8 >= 0 || i7 > i6)) {
            return -1;
        }
        int i9 = i6;
        while (!M(str, 0, charSequence, i9, str.length(), z)) {
            if (i9 == i7) {
                return -1;
            }
            i9 += i8;
        }
        return i9;
    }

    public static CharSequence E(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zB = ykr.b(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String F(String str, CharSequence charSequence) {
        if (!ac(str, (String) charSequence)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String G(String str, String str2, String str3) {
        int iU = U(str, str2, 0, false, 6);
        if (iU == -1) {
            return str3;
        }
        String strSubstring = str.substring(iU + str2.length(), str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String H(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iV = V(str, c, 0, 6);
        if (iV == -1) {
            return str2;
        }
        String strSubstring = str.substring(iV + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String I(String str, char c, String str2) {
        int iV = V(str, c, 0, 6);
        if (iV == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iV);
        strSubstring.getClass();
        return strSubstring;
    }

    public static List J(CharSequence charSequence) {
        return ykr.i(new cxb(charSequence, 5));
    }

    public static boolean K(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence2.getClass();
        return U(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    public static boolean L(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ykr.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean M(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ykr.c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c) {
        charSequence.getClass();
        return T(charSequence, c, 0, 2) >= 0;
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && ykr.c(charSequence.charAt(C(charSequence)), c, false);
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence instanceof String ? R((String) charSequence, (String) charSequence2) : M(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static /* synthetic */ boolean R(String str, String str2) {
        return x(str, str2, false);
    }

    public static /* synthetic */ int T(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        boolean z = charSequence instanceof String;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (z) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        int iJ = ykn.j(i, 0);
        int iC = C(charSequence);
        if (iJ > iC) {
            return -1;
        }
        while (!ykr.c(cArr[0], charSequence.charAt(iJ), false)) {
            if (iJ == iC) {
                return -1;
            }
            iJ++;
        }
        return iJ;
    }

    public static /* synthetic */ int U(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return D(charSequence, str, i, z & ((i2 & 4) == 0));
    }

    public static /* synthetic */ int V(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = C(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        for (int iK = ykn.k(i, C(charSequence)); iK >= 0; iK--) {
            if (ykr.c(cArr[0], charSequence.charAt(iK), false)) {
                return iK;
            }
        }
        return -1;
    }

    public static String W(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ String X(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static /* synthetic */ String Y(String str, String str2, String str3) {
        str.getClass();
        int iD = D(str, str2, 0, false);
        if (iD < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, iD);
            sb.append(str3);
            i = iD + length;
            if (iD >= str.length()) {
                break;
            }
            iD = D(str, str2, iD + ykn.j(length, 1), false);
        } while (iD > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static void a(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(a.cq(str, obj == null ? "null" : obj.getClass().getName(), " cannot be cast to "));
        yks.f(classCastException, ylh.class.getName());
        throw classCastException;
    }

    public static /* synthetic */ List aa(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int i = 0;
        String str = strArr[0];
        if (str.length() != 0) {
            return an(charSequence, str);
        }
        ymz<ymd> ymzVar = new ymz(new ynb(charSequence, new ynl(yfm.aC(strArr), i), 3), 0);
        ArrayList arrayList = new ArrayList(yfm.z(ymzVar, 10));
        for (ymd ymdVar : ymzVar) {
            ymdVar.getClass();
            arrayList.add(charSequence.subSequence(ymdVar.f().intValue(), ymdVar.e().intValue() + 1).toString());
        }
        return arrayList;
    }

    public static /* synthetic */ boolean ab(String str, String str2, int i) {
        return B(str, str2, i, false);
    }

    public static /* synthetic */ boolean ac(String str, String str2) {
        return A(str, str2, false);
    }

    public static char ad(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(C(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String ae(String str, int i) {
        str.getClass();
        String strSubstring = str.substring(0, ykn.k(i, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public static /* synthetic */ int af(CharSequence charSequence, String str) {
        int iC = C(charSequence);
        charSequence.getClass();
        return ((String) charSequence).lastIndexOf(str, iC);
    }

    public static String ag(String str, String str2) {
        int iU = U(str, "_", 0, false, 6);
        if (iU == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iU);
        strSubstring.getClass();
        return strSubstring;
    }

    public static final yot ai(Executor executor) {
        ypj ypjVar = executor instanceof ypj ? (ypj) executor : null;
        return ypjVar != null ? ypjVar.a : new ypx(executor);
    }

    public static final CancellationException aj(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void ak(ypi ypiVar, yih yihVar, boolean z) {
        Object objL = ypiVar.l();
        Throwable thO = ypiVar.o(objL);
        Object objE = thO != null ? ybn.e(thO) : ypiVar.k(objL);
        if (!z) {
            yihVar.resumeWith(objE);
            return;
        }
        ywu ywuVar = (ywu) yihVar;
        yih yihVar2 = ywuVar.b;
        Object obj = ywuVar.d;
        yil context = yihVar2.getContext();
        Object objB = yxr.b(context, obj);
        yrg yrgVarC = objB != yxr.a ? yos.c(yihVar2, context, objB) : null;
        try {
            yihVar2.resumeWith(objE);
            if (yrgVarC == null || yrgVarC.T()) {
                yxr.c(context, objB);
            }
        } catch (Throwable th) {
            if (yrgVarC == null || yrgVarC.T()) {
                yxr.c(context, objB);
            }
            throw th;
        }
    }

    public static final boolean al(int i) {
        return i == 1 || i == 2;
    }

    private static yjv am() {
        return "".length() == 0 ? new qyx(11) : new ynk(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List an(CharSequence charSequence, String str) {
        int iD = D(charSequence, str, 0, false);
        if (iD == -1) {
            return yfm.p(charSequence);
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iD).toString());
            length = str.length() + iD;
            iD = D(charSequence, str, length, false);
        } while (iD != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean b(Object obj, int i) {
        if (obj instanceof yfq) {
            if ((obj instanceof ykp ? ((ykp) obj).ca() : obj instanceof yjk ? 0 : obj instanceof yjv ? 1 : obj instanceof yjz ? 2 : obj instanceof yka ? 3 : obj instanceof ykb ? 4 : obj instanceof ykc ? 5 : obj instanceof ykd ? 6 : obj instanceof yke ? 7 : obj instanceof ykf ? 8 : obj instanceof ykg ? 9 : obj instanceof yjl ? 10 : obj instanceof yjm ? 11 : obj instanceof yjn ? 12 : obj instanceof yjo ? 13 : obj instanceof yjp ? 14 : obj instanceof yjq ? 15 : obj instanceof yjr ? 16 : obj instanceof yjs ? 17 : obj instanceof yjt ? 18 : obj instanceof yju ? 19 : obj instanceof yjw ? 20 : obj instanceof yjx ? 21 : obj instanceof yjy ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof yli) || (obj instanceof ylm);
        }
        return false;
    }

    public static void d(Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return;
        }
        a(obj, a.cf(i, "kotlin.jvm.functions.Function"));
    }

    public static void e(Object obj) {
        if (!(obj instanceof yli) || (obj instanceof ylj)) {
            return;
        }
        a(obj, "kotlin.collections.MutableCollection");
    }

    public static void f(Object obj) {
        if (!(obj instanceof yli) || (obj instanceof ylk)) {
            return;
        }
        a(obj, "kotlin.collections.MutableList");
    }

    public static void g(Object obj) {
        if (!(obj instanceof yli) || (obj instanceof yll)) {
            return;
        }
        a(obj, "kotlin.collections.MutableMap");
    }

    public static final Object h(Optional optional, Object obj) {
        return optional.isPresent() ? optional.get() : obj;
    }

    public static final long i(long j) {
        long j2 = ynm.a;
        int i = ynn.a;
        return j + j + 1;
    }

    public static final long j(long j) {
        if (j < -4611686018426L || j >= 4611686018427L) {
            return i(ykn.p(j, -4611686018427387903L, 4611686018427387903L));
        }
        long j2 = ynm.a;
        int i = ynn.a;
        long jL = l(j);
        return jL + jL;
    }

    public static final long k(long j) {
        if (j < -4611686018426999999L || j >= 4611686018427000000L) {
            return i(m(j));
        }
        long j2 = ynm.a;
        int i = ynn.a;
        return j + j;
    }

    public static final long l(long j) {
        return j * 1000000;
    }

    public static final long m(long j) {
        return j / 1000000;
    }

    public static final long n(double d, yno ynoVar) {
        ynoVar.getClass();
        double dZ = ykn.z(d, ynoVar, yno.a);
        if (Double.isNaN(dZ)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jW = yln.w(dZ);
        if (jW < -4611686018426999999L || jW >= 4611686018427000000L) {
            return j(yln.w(ykn.z(d, ynoVar, yno.c)));
        }
        long j = ynm.a;
        int i = ynn.a;
        return jW + jW;
    }

    public static final long o(int i, yno ynoVar) {
        ynoVar.getClass();
        long j = i;
        if (ynoVar.compareTo(yno.d) > 0) {
            return p(j, ynoVar);
        }
        long jB = ykn.B(j, ynoVar, yno.a);
        long j2 = ynm.a;
        int i2 = ynn.a;
        return jB + jB;
    }

    public static final long p(long j, yno ynoVar) {
        ynoVar.getClass();
        yno ynoVar2 = yno.a;
        long jB = ykn.B(4611686018426999999L, ynoVar2, ynoVar);
        if ((-jB) > j || j > jB) {
            return i(ykn.p(ykn.A(j, ynoVar, yno.c), -4611686018427387903L, 4611686018427387903L));
        }
        long jB2 = ykn.B(j, ynoVar, ynoVar2);
        long j2 = ynm.a;
        int i = ynn.a;
        return jB2 + jB2;
    }

    public static String q(String str, String str2) {
        return ykr.j(new ynb((ymw) new cxb(str, 5), (yjv) new ynk(str2, 0), 2), "\n");
    }

    public static String r(String str) throws IOException {
        int length;
        Comparable comparable;
        List listJ = J(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!L((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!ykr.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listJ.size();
        yjv yjvVarAm = am();
        int iQ = yfm.q(listJ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listJ) {
            int i = length + 1;
            if (length < 0) {
                yfm.w();
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iQ) && L(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(a.cd(iIntValue, "Requested character count ", " is less than zero."));
                }
                String strSubstring = str3.substring(ykn.k(iIntValue, str3.length()));
                strSubstring.getClass();
                String str4 = (String) yjvVarAm.a(strSubstring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        yfm.aw(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static /* synthetic */ String t(String str) throws IOException {
        String str2;
        if (L("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listJ = J(str);
        listJ.size();
        yjv yjvVarAm = am();
        int iQ = yfm.q(listJ);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listJ) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iQ) && L(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!ykr.b(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && ab(str3, "|", i3)) {
                    str3.getClass();
                    strSubstring = str3.substring(i3 + 1);
                    strSubstring.getClass();
                }
                if (strSubstring != null && (str2 = (String) yjvVarAm.a(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        yfm.aw(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static Integer u(String str) {
        boolean z;
        int i;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = -2147483647;
        if (yks.a(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i3 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i4 = -59652323;
        while (i < length) {
            int iD = ykr.d(str.charAt(i));
            if (iD < 0) {
                return null;
            }
            if (i2 < i4) {
                if (i4 == -59652323) {
                    i4 = -214748364;
                    if (i2 < -214748364) {
                    }
                }
                return null;
            }
            int i5 = i2 * 10;
            if (i5 < i3 + iD) {
                return null;
            }
            i2 = i5 - iD;
            i++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }

    public static Long v(String str) {
        int i;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (yks.a(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                z = true;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iD = ykr.d(str.charAt(i));
            if (iD < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 == -256204778801521550L) {
                    j3 = -922337203685477580L;
                    if (j2 < -922337203685477580L) {
                    }
                }
                return null;
            }
            long j4 = j2 * 10;
            long j5 = iD;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static boolean w(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return yks.e(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean x(String str, String str2, boolean z) {
        if (!z) {
            return str.endsWith(str2);
        }
        return z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean y(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean z(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(true, i, str2, i2, i3);
    }
}
