package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aur implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;

    public aur(cpm cpmVar, cpm cpmVar2, cpm cpmVar3) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final auq a() {
        cph.b(this.b);
        return new auq((Context) ((cpj) this.c).a);
    }
}
