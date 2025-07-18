package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpz {
    public final rql a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final yqt e;
    public final rqp f;
    public final String g;
    private final int[] h;
    private boolean i;
    private yzq j = zcp.b;

    public rpz(String str, boolean z, yqt yqtVar, int i, rqp rqpVar, int[] iArr, rqo rqoVar, yzq yzqVar, String str2) {
        this.b = str;
        this.d = z;
        this.e = yqtVar;
        this.a = new rqm(i, yzqVar, rqoVar);
        this.c = iArr.length > 0;
        this.f = rqpVar;
        this.h = iArr;
        this.g = str2;
    }

    public final synchronized yzq a() {
        if (!this.i) {
            yzo yzoVar = new yzo();
            for (int i : this.h) {
                rql rqlVar = this.a;
                yzoVar.c(new rqm(i, ((rqm) rqlVar).b, new rqn(((rqn) ((rqm) rqlVar).c).a)));
            }
            this.j = yzoVar.f();
            this.i = true;
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rpz) {
            return this.a.equals(((rpz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
