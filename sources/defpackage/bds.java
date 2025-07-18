package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bds implements cpi {
    private final cpm a;
    private final cpm b;

    public bds(cpm cpmVar, cpm cpmVar2) {
        this.a = cpmVar;
        this.b = cpmVar2;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final awy a() {
        return new awy((Context) ((cpj) this.a).a, (Map) ((cpj) this.b).a);
    }
}
