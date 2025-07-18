package defpackage;

import androidx.work.CoroutineWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cat extends agtu implements agvb {
    int a;
    final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cat(CoroutineWorker coroutineWorker, agsw agswVar) {
        super(2, agswVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cat) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        CoroutineWorker coroutineWorker = this.b;
        this.a = 1;
        Object objC = coroutineWorker.c(this);
        return objC == agtgVar ? agtgVar : objC;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cat(this.b, agswVar);
    }
}
