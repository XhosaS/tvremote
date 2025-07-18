package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awr implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;
    private final cpm d;

    public awr(cpm cpmVar, cpm cpmVar2, cpm cpmVar3, cpm cpmVar4) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
        this.d = cpmVar4;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final awq a() {
        return new awq((Context) ((cpj) this.a).a, this.b, cph.b(this.c), cph.b(this.d));
    }
}
