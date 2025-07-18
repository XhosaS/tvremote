package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cel extends agtu implements agvd {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public cel(agsw agswVar) {
        super(4, agswVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agvd
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        cel celVar = new cel(obj4);
        celVar.b = obj2;
        celVar.c = jLongValue;
        return celVar.b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            cbx.c();
            Log.e(cen.a, "Cannot check for unfinished work", (Throwable) obj2);
            long jMin = Math.min(j * 30000, cen.b);
            this.a = 1;
            if (ahce.b(jMin, this) == agtgVar) {
                return agtgVar;
            }
        }
        return true;
    }
}
