package defpackage;

import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kuo implements Iterator {
    final Iterator a;
    final /* synthetic */ EventParams b;

    public kuo(EventParams eventParams) {
        this.b = eventParams;
        this.a = eventParams.a.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
