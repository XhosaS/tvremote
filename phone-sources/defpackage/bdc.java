package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdc extends yid implements CoroutineExceptionHandler {
    final /* synthetic */ bju a;
    final /* synthetic */ bdd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdc(bbx bbxVar, bju bjuVar, bdd bddVar) {
        super(bbxVar);
        this.a = bjuVar;
        this.b = bddVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(yil yilVar, Throwable th) throws Throwable {
        bju bjuVar = this.a;
        bdd bddVar = this.b;
        bjuVar.b(th, bddVar);
        yil yilVar2 = bddVar.c;
        bbx bbxVar = CoroutineExceptionHandler.d;
        yilVar2.get(bbxVar);
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) bddVar.b.get(bbxVar);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(yilVar, th);
    }
}
