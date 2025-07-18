package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywd<T> implements ysy<T> {
    private final ysn a;

    public ywd(ysn ysnVar) {
        this.a = ysnVar;
    }

    @Override // defpackage.ysy
    public final Object emit(T t, yih<? super ygi> yihVar) {
        Object objA = this.a.a(t, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }
}
