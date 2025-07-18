package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu implements CoroutineExceptionHandler, bda {
    private final yil a;
    private final yjz b;
    private final yow c;
    private yqe e;

    public bbu(yil yilVar, yjz yjzVar) {
        this.a = yilVar;
        this.b = yjzVar;
        this.c = yoz.l(yilVar.plus(yilVar.get(bju.a) != null ? this : yim.a));
    }

    @Override // defpackage.bda
    public final void cb() {
        yqe yqeVar = this.e;
        if (yqeVar != null) {
            yoz.y(yqeVar, "Old job was still running!", null);
        }
        this.e = ykr.q(this.c, null, 0, this.b, 3);
    }

    @Override // defpackage.bda
    public final void dI() {
        yqe yqeVar = this.e;
        if (yqeVar != null) {
            yqeVar.t(new bbw());
        }
        this.e = null;
    }

    @Override // defpackage.bda
    public final void dJ() {
        yqe yqeVar = this.e;
        if (yqeVar != null) {
            yqeVar.t(new bbw());
        }
        this.e = null;
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        return (E) wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final yik<?> getKey() {
        return CoroutineExceptionHandler.d;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(yil yilVar, Throwable th) throws Throwable {
        bju bjuVar = (bju) yilVar.get(bju.a);
        if (bjuVar != null) {
            bjuVar.b(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.a.get(CoroutineExceptionHandler.d);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(yilVar, th);
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }
}
