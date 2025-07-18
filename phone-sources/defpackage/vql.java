package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vql {
    public final vqe a;
    public final vro b;
    public final Integer c;
    public final List d;
    public final int e;

    public vql(vqe vqeVar, vro vroVar, int i, Integer num, List list) {
        vroVar.getClass();
        this.a = vqeVar;
        this.b = vroVar;
        this.e = i;
        this.c = num;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vql)) {
            return false;
        }
        vql vqlVar = (vql) obj;
        return yks.e(this.a, vqlVar.a) && this.b == vqlVar.b && this.e == vqlVar.e && yks.e(this.c, vqlVar.c) && yks.e(this.d, vqlVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = this.e;
        a.bw(i);
        Integer num = this.c;
        return (((((iHashCode * 31) + i) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", style=");
        int i = this.e;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "BODY_SMALL" : "BODY_MEDIUM" : "LABEL_LARGE" : "TITLE_MEDIUM"));
        sb.append(", maxLines=");
        sb.append(this.c);
        sb.append(", accessibilityLabelParts=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ vql(vqe vqeVar, vro vroVar, int i, Integer num) {
        this(vqeVar, vroVar, i, num, yhb.a);
    }
}
