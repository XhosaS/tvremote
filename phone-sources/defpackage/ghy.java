package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghy implements gho {
    public final Context a;
    public final String b;
    public final ghl c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final yft g = new yga(new gem(this, 6));

    public ghy(Context context, String str, ghl ghlVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = ghlVar;
        this.d = z;
        this.e = z2;
    }

    private final ghx a() {
        return (ghx) this.g.a();
    }

    @Override // defpackage.gho
    public final ghk b() {
        return a().b();
    }

    @Override // defpackage.gho
    public final String c() {
        return this.b;
    }

    @Override // defpackage.gho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }

    @Override // defpackage.gho
    public final void d(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}
