package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jtr {
    public final wfo a;
    public final String b;
    public final List c;
    public final yjv d;

    public jtr(wfo wfoVar, String str, List list, yjv yjvVar) {
        wfoVar.getClass();
        this.a = wfoVar;
        this.b = str;
        this.c = list;
        this.d = yjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtr)) {
            return false;
        }
        jtr jtrVar = (jtr) obj;
        return yks.e(this.a, jtrVar.a) && yks.e(this.b, jtrVar.b) && yks.e(this.c, jtrVar.c) && yks.e(this.d, jtrVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SeasonSelectionDropdownMenuOptions(dynamicScheme=" + this.a + ", selectedSeasonTitle=" + this.b + ", seasons=" + this.c + ", onSeasonClick=" + this.d + ")";
    }
}
