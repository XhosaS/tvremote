package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class din implements dhe {
    private final Context a;

    public din(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        Uri uri = (Uri) obj;
        if (!dbn.b(i, i2)) {
            return null;
        }
        dpt dptVar = new dpt(uri);
        Context context = this.a;
        return new dhd(dptVar, Collections.EMPTY_LIST, dbq.b(context, uri, new dbo(context.getContentResolver())));
    }

    @Override // defpackage.dhe
    public final /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return dbn.a(uri) && !dbn.c(uri);
    }
}
