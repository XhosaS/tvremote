package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwz {
    public final Context a;
    public final ttm b;

    public rwz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rwz) {
            rwz rwzVar = (rwz) obj;
            if (this.a.equals(rwzVar.a) && this.b.equals(rwzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ttm ttmVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + ttmVar.toString() + "}";
    }

    public rwz(Context context, ttm ttmVar) {
        this.a = context;
        this.b = ttmVar;
    }
}
