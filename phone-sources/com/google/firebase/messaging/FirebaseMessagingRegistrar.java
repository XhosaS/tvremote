package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ndx;
import defpackage.nvc;
import defpackage.ocy;
import defpackage.uiv;
import defpackage.uiz;
import defpackage.ukf;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.uki;
import defpackage.ukq;
import defpackage.ulb;
import defpackage.uln;
import defpackage.umr;
import defpackage.umw;
import defpackage.uni;
import defpackage.unj;
import defpackage.unn;
import defpackage.uoq;
import defpackage.uos;
import defpackage.upt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ulb ulbVar, uki ukiVar) {
        uiz uizVar = (uiz) ukiVar.e(uiz.class);
        uni uniVar = (uni) ukiVar.e(uni.class);
        unj unjVarB = ukiVar.b(upt.class);
        unj unjVarB2 = ukiVar.b(umw.class);
        unn unnVar = (unn) ukiVar.e(unn.class);
        unj unjVarA = ukiVar.a(ulbVar);
        umr umrVar = (umr) ukiVar.e(umr.class);
        uos uosVar = new uos(uizVar.a());
        return new FirebaseMessaging(uizVar, uniVar, unjVarA, umrVar, uosVar, new uoq(uizVar, uosVar, new nvc(uizVar.a()), unjVarB, unjVarB2, unnVar), Executors.newSingleThreadExecutor(new ocy("Firebase-Messaging-Task", 0)), new ScheduledThreadPoolExecutor(1, new ocy("Firebase-Messaging-Init", 0)), new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ocy("Firebase-Messaging-File-Io", 0)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ukh<?>> getComponents() {
        ulb ulbVar = new ulb(uln.class, ndx.class);
        ukg ukgVarB = ukh.b(FirebaseMessaging.class);
        ukgVarB.a = LIBRARY_NAME;
        ukgVarB.b(new ukq(uiz.class, 1, 0));
        ukgVarB.b(new ukq(uni.class, 0, 0));
        ukgVarB.b(new ukq(upt.class, 0, 1));
        ukgVarB.b(new ukq(umw.class, 0, 1));
        ukgVarB.b(new ukq(unn.class, 1, 0));
        ukgVarB.b(new ukq(ulbVar, 0, 1));
        ukgVarB.b(new ukq(umr.class, 1, 0));
        ukgVarB.c = new ukf(ulbVar, 3);
        ukgVarB.c();
        return Arrays.asList(ukgVarB.a(), uiv.n(LIBRARY_NAME, "24.1.2_1p"));
    }
}
