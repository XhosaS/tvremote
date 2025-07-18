package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enp {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public enp(long j, int i, List list, List list2, List list3, List list4) {
        this.a = j;
        this.b = i;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = DesugarCollections.unmodifiableList(list3);
        this.f = DesugarCollections.unmodifiableList(list4);
    }
}
