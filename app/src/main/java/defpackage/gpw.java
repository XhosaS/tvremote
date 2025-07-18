package defpackage;

import android.content.IntentFilter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpw extends agtu implements agvb {
    int a;
    final /* synthetic */ gpx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpw(gpx gpxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gpxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gpw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gpx gpxVar = this.b;
            List listE = gpxVar.e();
            gpxVar.f(listE);
            this.a = 1;
            if (gpxVar.d(listE, this) == agtgVar) {
                return agtgVar;
            }
        }
        IntentFilter intentFilter = gpx.a;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gpw(this.b, agswVar);
    }
}
