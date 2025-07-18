package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yue extends AbstractQueue {
    final yuh a = new yuc();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yuh peek() {
        yuh yuhVar = this.a;
        yuh yuhVar2 = ((yuc) yuhVar).a;
        if (yuhVar2 == yuhVar) {
            return null;
        }
        return yuhVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        yuh yuhVar = this.a;
        yuc yucVar = (yuc) yuhVar;
        yuh yuhVar2 = yucVar.a;
        while (yuhVar2 != yuhVar) {
            yuh yuhVarG = yuhVar2.g();
            yug.h(yuhVar2);
            yuhVar2 = yuhVarG;
        }
        yucVar.a = yuhVar;
        yucVar.b = yuhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((yuh) obj).g() != ytl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        yuh yuhVar = this.a;
        return ((yuc) yuhVar).a == yuhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yud(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        yuh yuhVar = (yuh) obj;
        yug.f(yuhVar.i(), yuhVar.g());
        yuh yuhVar2 = this.a;
        yug.f(((yuc) yuhVar2).b, yuhVar);
        yug.f(yuhVar, yuhVar2);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        yuh yuhVar = this.a;
        yuh yuhVar2 = ((yuc) yuhVar).a;
        if (yuhVar2 == yuhVar) {
            return null;
        }
        remove(yuhVar2);
        return yuhVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        yuh yuhVar = (yuh) obj;
        yuh yuhVarI = yuhVar.i();
        yuh yuhVarG = yuhVar.g();
        yug.f(yuhVarI, yuhVarG);
        yug.h(yuhVar);
        return yuhVarG != ytl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        yuh yuhVar = this.a;
        int i = 0;
        for (yuh yuhVarG = ((yuc) yuhVar).a; yuhVarG != yuhVar; yuhVarG = yuhVarG.g()) {
            i++;
        }
        return i;
    }
}
