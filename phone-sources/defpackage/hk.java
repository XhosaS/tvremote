package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hk extends hm implements Iterator {
    final /* synthetic */ hn a;
    private hj b;
    private boolean c = true;

    public hk(hn hnVar) {
        this.a = hnVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        hj hjVar;
        if (this.c) {
            this.c = false;
            hjVar = this.a.b;
        } else {
            hj hjVar2 = this.b;
            hjVar = hjVar2 != null ? hjVar2.c : null;
        }
        this.b = hjVar;
        return this.b;
    }

    @Override // defpackage.hm
    public final void bO(hj hjVar) {
        hj hjVar2 = this.b;
        if (hjVar == hjVar2) {
            hj hjVar3 = hjVar2.d;
            this.b = hjVar3;
            this.c = hjVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        hj hjVar = this.b;
        return (hjVar == null || hjVar.c == null) ? false : true;
    }
}
