package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfa implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ lez b;
    final /* synthetic */ lez c;
    final /* synthetic */ long d;
    final /* synthetic */ lfg e;

    public lfa(lfg lfgVar, Bundle bundle, lez lezVar, lez lezVar2, long j) {
        this.a = bundle;
        this.b = lezVar;
        this.c = lezVar2;
        this.d = j;
        this.e = lfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Bundle bundle = this.a;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        lfg lfgVar = this.e;
        lbk lbkVar = lfgVar.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        lfgVar.l(this.b, this.c, this.d, true, lioVar.y(null, "screen_view", bundle, null, false));
    }
}
