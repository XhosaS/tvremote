package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayw implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;

    public ayw(cpm cpmVar, cpm cpmVar2, cpm cpmVar3) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ayv a() {
        Context context = (Context) ((cpj) this.a).a;
        return new ayv(context, this.c);
    }
}
