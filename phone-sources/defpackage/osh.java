package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osh {
    public final Context a;
    public final tst b;
    private final tst c;
    private final tst d;

    public osh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof osh) {
            osh oshVar = (osh) obj;
            if (this.a.equals(oshVar.a) && this.c.equals(oshVar.c) && this.d.equals(oshVar.d) && this.b.equals(oshVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.b;
        tst tstVar2 = this.d;
        tst tstVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(tstVar3) + ", stacktrace=" + String.valueOf(tstVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(tstVar) + "}";
    }

    public osh(Context context, tst tstVar, tst tstVar2, tst tstVar3) {
        this.a = context;
        this.c = tstVar;
        this.d = tstVar2;
        this.b = tstVar3;
    }
}
