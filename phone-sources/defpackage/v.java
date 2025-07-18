package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class v implements Serializable {
    public static final v a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final n i;
    private static final t j;
    private static final long serialVersionUID = 1;
    public final u h;

    static {
        k kVar = new k();
        i = kVar;
        t tVar = new t("other", kVar, null, null);
        j = tVar;
        u uVar = new u();
        uVar.a(tVar);
        a = new v(uVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    public v(u uVar) {
        this.h = uVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = uVar.b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((t) it.next()).a);
        }
        DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.t a(java.lang.String r40) throws java.lang.NumberFormatException, java.text.ParseException {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.a(java.lang.String):t");
    }

    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(c(d2));
            return;
        }
        sb.append(c(d2) + ".." + c(d3));
    }

    private static String c(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String d(String[] strArr, int i2, String str) throws ParseException {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(a.cg(str, "missing token at end of '", "'"), -1);
    }

    private static ParseException e(String str, String str2) {
        return new ParseException(a.ci(str2, str, "unexpected token '", "' in '", "'"), -1);
    }

    public final boolean equals(Object obj) {
        v vVar;
        return (obj instanceof v) && (vVar = (v) obj) != null && toString().equals(vVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
