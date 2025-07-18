package defpackage;

import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ony implements GellerLoggingCallback {
    public final otg a;

    public ony(otg otgVar) {
        this.a = otgVar;
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void a(acoc acocVar) {
        String str;
        int size = acocVar.d.size();
        Iterator it = acocVar.d.iterator();
        boolean z = size > 0;
        ony onyVar = this;
        while (true) {
            otg otgVar = onyVar.a;
            if (!it.hasNext()) {
                oth othVar = (oth) otgVar;
                otf otfVar = othVar.a;
                String str2 = othVar.b;
                String str3 = othVar.c;
                ((uqo) otfVar.Q.eV()).a(100L, str2, str3, Boolean.valueOf(z));
                ((uqq) otfVar.S.eV()).b(acocVar.e, str2, str3);
                return;
            }
            acog acogVar = (acog) it.next();
            boolean z2 = acogVar.e;
            acgd acgdVarB = acgd.b(acogVar.b);
            if (acgdVarB == null) {
                acgdVarB = acgd.UNKNOWN;
            }
            String strName = acgdVarB.name();
            int iA = acny.a(acogVar.c);
            if (iA == 0) {
                iA = 1;
            }
            z &= z2;
            switch (iA) {
                case 1:
                    str = "DELETION_REASON_UNKNOWN";
                    break;
                case 2:
                    str = "DELETION_REASON_WIPEOUT_DURATION";
                    break;
                case 3:
                    str = "DELETION_REASON_OUTDATED_DATA";
                    break;
                case 4:
                    str = "DELETION_REASON_GC_LIFE";
                    break;
                case 5:
                    str = "DELETION_REASON_GC_LIMIT";
                    break;
                case 6:
                    str = "DELETION_REASON_DATA_SIZE_LIMIT";
                    break;
                case 7:
                    str = "DELETION_REASON_NOT_IN_CONFIG";
                    break;
                default:
                    str = "DELETION_REASON_CORPUS_WIPEOUT";
                    break;
            }
            oth othVar2 = (oth) otgVar;
            otf otfVar2 = othVar2.a;
            int i = acogVar.d * 100;
            String str4 = othVar2.b;
            uqq uqqVar = (uqq) otfVar2.T.eV();
            Boolean boolValueOf = Boolean.valueOf(z2);
            Iterator it2 = it;
            uqqVar.b(i, str4, strName, str, boolValueOf);
            int i2 = acogVar.d * 100;
            String str5 = othVar2.c;
            ((uqq) otfVar2.U.eV()).b(i2, str4, str5, str, boolValueOf);
            ((uqo) otfVar2.R.eV()).a(100L, str4, str5, strName, boolValueOf);
            onyVar = this;
            it = it2;
        }
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void b() {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.P.eV()).a(100L, othVar.b, othVar.c);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void c(accg accgVar) {
        otg otgVar;
        Iterator it = accgVar.c.iterator();
        while (true) {
            otgVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            acce acceVar = (acce) it.next();
            String str = acceVar.c;
            oth othVar = (oth) otgVar;
            otf otfVar = othVar.a;
            double d = acceVar.e;
            String str2 = othVar.b;
            String str3 = othVar.c;
            ((uqq) otfVar.b.eV()).b(d, str2, str3, str);
            ((uqq) otfVar.c.eV()).b(acceVar.f, str2, str3, str);
            ((uqq) otfVar.d.eV()).b(acceVar.d, str2, str3, str);
            ((uqo) otfVar.g.eV()).a(100L, str2, str3, str);
        }
        acdn acdnVar = accgVar.d;
        if (acdnVar == null) {
            acdnVar = acdn.a;
        }
        oth othVar2 = (oth) otgVar;
        otf otfVar2 = othVar2.a;
        double d2 = acdnVar.c;
        String str4 = othVar2.b;
        String str5 = othVar2.c;
        ((uqq) otfVar2.h.eV()).b(d2, str4, str5);
        ((uqo) otfVar2.i.eV()).a(acdnVar.d * 100, str4, str5);
        Iterator it2 = accgVar.c.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((acce) it2.next()).d;
        }
        ((uqq) otfVar2.f.eV()).b(j, str4, str5);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void d(String str, String str2, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.p.eV()).b(j, othVar.b, othVar.c, str, str2);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void e(acgd acgdVar, String str, abre abreVar) {
        otg otgVar = this.a;
        oth othVar = (oth) otgVar;
        ((uqo) othVar.a.o.eV()).a(100L, othVar.b, othVar.c, acgdVar.name(), str, Integer.valueOf(abreVar.d));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void f(acgd acgdVar, String str, int i) {
        otg otgVar = this.a;
        oth othVar = (oth) otgVar;
        ((uqo) othVar.a.m.eV()).a(100L, othVar.b, othVar.c, acgdVar.name(), str, Integer.valueOf(i));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void g(acgd acgdVar, String str) {
        otg otgVar = this.a;
        oth othVar = (oth) otgVar;
        ((uqo) othVar.a.n.eV()).a(100L, othVar.b, othVar.c, acgdVar.name(), str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void h(String str, String str2, int i) {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.q.eV()).a(i * 100, othVar.b, othVar.c, str, str2);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void i(String str, boolean z, int i) {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.r.eV()).a(i * 100, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void j(String str, acdx acdxVar) {
        int iA;
        int iA2;
        int iA3;
        for (acbu acbuVar : acdxVar.b) {
            otg otgVar = this.a;
            try {
                int i = acdxVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acdxVar.getClass()).a(acdxVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acdxVar.getClass()).a(acdxVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        acdxVar.memoizedSerializedSize = (acdxVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                boolean z = abvz.e;
                abvw abvwVar = new abvw(new byte[iA], 0, iA);
                abza abzaVar = abza.a;
                abzaVar.a(acdxVar.getClass()).m(acdxVar, abwa.a(abvwVar));
                abvwVar.K();
                int size = acdxVar.b.size();
                oth othVar = (oth) otgVar;
                otf otfVar = othVar.a;
                String str2 = othVar.b;
                String str3 = othVar.c;
                ((uqq) otfVar.aB.eV()).b(iA, str2, str3, str, Integer.valueOf(size));
                try {
                    int i2 = acbuVar.memoizedSerializedSize;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iA2 = abzaVar.a(acbuVar.getClass()).a(acbuVar);
                        if (iA2 < 0) {
                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA2 = i2 & Integer.MAX_VALUE;
                        if (iA2 == Integer.MAX_VALUE) {
                            iA2 = abzaVar.a(acbuVar.getClass()).a(acbuVar);
                            if (iA2 < 0) {
                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                            }
                            acbuVar.memoizedSerializedSize = (acbuVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                        }
                    }
                    abvw abvwVar2 = new abvw(new byte[iA2], 0, iA2);
                    abzaVar.a(acbuVar.getClass()).m(acbuVar, abwa.a(abvwVar2));
                    abvwVar2.K();
                    otf otfVar2 = otfVar;
                    ((uqq) otfVar.aC.eV()).b(iA2, str2, str3, str);
                    for (acgi acgiVar : (acbuVar.b == 2 ? (acbw) acbuVar.c : acbw.a).b) {
                        try {
                            int i3 = acgiVar.memoizedSerializedSize;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                iA3 = abzaVar.a(acgiVar.getClass()).a(acgiVar);
                                if (iA3 < 0) {
                                    throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA3 = i3 & Integer.MAX_VALUE;
                                if (iA3 == Integer.MAX_VALUE) {
                                    iA3 = abzaVar.a(acgiVar.getClass()).a(acgiVar);
                                    if (iA3 < 0) {
                                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                    }
                                    acgiVar.memoizedSerializedSize = (acgiVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                }
                            }
                            abvw abvwVar3 = new abvw(new byte[iA3], 0, iA3);
                            abzaVar.a(acgiVar.getClass()).m(acgiVar, abwa.a(abvwVar3));
                            abvwVar3.K();
                            otf otfVar3 = otfVar2;
                            otfVar2 = otfVar3;
                            ((uqq) otfVar3.aD.eV()).b(iA3, str2, str3, str);
                        } catch (IOException e) {
                            throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", acgiVar), e);
                        }
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", acbuVar), e2);
                }
            } catch (IOException e3) {
                throw new RuntimeException(a.y(" to a byte array threw an IOException (should never happen).", acdxVar), e3);
            }
        }
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void k(String str) {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.V.eV()).a(100L, othVar.b, othVar.c, str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void l(acgd acgdVar, boolean z, long j) {
        otg otgVar = this.a;
        String strName = acgdVar.name();
        oth othVar = (oth) otgVar;
        otf otfVar = othVar.a;
        uqq uqqVar = (uqq) otfVar.z.eV();
        String str = othVar.b;
        String str2 = othVar.c;
        Boolean boolValueOf = Boolean.valueOf(z);
        double d = j;
        uqqVar.b(d, str, str2, strName, boolValueOf);
        yrp yrpVar = otfVar.w;
        String strName2 = acgdVar.name();
        ((uqo) yrpVar.eV()).a(100L, str, str2, strName2, boolValueOf);
        ((uqq) otfVar.x.eV()).b(d, str, str2, strName2, boolValueOf);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logCorpusQuotaExceeded(String str) {
        oth othVar = (oth) this.a;
        ((uqo) othVar.a.e.eV()).a(100L, othVar.b, othVar.c, str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheCleanup(String str, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.av.eV()).b(j, othVar.b, othVar.c, str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheCorpusCleanup(String str, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.aw.eV()).b(j, othVar.b, othVar.c, str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheDelete(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.al.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheDeleteResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ap.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheDeletionPropagationElementsCount(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.as.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheGetCorpusStats(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ax.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheGetCorpusStatsResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ay.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheRead(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.aj.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheReadMetadata(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.at.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheReadMetadataResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.au.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheReadResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.an.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheSyncUpdate(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.am.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheSyncUpdateDeletionDownloadResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ar.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheSyncUpdateDownloadResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.aq.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheWrite(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ak.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerCacheWriteResult(String str, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ao.eV()).b(j, othVar.b, othVar.c, str, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerConsentCheckActivityControlsComparison(String str, String str2, boolean z, boolean z2) {
        ((uqo) ((oth) this.a).a.aA.eV()).a(100L, str, str2, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logGellerConsentMiniWaaComparison(String str, String str2, boolean z) {
        ((uqo) ((oth) this.a).a.az.eV()).a(100L, str, str2, Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logNumberOfElementsDeletedBySyncTimeRangeDeletion(String str, int i) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.ag.eV()).b(i, othVar.b, othVar.c, str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void logSizeOfElementsDeletedBySyncTimeRangeDeletion(String str, int i) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.af.eV()).b(i, othVar.b, othVar.c, str);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void m(acgd acgdVar, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.y.eV()).b(j, othVar.b, othVar.c, acgdVar.name(), Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void n(acgd acgdVar) {
        otg otgVar = this.a;
        oth othVar = (oth) otgVar;
        ((uqo) othVar.a.v.eV()).a(100L, othVar.b, othVar.c, acgdVar.name());
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void o(acgd acgdVar, boolean z, long j, long j2) {
        otg otgVar = this.a;
        String strName = acgdVar.name();
        oth othVar = (oth) otgVar;
        otf otfVar = othVar.a;
        uqo uqoVar = (uqo) otfVar.t.eV();
        String str = othVar.b;
        String str2 = othVar.c;
        Boolean boolValueOf = Boolean.valueOf(z);
        uqoVar.a(100L, str, str2, strName, boolValueOf);
        double d = j2;
        ((uqq) otfVar.l.eV()).b(d, str, str2, acgdVar.name(), boolValueOf);
        ((uqq) otfVar.u.eV()).b(j, str, str2, acgdVar.name());
        ((uqq) otfVar.j.eV()).b(d, str, str2, acgdVar.name(), boolValueOf);
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void p(acgd acgdVar, long j, boolean z) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.s.eV()).b(j, othVar.b, othVar.c, acgdVar.name(), Boolean.valueOf(z));
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback
    public final void q(acgd acgdVar, boolean z, long j) {
        oth othVar = (oth) this.a;
        ((uqq) othVar.a.k.eV()).b(j, othVar.b, othVar.c, acgdVar.name(), Boolean.valueOf(z));
    }
}
