package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctr {
    final String a;
    final String b;
    final List c;

    public ctr(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctr)) {
            return false;
        }
        ctr ctrVar = (ctr) obj;
        return Objects.equals(this.a, ctrVar.a) && Objects.equals(this.b, ctrVar.b) && Objects.equals(this.c, ctrVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
