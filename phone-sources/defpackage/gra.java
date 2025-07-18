package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gra extends yiz implements ykb {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public gra(yih yihVar) {
        super(4, yihVar);
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        gra graVar = new gra((yih) obj4);
        graVar.b = (Throwable) obj2;
        graVar.c = jLongValue;
        return graVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            gpn.b();
            Log.e(grc.a, "Cannot check for unfinished work", (Throwable) obj2);
            long jMin = Math.min(j * 30000, grc.b);
            this.a = 1;
            if (yoz.f(jMin, this) == yioVar) {
                return yioVar;
            }
        }
        return true;
    }
}
