package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gww implements ysy, yko {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gww(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yko
    public final yfq b() {
        return this.b != 0 ? new ykq(2, this.a, gbt.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new ykh(2, this.a, gxa.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gbt, java.lang.Object] */
    @Override // defpackage.ysy
    public final /* synthetic */ Object emit(Object obj, yih yihVar) {
        if (this.b != 0) {
            Object objA = this.a.a((cvi) obj, yihVar);
            return objA == yio.a ? objA : ygi.a;
        }
        ((gxa) this.a).h((gwu) obj);
        return ygi.a;
    }

    public final boolean equals(Object obj) {
        if (this.b != 0) {
            if ((obj instanceof ysy) && (obj instanceof yko)) {
                return yks.e(b(), ((yko) obj).b());
            }
            return false;
        }
        if ((obj instanceof ysy) && (obj instanceof yko)) {
            return yks.e(b(), ((yko) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.b != 0 ? b().hashCode() : b().hashCode();
    }
}
