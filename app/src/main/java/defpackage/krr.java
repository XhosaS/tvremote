package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* compiled from: PG */
/* loaded from: classes.dex */
class krr extends ksg {
    final /* synthetic */ Context a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ ksp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krr(ksp kspVar, Context context, Bundle bundle) {
        super(kspVar, true);
        this.a = context;
        this.b = bundle;
        this.c = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVarAsInterface;
        try {
            Context context = this.a;
            kkk.k(context);
            String strA = lbc.a(context);
            kkk.k(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = lbc.a(context);
            }
            Boolean boolB = lbc.b(resources, strA);
            ksp kspVar = this.c;
            try {
                kqzVarAsInterface = kqy.asInterface(kmv.d(context, (boolB == null || !boolB.booleanValue()) ? kmv.c : kmv.b, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (kmr e) {
                kspVar.b(e, true, false);
                kqzVarAsInterface = null;
            }
            kspVar.f = kqzVarAsInterface;
            ksp kspVar2 = this.c;
            if (kspVar2.f == null) {
                Log.w(kspVar2.a, "Failed to connect to measurement client.");
                return;
            }
            Context context2 = this.a;
            int iA = kmv.a(context2, ModuleDescriptor.MODULE_ID);
            InitializationParams initializationParams = new InitializationParams(129017L, Math.max(iA, r6), Boolean.TRUE.equals(boolB) || kmv.b(context2, ModuleDescriptor.MODULE_ID, false) < iA, this.b, lbc.a(context2));
            kqz kqzVar = kspVar2.f;
            kkk.k(kqzVar);
            kqzVar.initialize(new kmf(context2), initializationParams, this.f);
        } catch (Exception e2) {
            this.c.b(e2, true, false);
        }
    }
}
