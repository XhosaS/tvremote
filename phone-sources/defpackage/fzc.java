package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzc<T> implements ysy<T> {
    private final ysn a;

    public fzc(ysn ysnVar) {
        ysnVar.getClass();
        this.a = ysnVar;
    }

    @Override // defpackage.ysy
    public final Object emit(T t, yih<? super ygi> yihVar) {
        Object objA = this.a.a(t, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }
}
