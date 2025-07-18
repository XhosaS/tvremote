package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class okx extends oks {
    private final nxs a;

    public okx(nxs nxsVar) {
        this.a = nxsVar;
    }

    @Override // defpackage.oks
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.c(new okz(olb.q(i, bundle), dataHolder == null ? null : new oai(dataHolder)));
    }
}
