package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqt implements ttm {
    private final Context a;
    private final /* synthetic */ int b;

    public rqt(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.ttm
    public final /* synthetic */ Object get() {
        if (this.b != 0) {
            return tst.h(sfy.a(this.a));
        }
        Context context = this.a;
        return osx.f(context) ? trk.a : tst.i(new File(context.getFilesDir(), "primes/crash"));
    }
}
