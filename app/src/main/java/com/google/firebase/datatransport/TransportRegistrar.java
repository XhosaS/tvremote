package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaih;
import defpackage.aaik;
import defpackage.aaiw;
import defpackage.aaji;
import defpackage.aajj;
import defpackage.aakn;
import defpackage.aako;
import defpackage.aarn;
import defpackage.jsf;
import defpackage.jsj;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ jsf lambda$getComponents$0(aaih aaihVar) {
        jsj.b((Context) aaihVar.e(Context.class));
        return jsj.a().c();
    }

    public static /* synthetic */ jsf lambda$getComponents$1(aaih aaihVar) {
        jsj.b((Context) aaihVar.e(Context.class));
        return jsj.a().c();
    }

    public static /* synthetic */ jsf lambda$getComponents$2(aaih aaihVar) {
        jsj.b((Context) aaihVar.e(Context.class));
        return jsj.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        aaie aaieVarB = aaif.b(jsf.class);
        aaieVarB.a = LIBRARY_NAME;
        aaieVarB.b(new aaiw(new aajj(aaji.class, Context.class), 1, 0));
        aaieVarB.c = new aaik() { // from class: aakp
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return TransportRegistrar.lambda$getComponents$0(aaihVar);
            }
        };
        aaie aaieVarA = aaif.a(new aajj(aakn.class, jsf.class));
        aaieVarA.b(new aaiw(new aajj(aaji.class, Context.class), 1, 0));
        aaieVarA.c = new aaik() { // from class: aakq
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return TransportRegistrar.lambda$getComponents$1(aaihVar);
            }
        };
        aaie aaieVarA2 = aaif.a(new aajj(aako.class, jsf.class));
        aaieVarA2.b(new aaiw(new aajj(aaji.class, Context.class), 1, 0));
        aaieVarA2.c = new aaik() { // from class: aakr
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return TransportRegistrar.lambda$getComponents$2(aaihVar);
            }
        };
        return Arrays.asList(aaieVarB.a(), aaieVarA.a(), aaieVarA2.a(), aarn.a(LIBRARY_NAME, "19.0.0_1p"));
    }
}
