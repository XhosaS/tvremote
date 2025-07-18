package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bic implements bbk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public bic(bid bidVar, Object obj, bih bihVar, int i) {
        this.d = i;
        this.b = bidVar;
        this.a = obj;
        this.c = bihVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bie, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v9, types: [dvj, java.lang.Object] */
    @Override // defpackage.bbk
    public final void a() {
        int i = this.d;
        if (i == 0) {
            ?? r0 = this.c;
            Object obj = this.a;
            bid bidVar = (bid) this.b;
            if (bidVar.d.g(obj) == r0) {
                bidVar.a(r0, bidVar.b, obj);
                return;
            }
            return;
        }
        if (i == 1) {
            Object obj2 = this.a;
            ((bje) this.c).remove(obj2);
            ((lj) this.b).d.g(obj2);
        } else {
            if (i != 2) {
                this.a.a();
                ((dve) this.b).d(this.c);
                return;
            }
            Object obj3 = this.a;
            Object obj4 = this.c;
            ((fyg) obj3).h((fwr) obj4);
            ((bje) this.b).remove(obj4);
        }
    }

    public bic(bje bjeVar, Object obj, lj ljVar, int i) {
        this.d = i;
        this.c = bjeVar;
        this.a = obj;
        this.b = ljVar;
    }

    public bic(fyg fygVar, fwr fwrVar, bje bjeVar, int i) {
        this.d = i;
        this.a = fygVar;
        this.c = fwrVar;
        this.b = bjeVar;
    }

    public bic(yjk yjkVar, dve dveVar, dvi dviVar, int i) {
        this.d = i;
        this.a = yjkVar;
        this.b = dveVar;
        this.c = dviVar;
    }
}
