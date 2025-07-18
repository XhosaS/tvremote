package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class i extends l {
    private final boolean b;
    private boolean c;
    private awy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(be beVar, boolean z) {
        super(beVar);
        beVar.getClass();
        this.b = z;
    }

    public final awy a(Context context) {
        if (this.c) {
            return this.d;
        }
        be beVar = this.a;
        awy awyVarAf = ii.af(context, beVar.a, beVar.h == 2, this.b);
        this.d = awyVarAf;
        this.c = true;
        return awyVarAf;
    }
}
