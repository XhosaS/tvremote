package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsj implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;
    private final tsk b;

    public tsj(tsk tskVar, Object obj) {
        this.b = tskVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tsj)) {
            return false;
        }
        tsj tsjVar = (tsj) obj;
        tsk tskVar = this.b;
        if (tskVar.equals(tsjVar.b)) {
            return tskVar.d(this.a, tsjVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.c(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return this.b.toString() + ".wrap(" + obj.toString() + ")";
    }
}
