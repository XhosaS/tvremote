package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugf extends ufq {
    private List b;

    public ugf(ImmutableCollection immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        List listNewArrayListWithCapacity = immutableCollection.isEmpty() ? Collections.EMPTY_LIST : Lists.newArrayListWithCapacity(immutableCollection.size());
        for (int i = 0; i < immutableCollection.size(); i++) {
            listNewArrayListWithCapacity.add(null);
        }
        this.b = listNewArrayListWithCapacity;
        v();
    }

    @Override // defpackage.ufq
    public final void h(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new ulp(obj));
        }
    }

    @Override // defpackage.ufq
    public final void j() {
        List<ulp> list = this.b;
        if (list != null) {
            ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            for (ulp ulpVar : list) {
                arrayListNewArrayListWithCapacity.add(ulpVar != null ? ulpVar.a : null);
            }
            b(DesugarCollections.unmodifiableList(arrayListNewArrayListWithCapacity));
        }
    }

    @Override // defpackage.ufq
    public final void x(int i) {
        super.x(i);
        this.b = null;
    }
}
