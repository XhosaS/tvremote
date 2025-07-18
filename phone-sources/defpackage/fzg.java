package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzg {
    public final List a;
    public final Object b;
    public final int c;
    public final int d;
    private final Object e;

    public fzg(List list, Object obj, int i, int i2) {
        this.a = list;
        this.e = null;
        this.b = obj;
        this.c = i;
        this.d = i2;
        if (i < 0 && i != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        list.isEmpty();
        if (i2 < 0 && i2 != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fzg)) {
            return false;
        }
        fzg fzgVar = (fzg) obj;
        if (!yks.e(this.a, fzgVar.a)) {
            return false;
        }
        Object obj2 = fzgVar.e;
        return yks.e(null, null) && yks.e(this.b, fzgVar.b) && this.c == fzgVar.c && this.d == fzgVar.d;
    }

    public /* synthetic */ fzg(List list, Object obj) {
        this(list, obj, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
