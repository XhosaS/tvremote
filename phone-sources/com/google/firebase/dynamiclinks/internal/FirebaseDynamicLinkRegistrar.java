package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.uiz;
import defpackage.ujh;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.uki;
import defpackage.ukq;
import defpackage.ulk;
import defpackage.ulo;
import defpackage.uls;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    public static /* synthetic */ ulo lambda$getComponents$0(uki ukiVar) {
        uiz uizVar = (uiz) ukiVar.e(uiz.class);
        return new ulo(new uls(uizVar.a()), uizVar, ukiVar.b(ujh.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ukh<?>> getComponents() {
        ukg ukgVarB = ukh.b(ulo.class);
        ukgVarB.b(new ukq(uiz.class, 1, 0));
        ukgVarB.b(new ukq(ujh.class, 0, 1));
        ukgVarB.c = new ulk(7);
        return Arrays.asList(ukgVarB.a());
    }
}
