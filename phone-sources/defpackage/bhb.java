package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhb<K, V> extends ygk<V> implements Collection<V>, j$.util.Collection<V>, yli {
    private final bgu a;

    public bhb(bgu bguVar) {
        this.a = bguVar;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        bhd[] bhdVarArr = new bhd[8];
        for (int i = 0; i < 8; i++) {
            bhdVarArr[i] = new bhh();
        }
        return new bgv(this.a.b, bhdVarArr);
    }
}
