package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amt implements yjk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ amt(int i, bcb bcbVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = bcbVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return Integer.valueOf(((aml) this.b).d.g(this.a));
        }
        if (i != 1) {
            jxl.a(this.b, Integer.valueOf(this.a));
            return ygi.a;
        }
        ((ajq) this.b).A(this.a);
        return true;
    }

    public /* synthetic */ amt(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
