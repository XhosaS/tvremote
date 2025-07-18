package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buj implements cpi {
    private final cpm a;
    private final cpm b;

    public buj(cpm cpmVar, cpm cpmVar2) {
        this.a = cpmVar;
        this.b = cpmVar2;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dka a() {
        return new dka((Context) ((cpj) this.a).a, ((bto) this.b).a());
    }
}
