package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class t implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final n b;
    public final q c;
    public final q d;

    public t(String str, n nVar, q qVar, q qVar2) {
        this.a = str;
        this.b = nVar;
        this.c = qVar;
        this.d = qVar2;
    }

    @Deprecated
    public final int hashCode() {
        n nVar = this.b;
        return nVar.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        q qVar = this.c;
        String string = this.b.toString();
        String strConcat = qVar == null ? "" : " ".concat(qVar.toString());
        q qVar2 = this.d;
        String strConcat2 = qVar2 != null ? " ".concat(qVar2.toString()) : "";
        return this.a + ": " + string + strConcat + strConcat2;
    }
}
