package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqw implements hqf {
    private final Context a;
    private final hqf b;
    private final hqf c;
    private final Class d;

    public hqw(Context context, hqf hqfVar, hqf hqfVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = hqfVar;
        this.c = hqfVar2;
        this.d = cls;
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && hjs.b((Uri) obj);
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) {
        Uri uri = (Uri) obj;
        return new cvi(new hwa(uri), new hqv(this.a, this.b, this.c, uri, i, i2, hllVar, this.d));
    }
}
