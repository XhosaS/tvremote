package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtf extends gtb {
    public gtf(gtr gtrVar) {
        super(gtrVar);
    }

    @Override // defpackage.gte
    public final boolean b(guw guwVar) {
        return guwVar.k.j == 2;
    }

    @Override // defpackage.gtb
    public final int d() {
        return 7;
    }

    @Override // defpackage.gtb
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        gsw gswVar = (gsw) obj;
        gswVar.getClass();
        return Build.VERSION.SDK_INT >= 26 ? (gswVar.a && gswVar.b) ? false : true : !gswVar.a;
    }
}
