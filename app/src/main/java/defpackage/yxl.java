package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxl extends yxr implements Serializable {
    private static final long serialVersionUID = 0;
    public final Queue a;
    final int b;

    public yxl(int i) {
        this.a = new ArrayDeque(i);
        this.b = i;
    }

    @Override // defpackage.yxr, defpackage.yxp
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.yxp, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (size() == this.b) {
            this.a.remove();
        }
        this.a.add(obj);
        return true;
    }

    @Override // defpackage.yxp, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.b;
        if (size < i) {
            return zar.j(this, collection.iterator());
        }
        clear();
        collection.getClass();
        int i2 = size - i;
        yqw.B(i2 >= 0, "number to skip cannot be negative");
        return zag.i(this, new zac(collection, i2));
    }

    @Override // defpackage.yxr
    protected final Queue b() {
        return this.a;
    }

    @Override // defpackage.yxp, defpackage.yxq
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.yxr, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
