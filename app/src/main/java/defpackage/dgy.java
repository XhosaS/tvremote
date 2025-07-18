package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgy implements dhe {
    private final Context a;

    public dgy(Context context) {
        this.a = context;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        Uri uri = (Uri) obj;
        return new dhd(new dpt(uri), Collections.EMPTY_LIST, new dgx(this.a, uri));
    }

    @Override // defpackage.dhe
    public final /* synthetic */ boolean b(Object obj) {
        return dbn.a((Uri) obj);
    }
}
