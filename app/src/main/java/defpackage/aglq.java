package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglq extends agfo {
    final agfx a;
    final long b;
    final TimeUnit c;

    public aglq(long j, TimeUnit timeUnit, agfx agfxVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = agfxVar;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        aglp aglpVar = new aglp(agfsVar);
        agfsVar.d(aglpVar);
        aggi aggiVarC = this.a.c(aglpVar, this.b, this.c);
        if (aghc.a(aglpVar, null, aggiVarC) || aglpVar.get() != aghd.a) {
            return;
        }
        aggiVarC.dispose();
    }
}
