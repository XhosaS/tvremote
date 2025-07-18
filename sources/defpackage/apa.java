package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apa {
    public final Context a;
    public final byg b;
    private final byg c;
    private final byg d;

    public apa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apa) {
            apa apaVar = (apa) obj;
            if (this.a.equals(apaVar.a) && this.c.equals(apaVar.c) && this.d.equals(apaVar.d) && this.b.equals(apaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        byg bygVar = this.b;
        byg bygVar2 = this.d;
        byg bygVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(bygVar3) + ", stacktrace=" + String.valueOf(bygVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(bygVar) + "}";
    }

    public apa(Context context, byg bygVar, byg bygVar2, byg bygVar3) {
        this.a = context;
        this.c = bygVar;
        this.d = bygVar2;
        this.b = bygVar3;
    }
}
