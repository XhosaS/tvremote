package defpackage;

import android.net.Uri;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfa {
    private static final NumberFormat e;
    public final String a;
    public final HashMap b;
    public final StringBuilder c;
    public int d;
    private final long f;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        e = numberFormat;
        numberFormat.setMinimumFractionDigits(3);
        numberFormat.setMaximumFractionDigits(3);
        numberFormat.setGroupingUsed(false);
    }

    public nfa(String str, String str2, long j) {
        String str3 = str + "?cpn=" + h(str2);
        this.a = str3;
        this.f = j;
        this.c = new StringBuilder();
        this.b = new HashMap();
        this.d = str3.length();
    }

    public static String b(long j) {
        return e.format(j / 1000.0f);
    }

    private static String h(String str) {
        return Uri.encode(str, ",:");
    }

    public final long a(long j) {
        return Math.max(0L, j - this.f);
    }

    public final StringBuilder c(String str, int i) {
        HashMap map = this.b;
        StringBuilder sb = (StringBuilder) map.get(str);
        if (sb == null) {
            this.d += str.length() + i + 2;
            StringBuilder sb2 = new StringBuilder(i);
            map.put(str, sb2);
            return sb2;
        }
        this.d += i + 1;
        sb.ensureCapacity(sb.length() + 1 + i);
        sb.append(',');
        return sb;
    }

    public final StringBuilder d() {
        StringBuilder sb = this.c;
        sb.setLength(0);
        return sb;
    }

    public final StringBuilder e(long j) {
        StringBuilder sbD = d();
        sbD.append(b(a(j)));
        sbD.append(':');
        return sbD;
    }

    public final void f(String str, String str2) {
        String strH = h(str2);
        c(str, strH.length()).append(strH);
    }

    public final void g(String str) {
        StringBuilder sb = (StringBuilder) this.b.remove(str);
        if (sb != null) {
            this.d -= (str.length() + sb.length()) + 2;
        }
    }
}
