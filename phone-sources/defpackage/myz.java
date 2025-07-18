package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myz {
    public final List a;

    public myz() {
        throw null;
    }

    public static nxb a() {
        nxb nxbVar = new nxb();
        nxbVar.d(Collections.EMPTY_LIST);
        return nxbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myz) {
            return this.a.equals(((myz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MoreInfoViewModel{items=" + String.valueOf(this.a) + "}";
    }

    public myz(List list) {
        this.a = list;
    }
}
