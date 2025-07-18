package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yqy implements Serializable, yqx {
    private static final long serialVersionUID = 0;
    public final Class a;

    public yqy(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.yqx
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yqy)) {
            return false;
        }
        Class cls = ((yqy) obj).a;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
