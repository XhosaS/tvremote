package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcc implements dau {
    public final File a;
    public final dcn b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public dcc(File file, dcn dcnVar) {
        this.a = file;
        this.b = dcnVar;
    }

    @Override // defpackage.dau
    public final void a() {
        this.c.set(true);
    }

    public final void b() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
