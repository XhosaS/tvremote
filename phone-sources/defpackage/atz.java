package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atz extends yiz implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atz(gj gjVar, boolean z, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.b = gjVar;
        this.a = z;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((atz) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((atz) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((atz) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.c;
        if (i == 0) {
            return new atz(this.a, (bmh) this.b, yihVar, 0);
        }
        if (i != 1) {
            return new atz(this.a, (yol) this.b, yihVar, 2);
        }
        return new atz((gj) this.b, this.a, yihVar, 1);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ft ftVar;
        int i = this.c;
        if (i == 0) {
            ybn.f(obj);
            if (this.a) {
                ((bmh) this.b).d(false);
            }
            return ygi.a;
        }
        if (i != 1) {
            ybn.f(obj);
            if (this.a) {
                ((yql) this.b).S(ygi.a);
            }
            return ygi.a;
        }
        ybn.f(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (!z) {
            gj gjVar = (gj) obj2;
            if (!gjVar.e && ((fv) obj2).b && (ftVar = gjVar.f) != null) {
                ftVar.a();
            }
        }
        ((fv) obj2).g(z);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atz(boolean z, bmh bmhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = z;
        this.b = bmhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atz(boolean z, yol yolVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = z;
        this.b = yolVar;
    }
}
