package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.uja;
import defpackage.uji;
import defpackage.ujj;
import defpackage.ujk;
import defpackage.ujl;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.ukq;
import defpackage.ulb;
import defpackage.yfm;
import defpackage.yfp;
import defpackage.yot;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@yfp
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ukh<?>> getComponents() {
        ukg ukgVarA = ukh.a(new ulb(uji.class, yot.class));
        ukgVarA.b(new ukq(new ulb(uji.class, Executor.class), 1, 0));
        ukgVarA.c = uja.e;
        ukg ukgVarA2 = ukh.a(new ulb(ujk.class, yot.class));
        ukgVarA2.b(new ukq(new ulb(ujk.class, Executor.class), 1, 0));
        ukgVarA2.c = uja.f;
        ukg ukgVarA3 = ukh.a(new ulb(ujj.class, yot.class));
        ukgVarA3.b(new ukq(new ulb(ujj.class, Executor.class), 1, 0));
        ukgVarA3.c = uja.g;
        ukg ukgVarA4 = ukh.a(new ulb(ujl.class, yot.class));
        ukgVarA4.b(new ukq(new ulb(ujl.class, Executor.class), 1, 0));
        ukgVarA4.c = uja.h;
        return yfm.s(ukgVarA.a(), ukgVarA2.a(), ukgVarA3.a(), ukgVarA4.a());
    }
}
