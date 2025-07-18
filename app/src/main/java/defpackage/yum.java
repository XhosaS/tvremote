package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yum extends yve implements zas {
    private static final long serialVersionUID = 6588350623831699109L;

    protected yum(Map map) {
        super(map);
    }

    @Override // defpackage.yve
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.yve, defpackage.zbl
    public final /* synthetic */ Collection b(Object obj) {
        return (List) super.b(obj);
    }

    @Override // defpackage.yve
    public final Collection c(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // defpackage.yve
    public final Collection d(Object obj, Collection collection) {
        return g(obj, (List) collection, null);
    }

    @Override // defpackage.zas
    public final List e(Object obj) {
        return (List) super.b(obj);
    }
}
