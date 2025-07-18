package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import defpackage.aahf;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaih;
import defpackage.aaik;
import defpackage.aaiw;
import defpackage.aaji;
import defpackage.aajj;
import defpackage.aako;
import defpackage.aaln;
import defpackage.aalx;
import defpackage.aamx;
import defpackage.aang;
import defpackage.aarn;
import defpackage.aaro;
import defpackage.jsf;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(aajj aajjVar, aaih aaihVar) {
        return new FirebaseMessaging((aahf) aaihVar.e(aahf.class), (aamx) aaihVar.e(aamx.class), aaihVar.b(aaro.class), aaihVar.b(aalx.class), (aang) aaihVar.e(aang.class), aaihVar.a(aajjVar), (aaln) aaihVar.e(aaln.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final aajj aajjVar = new aajj(aako.class, jsf.class);
        aaie aaieVarB = aaif.b(FirebaseMessaging.class);
        aaieVarB.a = LIBRARY_NAME;
        aaieVarB.b(new aaiw(new aajj(aaji.class, aahf.class), 1, 0));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aamx.class), 0, 0));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aaro.class), 0, 1));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aalx.class), 0, 1));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aang.class), 1, 0));
        aaieVarB.b(new aaiw(aajjVar, 0, 1));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aaln.class), 1, 0));
        aaieVarB.c = new aaik() { // from class: aapn
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(aajjVar, aaihVar);
            }
        };
        aaieVarB.c(1);
        return Arrays.asList(aaieVarB.a(), aarn.a(LIBRARY_NAME, "24.1.2_1p"));
    }
}
