package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxa<K, V> extends vwx<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, j$.util.Set<Map.Entry<? extends K, ? extends V>>, yli {
    private final Set a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxa(Set set) {
        super(set);
        set.getClass();
        this.a = set;
    }

    @Override // defpackage.vwx, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // defpackage.vwx, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new vwz(this.a.iterator());
    }

    @Override // defpackage.vwx, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
