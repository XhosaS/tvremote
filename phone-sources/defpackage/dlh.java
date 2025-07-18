package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlh extends yiz implements ykb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlh(Bundle bundle, yih yihVar) {
        super(4, yihVar);
        this.c = bundle;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        dlh dlhVar = new dlh(this.c, (yih) obj4);
        dlhVar.b = (dki) obj2;
        return dlhVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.b;
            Bundle bundle = this.c;
            this.a = 1;
            Object objO = ((dsn) obj2).o(new dkb(bundle), this);
            if (objO != yioVar) {
                objO = ygi.a;
            }
            if (objO == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
