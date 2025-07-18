package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csh extends csg implements ListIterator {
    final /* synthetic */ csj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csh(csj csjVar, int i) {
        super(csjVar);
        this.c = csjVar;
        dnx.bd(i, csjVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        dnx.bb();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        csj csjVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return csjVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        dnx.bb();
    }
}
