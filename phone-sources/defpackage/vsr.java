package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsr extends vss {
    final /* synthetic */ vsz a;
    private int b = 0;
    private final int c;

    public vsr(vsz vszVar) {
        this.a = vszVar;
        this.c = vszVar.d();
    }

    @Override // defpackage.vsu
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
