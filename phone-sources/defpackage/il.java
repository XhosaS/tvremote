package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class il extends AbstractSet {
    final /* synthetic */ ir a;

    public il(ir irVar) {
        this.a = irVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new io(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.d;
    }
}
