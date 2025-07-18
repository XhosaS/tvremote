package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.Registrar;
import defpackage.aahf;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaih;
import defpackage.aaik;
import defpackage.aaiw;
import defpackage.aaji;
import defpackage.aajj;
import defpackage.aalx;
import defpackage.aamp;
import defpackage.aamx;
import defpackage.aang;
import defpackage.aarn;
import defpackage.aaro;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(aaih aaihVar) {
        return new FirebaseInstanceId((aahf) aaihVar.e(aahf.class), aaihVar.b(aaro.class), aaihVar.b(aalx.class), (aang) aaihVar.e(aang.class));
    }

    public static /* synthetic */ aamx lambda$getComponents$1(aaih aaihVar) {
        return new aamp((FirebaseInstanceId) aaihVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        aaie aaieVarB = aaif.b(FirebaseInstanceId.class);
        aaieVarB.b(new aaiw(new aajj(aaji.class, aahf.class), 1, 0));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aaro.class), 0, 1));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aalx.class), 0, 1));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aang.class), 1, 0));
        aaieVarB.c = new aaik() { // from class: aamm
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return Registrar.lambda$getComponents$0(aaihVar);
            }
        };
        aaieVarB.c(1);
        aaif aaifVarA = aaieVarB.a();
        aaie aaieVarB2 = aaif.b(aamx.class);
        aaieVarB2.b(new aaiw(new aajj(aaji.class, FirebaseInstanceId.class), 1, 0));
        aaieVarB2.c = new aaik() { // from class: aamn
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return Registrar.lambda$getComponents$1(aaihVar);
            }
        };
        return Arrays.asList(aaifVarA, aaieVarB2.a(), aarn.a("fire-iid", "21.1.1"));
    }
}
