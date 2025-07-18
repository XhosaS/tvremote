package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ndx;
import defpackage.nea;
import defpackage.uiv;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.uki;
import defpackage.ukq;
import defpackage.ulb;
import defpackage.ulk;
import defpackage.ulm;
import defpackage.uln;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ ndx lambda$getComponents$0(uki ukiVar) {
        nea.b((Context) ukiVar.e(Context.class));
        return nea.a().c();
    }

    public static /* synthetic */ ndx lambda$getComponents$1(uki ukiVar) {
        nea.b((Context) ukiVar.e(Context.class));
        return nea.a().c();
    }

    public static /* synthetic */ ndx lambda$getComponents$2(uki ukiVar) {
        nea.b((Context) ukiVar.e(Context.class));
        return nea.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ukh<?>> getComponents() {
        ukg ukgVarB = ukh.b(ndx.class);
        ukgVarB.a = LIBRARY_NAME;
        ukgVarB.b(new ukq(Context.class, 1, 0));
        ukgVarB.c = new ulk(4);
        ukg ukgVarA = ukh.a(new ulb(ulm.class, ndx.class));
        ukgVarA.b(new ukq(Context.class, 1, 0));
        ukgVarA.c = new ulk(5);
        ukg ukgVarA2 = ukh.a(new ulb(uln.class, ndx.class));
        ukgVarA2.b(new ukq(Context.class, 1, 0));
        ukgVarA2.c = new ulk(6);
        return Arrays.asList(ukgVarB.a(), ukgVarA.a(), ukgVarA2.a(), uiv.n(LIBRARY_NAME, "19.0.0_1p"));
    }
}
