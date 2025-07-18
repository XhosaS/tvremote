package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgs extends bgr {
    public bgs(Context context) {
        super(context);
    }

    @Override // defpackage.bgr, defpackage.bgp, defpackage.bgn, defpackage.bgt
    public final bgm b(bgl bglVar) {
        bzt bztVar = this.f;
        if (bztVar.f()) {
            return bgm.NONE;
        }
        int iD = bztVar.d(bglVar);
        int i = bglVar.b;
        if ((i != 9 && i != 10 && i != 29) || iD != 1) {
            if (iD != 0) {
                if (iD != 1 && iD != 2) {
                    if (iD != 3 && iD != 4) {
                        return bgm.NONE;
                    }
                }
            }
            return bgm.VARIABLE;
        }
        if (!this.b.c()) {
            return bgm.NONE;
        }
        return bgm.INCREMENTAL;
    }
}
