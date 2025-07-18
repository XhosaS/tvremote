package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fya extends agtu implements agvb {
    int a;
    final /* synthetic */ fyb b;
    final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fya(fyb fybVar, Context context, agsw agswVar) {
        super(2, agswVar);
        this.b = fybVar;
        this.c = context;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fya) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fyb fybVar = this.b;
            this.a = 1;
            obj = fybVar.b.b(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Intent intent = new Intent("com.google.android.apps.tvsearch.fcm.REGISTER_FCM_SOON_ACTION");
            ComponentName componentName = irm.a;
            Intent component = intent.setComponent(irm.i);
            component.getClass();
            this.c.sendBroadcast(component);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fya(this.b, this.c, agswVar);
    }
}
