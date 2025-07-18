package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zr extends zu {
    private final List o;
    private final Map p;

    public zr(zt ztVar, String str, String str2) {
        super(ztVar, str, str2, false);
        this.o = new ArrayList();
        this.p = new lz();
    }

    final void a(Collection collection) {
        this.n.clear();
        List list = this.o;
        list.clear();
        Map map = this.p;
        map.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dln dlnVar = (dln) it.next();
            zu zuVarB = this.a.b(((zf) dlnVar.b).n());
            if (zuVarB != null) {
                list.add(zuVarB);
                map.put(zuVarB.c, dlnVar);
                int i = dlnVar.a;
                if (i == 2 || i == 3) {
                    this.n.add(zuVarB);
                }
            }
        }
        zv.a().a.a(259, this);
    }
}
