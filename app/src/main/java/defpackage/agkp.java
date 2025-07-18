package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkp extends agfo {
    final agfx a;
    final long b;
    final long c;
    final TimeUnit d;

    public agkp(long j, long j2, TimeUnit timeUnit, agfx agfxVar) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = agfxVar;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        agko agkoVar = new agko(agfsVar);
        agfsVar.d(agkoVar);
        agfx agfxVar = this.a;
        if (!(agfxVar instanceof agnm)) {
            aghd.c(agkoVar, agfxVar.d(agkoVar, this.b, this.c, this.d));
            return;
        }
        agfw agfwVarA = agfxVar.a();
        aghd.c(agkoVar, agfwVarA);
        agfwVarA.c(agkoVar, this.b, this.c, this.d);
    }
}
