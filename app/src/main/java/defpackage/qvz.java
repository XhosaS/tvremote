package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvz implements yrp {
    private final Context a;

    public qvz(Context context) {
        this.a = context;
    }

    @Override // defpackage.yrp
    public final /* bridge */ /* synthetic */ Object eV() {
        Context context = this.a;
        return mhv.g(context) ? ypv.a : yqt.i(new File(context.getFilesDir(), "primes/crash"));
    }
}
