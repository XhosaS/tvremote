package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czc implements Cloneable {
    public dpn a = dpk.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final czc clone() {
        try {
            return (czc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof czc) {
            return dqm.g(this.a, ((czc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        dpn dpnVar = this.a;
        if (dpnVar != null) {
            return dpnVar.hashCode();
        }
        return 0;
    }
}
