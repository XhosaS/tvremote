package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybr implements xzo {
    private final /* synthetic */ int a;
    private final Object b;

    public ybr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ybp] */
    @Override // defpackage.xzo
    public final Object a() {
        return this.a != 0 ? this.b : ybq.a(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ybp] */
    @Override // defpackage.xzo
    public final void b(Object obj) throws Throwable {
        if (this.a != 0) {
            return;
        }
        ybq.d(this.b, obj);
    }
}
