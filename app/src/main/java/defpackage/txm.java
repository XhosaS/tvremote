package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txm {
    public final vyb a;
    public final txk b;
    public final HashMap c = new HashMap();

    public txm(vyb vybVar, txk txkVar) {
        this.a = vybVar;
        this.b = txkVar;
    }

    public final void a(tqu tquVar) {
        zyd zydVar;
        final txj txjVar = (txj) this.c.get(tquVar.c);
        if (txjVar == null || (zydVar = txjVar.h) == null) {
            return;
        }
        txjVar.d("stop listening", xab.b(zydVar).a(new Callable() { // from class: tww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                txjVar.i.c();
                return null;
            }
        }, txjVar.c));
    }
}
