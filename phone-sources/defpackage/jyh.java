package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jyh implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ jyh(mdw mdwVar, bcb bcbVar, bcb bcbVar2, jyb jybVar, by byVar, gi giVar, int i) {
        this.g = i;
        this.f = mdwVar;
        this.a = bcbVar;
        this.b = bcbVar2;
        this.c = jybVar;
        this.d = byVar;
        this.e = giVar;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [bvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        if (this.g == 0) {
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            Object obj2 = this.f;
            mdw mdwVar = (mdw) obj2;
            if (mdwVar.q() == 1) {
                this.a.b(true);
                return ygi.a;
            }
            Object obj3 = this.c;
            ?? r4 = this.b;
            mdwVar.n(zBooleanValue);
            r4.b(bool);
            if (!((jyb) obj3).a) {
                mdwVar.m((by) this.d, (gi) this.e, new ikc(obj2, obj3, (Object) r4, 10, (char[]) null));
            }
            return ygi.a;
        }
        bwi bwiVar = (bwi) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            bwj[] bwjVarArr = (bwj[]) this.c;
            if (i >= bwjVarArr.length) {
                return ygi.a;
            }
            Object obj4 = this.d;
            Object obj5 = this.f;
            Object obj6 = this.b;
            ?? r6 = this.e;
            ?? r7 = this.a;
            bwj bwjVar = bwjVarArr[i];
            bwjVar.getClass();
            xo.c(bwiVar, bwjVar, (bvs) r7.get(i2), r6.n(), ((yld) obj6).a, ((yld) obj5).a, ((xq) obj4).a);
            i++;
            i2++;
        }
    }

    public /* synthetic */ jyh(bwj[] bwjVarArr, List list, bvv bvvVar, yld yldVar, yld yldVar2, xq xqVar, int i) {
        this.g = i;
        this.c = bwjVarArr;
        this.a = list;
        this.e = bvvVar;
        this.b = yldVar;
        this.f = yldVar2;
        this.d = xqVar;
    }
}
