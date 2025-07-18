package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface zbp extends Collection {
    int a(Object obj);

    int c(Object obj, int i);

    @Override // java.util.Collection, defpackage.zbp
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    boolean g(Object obj, int i);

    void h(Object obj, int i);

    Set i();

    Set j();

    @Override // java.util.Collection, defpackage.zbp
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.zbp
    int size();
}
