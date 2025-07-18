package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouk {
    public static final ouk a = new ouk("zxx", oul.a, 1, "");
    public final String b;
    public final oul c;
    public final String d;
    public final int e;

    public ouk(String str, oul oulVar, int i, String str2) {
        oulVar.getClass();
        this.b = str;
        this.c = oulVar;
        this.e = i;
        this.d = str2;
    }

    public final int a() {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 1) {
            return RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if (iOrdinal == 2) {
            return 4160;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 0 : 1152;
        }
        return 128;
    }

    public final String b() {
        switch (this.e - 1) {
        }
        return "text/xml";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouk)) {
            return false;
        }
        ouk oukVar = (ouk) obj;
        return yks.e(this.b, oukVar.b) && this.c == oukVar.c && this.e == oukVar.e && yks.e(this.d, oukVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        int i = this.e;
        a.bw(i);
        return (((iHashCode * 31) + i) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Caption(languageCode=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", format=");
        switch (this.e) {
            case 1:
                str = "FORMAT_UNSPECIFIED";
                break;
            case 2:
                str = "FORMAT_3";
                break;
            case 3:
                str = "JSON3";
                break;
            case 4:
                str = "FORMAT_2";
                break;
            case 5:
                str = "WEB_VTT";
                break;
            case 6:
                str = "WEB_VTT_TV";
                break;
            default:
                str = "TTML";
                break;
        }
        sb.append((Object) str);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
