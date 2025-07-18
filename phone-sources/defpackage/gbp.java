package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbp {
    public final List a;
    public final Integer b;
    public final int c;
    private final fus d;

    public gbp(List list, Integer num, fus fusVar, int i) {
        this.a = list;
        this.b = num;
        this.d = fusVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gbp)) {
            return false;
        }
        gbp gbpVar = (gbp) obj;
        return yks.e(this.a, gbpVar.a) && yks.e(this.b, gbpVar.b) && yks.e(this.d, gbpVar.d) && this.c == gbpVar.c;
    }

    public final int hashCode() {
        Integer num = this.b;
        return this.a.hashCode() + (num != null ? num.hashCode() : 0) + this.d.hashCode() + this.c;
    }

    public final String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.d + ", leadingPlaceholderCount=" + this.c + ')';
    }
}
