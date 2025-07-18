package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxi extends vys {
    public final vxo a;
    public final Object b;
    public final vzr c;
    public final long d;
    public final vyt e;
    public final int f;

    public vxi(vxo vxoVar, Object obj, vzr vzrVar, long j, int i, vyt vytVar) {
        this.a = vxoVar;
        this.b = obj;
        this.c = vzrVar;
        this.d = j;
        this.f = i;
        this.e = vytVar;
    }

    @Override // defpackage.vys
    public final long a() {
        return this.d;
    }

    @Override // defpackage.vys
    public final vxo b() {
        return this.a;
    }

    @Override // defpackage.vys
    public final vyt c() {
        return this.e;
    }

    @Override // defpackage.vys
    public final vzr d() {
        return this.c;
    }

    @Override // defpackage.vys
    public final Object e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vys) {
            vys vysVar = (vys) obj;
            if (this.a.equals(vysVar.b()) && this.b.equals(vysVar.e()) && this.c.equals(vysVar.d()) && this.d == vysVar.a() && this.f == vysVar.f() && this.e.equals(vysVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vys
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        vzr vzrVar = this.c;
        String string = this.a.toString();
        String string2 = vzrVar.toString();
        String str = i != 1 ? i != 2 ? "SUBSCRIBE" : "FORCE_REFRESH" : "UNDEFINED";
        Object obj = this.b;
        return "SubscribeCallState{dataSource=" + string + ", contentKey=" + ((String) obj) + ", tolerance=" + string2 + ", index=" + this.d + ", subscribeCallType=" + str + ", subscribeSequenceState=" + this.e.toString() + "}";
    }
}
