package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yix extends yit {
    public yix(yih yihVar) {
        super(yihVar);
        if (yihVar != null && yihVar.getContext() != yim.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return yim.a;
    }
}
