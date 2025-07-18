package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yrt implements Serializable, yrp {
    private static final long serialVersionUID = 0;
    public final Object a;

    public yrt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.yrp
    public final Object eV() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yrt) {
            return yqs.a(this.a, ((yrt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
