package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.aahg;
import defpackage.aahh;
import defpackage.aahi;
import defpackage.aahj;
import defpackage.aahy;
import defpackage.aahz;
import defpackage.aaia;
import defpackage.aaib;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaiw;
import defpackage.aajj;
import defpackage.agqq;
import defpackage.ahbm;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        aaie aaieVarA = aaif.a(new aajj(aahy.class, ahbm.class));
        aaieVarA.b(new aaiw(new aajj(aahy.class, Executor.class), 1, 0));
        aaieVarA.c = aahg.a;
        aaie aaieVarA2 = aaif.a(new aajj(aaia.class, ahbm.class));
        aaieVarA2.b(new aaiw(new aajj(aaia.class, Executor.class), 1, 0));
        aaieVarA2.c = aahh.a;
        aaie aaieVarA3 = aaif.a(new aajj(aahz.class, ahbm.class));
        aaieVarA3.b(new aaiw(new aajj(aahz.class, Executor.class), 1, 0));
        aaieVarA3.c = aahi.a;
        aaie aaieVarA4 = aaif.a(new aajj(aaib.class, ahbm.class));
        aaieVarA4.b(new aaiw(new aajj(aaib.class, Executor.class), 1, 0));
        aaieVarA4.c = aahj.a;
        return agqq.d(aaieVarA.a(), aaieVarA2.a(), aaieVarA3.a(), aaieVarA4.a());
    }
}
