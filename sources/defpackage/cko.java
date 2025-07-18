package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cko extends ckp {
    final /* synthetic */ ckv a;
    private int b = 0;
    private final int c;

    public cko(ckv ckvVar) {
        this.a = ckvVar;
        this.c = ckvVar.d();
    }

    @Override // defpackage.ckr
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
