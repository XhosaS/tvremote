package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pak extends pao {
    public final pan a;
    private final List c;

    public pak(pan panVar, List list) {
        this.a = panVar;
        if (list == null) {
            throw new NullPointerException("Null children");
        }
        this.c = list;
    }

    @Override // defpackage.pao
    public final pan a() {
        return this.a;
    }

    @Override // defpackage.pao
    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pao) {
            pao paoVar = (pao) obj;
            pan panVar = this.a;
            if (panVar != null ? panVar.equals(paoVar.a()) : paoVar.a() == null) {
                if (this.c.equals(paoVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        pan panVar = this.a;
        return (((panVar == null ? 0 : panVar.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        List list = this.c;
        return "VeTreeNode{ve=" + String.valueOf(this.a) + ", children=" + list.toString() + "}";
    }
}
