package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diu implements dhe {
    private final Context a;
    private final dhe b;
    private final dhe c;
    private final Class d;

    public diu(Context context, dhe dheVar, dhe dheVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = dheVar;
        this.c = dheVar2;
        this.d = cls;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        Uri uri = (Uri) obj;
        return new dhd(new dpt(uri), Collections.EMPTY_LIST, new dit(this.a, this.b, this.c, uri, i, i2, danVar, this.d));
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && dbn.a((Uri) obj);
    }
}
