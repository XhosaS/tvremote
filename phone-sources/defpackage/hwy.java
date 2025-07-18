package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwy {
    public final hxa a;
    public final hyg b;

    public hwy(hxa hxaVar, hyg hygVar) {
        this.a = hxaVar;
        this.b = hygVar;
    }

    static /* synthetic */ String a(char c) {
        return "Bad path coords for " + c + " path segment";
    }

    public final String toString() {
        hxa hxaVar = this.a;
        Objects.toString(hxaVar);
        return String.valueOf(hxaVar).concat(" {}");
    }
}
