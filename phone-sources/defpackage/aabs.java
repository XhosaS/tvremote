package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aabs implements Serializable {
    private static aagc a = null;
    public static final aabs b = new aagb("UTC", "UTC", 0, 0);
    public static Set c = null;
    public static volatile aabs d = null;
    public static aaga f = null;
    private static aaej g = null;
    private static Map h = null;
    private static Map i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String e;

    static {
        aagc aagfVar;
        String property;
        aaga aagaVar = null;
        try {
            property = System.getProperty("org.joda.time.DateTimeZone.Provider");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            try {
                aagfVar = (aagc) Class.forName(property).newInstance();
            } catch (Exception e) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getThreadGroup().uncaughtException(threadCurrentThread, e);
            }
        } else {
            aagfVar = null;
        }
        if (aagfVar == null) {
            try {
                aagfVar = new aagf(null);
            } catch (Exception e2) {
                Thread threadCurrentThread2 = Thread.currentThread();
                threadCurrentThread2.getThreadGroup().uncaughtException(threadCurrentThread2, e2);
            }
        }
        if (aagfVar == null) {
            aagfVar = new aagd();
        }
        Set setA = aagfVar.a();
        if (setA == null || setA.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!setA.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!b.equals(aagfVar.b("UTC"))) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
        a = aagfVar;
        c = setA;
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property2 != null) {
                try {
                    aagaVar = (aaga) Class.forName(property2).newInstance();
                } catch (Exception e3) {
                    Thread threadCurrentThread3 = Thread.currentThread();
                    threadCurrentThread3.getThreadGroup().uncaughtException(threadCurrentThread3, e3);
                }
            }
        } catch (SecurityException unused2) {
        }
        if (aagaVar == null) {
            aagaVar = new aaga();
        }
        f = aagaVar;
    }

    protected aabs(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.e = str;
    }

    private static int c(String str) {
        String str2;
        aabq aabqVar = new aabq();
        aaej aaejVarR = r();
        if (aaejVarR.c != aabqVar) {
            aaejVarR = new aaej(aaejVarR.a, aaejVarR.b, aabqVar, aaejVarR.d);
        }
        aaff aaffVar = aaejVarR.b;
        if (aaffVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        aafb aafbVar = new aafb(aaejVarR.b(aaejVarR.c));
        int iC = aaffVar.c(aafbVar, str, 0);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= str.length()) {
            return -((int) aafbVar.g(str));
        }
        String string = str.toString();
        int i2 = aafd.a;
        String strConcat = string.length() <= iC + 35 ? string : string.substring(0, iC + 32).concat("...");
        if (iC <= 0) {
            str2 = "Invalid format: \"" + strConcat + "\"";
        } else if (iC >= string.length()) {
            str2 = "Invalid format: \"" + strConcat + "\" is too short";
        } else {
            str2 = "Invalid format: \"" + strConcat + "\" is malformed at \"" + strConcat.substring(iC) + "\"";
        }
        throw new IllegalArgumentException(str2);
    }

    private static synchronized String f(String str) {
        Map map;
        map = i;
        if (map == null) {
            map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            i = map;
        }
        return (String) map.get(str);
    }

    public static String k(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        aafd.c(stringBuffer, i3, 2);
        stringBuffer.append(':');
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        aafd.c(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 != 0) {
            int i7 = i6 / 1000;
            stringBuffer.append(':');
            aafd.c(stringBuffer, i7, 2);
            int i8 = i6 - (i7 * 1000);
            if (i8 != 0) {
                stringBuffer.append('.');
                aafd.c(stringBuffer, i8, 3);
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static aabs l(String str) {
        if (str == null) {
            return n();
        }
        if (!str.equals("UTC")) {
            aabs aabsVarB = a.b(str);
            if (aabsVarB != null) {
                return aabsVarB;
            }
            if (!str.startsWith("+") && !str.startsWith("-")) {
                throw new IllegalArgumentException(a.cg(str, "The datetime zone id '", "' is not recognised"));
            }
            int iC = c(str);
            if (iC != 0) {
                return q(k(iC), iC);
            }
        }
        return b;
    }

    public static aabs m(TimeZone timeZone) {
        if (timeZone == null) {
            return n();
        }
        String id = timeZone.getID();
        if (!id.equals("UTC")) {
            String strF = f(id);
            aabs aabsVarB = strF != null ? a.b(strF) : null;
            if (aabsVarB == null) {
                aabsVarB = a.b(id);
            }
            if (aabsVarB != null) {
                return aabsVarB;
            }
            if (strF == null) {
                String id2 = timeZone.getID();
                if (id2.startsWith("GMT+") || id2.startsWith("GMT-")) {
                    int iC = c(id2.substring(3));
                    if (iC != 0) {
                        return q(k(iC), iC);
                    }
                }
            }
            throw new IllegalArgumentException(a.cg(id, "The datetime zone id '", "' is not recognised"));
        }
        return b;
    }

    public static aabs n() {
        aabs aabsVarM;
        aabs aabsVar = d;
        if (aabsVar != null) {
            return aabsVar;
        }
        synchronized (aabs.class) {
            aabsVarM = d;
            if (aabsVarM == null) {
                aabsVarM = null;
                try {
                    try {
                        String property = System.getProperty("user.timezone");
                        if (property != null) {
                            aabsVarM = l(property);
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (aabsVarM == null) {
                        aabsVarM = m(TimeZone.getDefault());
                    }
                } catch (IllegalArgumentException unused2) {
                }
                if (aabsVarM == null) {
                    aabsVarM = b;
                }
                d = aabsVarM;
            }
        }
        return aabsVarM;
    }

    private static synchronized aabs q(String str, int i2) {
        aabs aabsVar;
        if (i2 == 0) {
            return b;
        }
        if (h == null) {
            h = new HashMap();
        }
        Reference reference = (Reference) h.get(str);
        if (reference != null && (aabsVar = (aabs) reference.get()) != null) {
            return aabsVar;
        }
        aagb aagbVar = new aagb(str, null, i2, i2);
        h.put(str, new SoftReference(aagbVar));
        return aagbVar;
    }

    private static synchronized aaej r() {
        if (g == null) {
            aaey aaeyVar = new aaey();
            aaeyVar.u(null, true, 4);
            g = aaeyVar.a();
        }
        return g;
    }

    public abstract int a(long j);

    public abstract int b(long j);

    public abstract long d(long j);

    public abstract long e(long j);

    public abstract boolean equals(Object obj);

    public abstract String g(long j);

    public abstract boolean h();

    public int hashCode() {
        return this.e.hashCode() + 57;
    }

    public int i(long j) {
        int iA = a(j);
        long j2 = j - iA;
        int iA2 = a(j2);
        if (iA != iA2) {
            if (iA - iA2 < 0 && d(j2) != d(j - iA2)) {
                return iA;
            }
        } else if (iA >= 0) {
            long jE = e(j2);
            if (jE < j2) {
                int iA3 = a(jE);
                if (j2 - jE <= iA3 - iA) {
                    return iA3;
                }
            }
        }
        return iA2;
    }

    public final long j(long j) {
        long jA = a(j);
        long j2 = j + jA;
        if ((j ^ j2) >= 0 || (j ^ jA) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public final boolean o(long j) {
        return a(j) == b(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p(long r9, long r11) {
        /*
            r8 = this;
            int r11 = r8.a(r11)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.a(r0)
            if (r12 == r11) goto L56
            int r11 = r8.a(r9)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.a(r0)
            if (r11 == r12) goto L3c
            if (r11 >= 0) goto L3c
            long r2 = r8.d(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L2a
            r2 = r4
        L2a:
            long r0 = (long) r12
            long r0 = r9 - r0
            long r6 = r8.d(r0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L36
            goto L37
        L36:
            r4 = r6
        L37:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r11 = r12
        L3d:
            long r11 = (long) r11
            long r0 = r9 - r11
            long r2 = r9 ^ r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L56
            long r9 = r9 ^ r11
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L4e
            goto L56
        L4e:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "Subtracting time zone offset caused overflow"
            r9.<init>(r10)
            throw r9
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabs.p(long, long):long");
    }

    public final String toString() {
        return this.e;
    }

    protected Object writeReplace() {
        return new aabr(this.e);
    }
}
