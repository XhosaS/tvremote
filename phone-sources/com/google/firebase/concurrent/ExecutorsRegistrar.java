package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.uji;
import defpackage.ujj;
import defpackage.ujk;
import defpackage.ujl;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.ukv;
import defpackage.uky;
import defpackage.ulb;
import defpackage.ulh;
import defpackage.ulk;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final ukv a = new ukv(new uky(2));
    public static final ukv b = new ukv(new uky(3));
    public static final ukv c = new ukv(new uky(4));
    static final ukv d = new ukv(new uky(5));

    public static ScheduledExecutorService a(ExecutorService executorService) {
        return new ulh(executorService, (ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ukh<?>> getComponents() {
        ukg ukgVar = new ukg(new ulb(uji.class, ScheduledExecutorService.class), new ulb(uji.class, ExecutorService.class), new ulb(uji.class, Executor.class));
        ukgVar.c = new ulk(1);
        ukg ukgVar2 = new ukg(new ulb(ujj.class, ScheduledExecutorService.class), new ulb(ujj.class, ExecutorService.class), new ulb(ujj.class, Executor.class));
        ukgVar2.c = new ulk(0);
        ukg ukgVar3 = new ukg(new ulb(ujk.class, ScheduledExecutorService.class), new ulb(ujk.class, ExecutorService.class), new ulb(ujk.class, Executor.class));
        ukgVar3.c = new ulk(2);
        ukg ukgVarA = ukh.a(new ulb(ujl.class, Executor.class));
        ukgVarA.c = new ulk(3);
        return Arrays.asList(ukgVar.a(), ukgVar2.a(), ukgVar3.a(), ukgVarA.a());
    }
}
