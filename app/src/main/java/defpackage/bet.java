package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bet {
    public final Map b = new LinkedHashMap();

    public abstract Object a(bes besVar);

    public final boolean equals(Object obj) {
        return (obj instanceof bet) && agvy.c(this.b, ((bet) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
