package com.google.android.libraries.assistant.soda.data;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abxv;
import defpackage.adou;
import defpackage.adov;
import defpackage.mca;
import defpackage.mcb;
import defpackage.wyo;
import defpackage.zdy;
import defpackage.zwk;
import defpackage.zxn;
import defpackage.zyd;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SodaDataProviderJni {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/data/SodaDataProviderJni");
    public final ReadWriteLock b = new ReentrantReadWriteLock();
    public boolean c = false;
    private final mca d;

    public SodaDataProviderJni(mca mcaVar) {
        this.d = mcaVar;
    }

    private final void getData(long j, long j2, byte[] bArr) throws abxv {
        adov adovVar = adov.a;
        adou adouVar = new adou();
        adouVar.C(bArr, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
        zyd zydVarC = this.d.c();
        mcb mcbVar = new mcb(this, j, j2);
        zxn.p(zydVarC, wyo.f(mcbVar), zwk.a);
    }

    private final void onShutdown() {
        this.b.writeLock().lock();
        try {
            this.c = true;
        } finally {
            this.b.writeLock().unlock();
        }
    }

    public native void nativeHandleDataResponse(long j, long j2, byte[] bArr);
}
