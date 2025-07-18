package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqg {
    public final vqe a;
    public final List b;

    public vqg(vqe vqeVar, List list) {
        list.getClass();
        this.a = vqeVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqg)) {
            return false;
        }
        vqg vqgVar = (vqg) obj;
        return yks.e(this.a, vqgVar.a) && yks.e(this.b, vqgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProductSpaceData(productSpaceTitle=" + this.a + ", cardStacks=" + this.b + ")";
    }
}
