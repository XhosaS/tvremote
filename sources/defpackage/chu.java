package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chu extends chn {
    private List b;

    public chu(bzl bzlVar, boolean z) {
        super(bzlVar, z, true);
        List listE = bzlVar.isEmpty() ? Collections.EMPTY_LIST : biu.e(bzlVar.size());
        for (int i = 0; i < bzlVar.size(); i++) {
            listE.add(null);
        }
        this.b = listE;
        x();
    }

    @Override // defpackage.chn
    public final void g(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new asv(obj));
        }
    }

    @Override // defpackage.chn
    public final void i() {
        List<asv> list = this.b;
        if (list != null) {
            ArrayList arrayListE = biu.e(list.size());
            for (asv asvVar : list) {
                arrayListE.add(asvVar != null ? asvVar.a : null);
            }
            c(DesugarCollections.unmodifiableList(arrayListE));
        }
    }

    @Override // defpackage.chn
    public final void z(int i) {
        super.z(i);
        this.b = null;
    }
}
