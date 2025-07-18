package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytc extends ysp {
    final /* synthetic */ yug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytc(yug yugVar) {
        super(yugVar);
        this.b = yugVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        yug yugVar;
        Object obj2;
        if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (yugVar = this.b).get(key)) != null) {
            if (yugVar.i.c(entry.getValue(), obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ytb(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.b.remove(key, entry.getValue());
    }
}
