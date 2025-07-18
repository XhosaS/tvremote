package defpackage;

import j$.util.DesugarTimeZone;
import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class meh {
    private static final Date c;
    private static final String[] b = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE, dd MMM yyyy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    public static final ThreadLocal a = new meg();

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        c = calendar.getTime();
    }

    public static long a(String str) {
        long j = -1;
        if (str == null) {
            return -1L;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            ThreadLocal threadLocal = a;
            Map map = (Map) ((SoftReference) threadLocal.get()).get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str2);
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                map.put(str2, simpleDateFormat);
            }
            simpleDateFormat.set2DigitYearStart(c);
            try {
                return simpleDateFormat.parse(str).getTime();
            } catch (ParseException unused) {
            }
        }
        return j;
    }
}
