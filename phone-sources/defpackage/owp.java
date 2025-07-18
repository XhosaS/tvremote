package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owp implements xqc {
    private static final owo a = new owo();
    private final utc b;

    public owp(utc utcVar) {
        this.b = utcVar;
    }

    @Override // defpackage.xqc
    public final xqb a(xsq xsqVar, xpy xpyVar, xpz xpzVar) {
        owo owoVar = a;
        xpx xpxVar = xud.c;
        Collection collection = (Collection) xpyVar.g(xpxVar);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        utc utcVar = this.b;
        arrayList.add(owoVar);
        return utcVar.a(xsqVar, xpyVar.f(xpxVar, DesugarCollections.unmodifiableList(arrayList)), xpzVar);
    }
}
