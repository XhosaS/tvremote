package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtc extends vts {
    public final Class a;
    public final caq b;
    public final yqt c;
    public final vtq d;
    public final yqt e;
    public final caz f;
    public final yqt g;
    public final yqt h;
    public final yzq i;
    public final yqt j;
    public final yqt k;
    public final yqt l;

    public vtc(Class cls, caq caqVar, yqt yqtVar, vtq vtqVar, yqt yqtVar2, caz cazVar, yqt yqtVar3, yqt yqtVar4, yzq yzqVar, yqt yqtVar5, yqt yqtVar6, yqt yqtVar7) {
        this.a = cls;
        this.b = caqVar;
        this.c = yqtVar;
        this.d = vtqVar;
        this.e = yqtVar2;
        this.f = cazVar;
        this.g = yqtVar3;
        this.h = yqtVar4;
        this.i = yzqVar;
        this.j = yqtVar5;
        this.k = yqtVar6;
        this.l = yqtVar7;
    }

    @Override // defpackage.vts
    public final caq a() {
        return this.b;
    }

    @Override // defpackage.vts
    public final caz b() {
        return this.f;
    }

    @Override // defpackage.vts
    public final vto c() {
        return new vtb(this);
    }

    @Override // defpackage.vts
    public final vtq d() {
        return this.d;
    }

    @Override // defpackage.vts
    public final yqt e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vts) {
            vts vtsVar = (vts) obj;
            if (this.a.equals(vtsVar.m()) && this.b.equals(vtsVar.a()) && this.c.equals(vtsVar.g()) && this.d.equals(vtsVar.d()) && this.e.equals(vtsVar.h()) && this.f.equals(vtsVar.b()) && this.g.equals(vtsVar.i()) && this.h.equals(vtsVar.k()) && this.i.equals(vtsVar.l()) && this.j.equals(vtsVar.f()) && this.k.equals(vtsVar.e()) && this.l.equals(vtsVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vts
    public final yqt f() {
        return this.j;
    }

    @Override // defpackage.vts
    public final yqt g() {
        return this.c;
    }

    @Override // defpackage.vts
    public final yqt h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.vts
    public final yqt i() {
        return this.g;
    }

    @Override // defpackage.vts
    public final yqt j() {
        return this.l;
    }

    @Override // defpackage.vts
    public final yqt k() {
        return this.h;
    }

    @Override // defpackage.vts
    public final yzq l() {
        return this.i;
    }

    @Override // defpackage.vts
    public final Class m() {
        return this.a;
    }

    public final String toString() {
        yqt yqtVar = this.l;
        yqt yqtVar2 = this.k;
        yqt yqtVar3 = this.j;
        yzq yzqVar = this.i;
        yqt yqtVar4 = this.h;
        yqt yqtVar5 = this.g;
        caz cazVar = this.f;
        yqt yqtVar6 = this.e;
        vtq vtqVar = this.d;
        yqt yqtVar7 = this.c;
        caq caqVar = this.b;
        return "TikTokWorkSpec{workerClass=" + this.a.toString() + ", constraints=" + caqVar.toString() + ", expedited=" + String.valueOf(yqtVar7) + ", initialDelay=" + vtqVar.toString() + ", nextScheduleTimeOverride=" + String.valueOf(yqtVar6) + ", inputData=" + cazVar.toString() + ", periodic=" + String.valueOf(yqtVar5) + ", unique=" + String.valueOf(yqtVar4) + ", tags=" + yzqVar.toString() + ", backoffPolicy=" + String.valueOf(yqtVar3) + ", backoffDelayDuration=" + String.valueOf(yqtVar2) + ", targetProcess=" + String.valueOf(yqtVar) + "}";
    }
}
