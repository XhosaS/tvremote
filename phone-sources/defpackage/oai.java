package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oai<T> implements Iterable, Closeable, nwz {
    public final DataHolder a;

    public oai(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.nwz
    public final void a() {
        this.a.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new zxl(this, 1);
    }
}
