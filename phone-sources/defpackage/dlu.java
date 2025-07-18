package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlu extends yiz implements yjz {
    int a;
    final /* synthetic */ dlv b;
    final /* synthetic */ Context c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlu(dlv dlvVar, Context context, int i, String str, yih yihVar) {
        super(2, yihVar);
        this.b = dlvVar;
        this.c = context;
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dlu dluVar = new dlu(this.b, this.c, this.d, this.e, yihVar);
        dluVar.f = obj;
        return dluVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar = (yow) this.f;
            dlv dlvVar = this.b;
            Context context = this.c;
            dlvVar.b(yowVar, context);
            int i2 = this.d;
            String str = this.e;
            dlj dljVarA = dlvVar.a();
            this.a = 1;
            Object objC = dljVarA.c(context, new djz(i2), null, new dli(str, null), this);
            if (objC != yioVar) {
                objC = ygi.a;
            }
            if (objC == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
