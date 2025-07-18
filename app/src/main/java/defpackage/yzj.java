package defpackage;

import com.google.common.collect.Sets;
import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yzj extends yzk implements Collection, zbp {
    private static final long serialVersionUID = 912559;
    private transient yyk b;
    private transient yzq c;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        zdl it = j().iterator();
        while (it.hasNext()) {
            zbo zboVar = (zbo) it.next();
            Arrays.fill(objArr, i, zboVar.a() + i, zboVar.b());
            i += zboVar.a();
        }
        return i;
    }

    @Override // defpackage.zbp
    @Deprecated
    public final int c(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return zbu.a(this, obj);
    }

    @Override // defpackage.yxy
    public final yyk f() {
        yyk yykVar = this.b;
        if (yykVar != null) {
            return yykVar;
        }
        yyk yykVarF = super.f();
        this.b = yykVarF;
        return yykVarF;
    }

    @Override // defpackage.zbp
    @Deprecated
    public final boolean g(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.zbp
    @Deprecated
    public final void h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Sets.a(j());
    }

    @Override // defpackage.zbp
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final zdl iterator() {
        return new yzf(j().iterator());
    }

    /* renamed from: n */
    public abstract yzq i();

    @Override // defpackage.zbp
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final yzq j() {
        yzq yzhVar = this.c;
        if (yzhVar == null) {
            yzhVar = isEmpty() ? zcp.b : new yzh(this);
            this.c = yzhVar;
        }
        return yzhVar;
    }

    public abstract zbo p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.yxy
    public abstract Object writeReplace();
}
