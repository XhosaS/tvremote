package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgh extends bgt {
    public bgh(Context context) {
        super(context);
        zv.b(context);
    }

    @Override // defpackage.bgt
    public final bgl a() {
        zv.c();
        zu zuVarE = zv.a().e();
        return new bgl(zuVarE.c.hashCode(), zuVarE.j, zuVarE.e, zuVarE.d);
    }

    @Override // defpackage.bgt
    public final bgm b(bgl bglVar) {
        zv.c();
        for (zu zuVar : zv.a().h) {
            if (new bgl(zuVar.c.hashCode(), zuVar.j, zuVar.e, zuVar.d).equals(bglVar)) {
                return zuVar.b() == 1 ? bgm.VARIABLE : bgm.NONE;
            }
        }
        return bgm.NONE;
    }
}
