package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ror implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public ror(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aafi b() {
        return new aafi((Context) ((xcn) this.a).a, (rou) this.b.b(), this.c);
    }
}
