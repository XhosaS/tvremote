package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abv extends yiz implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abv(aan aanVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.c = i2;
        this.b = aanVar;
        this.a = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((abv) create((vc) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((abv) create((vc) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.c != 0) {
            return new abv((aan) this.b, this.a, yihVar, 1);
        }
        return new abv((abw) this.b, this.a, yihVar, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.c != 0) {
            ybn.f(obj);
            aan aanVar = (aan) this.b;
            aal aalVar = aanVar.e;
            int iA = aalVar.a();
            int i = this.a;
            if (iA != i || aalVar.b() != 0) {
                aanVar.j.c();
            }
            aalVar.e(i, 0);
            aalVar.b = null;
            bys bysVar = aanVar.p;
            if (bysVar != null) {
                bysVar.B();
            }
            return ygi.a;
        }
        ybn.f(obj);
        abw abwVar = (abw) this.b;
        abp abpVar = abwVar.d;
        int iA2 = abpVar.a();
        int i2 = this.a;
        if (iA2 != i2 || abpVar.b() != 0) {
            abwVar.i.c();
        }
        abpVar.e(i2, 0);
        abpVar.b = null;
        bys bysVar2 = abwVar.o;
        if (bysVar2 != null) {
            bysVar2.B();
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abv(abw abwVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.c = i2;
        this.b = abwVar;
        this.a = i;
    }
}
