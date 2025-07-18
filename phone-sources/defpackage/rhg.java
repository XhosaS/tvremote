package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rhg implements qvs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rhg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rhu] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, rhu] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, qvs] */
    @Override // defpackage.qvs
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.a().run();
            ((qwn) this.b).b.f(obj);
        } else {
            if (i == 1) {
                ((qvx) this.a).d = true;
                this.b.a(obj);
                return;
            }
            int i2 = rhp.t;
            this.a.a().run();
            qwn qwnVar = (qwn) this.b;
            Runnable runnable = qwnVar.e.o;
            qwnVar.b.f(obj);
        }
    }
}
