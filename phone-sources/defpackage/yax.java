package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yax {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final yaz f;
    final boolean g;
    final boolean h;

    public yax(List list, Collection collection, Collection collection2, yaz yazVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = yazVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        sij.x(!z2 || list == null, "passThrough should imply buffer is null");
        sij.x((z2 && yazVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        sij.x(!z2 || (collection.size() == 1 && collection.contains(yazVar)) || (collection.size() == 0 && yazVar.b), "passThrough should imply winningSubstream is drained");
        sij.x((z && yazVar == null) ? false : true, "cancelled should imply committed");
    }

    final yax a(yaz yazVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        sij.x(!z, "hedging frozen");
        yaz yazVar2 = this.f;
        sij.x(yazVar2 == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(yazVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(yazVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new yax(this.b, this.c, collectionUnmodifiableCollection, yazVar2, this.g, this.a, z, this.e + 1);
    }

    final yax b() {
        return this.h ? this : new yax(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final yax c(yaz yazVar) {
        Collection collectionUnmodifiableCollection;
        sij.x(!this.a, "Already passThrough");
        if (yazVar.b) {
            collectionUnmodifiableCollection = this.c;
        } else {
            Collection collection = this.c;
            if (collection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(yazVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(yazVar);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collectionUnmodifiableCollection;
        yaz yazVar2 = this.f;
        boolean z = yazVar2 != null;
        List list = this.b;
        if (z) {
            sij.x(yazVar2 == yazVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new yax(list, collection2, this.d, yazVar2, this.g, z, this.h, this.e);
    }
}
