package defpackage;

import com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmm extends yiv {
    public /* synthetic */ Object a;
    final /* synthetic */ WorkerWrapper b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmm(WorkerWrapper workerWrapper, yih yihVar) {
        super(yihVar);
        this.b = workerWrapper;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
