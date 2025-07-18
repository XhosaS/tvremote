package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enx extends enz implements eng {
    final eoa a;

    public enx(long j, dze dzeVar, List list, eoa eoaVar, List list2) {
        super(j, dzeVar, list, eoaVar, list2);
        this.a = eoaVar;
    }

    @Override // defpackage.eng
    public final long a(long j, long j2) {
        return this.a.a(j, j2);
    }

    @Override // defpackage.eng
    public final long b(long j, long j2) {
        return this.a.d(j, j2);
    }

    @Override // defpackage.eng
    public final long c(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.eng
    public final long d() {
        return this.a.a;
    }

    @Override // defpackage.eng
    public final long e(long j, long j2) {
        eoa eoaVar = this.a;
        if (eoaVar.c != null) {
            return -9223372036854775807L;
        }
        long jB = eoaVar.b(j, j2) + eoaVar.a(j, j2);
        return (eoaVar.f(jB) + eoaVar.d(jB, j)) - eoaVar.d;
    }

    @Override // defpackage.eng
    public final long f(long j) {
        return this.a.c(j);
    }

    @Override // defpackage.eng
    public final long g(long j, long j2) {
        return this.a.e(j, j2);
    }

    @Override // defpackage.eng
    public final long h(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.eng
    public final enw i(long j) {
        return this.a.g(this, j);
    }

    @Override // defpackage.eng
    public final boolean j() {
        return this.a.h();
    }

    @Override // defpackage.enz
    public final enw l() {
        return null;
    }

    @Override // defpackage.enz
    public final String m() {
        return null;
    }

    @Override // defpackage.enz
    public final eng k() {
        return this;
    }
}
