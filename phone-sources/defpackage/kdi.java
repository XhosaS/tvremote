package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdi extends sbt {
    public final Context a;
    public final iof b;
    public final ihg c;
    public final String d;
    public final wll e;
    public final kds f;

    public kdi(Context context, iof iofVar, ihg ihgVar, String str, wll wllVar, kds kdsVar) {
        this.a = context;
        this.b = iofVar;
        this.c = ihgVar;
        this.d = str;
        this.e = wllVar;
        this.f = kdsVar;
    }

    public final wnq a() {
        return this.b.e(this.e);
    }

    @Override // defpackage.sbt
    protected final void e() {
        if (yks.e(a(), wnq.a)) {
            this.b.f(this.e);
        }
    }
}
