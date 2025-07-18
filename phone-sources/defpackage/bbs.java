package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbs implements yjv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bbs(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, uhp] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        long j;
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.a;
            synchronized (((bbt) obj3).a) {
                ((bbt) obj3).b.remove(obj2);
            }
            return ygi.a;
        }
        if (i == 1) {
            ((akb) this.b).a.c.n(this.a);
            return ygi.a;
        }
        if (i == 2) {
            bja bjaVar = (bja) obj;
            synchronized (bjb.b) {
                j = bjb.d;
                bjb.d = 1 + j;
            }
            return new bin(j, bjaVar, this.a, this.b);
        }
        if (i != 3) {
            int iIntValue = ((Number) obj).intValue();
            return this.b.a(Integer.valueOf(iIntValue), this.a.get(iIntValue));
        }
        Throwable th = (Throwable) obj;
        if (th instanceof gru) {
            ((gpm) this.a).j(((gru) th).a);
        }
        this.b.cancel(false);
        return ygi.a;
    }

    public bbs(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
