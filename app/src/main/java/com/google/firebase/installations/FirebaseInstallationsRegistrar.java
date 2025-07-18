package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import defpackage.aahf;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaih;
import defpackage.aaik;
import defpackage.aaiw;
import defpackage.aaji;
import defpackage.aajj;
import defpackage.aalu;
import defpackage.aalv;
import defpackage.aalw;
import defpackage.aanf;
import defpackage.aang;
import defpackage.aarn;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ aang lambda$getComponents$0(aaih aaihVar) {
        return new aanf((aahf) aaihVar.e(aahf.class), aaihVar.b(aalw.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        aaie aaieVarB = aaif.b(aang.class);
        aaieVarB.b(new aaiw(new aajj(aaji.class, aahf.class), 1, 0));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aalw.class), 0, 1));
        aaieVarB.c = new aaik() { // from class: aani
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(aaihVar);
            }
        };
        return Arrays.asList(aaieVarB.a(), aaif.c(new aalv(), aalu.class), aarn.a("fire-installations", "17.0.2_1p"));
    }
}
