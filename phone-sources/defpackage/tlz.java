package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlz extends tlq {
    public final pku a;

    public tlz(pku pkuVar) {
        this.a = pkuVar;
    }

    @Override // defpackage.tlq
    public final Set a() {
        return EnumSet.of(tmf.POWER);
    }

    @Override // defpackage.tlq
    public final tma b(tlx tlxVar) {
        return new tmj(this, 1);
    }

    @Override // defpackage.tlq
    public final Set c() {
        return EnumSet.of(tmf.POWER);
    }
}
