package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mci {
    private final Context a;
    private final jyw b;
    private final mgx c;

    public mci(Context context) {
        List list = jyw.m;
        jyt jytVar = new jyt(context, "SODA_CLEARCUT");
        this.c = new mcf();
        this.a = context;
        jytVar.f = new mch();
        this.b = jytVar.b();
    }

    public final void a(admh admhVar) throws abxv {
        Optional optionalOf;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        if (TextUtils.equals(admhVar.c, "SODA_CLEARCUT")) {
            try {
                abvo abvoVar = admhVar.d;
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                adux aduxVar = adux.a;
                abvt abvtVarK = abvoVar.k();
                adux aduxVar2 = new adux();
                try {
                    try {
                        try {
                            abzj abzjVarA = abza.a.a(aduxVar2.getClass());
                            abzjVarA.i(aduxVar2, abvu.p(abvtVarK), generatedRegistry);
                            abzjVarA.g(aduxVar2);
                            try {
                                abvtVarK.z(0);
                                Byte b = (byte) 1;
                                b.getClass();
                                aduz aduzVar = aduxVar2.c;
                                if (aduzVar == null) {
                                    aduzVar = aduz.a;
                                }
                                aduv aduvVar = aduzVar.c;
                                if (aduvVar == null) {
                                    aduvVar = aduv.a;
                                }
                                adtv adtvVar = aduvVar.b;
                                if (adtvVar == null) {
                                    adtvVar = adtv.a;
                                }
                                adma admaVarB = adma.b(adtvVar.b);
                                if (admaVarB == null) {
                                    admaVarB = adma.UNKNOWN_HOST_APP_ID;
                                }
                                int iOrdinal = admaVarB.ordinal();
                                if (iOrdinal != 8 && iOrdinal != 13 && iOrdinal != 14) {
                                    switch (iOrdinal) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            break;
                                        default:
                                            aduz aduzVar2 = aduxVar2.c;
                                            if (aduzVar2 == null) {
                                                aduzVar2 = aduz.a;
                                            }
                                            aduv aduvVar2 = aduzVar2.c;
                                            if (aduvVar2 == null) {
                                                aduvVar2 = aduv.a;
                                            }
                                            adtv adtvVar2 = aduvVar2.b;
                                            if (adtvVar2 == null) {
                                                adtvVar2 = adtv.a;
                                            }
                                            if (adtvVar2 != null) {
                                                adma admaVarB2 = adma.b(adtvVar2.b);
                                                if (admaVarB2 == null) {
                                                    admaVarB2 = adma.UNKNOWN_HOST_APP_ID;
                                                }
                                                adma admaVar = adma.ANDROID_VOICE_IME;
                                                if (!admaVarB2.equals(admaVar) && ((iA4 = admc.a(adtvVar2.d)) == 0 || iA4 != 4)) {
                                                    String strA = tvc.a(adtvVar2);
                                                    if ((strA.startsWith("com.google") || strA.startsWith("com.android")) && !tvc.a.containsKey(strA)) {
                                                        return;
                                                    }
                                                }
                                                final jyv jyvVarI = this.b.i(aduxVar2, mhm.b(this.a, this.c));
                                                jyvVarI.k = admhVar.c;
                                                aduz aduzVar3 = aduxVar2.c;
                                                if (aduzVar3 == null) {
                                                    aduzVar3 = aduz.a;
                                                }
                                                aduv aduvVar3 = aduzVar3.c;
                                                if (aduvVar3 == null) {
                                                    aduvVar3 = aduv.a;
                                                }
                                                adtv adtvVar3 = aduvVar3.b;
                                                if (adtvVar3 == null) {
                                                    adtvVar3 = adtv.a;
                                                }
                                                if (adtvVar3 == null) {
                                                    optionalOf = Optional.empty();
                                                } else {
                                                    adma admaVarB3 = adma.b(adtvVar3.b);
                                                    if (admaVarB3 == null) {
                                                        admaVarB3 = adma.UNKNOWN_HOST_APP_ID;
                                                    }
                                                    if (admaVarB3.equals(admaVar) || ((iA = admc.a(adtvVar3.d)) != 0 && iA == 4)) {
                                                        optionalOf = Optional.of(109599039);
                                                    } else {
                                                        adma admaVarB4 = adma.b(adtvVar3.b);
                                                        if (admaVarB4 == null) {
                                                            admaVarB4 = adma.UNKNOWN_HOST_APP_ID;
                                                        }
                                                        if (admaVarB4.equals(adma.GBOARD_SMART_DICTATION) && (iA3 = admc.a(adtvVar3.d)) != 0 && iA3 == 6) {
                                                            optionalOf = Optional.of(91187825);
                                                        } else {
                                                            adma admaVarB5 = adma.b(adtvVar3.b);
                                                            if (admaVarB5 == null) {
                                                                admaVarB5 = adma.UNKNOWN_HOST_APP_ID;
                                                            }
                                                            optionalOf = (admaVarB5.equals(adma.FITBIT) && (iA2 = admc.a(adtvVar3.d)) != 0 && iA2 == 6) ? Optional.of(85741106) : Optional.ofNullable((Integer) tvc.a.get(tvc.a(adtvVar3)));
                                                        }
                                                    }
                                                }
                                                optionalOf.ifPresent(new Consumer() { // from class: mcg
                                                    @Override // java.util.function.Consumer
                                                    public final void accept(Object obj) {
                                                        aech aechVar;
                                                        int iIntValue = ((Integer) obj).intValue();
                                                        aech aechVar2 = aech.EVENT_OVERRIDE;
                                                        jzc jzcVarC = jzc.c(iIntValue, aechVar2);
                                                        aech aechVar3 = ((jyr) jzcVarC).b;
                                                        if (aechVar3 == aechVar2 || aechVar3 == (aechVar = aech.EVENT_DEFERRING)) {
                                                            jyvVarI.n = jzcVarC;
                                                            return;
                                                        }
                                                        Log.e("AbstractLogEventBuilder", "The given event-level ProductIdOrigin value " + Integer.toString(aechVar3.l) + " is not one of the values expected for a value set at the event-level: " + String.valueOf(aechVar2) + " or " + String.valueOf(aechVar));
                                                    }

                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                    }
                                                });
                                                jyvVarI.d();
                                                return;
                                            }
                                            return;
                                    }
                                }
                                ((zdv) ((zdv) ((zdv) mcl.a.b()).n(30, TimeUnit.SECONDS)).q("com/google/android/libraries/assistant/soda/metrics/SodaMetricsUtils", "isMetricsLoggingSupported", 18, "SodaMetricsUtils.java")).v("Metrics logging not supported for host app id: %d", admaVarB.K);
                            } catch (abxv e) {
                                throw e;
                            }
                        } catch (IOException e2) {
                            if (!(e2.getCause() instanceof abxv)) {
                                throw new abxv(e2);
                            }
                            throw ((abxv) e2.getCause());
                        } catch (RuntimeException e3) {
                            if (!(e3.getCause() instanceof abxv)) {
                                throw e3;
                            }
                            throw ((abxv) e3.getCause());
                        }
                    } catch (abxv e4) {
                        if (!e4.a) {
                            throw e4;
                        }
                        throw new abxv(e4);
                    }
                } catch (abzz e5) {
                    throw e5.a();
                }
            } catch (abxv e6) {
                Log.w("SodaMetricsClearcut", "Failed to parse message as SodaExtension", e6);
            }
        }
    }
}
