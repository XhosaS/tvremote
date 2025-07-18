package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gti extends gtb {
    public gti(gtr gtrVar) {
        super(gtrVar);
    }

    @Override // defpackage.gte
    public final boolean b(guw guwVar) {
        int i = guwVar.k.j;
        if (i != 3) {
            return Build.VERSION.SDK_INT >= 30 && i == 6;
        }
        return true;
    }

    @Override // defpackage.gtb
    public final int d() {
        return 7;
    }

    @Override // defpackage.gtb
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        gsw gswVar = (gsw) obj;
        gswVar.getClass();
        return !gswVar.a || gswVar.c;
    }
}
