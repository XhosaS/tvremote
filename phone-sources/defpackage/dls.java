package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dls extends yiz implements yjz {
    int a;
    final /* synthetic */ dlv b;
    final /* synthetic */ Context c;
    final /* synthetic */ int d;
    final /* synthetic */ Bundle e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dls(dlv dlvVar, Context context, int i, Bundle bundle, yih yihVar) {
        super(2, yihVar);
        this.b = dlvVar;
        this.c = context;
        this.d = i;
        this.e = bundle;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dls) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dls dlsVar = new dls(this.b, this.c, this.d, this.e, yihVar);
        dlsVar.f = obj;
        return dlsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object objC;
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar = (yow) this.f;
            dlv dlvVar = this.b;
            Context context = this.c;
            dlvVar.b(yowVar, context);
            int i2 = this.d;
            Bundle bundle = this.e;
            dlj dljVarA = dlvVar.a();
            this.a = 1;
            if (Build.VERSION.SDK_INT > 31 || (objC = dljVarA.c(context, new djz(i2), bundle, new dlh(bundle, null), this)) != yioVar) {
                objC = ygi.a;
            }
            if (objC == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
