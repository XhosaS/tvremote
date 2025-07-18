package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.uiv;
import defpackage.uiz;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.uki;
import defpackage.ukq;
import defpackage.ulk;
import defpackage.umw;
import defpackage.umy;
import defpackage.und;
import defpackage.une;
import defpackage.uni;
import defpackage.unn;
import defpackage.upt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(uki ukiVar) {
        uiz uizVar = (uiz) ukiVar.e(uiz.class);
        return new FirebaseInstanceId(uizVar, new und(uizVar.a()), umy.a(), umy.a(), ukiVar.b(upt.class), ukiVar.b(umw.class), (unn) ukiVar.e(unn.class));
    }

    public static /* synthetic */ uni lambda$getComponents$1(uki ukiVar) {
        return new une((FirebaseInstanceId) ukiVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ukh<?>> getComponents() {
        ukg ukgVarB = ukh.b(FirebaseInstanceId.class);
        ukgVarB.b(new ukq(uiz.class, 1, 0));
        ukgVarB.b(new ukq(upt.class, 0, 1));
        ukgVarB.b(new ukq(umw.class, 0, 1));
        ukgVarB.b(new ukq(unn.class, 1, 0));
        ukgVarB.c = new ulk(8);
        ukgVarB.c();
        ukh ukhVarA = ukgVarB.a();
        ukg ukgVarB2 = ukh.b(uni.class);
        ukgVarB2.b(new ukq(FirebaseInstanceId.class, 1, 0));
        ukgVarB2.c = new ulk(9);
        return Arrays.asList(ukhVarA, ukgVarB2.a(), uiv.n("fire-iid", "21.1.1"));
    }
}
