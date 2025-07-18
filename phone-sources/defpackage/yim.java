package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yim implements Serializable, yil {
    public static final yim a = new yim();
    private static final long serialVersionUID = 0;

    private yim() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        yikVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        yikVar.getClass();
        return this;
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        yilVar.getClass();
        return yilVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return r;
    }
}
