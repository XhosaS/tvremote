package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqo implements Iterable {
    final /* synthetic */ int[] a;

    public agqo(int[] iArr) {
        this.a = iArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new agvk(this.a);
    }
}
