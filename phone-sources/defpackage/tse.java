package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tse<T> extends tsg<T, T> implements Serializable {
    static final tsg a = new tse();
    private static final long serialVersionUID = 0;

    private tse() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.tsg
    public final <S> tsg<T, S> doAndThen(tsg<T, S> tsgVar) {
        tsgVar.getClass();
        return tsgVar;
    }

    public final String toString() {
        return "Converter.identity()";
    }

    @Override // defpackage.tsg
    public final /* bridge */ /* synthetic */ tsg reverse() {
        return this;
    }

    @Override // defpackage.tsg
    protected final T doBackward(T t) {
        return t;
    }

    @Override // defpackage.tsg
    protected final T doForward(T t) {
        return t;
    }
}
