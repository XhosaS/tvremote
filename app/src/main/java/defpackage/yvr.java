package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yvr extends yve implements zcu {
    private static final long serialVersionUID = 7431625294878419160L;

    protected yvr(Map map) {
        super(map);
    }

    @Override // defpackage.yve
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.yve, defpackage.zbl
    public final /* synthetic */ Collection b(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // defpackage.yve
    public final Collection d(Object obj, Collection collection) {
        return new yvd(this, obj, (Set) collection);
    }

    @Override // defpackage.yve, defpackage.yvl, defpackage.zbl
    public final void l(Object obj, Object obj2) {
        throw null;
    }
}
