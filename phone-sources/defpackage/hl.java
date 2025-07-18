package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hl extends hm implements Iterator {
    hj a;
    hj b;

    public hl(hj hjVar, hj hjVar2) {
        this.a = hjVar2;
        this.b = hjVar;
    }

    private final hj d() {
        hj hjVar = this.b;
        hj hjVar2 = this.a;
        if (hjVar == hjVar2 || hjVar2 == null) {
            return null;
        }
        return b(hjVar);
    }

    public abstract hj a(hj hjVar);

    public abstract hj b(hj hjVar);

    @Override // defpackage.hm
    public final void bO(hj hjVar) {
        if (this.a == hjVar && hjVar == this.b) {
            this.b = null;
            this.a = null;
        }
        hj hjVar2 = this.a;
        if (hjVar2 == hjVar) {
            this.a = a(hjVar2);
        }
        if (this.b == hjVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        hj hjVar = this.b;
        this.b = d();
        return hjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
