package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bil implements yjv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bil(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, uhp] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        long j;
        switch (this.b) {
            case 0:
                bja bjaVar = (bja) obj;
                synchronized (bjb.b) {
                    j = bjb.d;
                    bjb.d = 1 + j;
                }
                return new bir(j, bjaVar, this.a);
            case 1:
                return this.a.a(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 2:
                this.a.cancel(false);
                return ygi.a;
            case 3:
                ((ysa) this.a).b(null);
                return ygi.a;
            case 4:
                Object obj2 = this.a;
                synchronized (((dsl) obj2).d) {
                    ((dsl) obj2).e = 5;
                    ((dsl) obj2).g = null;
                }
                return ygi.a;
            case 5:
                Object obj3 = ((Object[]) this.a)[((Number) obj).intValue()];
                if (obj3 != null) {
                    return (Byte) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            case 6:
                this.a.get(((Number) obj).intValue());
                return null;
            case 7:
                this.a.get(((Number) obj).intValue());
                return null;
            case 8:
                this.a.get(((Number) obj).intValue());
                return null;
            case 9:
                this.a.get(((Number) obj).intValue());
                return null;
            case 10:
                this.a.get(((Number) obj).intValue());
                return null;
            case 11:
                ?? r6 = this.a;
                ygi ygiVar = ygi.a;
                r6.resumeWith(ygiVar);
                return ygiVar;
            default:
                this.a.cancel(false);
                return ygi.a;
        }
    }
}
