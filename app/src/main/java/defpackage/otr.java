package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otr implements afer {
    private static final otq a = new otq();
    private final otx b;

    public otr(otx otxVar) {
        this.b = otxVar;
    }

    @Override // defpackage.afer
    public final afeq a(afil afilVar, afem afemVar, afen afenVar) {
        otq otqVar = a;
        afel afelVar = afmm.c;
        Collection collection = (Collection) afemVar.h(afelVar);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        otx otxVar = this.b;
        arrayList.add(otqVar);
        return otxVar.a(afilVar, afemVar.f(afelVar, DesugarCollections.unmodifiableList(arrayList)), afenVar);
    }
}
