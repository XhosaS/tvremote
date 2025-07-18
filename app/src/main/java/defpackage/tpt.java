package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tpt implements Runnable {
    final /* synthetic */ tps a;

    public tpt(tps tpsVar) {
        this.a = tpsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set = tpu.a;
        tps tpsVar = this.a;
        set.add(tpsVar);
        int i = tpu.b;
        if (i != -1) {
            tpsVar.b(i);
        }
    }
}
