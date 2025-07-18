package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afrk implements afzt {
    @Override // defpackage.afzt
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(afrq.j("grpc-default-executor-%d"));
    }

    @Override // defpackage.afzt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
