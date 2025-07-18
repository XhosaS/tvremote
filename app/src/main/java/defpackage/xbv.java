package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbv {
    public final xby a;

    public xbv(xby xbyVar) {
        this.a = xbyVar;
    }

    public final /* synthetic */ acaw a() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((xbz) this.a.b).b);
        listUnmodifiableList.getClass();
        return new acaw(listUnmodifiableList);
    }
}
