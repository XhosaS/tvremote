package defpackage;

import androidx.work.CoroutineWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cas extends agtu implements agvb {
    int a;
    final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cas(CoroutineWorker coroutineWorker, agsw agswVar) {
        super(2, agswVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        agsw agswVarC = c((ahbt) obj, (agsw) obj2);
        agpu agpuVar = agpu.a;
        ((cas) agswVarC).b(agpuVar);
        return agpuVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        throw new IllegalStateException("Not implemented");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cas(this.b, agswVar);
    }
}
