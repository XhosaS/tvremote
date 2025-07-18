package com.google.android.libraries.geller.portable.callbacks;

import defpackage.abre;
import defpackage.accg;
import defpackage.acdx;
import defpackage.acgd;
import defpackage.acoc;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface GellerLoggingCallback {
    void a(acoc acocVar);

    void b();

    void c(accg accgVar);

    void d(String str, String str2, long j);

    void e(acgd acgdVar, String str, abre abreVar);

    void f(acgd acgdVar, String str, int i);

    void g(acgd acgdVar, String str);

    void h(String str, String str2, int i);

    void i(String str, boolean z, int i);

    void j(String str, acdx acdxVar);

    void k(String str);

    void l(acgd acgdVar, boolean z, long j);

    void logCorpusQuotaExceeded(String str);

    void logGellerCacheCleanup(String str, long j);

    void logGellerCacheCorpusCleanup(String str, long j);

    void logGellerCacheDelete(String str, boolean z, long j);

    void logGellerCacheDeleteResult(String str, boolean z, long j);

    void logGellerCacheDeletionPropagationElementsCount(String str, boolean z, long j);

    void logGellerCacheGetCorpusStats(String str, boolean z, long j);

    void logGellerCacheGetCorpusStatsResult(String str, boolean z, long j);

    void logGellerCacheRead(String str, boolean z, long j);

    void logGellerCacheReadMetadata(String str, boolean z, long j);

    void logGellerCacheReadMetadataResult(String str, boolean z, long j);

    void logGellerCacheReadResult(String str, boolean z, long j);

    void logGellerCacheSyncUpdate(String str, boolean z, long j);

    void logGellerCacheSyncUpdateDeletionDownloadResult(String str, boolean z, long j);

    void logGellerCacheSyncUpdateDownloadResult(String str, boolean z, long j);

    void logGellerCacheWrite(String str, boolean z, long j);

    void logGellerCacheWriteResult(String str, boolean z, long j);

    void logGellerConsentCheckActivityControlsComparison(String str, String str2, boolean z, boolean z2);

    void logGellerConsentMiniWaaComparison(String str, String str2, boolean z);

    void logNumberOfElementsDeletedBySyncTimeRangeDeletion(String str, int i);

    void logSizeOfElementsDeletedBySyncTimeRangeDeletion(String str, int i);

    void m(acgd acgdVar, boolean z, long j);

    void n(acgd acgdVar);

    void o(acgd acgdVar, boolean z, long j, long j2);

    void p(acgd acgdVar, long j, boolean z);

    void q(acgd acgdVar, boolean z, long j);
}
