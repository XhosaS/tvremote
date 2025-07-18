package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class anu implements apb {
    public final File a;
    public final aoz b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public anu(File file, aoz aozVar) {
        this.a = file;
        this.b = aozVar;
    }

    @Override // defpackage.alr
    public final void a() {
        this.c.set(true);
    }

    @Override // defpackage.apb
    public final Object b(agsw agswVar) {
        c();
        return aob.a(this.a, new ant(this, null), agswVar);
    }

    protected final void c() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
