package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxj extends vyt {
    public final vxo a;
    public final long b;
    public final vyd c;
    public final vyh d;
    public final int e;
    public final Instant f;

    public vxj(vxo vxoVar, long j, vyd vydVar, vyh vyhVar, int i, Instant instant) {
        this.a = vxoVar;
        this.b = j;
        this.c = vydVar;
        this.d = vyhVar;
        this.e = i;
        if (instant == null) {
            throw new NullPointerException("Null epochTimeAtStart");
        }
        this.f = instant;
    }

    @Override // defpackage.vyt
    public final int a() {
        return this.e;
    }

    @Override // defpackage.vyt
    public final long b() {
        return this.b;
    }

    @Override // defpackage.vyt
    public final vxo c() {
        return this.a;
    }

    @Override // defpackage.vyt
    public final vyd d() {
        return this.c;
    }

    @Override // defpackage.vyt
    public final vyh e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyt) {
            vyt vytVar = (vyt) obj;
            if (this.a.equals(vytVar.c()) && this.b == vytVar.b() && this.c.equals(vytVar.d()) && this.d.equals(vytVar.e()) && this.e == vytVar.a() && this.f.equals(vytVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vyt
    public final Instant f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Instant instant = this.f;
        vyh vyhVar = this.d;
        vyd vydVar = this.c;
        return "SubscribeSequenceState{dataSource=" + this.a.toString() + ", index=" + this.b + ", fetchTaskIdentifier=" + vydVar.toString() + ", loadTaskIdentifier=" + vyhVar.toString() + ", loadAttempts=" + this.e + ", epochTimeAtStart=" + instant.toString() + "}";
    }
}
