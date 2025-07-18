package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciq extends cij {
    public ciq(cja cjaVar) {
        super(cjaVar);
    }

    @Override // defpackage.cim
    public final boolean b(cld cldVar) {
        int i = cldVar.l.j;
        if (i != 3) {
            return Build.VERSION.SDK_INT >= 30 && i == 6;
        }
        return true;
    }

    @Override // defpackage.cij
    protected final int d() {
        return 7;
    }

    @Override // defpackage.cij
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        chu chuVar = (chu) obj;
        chuVar.getClass();
        return !chuVar.a || chuVar.c;
    }
}
