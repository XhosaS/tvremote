package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class aec {
    final String a;
    final String b;
    final List c;

    public aec(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aecVar = (aec) obj;
        return Objects.equals(this.a, aecVar.a) && Objects.equals(this.b, aecVar.b) && Objects.equals(this.c, aecVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
