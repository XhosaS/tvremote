package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afxu {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final afyd f;
    final boolean g;
    final boolean h;

    public afxu(List list, Collection collection, Collection collection2, afyd afydVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = afydVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        yqw.M(!z2 || list == null, "passThrough should imply buffer is null");
        yqw.M((z2 && afydVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        yqw.M(!z2 || (collection.size() == 1 && collection.contains(afydVar)) || (collection.size() == 0 && afydVar.b), "passThrough should imply winningSubstream is drained");
        yqw.M((z && afydVar == null) ? false : true, "cancelled should imply committed");
    }

    final afxu a(afyd afydVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        yqw.M(!z, "hedging frozen");
        afyd afydVar2 = this.f;
        yqw.M(afydVar2 == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(afydVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(afydVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new afxu(this.b, this.c, collectionUnmodifiableCollection, afydVar2, this.g, this.a, z, this.e + 1);
    }

    final afxu b() {
        return this.h ? this : new afxu(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final afxu c(afyd afydVar) {
        Collection collectionUnmodifiableCollection;
        yqw.M(!this.a, "Already passThrough");
        if (afydVar.b) {
            collectionUnmodifiableCollection = this.c;
        } else {
            Collection collection = this.c;
            if (collection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(afydVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(afydVar);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collectionUnmodifiableCollection;
        afyd afydVar2 = this.f;
        boolean z = afydVar2 != null;
        List list = this.b;
        if (z) {
            yqw.M(afydVar2 == afydVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new afxu(list, collection2, this.d, afydVar2, this.g, z, this.h, this.e);
    }
}
