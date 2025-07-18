package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes3.dex */
public class s implements InterfaceC0062e {
    public static volatile AbstractMap.SimpleImmutableEntry c;
    public static volatile AbstractMap.SimpleImmutableEntry d;
    public final j$.desugar.sun.nio.fs.n a;
    public final String b;

    public s(j$.desugar.sun.nio.fs.n nVar, String str) {
        this.a = nVar;
        this.b = str;
    }

    public static int b(v vVar, CharSequence charSequence, int i, int i2, j jVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            vVar.e(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || vVar.a(charSequence.charAt(i2), 'Z')) {
            vVar.e(ZoneId.of(upperCase));
            return i2;
        }
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iL = jVar.l(vVar2, charSequence, i2);
        try {
            if (iL >= 0) {
                vVar.e(ZoneId.Y(upperCase, ZoneOffset.e0((int) vVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iL;
            }
            if (jVar == j.e) {
                return ~i;
            }
            vVar.e(ZoneId.of(upperCase));
            return i2;
        } catch (j$.time.b unused) {
            return ~i;
        }
    }

    public m a(v vVar) {
        Set<String> set = j$.time.zone.h.d;
        int size = set.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = vVar.b ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.b ? c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        m mVar = vVar.b ? new m("", null, null) : new l("", null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, mVar);
                        if (vVar.b) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (m) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC0062e
    public boolean i(y yVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) yVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i, i, j.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !vVar.a(charSequence.charAt(i3), 'C')) ? b(vVar, charSequence, i, i3, j.f) : b(vVar, charSequence, i, i4, j.f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !vVar.a(charSequence.charAt(i2), '0')) {
                    return b(vVar, charSequence, i, i2, j.f);
                }
                vVar.e(ZoneId.of("GMT0"));
                return i5;
            }
        }
        m mVarA = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = mVarA.c(charSequence, parsePosition);
        if (strC != null) {
            vVar.e(ZoneId.of(strC));
            return parsePosition.getIndex();
        }
        if (!vVar.a(cCharAt, 'Z')) {
            return ~i;
        }
        vVar.e(ZoneOffset.UTC);
        return i + 1;
    }

    public final String toString() {
        return this.b;
    }
}
