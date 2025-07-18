package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sgm implements Serializable {
    private static final long serialVersionUID = 1;
    public final sgp a;

    public sgm(sgp sgpVar) {
        this.a = sgpVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sgm) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() + 527;
    }

    public String toString() {
        return String.format(Locale.US, "VisualElement {tag: %s}", this.a);
    }
}
