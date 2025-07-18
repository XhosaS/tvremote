package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfm extends tfj {
    final /* synthetic */ tfj a;
    final /* synthetic */ tfs b;
    final /* synthetic */ kwy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfm(tfs tfsVar, kwy kwyVar, kwy kwyVar2, tfj tfjVar) {
        super(kwyVar);
        this.c = kwyVar2;
        this.a = tfjVar;
        this.b = tfsVar;
    }

    @Override // defpackage.tfj
    public final void a() {
        tfs tfsVar = this.b;
        synchronized (tfsVar.e) {
            kwy kwyVar = this.c;
            tfsVar.d.add(kwyVar);
            ((onz) kwyVar.a).k(new tfl(tfsVar, kwyVar, 0));
            tfsVar.k.getAndIncrement();
            tfj tfjVar = this.a;
            if (tfsVar.m == null && !tfsVar.f) {
                List list = tfsVar.c;
                list.add(tfjVar);
                tfsVar.l = new itp(tfsVar, 2);
                tfsVar.f = true;
                if (!tfsVar.a.bindService(tfsVar.g, tfsVar.l, 1)) {
                    tfsVar.f = false;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((tfj) it.next()).b(new tft());
                    }
                    list.clear();
                }
            } else if (tfsVar.f) {
                tfsVar.c.add(tfjVar);
            } else {
                tfjVar.run();
            }
        }
    }
}
