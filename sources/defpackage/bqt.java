package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqt implements cpi {
    private final cpm a;
    private final cpm b;

    public bqt(cpm cpmVar, cpm cpmVar2) {
        this.a = cpmVar;
        this.b = cpmVar2;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bqs a() {
        return new bqs((Context) ((cpj) this.a).a, (bsi) this.b.a());
    }
}
