package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpt extends agtu implements agvb {
    int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ gpx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpt(Intent intent, gpx gpxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = intent;
        this.c = gpxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gpt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            IntentFilter intentFilter = gpx.a;
            gpx gpxVar = this.c;
            this.a = 1;
            if (gpxVar.b(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gpt(this.b, this.c, agswVar);
    }
}
