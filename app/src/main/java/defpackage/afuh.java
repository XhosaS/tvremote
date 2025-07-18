package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afuh extends afen {
    public final String b;
    final /* synthetic */ afun c;
    public final AtomicReference a = new AtomicReference(afun.e);
    private final afen d = new aftz(this);

    public afuh(afun afunVar, String str) {
        this.c = afunVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.afen
    public final afeq a(afil afilVar, afem afemVar) {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        afgo afgoVar = afun.e;
        if (obj != afgoVar) {
            return c(afilVar, afemVar);
        }
        afun afunVar = this.c;
        afub afubVar = new afub(this);
        afkc afkcVar = afunVar.m;
        afkcVar.c(afubVar);
        afkcVar.b();
        if (atomicReference.get() != afgoVar) {
            return c(afilVar, afemVar);
        }
        if (afunVar.C.get()) {
            return new afuc();
        }
        afug afugVar = new afug(this, affp.k(), afilVar, afemVar);
        afkcVar.c(new afud(this, afugVar));
        afkcVar.b();
        return afugVar;
    }

    @Override // defpackage.afen
    public final String b() {
        return this.b;
    }

    public final afeq c(afil afilVar, afem afemVar) {
        afgo afgoVar = (afgo) this.a.get();
        if (afgoVar == null) {
            return this.d.a(afilVar, afemVar);
        }
        if (!(afgoVar instanceof afuz)) {
            return new aftq(afgoVar, this.d, this.c.k, afilVar, afemVar);
        }
        afuy afuyVarB = ((afuz) afgoVar).b.b(afilVar);
        if (afuyVarB != null) {
            afemVar = afemVar.f(afuy.a, afuyVarB);
        }
        return this.d.a(afilVar, afemVar);
    }

    final void d(afgo afgoVar) {
        Collection collection;
        AtomicReference atomicReference = this.a;
        afgo afgoVar2 = (afgo) atomicReference.get();
        atomicReference.set(afgoVar);
        if (afgoVar2 != afun.e || (collection = this.c.y) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((afug) it.next()).j();
        }
    }
}
