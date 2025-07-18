package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtg extends gtb {
    static {
        gpn.a("NetworkMeteredCtrlr");
    }

    public gtg(gtr gtrVar) {
        super(gtrVar);
    }

    @Override // defpackage.gte
    public final boolean b(guw guwVar) {
        return guwVar.k.j == 5;
    }

    @Override // defpackage.gtb
    public final int d() {
        return 7;
    }

    @Override // defpackage.gtb
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        gsw gswVar = (gsw) obj;
        gswVar.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            return (gswVar.a && gswVar.c) ? false : true;
        }
        gpn.b();
        return !gswVar.a;
    }
}
