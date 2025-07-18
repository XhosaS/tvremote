package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwa extends rdd {
    final /* synthetic */ qwb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwa(qwb qwbVar) {
        super(null, null, null);
        this.a = qwbVar;
    }

    @Override // defpackage.rdd
    public final void a() {
        this.a.d();
    }

    @Override // defpackage.rdd
    public final void b(Object obj) {
        qwb qwbVar = this.a;
        qwbVar.d();
        qwbVar.a(obj);
    }

    @Override // defpackage.rdd
    public final void c(ImmutableList immutableList) {
        this.a.b();
    }
}
