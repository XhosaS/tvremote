package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ages extends afhe {
    @Override // defpackage.afhe
    public final afhj a(afhb afhbVar) {
        return f().a(afhbVar);
    }

    @Override // defpackage.afhe
    public final afkc b() {
        return ((aftw) f()).b.m;
    }

    @Override // defpackage.afhe
    public final ScheduledExecutorService c() {
        return ((aftw) f()).b.j;
    }

    @Override // defpackage.afhe
    public final void d() {
        f().d();
    }

    @Override // defpackage.afhe
    public void e(affe affeVar, afhk afhkVar) {
        throw null;
    }

    protected abstract afhe f();

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("delegate", f());
        return yqqVarB.toString();
    }
}
