package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lse implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public lse(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lrc b() {
        return new lrc(((lrz) this.b).b(), (lql) this.a.b(), (SharedPreferences) this.c.b(), 5, null);
    }
}
