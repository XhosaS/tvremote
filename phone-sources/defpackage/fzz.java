package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzz extends fus {
    public static final fzz a;
    public final fzx b;
    public final List c;
    public final int d;
    public final int e;
    public final fzw f;
    public final fzw g;

    static {
        List listP = yfm.p(gcb.a);
        fzu fzuVar = fzu.b;
        fzu fzuVar2 = fzu.a;
        a = new fzz(fzx.a, listP, 0, 0, new fzw(fzuVar, fzuVar2, fzuVar2));
    }

    public /* synthetic */ fzz(fzx fzxVar, List list, int i, int i2, fzw fzwVar) {
        super((byte[]) null);
        this.b = fzxVar;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = fzwVar;
        this.g = null;
        if (fzxVar != fzx.c && i < 0) {
            throw new IllegalArgumentException("Prepend insert defining placeholdersBefore must be > 0, but was " + i);
        }
        if (fzxVar != fzx.b && i2 < 0) {
            throw new IllegalArgumentException("Append insert defining placeholdersAfter must be > 0, but was " + i2);
        }
        if (fzxVar == fzx.a && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzz)) {
            return false;
        }
        fzz fzzVar = (fzz) obj;
        if (this.b != fzzVar.b || !yks.e(this.c, fzzVar.c) || this.d != fzzVar.d || this.e != fzzVar.e || !yks.e(this.f, fzzVar.f)) {
            return false;
        }
        fzw fzwVar = fzzVar.g;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31;
    }

    public final String toString() {
        List list = this.c;
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((gcb) it.next()).c.size();
        }
        int i = this.d;
        String strValueOf = i != -1 ? String.valueOf(i) : "none";
        int i2 = this.e;
        String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.b);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        gcb gcbVar = (gcb) yfm.U(list);
        sb.append(gcbVar != null ? yfm.U(gcbVar.c) : null);
        sb.append("\n                    |   last item: ");
        gcb gcbVar2 = (gcb) yfm.X(list);
        sb.append(gcbVar2 != null ? yfm.X(gcbVar2.c) : null);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f);
        sb.append("\n                    ");
        return ylh.t(sb.toString().concat("|)"));
    }
}
