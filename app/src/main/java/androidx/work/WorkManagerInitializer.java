package androidx.work;

import android.content.Context;
import defpackage.bsu;
import defpackage.cai;
import defpackage.cak;
import defpackage.cbx;
import defpackage.cfq;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements bsu {
    private static final String a = cbx.d("WrkMgrInitializer");

    @Override // defpackage.bsu
    public final /* bridge */ /* synthetic */ Object a(Context context) {
        cbx.c().a(a, "Initializing WorkManager with default configuration.");
        cak cakVar = new cak(new cai());
        context.getClass();
        cfq.l(context, cakVar);
        context.getClass();
        return cfq.j(context);
    }

    @Override // defpackage.bsu
    public final List b() {
        return Collections.EMPTY_LIST;
    }
}
