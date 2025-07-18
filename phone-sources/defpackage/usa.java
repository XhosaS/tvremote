package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usa {
    public final ttm a;
    public final usc b;

    public usa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof usa) {
            usa usaVar = (usa) obj;
            if (this.a.equals(usaVar.a) && this.b.equals(usaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        usc uscVar = this.b;
        return "ConsistencyTokenConfig{enabled=" + String.valueOf(this.a) + ", consistencyTokenManager=" + String.valueOf(uscVar) + "}";
    }

    public usa(ttm ttmVar, usc uscVar) {
        this.a = ttmVar;
        this.b = uscVar;
    }
}
