package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fld {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        String[] strArrAu = edt.au(str, "\\.");
        long j = 0;
        for (String str2 : edt.at(strArrAu[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrAu.length == 2) {
            String strTrim = strArrAu[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(String.valueOf(strTrim)));
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void c(edi ediVar) throws eaf {
        int i = ediVar.b;
        if (d(ediVar)) {
            return;
        }
        ediVar.K(i);
        throw new eaf("Expected WEBVTT. Got ".concat(String.valueOf(ediVar.u())), null, true, 1);
    }

    public static boolean d(edi ediVar) {
        String strU = ediVar.u();
        return strU != null && strU.startsWith("WEBVTT");
    }
}
