package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpi implements cpi {
    private final cpm a;

    public bpi(cpm cpmVar) {
        this.a = cpmVar;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Handler a() {
        return new Handler(((bpk) this.a).a());
    }
}
