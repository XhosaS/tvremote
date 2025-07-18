package defpackage;

import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tse extends tsa {
    public final yyk b;

    public tse(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null alternativeSpans");
        }
        this.b = yykVar;
    }

    @Override // defpackage.tsa
    public final yyk a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tsa) {
            return Lists.d(this.b, ((tsa) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AlternativeSpans{alternativeSpans=" + this.b.toString() + "}";
    }
}
