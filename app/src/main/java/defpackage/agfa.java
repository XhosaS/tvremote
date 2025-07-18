package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agfa extends agew {
    private final AtomicInteger l;
    private afhk m;

    public agfa(afhe afheVar) {
        super(afheVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new afhd(afhg.a);
    }

    private final afhk g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ageu) it.next()).d);
        }
        return new agez(arrayList, this.l);
    }

    private final void h(affe affeVar, afhk afhkVar) {
        if (affeVar == this.k && afhkVar.equals(this.m)) {
            return;
        }
        this.h.e(affeVar, afhkVar);
        this.k = affeVar;
        this.m = afhkVar;
    }

    @Override // defpackage.agew
    protected final ageu e(Object obj) {
        return new agey(this, obj, this.j);
    }

    @Override // defpackage.agew
    protected final void f() {
        ArrayList arrayList = new ArrayList();
        for (ageu ageuVar : this.g) {
            if (ageuVar.c == affe.READY) {
                arrayList.add(ageuVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(affe.READY, g(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            affe affeVar = ((ageu) it.next()).c;
            affe affeVar2 = affe.CONNECTING;
            if (affeVar == affeVar2 || affeVar == affe.IDLE) {
                h(affeVar2, new afhd(afhg.a));
                return;
            }
        }
        h(affe.TRANSIENT_FAILURE, g(this.g));
    }
}
