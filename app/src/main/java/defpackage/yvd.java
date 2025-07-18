package defpackage;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yvd extends yva implements Set {
    final /* synthetic */ yve f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvd(yve yveVar, Object obj, Set set) {
        super(yveVar, obj, set, null);
        this.f = yveVar;
    }

    @Override // defpackage.yva, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zG = Sets.g((Set) this.b, collection);
        if (zG) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zG;
    }
}
