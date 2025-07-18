package defpackage;

import j$.util.Set;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhj<E> extends ygv<E> implements Set<E>, java.util.Set, Collection, yli {
    public static final bhj a;
    public final Object b;
    public final Object c;
    public final bgu d;

    static {
        bhm bhmVar = bhm.a;
        a = new bhj(bhmVar, bhmVar, bgu.a);
    }

    public bhj(Object obj, Object obj2, bgu bguVar) {
        this.b = obj;
        this.c = obj2;
        this.d = bguVar;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.ygv, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new bhk(this.b, this.d);
    }
}
