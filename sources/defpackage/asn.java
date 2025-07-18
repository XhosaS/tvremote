package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asn implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;

    public asn(cpm cpmVar, cpm cpmVar2, cpm cpmVar3) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bzt a() {
        return new bzt((Context) ((cpj) this.a).a, (asq) this.b.a(), this.c, (byte[]) null);
    }
}
