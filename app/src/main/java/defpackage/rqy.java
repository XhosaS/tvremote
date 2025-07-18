package defpackage;

import com.google.common.collect.Sets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqy extends rqv {
    public final yqt b;
    public final rpz c;
    public final epa d;
    public final yyr e;
    private final long f;
    private final yqt g;
    private final yqt h;
    private final yzq i;

    public rqy(long j, yqt yqtVar, yqt yqtVar2, yqt yqtVar3, rpz rpzVar, epa epaVar, yyr yyrVar, yzq yzqVar) {
        this.f = j;
        this.g = yqtVar;
        this.b = yqtVar2;
        this.h = yqtVar3;
        this.c = rpzVar;
        this.d = epaVar;
        this.e = yyrVar;
        this.i = yzqVar;
    }

    @Override // defpackage.rqv
    protected final long a() {
        return this.f;
    }

    @Override // defpackage.rqv
    public final epa b() {
        return this.d;
    }

    @Override // defpackage.rqv
    public final rpz c() {
        return this.c;
    }

    @Override // defpackage.rqv
    public final yqt d() {
        return this.b;
    }

    @Override // defpackage.rqv
    public final yqt e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqv) {
            rqv rqvVar = (rqv) obj;
            if (this.f == rqvVar.a() && this.g.equals(rqvVar.e()) && this.b.equals(rqvVar.d()) && this.h.equals(rqvVar.f())) {
                rqvVar.i();
                if (this.c.equals(rqvVar.c()) && this.d.equals(rqvVar.b()) && zbk.e(this.e, rqvVar.g()) && this.i.equals(rqvVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rqv
    public final yqt f() {
        return this.h;
    }

    @Override // defpackage.rqv
    public final yyr g() {
        return this.e;
    }

    @Override // defpackage.rqv
    public final yzq h() {
        return this.i;
    }

    public final int hashCode() {
        long j = this.f;
        return ((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.c.a.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ Sets.a(this.e.entrySet())) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.rqv
    public final void i() {
    }
}
