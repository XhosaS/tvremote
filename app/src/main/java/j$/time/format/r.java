package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class r extends i {
    public final char g;
    public final int h;

    public r(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, F.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new r(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new r(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final i f(Locale locale) {
        j$.time.temporal.r rVar;
        ConcurrentHashMap concurrentHashMap = j$.time.temporal.s.g;
        Objects.a(locale, "locale");
        j$.time.temporal.s sVarA = j$.time.temporal.s.a(j$.time.c.a[((((int) ((r7.getFirstDayOfWeek() - 1) % 7)) + 7) + j$.time.c.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            rVar = sVarA.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.r rVar2 = sVarA.f;
                int i = this.h;
                if (i == 2) {
                    return new o(rVar2, 2, 2, o.h, this.e);
                }
                return new i(rVar2, i, 19, i < 4 ? F.NORMAL : F.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                rVar = sVarA.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                rVar = sVarA.e;
            }
        }
        return new i(rVar, this.b, this.c, F.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC0062e
    public final boolean i(y yVar, StringBuilder sb) {
        return f(yVar.b.b).i(yVar, sb);
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        return f(vVar.a.b).l(vVar, charSequence, i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? F.NORMAL : F.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
