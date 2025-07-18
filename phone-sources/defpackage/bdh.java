package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdh implements Iterable, bjs, yli {
    private final bdg a;
    private final int b;
    private final int c;

    public bdh(bdg bdgVar, int i, int i2) {
        this.a = bdgVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bdg bdgVar = this.a;
        if (bdgVar.g != this.c) {
            bdi.g();
        }
        int i = this.b;
        return bdgVar.h(i) != null ? new bdw() : new bbp(bdgVar, i + 1, i + bdi.a(bdgVar.a, i));
    }
}
