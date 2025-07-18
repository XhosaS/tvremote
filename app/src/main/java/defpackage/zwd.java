package defpackage;

import com.google.common.collect.Lists;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwd extends zwf {
    public zwd(yxy yxyVar, boolean z) {
        super(yxyVar, z);
        u();
    }

    @Override // defpackage.zwf
    public final /* bridge */ /* synthetic */ Object x(List list) {
        ArrayList arrayListA = Lists.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zwe zweVar = (zwe) it.next();
            arrayListA.add(zweVar != null ? zweVar.a : null);
        }
        return DesugarCollections.unmodifiableList(arrayListA);
    }
}
