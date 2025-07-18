package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.uiv;
import defpackage.uiz;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.uki;
import defpackage.ukq;
import defpackage.ulk;
import defpackage.umt;
import defpackage.umu;
import defpackage.umv;
import defpackage.unm;
import defpackage.unn;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ unn lambda$getComponents$0(uki ukiVar) {
        return new unm((uiz) ukiVar.e(uiz.class), ukiVar.b(umv.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ukh<?>> getComponents() {
        ukg ukgVarB = ukh.b(unn.class);
        ukgVarB.b(new ukq(uiz.class, 1, 0));
        ukgVarB.b(new ukq(umv.class, 0, 1));
        ukgVarB.c = new ulk(10);
        return Arrays.asList(ukgVarB.a(), ukh.d(new umu(), umt.class), uiv.n("fire-installations", "17.0.2_1p"));
    }
}
