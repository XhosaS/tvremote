package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxc extends vwx implements Set, j$.util.Set, yli {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxc(Collection collection) {
        super(collection);
        collection.getClass();
    }

    @Override // defpackage.vwx, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
