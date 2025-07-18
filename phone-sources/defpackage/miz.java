package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class miz implements ieh {
    private final /* synthetic */ int a;
    private final Object b;

    public miz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ieh
    public final /* synthetic */ Object a() {
        if (this.a == 0) {
            return new LinearLayoutManager((Context) ((icy) this.b).a, 0, false);
        }
        eu euVar = new eu((Context) this.b, "play_movies_media", null, null);
        euVar.k();
        return euVar;
    }
}
