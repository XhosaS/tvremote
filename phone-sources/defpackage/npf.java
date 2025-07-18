package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class npf extends LruCache {
    final /* synthetic */ nph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npf(nph nphVar) {
        super(20);
        this.a = nphVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            this.a.g.add(num);
        }
    }
}
