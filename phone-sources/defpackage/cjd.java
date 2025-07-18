package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjd {
    private static final CoroutineExceptionHandler c = new cjc(CoroutineExceptionHandler.d);
    public yow a;
    public final dfb b;

    public cjd() {
        this(null, 3);
    }

    public /* synthetic */ cjd(dfb dfbVar, int i) {
        dfbVar = (i & 1) != 0 ? new dfb((char[]) null) : dfbVar;
        yim yimVar = yim.a;
        this.b = dfbVar;
        yil yilVarPlus = c.plus(cky.a).plus(yimVar);
        yimVar.get(yqe.c);
        this.a = yoz.l(yilVarPlus.plus(new yqy(null)));
    }
}
