package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lab extends lcn {
    public char a;
    public long b;
    public final kzz c;
    public final kzz d;
    public final kzz e;
    public final kzz f;
    public final kzz g;
    public final kzz h;
    public final kzz i;
    public final kzz j;
    public final kzz k;
    private String l;

    public lab(lbk lbkVar) {
        super(lbkVar);
        this.a = (char) 0;
        this.b = -1L;
        this.c = new kzz(this, 6, false, false);
        this.d = new kzz(this, 6, true, false);
        this.e = new kzz(this, 6, false, true);
        this.f = new kzz(this, 5, false, false);
        this.g = new kzz(this, 5, true, false);
        this.h = new kzz(this, 5, false, true);
        this.i = new kzz(this, 4, false, false);
        this.j = new kzz(this, 3, false, false);
        this.k = new kzz(this, 2, false, false);
    }

    protected static Object b(String str) {
        if (str == null) {
            return null;
        }
        return new laa(str);
    }

    static String c(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strD = d(z, obj);
        String strD2 = d(z, obj2);
        String strD3 = d(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strD)) {
            sb.append(str2);
            sb.append(strD);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strD2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strD2);
        }
        if (!TextUtils.isEmpty(strD3)) {
            sb.append(str3);
            sb.append(strD3);
        }
        return sb.toString();
    }

    static String d(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof laa ? ((laa) obj).a : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strE = e(lbk.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && e(className).equals(strE)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    static String e(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    @Override // defpackage.lcn
    protected final boolean a() {
        return false;
    }

    protected final String f() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                kts ktsVar = this.y.d.y.c;
                this.l = "FA";
            }
            kkk.k(this.l);
            str = this.l;
        }
        return str;
    }

    public final void h(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(f(), i)) {
            Log.println(i, f(), c(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        kkk.k(str);
        lbh lbhVar = this.y.g;
        if (lbhVar == null) {
            Log.println(6, f(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!lbhVar.r()) {
                Log.println(6, f(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            lbhVar.h(new kzy(this, i, str, obj, obj2, obj3));
        }
    }
}
