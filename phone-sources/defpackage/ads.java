package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ads {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    final /* synthetic */ adt f;

    public ads(adt adtVar, List list) {
        this.f = adtVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            wv.c("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
