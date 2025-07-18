package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eez implements eer {
    private final Context a;
    private final eer b;

    public eez(Context context) {
        efb efbVar = new efb();
        this.a = context.getApplicationContext();
        this.b = efbVar;
    }

    @Override // defpackage.eer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final efa a() {
        return new efa(this.a, ((efb) this.b).a());
    }
}
