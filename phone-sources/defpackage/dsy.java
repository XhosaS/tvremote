package defpackage;

import android.content.Context;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsy extends yid implements CoroutineExceptionHandler {
    final /* synthetic */ dsn a;
    final /* synthetic */ Context b;
    final /* synthetic */ dti c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsy(bbx bbxVar, dti dtiVar, dsn dsnVar, Context context) {
        super(bbxVar);
        this.c = dtiVar;
        this.a = dsnVar;
        this.b = context;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(yil yilVar, Throwable th) {
        dti dtiVar = this.c;
        ykr.q(dtiVar, null, 0, new ajo(this.a, this.b, th, dtiVar, (yih) null, 6), 3);
    }
}
