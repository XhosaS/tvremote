package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oza {
    public final List a(oxp oxpVar) {
        oxpVar.getClass();
        Collection<ozl> collectionD = oxpVar.d();
        ArrayList arrayList = new ArrayList(agqq.i(collectionD, 10));
        for (ozl ozlVar : collectionD) {
            arrayList.add(ozlVar.o(ozlVar.k()));
        }
        return arrayList;
    }
}
