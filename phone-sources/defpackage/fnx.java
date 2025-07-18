package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnx {
    public final ImmutableList a;
    public final int b;
    public final long c;

    public fnx(List list, int i, long j) {
        this.a = ImmutableList.copyOf((Collection) list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnx)) {
            return false;
        }
        fnx fnxVar = (fnx) obj;
        return this.a.equals(fnxVar.a) && this.b == fnxVar.b && this.c == fnxVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + a.k(this.c);
    }
}
