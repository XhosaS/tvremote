package androidx.work;

import android.content.Context;
import defpackage.fki;
import defpackage.gik;
import defpackage.gpn;
import defpackage.gpz;
import defpackage.nxb;
import defpackage.tae;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements gik<gpz> {
    static {
        gpn.a("WrkMgrInitializer");
    }

    @Override // defpackage.gik
    public final /* synthetic */ Object a(Context context) {
        gpn.b();
        gpz.e(context, new tae(new nxb()));
        return fki.aV(context);
    }

    @Override // defpackage.gik
    public final List b() {
        return Collections.EMPTY_LIST;
    }
}
