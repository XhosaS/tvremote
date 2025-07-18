package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvx implements mbg {
    public final yqt a;
    public final /* synthetic */ tvy b;

    public tvx(tvy tvyVar, yqt yqtVar) {
        this.b = tvyVar;
        this.a = (yqtVar.g() && ((tva) yqtVar.c()).e()) ? yqtVar : ypv.a;
    }

    @Override // defpackage.mbg
    public final void a() {
        throw null;
    }

    @Override // defpackage.mbg
    public final void b(adrb adrbVar) throws Throwable {
        wvl wvlVar;
        Throwable th;
        int i;
        wvl wvlVar2;
        boolean z;
        int iA;
        tvy tvyVar = this.b;
        wvl wvlVarB = tvyVar.g.b("handleSodaEvent", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleSodaEvent", 832);
        try {
            i = adrbVar.b;
        } catch (Throwable th2) {
            th = th2;
            wvlVar = wvlVarB;
        }
        try {
            if ((i & 2) != 0) {
                adqz adqzVar = adrbVar.d;
                if (adqzVar == null) {
                    try {
                        adqzVar = adqz.a;
                    } catch (Throwable th3) {
                        th = th3;
                        wvlVar = wvlVarB;
                        try {
                            wvlVar.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                }
                int i2 = adqzVar.b;
                if (i2 != 1) {
                    if (i2 == 2) {
                        ((zdv) ((zdv) ((zdv) tvy.a.b()).n(5, TimeUnit.SECONDS)).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handlePartialResult", 1022, "SodaSpeechRecognizer.java")).u("#handlePartialResult");
                        adqr adqrVar = adqzVar.b == 2 ? (adqr) adqzVar.c : adqr.a;
                        tuw tuwVar = tuw.a;
                        tuv tuvVar = new tuv();
                        String str = (String) adqrVar.b.get(0);
                        if ((tuvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            tuvVar.y();
                        }
                        tuw tuwVar2 = (tuw) tuvVar.b;
                        str.getClass();
                        tuwVar2.b |= 1;
                        tuwVar2.c = str;
                        String str2 = adqzVar.f;
                        if ((tuvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            tuvVar.y();
                        }
                        tuw tuwVar3 = (tuw) tuvVar.b;
                        str2.getClass();
                        tuwVar3.b |= 4;
                        tuwVar3.e = str2;
                        tvyVar.m.h((tuw) tuvVar.v());
                    }
                    wvlVar2 = wvlVarB;
                } else {
                    adpr adprVar = (adpr) adqzVar.c;
                    zdy zdyVar = tvy.a;
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleFinalResult", 939, "SodaSpeechRecognizer.java")).v("#handleFinalResult: %d hyp", adprVar.c.size());
                    tso tsoVar = tso.a;
                    tsn tsnVar = new tsn();
                    String str3 = adqzVar.f;
                    if ((tsnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        tsnVar.y();
                    }
                    tso tsoVar2 = (tso) tsnVar.b;
                    str3.getClass();
                    tsoVar2.b |= 1;
                    tsoVar2.f = str3;
                    abxs abxsVar = adprVar.c;
                    if ((tsnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        tsnVar.y();
                    }
                    tso tsoVar3 = (tso) tsnVar.b;
                    abxs abxsVar2 = tsoVar3.c;
                    if (!abxsVar2.c()) {
                        int size = abxsVar2.size();
                        tsoVar3.c = abxsVar2.d(size + size);
                    }
                    abus.m(abxsVar, tsoVar3.c);
                    int size2 = adprVar.c.size();
                    List ztiVar = size2 == 0 ? Collections.EMPTY_LIST : new zti(new float[size2], 0, size2);
                    if ((tsnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        tsnVar.y();
                    }
                    tso tsoVar4 = (tso) tsnVar.b;
                    abxi abxiVar = tsoVar4.d;
                    if (!abxiVar.c()) {
                        int size3 = abxiVar.size();
                        tsoVar4.d = abxiVar.d(size3 + size3);
                    }
                    abus.m(ztiVar, tsoVar4.d);
                    abxc abxcVar = adlj.b;
                    MessageLite messageLite = abxcVar.a;
                    adpr adprVar2 = adpr.a;
                    if (messageLite != adprVar2) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    abwr abwrVar = adprVar.n;
                    int i3 = 1;
                    abxb abxbVar = abxcVar.d;
                    wvlVar2 = wvlVarB;
                    if (!abxbVar.d) {
                        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                    }
                    Object objK = abwrVar.k(abxbVar);
                    if (objK != null && ((List) objK).size() != 0) {
                        if (messageLite != adprVar2) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        Object objK2 = adprVar.n.k(abxbVar);
                        Iterable iterable = (Iterable) (objK2 == null ? abxcVar.b : abxcVar.b(objK2));
                        if ((tsnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            tsnVar.y();
                        }
                        tso tsoVar5 = (tso) tsnVar.b;
                        abxs abxsVar3 = tsoVar5.e;
                        if (!abxsVar3.c()) {
                            int size4 = abxsVar3.size();
                            tsoVar5.e = abxsVar3.d(size4 + size4);
                        }
                        abus.m(iterable, tsoVar5.e);
                    }
                    twe tweVar = tvyVar.l;
                    boolean z2 = ((tsk) tweVar).C;
                    if (z2 || ((tsk) tweVar).D || ((tsk) tweVar).v.isPresent()) {
                        for (adqb adqbVar : adprVar.d) {
                            tun tunVar = tun.a;
                            tuk tukVar = new tuk();
                            abxs abxsVar4 = adqbVar.c;
                            if ((tukVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                tukVar.y();
                            }
                            tun tunVar2 = (tun) tukVar.b;
                            twe tweVar2 = tweVar;
                            abxs abxsVar5 = tunVar2.c;
                            if (abxsVar5.c()) {
                                z = z2;
                            } else {
                                int size5 = abxsVar5.size();
                                z = z2;
                                tunVar2.c = abxsVar5.d(size5 + size5);
                            }
                            abus.m(abxsVar4, tunVar2.c);
                            if (z) {
                                adrj adrjVar = adprVar.f;
                                if (adrjVar == null) {
                                    adrjVar = adrj.a;
                                }
                                long j = adqbVar.d + (adrjVar.b / 1000);
                                if ((tukVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    tukVar.y();
                                }
                                tun tunVar3 = (tun) tukVar.b;
                                tunVar3.b |= 1;
                                tunVar3.d = j;
                            }
                            int i4 = tvyVar.j;
                            if (i4 != 0 && ((tsk) tweVar2).D && adqbVar.f.size() != 0) {
                                for (adrl adrlVar : adqbVar.f) {
                                    if (adrlVar.b == i4) {
                                        int iA2 = adqy.a(adrlVar.c);
                                        if (iA2 == 0) {
                                            iA2 = i3;
                                        }
                                        int i5 = iA2 - 1;
                                        int i6 = i5 != 0 ? i5 != i3 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 6 : 5 : 4 : 3 : 2 : 1;
                                        if ((tukVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            tukVar.y();
                                        }
                                        tun tunVar4 = (tun) tukVar.b;
                                        tunVar4.e = i6 - 1;
                                        tunVar4.b |= 2;
                                    } else {
                                        i3 = 1;
                                    }
                                }
                                if ((tukVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    tukVar.y();
                                }
                                tun tunVar5 = (tun) tukVar.b;
                                tunVar5.e = 0;
                                tunVar5.b |= 2;
                            }
                            if ((adqbVar.b & 2) != 0) {
                                Optional optional = ((tsk) tweVar2).v;
                                if (optional.isPresent() && (iA = adnv.a(((adnx) optional.get()).c)) != 0 && iA != 1) {
                                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer$SodaCallbackImpl", "handleFinalResult", 979, "SodaSpeechRecognizer.java")).u("Setting diarization info in soda response");
                                    tsm tsmVar = tsm.a;
                                    tsl tslVar = new tsl();
                                    adpl adplVar = adqbVar.e;
                                    if (adplVar == null) {
                                        adplVar = adpl.a;
                                    }
                                    String str4 = adplVar.b;
                                    if ((tslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        tslVar.y();
                                    }
                                    tsm tsmVar2 = (tsm) tslVar.b;
                                    str4.getClass();
                                    tsmVar2.b |= 1;
                                    tsmVar2.c = str4;
                                    adpl adplVar2 = adqbVar.e;
                                    if (adplVar2 == null) {
                                        adplVar2 = adpl.a;
                                    }
                                    boolean z3 = adplVar2.c;
                                    if ((tslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        tslVar.y();
                                    }
                                    tsm tsmVar3 = (tsm) tslVar.b;
                                    tsmVar3.b |= 2;
                                    tsmVar3.d = z3;
                                    tsm tsmVar4 = (tsm) tslVar.v();
                                    if ((tukVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        tukVar.y();
                                    }
                                    tun tunVar6 = (tun) tukVar.b;
                                    tsmVar4.getClass();
                                    tunVar6.f = tsmVar4;
                                    tunVar6.b |= 4;
                                }
                            }
                            tsnVar.a((tun) tukVar.v());
                            tweVar = tweVar2;
                            z2 = z;
                            i3 = 1;
                        }
                    }
                    tvyVar.m.j((tso) tsnVar.v());
                }
            } else {
                wvlVar2 = wvlVarB;
                if ((i & 16) != 0) {
                    adpp adppVar = adrbVar.e;
                    if (adppVar == null) {
                        adppVar = adpp.a;
                    }
                    if ((adppVar.b & 1) != 0) {
                        adpp adppVar2 = adrbVar.e;
                        if (adppVar2 == null) {
                            adppVar2 = adpp.a;
                        }
                        int iA3 = adpo.a(adppVar2.c);
                        if (iA3 == 0) {
                            iA3 = 1;
                        }
                        if (iA3 == 1) {
                            tvyVar.m.l();
                        } else if (iA3 == 2 || iA3 == 4) {
                            tvyVar.m.b();
                        }
                    }
                } else if ((33554432 & i) != 0) {
                    adqj adqjVar = adrbVar.i;
                    if (adqjVar == null) {
                        adqjVar = adqj.a;
                    }
                    if (adqjVar != null && adqjVar.b.size() > 0) {
                        tvyVar.m.g(adqjVar);
                    }
                }
            }
            if ((adrbVar.b & 2097152) != 0) {
                mck mckVar = tvyVar.x;
                admf admfVar = adrbVar.h;
                if (admfVar == null) {
                    admfVar = admf.a;
                }
                Iterator it = admfVar.c.iterator();
                while (it.hasNext()) {
                    mckVar.b.a((admh) it.next());
                }
                mckVar.c.isPresent();
                if (!admfVar.d.isEmpty()) {
                    ((zdv) ((zdv) ((zdv) mck.a.b()).n(30, TimeUnit.SECONDS)).q("com/google/android/libraries/assistant/soda/metrics/SodaMetricsLoggerTiktok", "logBatchMetricsEvent", 70, "SodaMetricsLoggerTiktok.java")).u("Dropping Soda generic appflow logs due to missing SodaMetricsAppFlow.");
                }
                mckVar.d.isPresent();
                if (!admfVar.b.isEmpty()) {
                    ((zdv) ((zdv) ((zdv) mck.a.b()).n(30, TimeUnit.SECONDS)).q("com/google/android/libraries/assistant/soda/metrics/SodaMetricsLoggerTiktok", "logBatchMetricsEvent", 81, "SodaMetricsLoggerTiktok.java")).u("Dropping Soda streamz events due to missing SodaMetricsStreamz.");
                }
            }
            twe tweVar3 = tvyVar.l;
            if (((tsk) tweVar3).p) {
                int i7 = adrbVar.b;
                if ((i7 & 2) != 0 || (i7 & 16) != 0 || (65536 & i7) != 0 || (i7 & 134217728) != 0) {
                    tvyVar.m.k(adrbVar);
                }
            }
            if (((tsk) tweVar3).n.isPresent() && (adrbVar.b & 64) != 0) {
                adph adphVar = adrbVar.f;
                if (adphVar == null) {
                    adphVar = adph.a;
                }
                tvyVar.t.r((int) (adphVar.b * 100.0f));
            }
            yqt yqtVar = this.a;
            if (yqtVar.g() && (adrbVar.b & 64) == 0) {
                ((tva) yqtVar.c()).b(adrbVar);
            }
            wvlVar2.close();
        } catch (Throwable th5) {
            th = th5;
            th = th;
            wvlVar.close();
            throw th;
        }
    }

    @Override // defpackage.mbg
    public final void c() {
        throw null;
    }

    @Override // defpackage.mbg
    public final void d() {
        throw null;
    }
}
