package com.google.android.apps.play.movies.common;

import defpackage.idr;
import defpackage.iea;
import defpackage.ieg;
import defpackage.kqc;
import defpackage.ksn;
import defpackage.lfn;
import defpackage.lxj;
import defpackage.lzi;
import defpackage.mab;
import defpackage.mcd;
import defpackage.mcj;
import defpackage.mcw;
import defpackage.mcy;
import defpackage.mem;
import defpackage.xby;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface VideosGlobals extends xby<kqc> {
    iea<ieg<ksn>> getAccountRepository();

    lfn getConfig();

    ExecutorService getCpuExecutor();

    lzi getItagInfoStore();

    ExecutorService getLocalExecutor();

    Executor getNetworkExecutor();

    mem getNetworkStatus();

    mab getPurchaseStoreSync();

    lxj getRepositories();

    ExecutorService getSyncExecutor();

    mcd getUserSentimentsStore();

    mcj getWatchNextStoreSync();

    mcw getWishlistStoreSync();

    mcy getWishlistStoreUpdater();

    idr<Boolean> isStreaming();
}
