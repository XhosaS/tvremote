package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eur implements aejl {
    private final eup a;
    private final eus b;
    private final int c;

    public eur(eup eupVar, eus eusVar, int i) {
        this.a = eupVar;
        this.b = eusVar;
        this.c = i;
    }

    @Override // defpackage.agow
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return new vgq(this.b.a);
        }
        if (i == 1) {
            eus eusVar = this.b;
            eup eupVar = this.a;
            Context context = (Context) eupVar.n.a();
            return new vrp(eusVar.a, context);
        }
        eup eupVar2 = this.a;
        mcw mcwVar = (mcw) eupVar2.i.a();
        aejl aejlVar = eupVar2.aR;
        return new vze(mcwVar, (vyl) eupVar2.bd.a(), (Executor) aejlVar.a());
    }
}
