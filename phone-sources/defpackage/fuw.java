package defpackage;

import android.content.ComponentName;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuw {
    final fup a;
    final List b = new ArrayList();
    final boolean c;
    public fuq d;
    private final fum e;

    public fuw(fup fupVar, boolean z) {
        this.a = fupVar;
        this.e = fupVar.f;
        this.c = z;
    }

    public final ComponentName a() {
        return this.e.a;
    }

    final fux b(String str) {
        for (fux fuxVar : this.b) {
            if (fuxVar.c.equals(str)) {
                return fuxVar;
            }
        }
        return null;
    }

    public final String c() {
        return this.e.a();
    }

    public final List d() {
        fuy.e();
        return DesugarCollections.unmodifiableList(this.b);
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + c() + " }";
    }
}
