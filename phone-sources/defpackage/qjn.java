package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjn extends yiz implements yjz {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjn(dlv dlvVar, Context context, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.e = i2;
        this.c = dlvVar;
        this.d = context;
        this.b = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((qjn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qjn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.e != 0) {
            Object obj2 = this.c;
            return new qjn((dlv) obj2, (Context) this.d, this.b, yihVar, 1);
        }
        Object obj3 = this.c;
        return new qjn((qjp) obj3, (qen) this.d, this.b, yihVar, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.e != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i == 0) {
                Object obj2 = this.c;
                Object obj3 = this.d;
                int i2 = this.b;
                dlj dljVarA = ((dlv) obj2).a();
                this.a = 1;
                if (dlj.e(dljVarA, (Context) obj3, i2, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
            return obj;
        }
        ybn.f(obj);
        Object obj4 = this.c;
        Object obj5 = this.d;
        int i3 = this.b;
        String strP = osk.P((qen) obj5, i3);
        tuv tuvVarL = qjp.a.l();
        Context context = ((qjp) obj4).b;
        tuvVarL.E("Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", context.getApplicationContext().getPackageName(), strP, new Integer(i3));
        uhp uhpVar = ((gpt) fki.aV(context).a(strP)).c;
        this.a = 1;
        Object objU = wae.U(uhpVar, this);
        return objU == yioVar2 ? yioVar2 : objU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjn(qjp qjpVar, qen qenVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.e = i2;
        this.c = qjpVar;
        this.d = qenVar;
        this.b = i;
    }
}
