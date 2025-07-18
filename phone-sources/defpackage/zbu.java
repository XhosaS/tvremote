package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbu {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String e;
    public final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public zbu(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbu)) {
            return false;
        }
        zbu zbuVar = (zbu) obj;
        return yks.e(zbuVar.e, this.e) && yks.e(zbuVar.f, this.f) && zbuVar.g == this.g && yks.e(zbuVar.h, this.h) && yks.e(zbuVar.i, this.i) && zbuVar.j == this.j && zbuVar.k == this.k && zbuVar.l == this.l && zbuVar.m == this.m;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.e.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + a.k(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        boolean z = this.m;
        boolean z2 = this.l;
        return (((((((iHashCode * 31) + a.q(this.j)) * 31) + a.q(this.k)) * 31) + a.q(z2)) * 31) + a.q(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            long j = this.g;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) zdm.a.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
