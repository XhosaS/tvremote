package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liw implements mgr {
    public static final ey a = new ew().a();
    public final eu b;
    public final tst c;
    public final String d;
    public final boolean e;
    public final Context f;
    public final nhl h = new nhl();
    public final tbk g = new tbk(this);

    public liw(eu euVar, lit litVar, String str, boolean z, Context context) {
        this.b = euVar;
        this.c = tst.i(litVar);
        this.d = str;
        this.e = z;
        this.f = context;
        euVar.h(new nhl().e());
        euVar.k();
        try {
            euVar.e(true);
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.mgr
    public final void a() {
        ((lit) ((ttd) this.c).a).c(this.b);
    }
}
