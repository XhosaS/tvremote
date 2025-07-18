package defpackage;

import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbs implements Observer {
    private final WeakReference a;

    public sbs(sbt sbtVar) {
        this.a = new WeakReference(sbtVar);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        sbt sbtVar = (sbt) this.a.get();
        if (sbtVar == null) {
            observable.deleteObserver(this);
            return;
        }
        boolean z = false;
        boolean z2 = observable instanceof sbk ? ((sbk) observable).a : false;
        aafi aafiVar = sbtVar.k;
        if (!z2 && sbtVar.j == 3) {
            z = true;
        }
        yjk yjkVar = (yjk) aafiVar.b.get(observable);
        if (yjkVar == null) {
            return;
        }
        if (z) {
            yjkVar.a();
        } else {
            aafiVar.c.add(yjkVar);
        }
    }
}
