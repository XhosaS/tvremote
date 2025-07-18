package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import defpackage.aahy;
import defpackage.aahz;
import defpackage.aaia;
import defpackage.aaib;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaik;
import defpackage.aajc;
import defpackage.aajj;
import defpackage.aaka;
import defpackage.aamy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final aajc a = new aajc(new aamy() { // from class: aake
        @Override // defpackage.aamy
        public final Object a() {
            StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            builderDetectNetwork.detectResourceMismatches();
            builderDetectNetwork.detectUnbufferedIo();
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new aajn("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
        }
    });
    public static final aajc b = new aajc(new aamy() { // from class: aakf
        @Override // defpackage.aamy
        public final Object a() {
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new aajn("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
    });
    public static final aajc c = new aajc(new aamy() { // from class: aakg
        @Override // defpackage.aamy
        public final Object a() {
            return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new aajn("Firebase Blocking", 11, null)));
        }
    });
    static final aajc d = new aajc(new aamy() { // from class: aakh
        @Override // defpackage.aamy
        public final Object a() {
            return Executors.newSingleThreadScheduledExecutor(new aajn("Firebase Scheduler", 0, null));
        }
    });

    public static ScheduledExecutorService a(ExecutorService executorService) {
        return new aaka(executorService, (ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        aaie aaieVar = new aaie(new aajj(aahy.class, ScheduledExecutorService.class), new aajj(aahy.class, ExecutorService.class), new aajj(aahy.class, Executor.class));
        aaieVar.c = new aaik() { // from class: aaki
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            }
        };
        aaie aaieVar2 = new aaie(new aajj(aahz.class, ScheduledExecutorService.class), new aajj(aahz.class, ExecutorService.class), new aajj(aahz.class, Executor.class));
        aaieVar2.c = new aaik() { // from class: aakj
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            }
        };
        aaie aaieVar3 = new aaie(new aajj(aaia.class, ScheduledExecutorService.class), new aajj(aaia.class, ExecutorService.class), new aajj(aaia.class, Executor.class));
        aaieVar3.c = new aaik() { // from class: aakk
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            }
        };
        aaie aaieVarA = aaif.a(new aajj(aaib.class, Executor.class));
        aaieVarA.c = new aaik() { // from class: aakl
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return aakm.a;
            }
        };
        return Arrays.asList(aaieVar.a(), aaieVar2.a(), aaieVar3.a(), aaieVarA.a());
    }
}
