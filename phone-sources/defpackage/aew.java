package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aew implements yjk {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aew(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yuj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjk
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            ahy ahyVar = afc.a;
            if (this.a) {
                this.b.eV(ygi.a);
            }
            return ygi.a;
        }
        if (i == 1) {
            this.b.a(Boolean.valueOf(!this.a));
            return ygi.a;
        }
        boolean z = this.a;
        jiv jivVar = (jiv) this.b;
        jivVar.s(z);
        jivVar.s(!z);
        return ygi.a;
    }

    public /* synthetic */ aew(boolean z, yuj yujVar, int i) {
        this.c = i;
        this.a = z;
        this.b = yujVar;
    }
}
