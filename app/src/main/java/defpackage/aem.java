package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aem {
    public final int a;
    public final List b;

    public aem(List list) {
        this.a = 0;
        this.b = list;
    }

    public final aen[] a() {
        return (aen[]) this.b.get(0);
    }

    @Deprecated
    public aem() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }
}
