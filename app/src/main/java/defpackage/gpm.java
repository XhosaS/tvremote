package defpackage;

import android.content.pm.PackageInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpm extends agtu implements agvb {
    int a;
    final /* synthetic */ gpo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpm(gpo gpoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gpoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gpm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gpo gpoVar = this.b;
            PackageInfo packageInfo = gpoVar.b;
            String str = packageInfo.packageName;
            str.getClass();
            long longVersionCode = packageInfo.getLongVersionCode();
            this.a = 1;
            if (gpoVar.a.q(str, longVersionCode, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gpm(this.b, agswVar);
    }
}
