package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdt implements Iterator {
    final /* synthetic */ Object a;
    private int b;
    private final /* synthetic */ int c;

    public cdt(ViewGroup viewGroup, int i) {
        this.c = i;
        this.a = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != 0) {
            return this.b < ((ViewGroup) this.a).getChildCount();
        }
        return this.b < ((cdu) this.a).a.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.c == 0) {
            int i = this.b;
            this.b = i + 1;
            cdw cdwVar = ((cdu) this.a).a;
            return cdwVar.e(cdwVar.a[i] & 31);
        }
        int i2 = this.b;
        this.b = i2 + 1;
        View childAt = ((ViewGroup) this.a).getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c == 0) {
            throw new UnsupportedOperationException();
        }
        int i = this.b - 1;
        this.b = i;
        ((ViewGroup) this.a).removeViewAt(i);
    }

    public cdt(cdu cduVar, int i) {
        this.c = i;
        this.a = cduVar;
        this.b = 0;
    }
}
