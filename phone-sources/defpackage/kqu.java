package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqu implements xcm {
    private final kqf a;
    private final /* synthetic */ int b;

    public kqu(kqf kqfVar, int i) {
        this.b = i;
        this.a = kqfVar;
    }

    public static idr c(kqf kqfVar) {
        idr idrVar = kqfVar.i;
        idrVar.getClass();
        return idrVar;
    }

    public final idr a() {
        if (this.b != 0) {
            return c(this.a);
        }
        idr idrVar = this.a.f;
        idrVar.getClass();
        return idrVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }
}
