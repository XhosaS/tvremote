package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ugy extends ugw implements uhp {
    protected ugy() {
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        delegate().c(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugw
    /* renamed from: g */
    public /* bridge */ /* synthetic */ Future delegate() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ugw, com.google.common.collect.ForwardingObject
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract uhp delegate();
}
