package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yze extends yvu implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient yyr map;
    final transient int size;

    public yze(yyr yyrVar, int i) {
        this.map = yyrVar;
        this.size = i;
    }

    @Override // defpackage.zbl
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.yvl
    public final /* synthetic */ Collection f() {
        return new yzc(this);
    }

    @Override // defpackage.yvl
    public final Map h() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.yvl
    public final Set i() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.zbl
    @Deprecated
    public final void j() {
        throw null;
    }

    @Override // defpackage.yvl, defpackage.zbl
    @Deprecated
    public final void l(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.yvl, defpackage.zbl
    public /* synthetic */ Map m() {
        return this.map;
    }

    @Override // defpackage.yvl, defpackage.zbl
    public final /* bridge */ /* synthetic */ Set n() {
        throw null;
    }
}
