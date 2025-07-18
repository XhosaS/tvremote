package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baz {
    public final Context a;
    public final byo b;

    public baz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baz) {
            baz bazVar = (baz) obj;
            if (this.a.equals(bazVar.a) && this.b.equals(bazVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        byo byoVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + byoVar.toString() + "}";
    }

    public baz(Context context, byo byoVar) {
        this.a = context;
        this.b = byoVar;
    }
}
