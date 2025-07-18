package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class v {
    public final DateTimeFormatter a;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList d;
    public ArrayList e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new D());
    }

    public static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public final boolean a(char c, char c2) {
        return this.b ? c == c2 : b(c, c2);
    }

    public final D c() {
        return (D) this.d.get(r0.size() - 1);
    }

    public final Long d(j$.time.temporal.a aVar) {
        return (Long) c().a.get(aVar);
    }

    public final void e(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        c().b = zoneId;
    }

    public final int f(j$.time.temporal.n nVar, long j, int i, int i2) {
        Objects.a(nVar, "field");
        Long l = (Long) c().a.put(nVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    public final boolean g(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return c().toString();
    }
}
