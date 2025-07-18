package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abvg extends abvh {
    final /* synthetic */ abvo a;
    private int b = 0;
    private final int c;

    public abvg(abvo abvoVar) {
        this.a = abvoVar;
        this.c = abvoVar.d();
    }

    @Override // defpackage.abvj
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
