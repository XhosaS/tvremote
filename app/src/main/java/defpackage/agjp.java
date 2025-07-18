package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjp extends agfy {
    final agfr a;
    final aghl b;

    public agjp(agfr agfrVar, aghl aghlVar) {
        this.a = agfrVar;
        this.b = aghlVar;
    }

    @Override // defpackage.agfy
    protected final void e(agfz agfzVar) {
        try {
            this.a.m(new agjo(agfzVar, new HashMap(), this.b));
        } catch (Throwable th) {
            agfzVar.c(aghe.INSTANCE);
            agfzVar.fg(th);
        }
    }
}
