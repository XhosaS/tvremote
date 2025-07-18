package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qk {
    private final Context a;
    private final clx b;
    private final long c;
    private final yy d;

    public qk(Context context, clx clxVar, long j, yy yyVar) {
        this.a = context;
        this.b = clxVar;
        this.c = j;
        this.d = yyVar;
    }

    public final qj a() {
        return new qj(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        qk qkVar = (qk) obj;
        if (!yks.e(this.a, qkVar.a) || !yks.e(this.b, qkVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = qkVar.c;
        long j3 = bnq.a;
        return a.s(j, j2) && yks.e(this.d, qkVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = bnq.a;
        return (((iHashCode * 31) + a.k(this.c)) * 31) + this.d.hashCode();
    }
}
