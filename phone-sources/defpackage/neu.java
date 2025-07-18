package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class neu implements evx, evw {
    public final evx a;
    private final net b;
    private final String c;
    private evw d;

    public neu(evx evxVar, net netVar, String str) {
        this.a = evxVar;
        this.b = netVar;
        this.c = str;
    }

    @Override // defpackage.evx
    public final long a(long j, ekj ekjVar) {
        return this.a.a(j, ekjVar);
    }

    @Override // defpackage.ewy
    public final /* bridge */ /* synthetic */ void b(ewz ewzVar) {
        evw evwVar = this.d;
        evwVar.getClass();
        evwVar.b(this);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.evx, defpackage.ewz
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.evw
    public final void dp(evx evxVar) {
        evw evwVar = this.d;
        evwVar.getClass();
        evwVar.dp(this);
    }

    @Override // defpackage.evx
    public final void dr() {
        this.a.dr();
    }

    @Override // defpackage.evx
    public final void dt(long j) {
        this.b.G(this.c);
        this.a.dt(j);
    }

    @Override // defpackage.evx
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.evx
    public final long f(long j) {
        this.b.G(this.c);
        return this.a.f(j);
    }

    @Override // defpackage.evx
    public final long g(ezf[] ezfVarArr, boolean[] zArr, ewx[] ewxVarArr, boolean[] zArr2, long j) {
        this.b.G(this.c);
        return this.a.g(ezfVarArr, zArr, ewxVarArr, zArr2, j);
    }

    @Override // defpackage.evx
    public final exi h() {
        return this.a.h();
    }

    @Override // defpackage.evx
    public final /* synthetic */ List i(List list) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.evx
    public final void l(evw evwVar, long j) {
        this.d = evwVar;
        this.b.G(this.c);
        this.a.l(this, j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final void m(long j) {
        this.b.G(this.c);
        this.a.m(j);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean n(eji ejiVar) {
        this.b.G(this.c);
        return this.a.n(ejiVar);
    }

    @Override // defpackage.evx, defpackage.ewz
    public final boolean o() {
        return this.a.o();
    }
}
