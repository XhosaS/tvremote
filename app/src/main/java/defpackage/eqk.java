package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqk implements Iterator {
    final /* synthetic */ eql a;
    private int b = 0;

    public eqk(eql eqlVar) {
        this.a = eqlVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eqw next() {
        eql eqlVar = this.a;
        if (this.b < eqlVar.c()) {
            int i = this.b;
            this.b = i + 1;
            return eqlVar.e(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
