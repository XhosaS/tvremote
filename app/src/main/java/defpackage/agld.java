package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agld extends AtomicReference implements aglg {
    private static final long serialVersionUID = 2346567790059478686L;
    aglf a;
    int b;

    public agld() {
        aglf aglfVar = new aglf(null);
        this.a = aglfVar;
        set(aglfVar);
    }

    final void a(aglf aglfVar) {
        this.a.set(aglfVar);
        this.a = aglfVar;
        this.b++;
    }

    @Override // defpackage.aglg
    public final void b(agle agleVar) {
        if (agleVar.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                Object obj = agleVar.c;
                if (obj == null) {
                    obj = (aglf) get();
                    agleVar.c = obj;
                }
                while (!agleVar.d) {
                    aglf aglfVar = (aglf) ((aglf) obj).get();
                    if (aglfVar != null) {
                        if (agob.a(aglfVar.a, agleVar.b)) {
                            agleVar.c = null;
                            return;
                        }
                        obj = aglfVar;
                    } else {
                        agleVar.c = obj;
                        iAddAndGet = agleVar.addAndGet(-iAddAndGet);
                    }
                }
                agleVar.c = null;
                return;
            } while (iAddAndGet != 0);
        }
    }

    final void c() {
        aglf aglfVar = (aglf) get();
        if (aglfVar.a != null) {
            aglf aglfVar2 = new aglf(null);
            aglfVar2.lazySet((aglf) aglfVar.get());
            set(aglfVar2);
        }
    }
}
