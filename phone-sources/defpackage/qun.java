package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qun implements que {
    public final ImmutableList a;
    private boolean c;
    private Object d;
    private final unx e = new unx(null, null);
    public final Map b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public qun(ImmutableList immutableList, dvk dvkVar) {
        this.a = immutableList;
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            qub qubVar = (qub) it.next();
            qubVar.a.d(dvkVar, new rdg(this, qubVar, 1));
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.que
    public final unx a(Object obj) {
        if (obj != this.d) {
            sjl.c();
            this.d = obj;
            this.c = true;
            UnmodifiableIterator it = this.a.iterator();
            while (it.hasNext()) {
                ((qub) it.next()).a(obj);
            }
            this.c = false;
            b();
        }
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        sjl.c();
        if (this.c) {
            return;
        }
        UnmodifiableIterator it = this.a.iterator();
        qua quaVar = null;
        while (it.hasNext()) {
            qua quaVar2 = (qua) this.b.get((qub) it.next());
            if (quaVar2 != null && (quaVar == null || quaVar2.compareTo(quaVar) > 0)) {
                quaVar = quaVar2;
            }
        }
        tst tstVarH = tst.h(quaVar);
        if (!tstVarH.g()) {
            this.e.k(null);
        } else {
            this.e.k((qua) tstVarH.c());
        }
    }
}
