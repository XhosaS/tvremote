package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymz implements Iterable, yli {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ymz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ymw] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b != 0 ? ykn.e((Object[]) this.a) : this.a.a();
    }
}
