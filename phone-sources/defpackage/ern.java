package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ern implements eum {
    public final String u;
    public final List v;
    public final boolean w;

    protected ern(String str, List list, boolean z) {
        this.u = str;
        this.v = DesugarCollections.unmodifiableList(list);
        this.w = z;
    }
}
