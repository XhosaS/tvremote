package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yst extends AbstractQueue {
    final yuh a = new ysr();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yuh peek() {
        yuh yuhVar = this.a;
        yuh yuhVar2 = ((ysr) yuhVar).a;
        if (yuhVar2 == yuhVar) {
            return null;
        }
        return yuhVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        yuh yuhVar = this.a;
        ysr ysrVar = (ysr) yuhVar;
        yuh yuhVar2 = ysrVar.a;
        while (yuhVar2 != yuhVar) {
            yuh yuhVarF = yuhVar2.f();
            yug.g(yuhVar2);
            yuhVar2 = yuhVarF;
        }
        ysrVar.a = yuhVar;
        ysrVar.b = yuhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((yuh) obj).f() != ytl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        yuh yuhVar = this.a;
        return ((ysr) yuhVar).a == yuhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yss(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        yuh yuhVar = (yuh) obj;
        yug.e(yuhVar.h(), yuhVar.f());
        yuh yuhVar2 = this.a;
        yug.e(((ysr) yuhVar2).b, yuhVar);
        yug.e(yuhVar, yuhVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        yuh yuhVar = this.a;
        yuh yuhVar2 = ((ysr) yuhVar).a;
        if (yuhVar2 == yuhVar) {
            return null;
        }
        remove(yuhVar2);
        return yuhVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        yuh yuhVar = (yuh) obj;
        yuh yuhVarH = yuhVar.h();
        yuh yuhVarF = yuhVar.f();
        yug.e(yuhVarH, yuhVarF);
        yug.g(yuhVar);
        return yuhVarF != ytl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        yuh yuhVar = this.a;
        int i = 0;
        for (yuh yuhVarF = ((ysr) yuhVar).a; yuhVarF != yuhVar; yuhVarF = yuhVarF.f()) {
            i++;
        }
        return i;
    }
}
