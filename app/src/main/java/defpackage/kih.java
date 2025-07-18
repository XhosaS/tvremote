package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kih implements kij {
    public final DataHolder a;

    protected kih(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.kez
    public final void a() {
        this.a.close();
    }

    @Override // defpackage.kij
    public final int b() {
        return this.a.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kik(this);
    }
}
