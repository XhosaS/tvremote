package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwo implements qvn, qvh {
    public final qvm a;

    public qwo(qth qthVar) {
        this.a = new qvm(qthVar);
    }

    @Override // defpackage.qvh
    public final Object a() {
        return this.a.a();
    }

    @Override // defpackage.qvh
    public final boolean b() {
        return this.a.e;
    }

    @Override // defpackage.qvh
    public final void c(rdd rddVar) {
        this.a.a.add(rddVar);
    }

    @Override // defpackage.qvh
    public final void d(rdd rddVar) {
        this.a.a.remove(rddVar);
    }

    public final ImmutableList e() {
        return this.a.e();
    }

    public final void f(Object obj) {
        this.a.g(obj);
    }
}
