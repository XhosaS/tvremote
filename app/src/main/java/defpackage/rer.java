package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rer extends rgh {
    public final Context a;
    public final yrp b;

    public rer(Context context, yrp yrpVar) {
        this.a = context;
        this.b = yrpVar;
    }

    @Override // defpackage.rgh
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.rgh
    public final yrp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        yrp yrpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgh) {
            rgh rghVar = (rgh) obj;
            if (this.a.equals(rghVar.a()) && ((yrpVar = this.b) != null ? yrpVar.equals(rghVar.b()) : rghVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        yrp yrpVar = this.b;
        return (iHashCode * 1000003) ^ (yrpVar == null ? 0 : yrpVar.hashCode());
    }

    public final String toString() {
        yrp yrpVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(yrpVar) + "}";
    }
}
