package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmk extends tlq {
    public final pku a;

    public tmk(pku pkuVar) {
        this.a = pkuVar;
    }

    @Override // defpackage.tlq
    public final Set a() {
        return EnumSet.of(tmf.VOLUME);
    }

    @Override // defpackage.tlq
    public final tma b(tlx tlxVar) {
        return new tmj(this, 0);
    }
}
