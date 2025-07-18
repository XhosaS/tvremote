package defpackage;

import android.content.Context;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvl implements pvg {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final Random c;
    public final ntp d;
    private final qei e;
    private final qig f;
    private final qmt g;
    private final pyg h;
    private final qbp i;
    private final qgq j;

    public pvl(Context context, qei qeiVar, qig qigVar, qmt qmtVar, pyg pygVar, ntp ntpVar, qbp qbpVar, qgq qgqVar, qpr qprVar, Random random) {
        this.b = context;
        this.e = qeiVar;
        this.f = qigVar;
        this.g = qmtVar;
        this.h = pygVar;
        this.d = ntpVar;
        this.i = qbpVar;
        this.j = qgqVar;
        this.c = random;
        qprVar.a(context);
    }

    @Override // defpackage.pvg
    public final pvh a(vhq vhqVar) {
        return new pvo(this, null, vhqVar, 0, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.pvg
    public final pvh b(vie vieVar) {
        return new pvo(this, vieVar, null, 0, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.pvg
    public final pvh c() {
        return new pvo(this, null, null, 8, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
