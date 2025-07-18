package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsv extends yiv {
    public /* synthetic */ Object a;
    final /* synthetic */ SessionWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsv(SessionWorker sessionWorker, yih yihVar) {
        super(yihVar);
        this.b = sessionWorker;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
