package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nqh extends TimerTask {
    final /* synthetic */ nqi a;

    public nqh(nqi nqiVar) {
        this.a = nqiVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        nqi nqiVar = this.a;
        nqj nqjVar = nqiVar.c;
        nqjVar.o(nqiVar.a);
        nqjVar.c.postDelayed(this, 1000L);
    }
}
