package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.tvsearch.logging.primes.libas.ipc.LatencyLoggerService;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmg extends Handler {
    private final glq a;
    private final gmd b;
    private final gmu c;

    public gmg(glq glqVar, gmd gmdVar, gmu gmuVar) {
        this.a = glqVar;
        this.b = gmdVar;
        this.c = gmuVar;
    }

    private static gmc a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return gmc.a(str);
        }
        ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "buildPrimesLatencyEventFromEventName", 279, "LatencyLoggerService.java")).u("Received Latency Event had no name.");
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 19:
            case 20:
                int i2 = message.what;
                if (i2 == 2) {
                    ArrayList<String> stringArrayList = data.getStringArrayList("LatencyEventKey");
                    if (stringArrayList != null) {
                        ArrayList arrayList = new ArrayList();
                        int size = stringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            gmc gmcVarA = a(stringArrayList.get(i3));
                            if (gmcVarA != null) {
                                arrayList.add(gmcVarA);
                            }
                        }
                        this.b.n(arrayList);
                        break;
                    }
                } else {
                    String string = data.getString("LatencyEventKey");
                    try {
                        gmc gmcVarA2 = a(string);
                        if (gmcVarA2 != null) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            if (i2 != 6) {
                                                if (i2 != 19) {
                                                    if (i2 != 20) {
                                                        ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithLatencyLogger", 167, "LatencyLoggerService.java")).v("Received Unsupported message[%d].", i2);
                                                        break;
                                                    } else {
                                                        this.b.c();
                                                        break;
                                                    }
                                                } else {
                                                    this.b.d();
                                                    break;
                                                }
                                            } else {
                                                String string2 = data.getString("NewEventKey");
                                                string2.getClass();
                                                this.b.p(gmcVarA2, gmc.a(string2));
                                                break;
                                            }
                                        } else {
                                            String string3 = data.getString("TimerStatusKey");
                                            string3.getClass();
                                            this.b.r(gmcVarA2, (rbl) Enum.valueOf(rbl.class, string3));
                                            break;
                                        }
                                    } else {
                                        this.b.b(gmcVarA2);
                                        break;
                                    }
                                } else {
                                    this.b.a(gmcVarA2);
                                    break;
                                }
                            } else {
                                this.b.l(gmcVarA2);
                                break;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        ((zdv) ((zdv) ((zdv) LatencyLoggerService.a.d()).p(e)).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithLatencyLogger", 170, "LatencyLoggerService.java")).x("Failed to parse latency event[%s].", string);
                        return;
                    }
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 23:
            default:
                ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessage", 111, "LatencyLoggerService.java")).v("Received Unsupported message[%d].", message.what);
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i4 = message.what;
                switch (i4) {
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        this.c.E(feq.c(data, "StartupEventTimeKey", Instant.EPOCH), feq.f(data, Duration.ZERO));
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        this.c.F(feq.c(data, "StartupEventTimeKey", Instant.EPOCH), feq.f(data, Duration.ZERO));
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        Instant instantC = feq.c(data, "StartupEventTimeKey", Instant.EPOCH);
                        String string4 = data.getString("LatencyEventKey");
                        try {
                            gmc gmcVarA3 = a(string4);
                            if (gmcVarA3 == null) {
                                break;
                            } else {
                                this.c.C(gmcVarA3, instantC);
                                break;
                            }
                        } catch (IllegalArgumentException e2) {
                            ((zdv) ((zdv) ((zdv) LatencyLoggerService.a.d()).p(e2)).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithKatnissStartupLogger", 204, "LatencyLoggerService.java")).x("Failed to parse latency event[%s].", string4);
                            return;
                        }
                    default:
                        ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithKatnissStartupLogger", 209, "LatencyLoggerService.java")).v("Received Unsupported message[%d].", i4);
                        break;
                }
            case 21:
            case 22:
                int i5 = message.what;
                String string5 = data.getString("E2ELatencyEventKey");
                if (TextUtils.isEmpty(string5)) {
                    ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithKatnissE2ELatencyLogger", 216, "LatencyLoggerService.java")).u("Received Latency Event had no name.");
                    break;
                } else {
                    try {
                        gma gmaVar = gma.a;
                        gma gmaVar2 = (gma) Enum.valueOf(gma.class, string5);
                        if (i5 != 21) {
                            if (i5 != 22) {
                                ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithKatnissE2ELatencyLogger", 230, "LatencyLoggerService.java")).v("Received Unsupported message[%d]", i5);
                                break;
                            } else {
                                this.a.w(gmaVar2);
                                break;
                            }
                        } else {
                            this.a.z(feq.c(data, "E2ELatencyEventTimeKey", Instant.EPOCH), gmaVar2);
                            break;
                        }
                    } catch (IllegalArgumentException e3) {
                        ((zdv) ((zdv) ((zdv) LatencyLoggerService.a.d()).p(e3)).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithKatnissE2ELatencyLogger", 233, "LatencyLoggerService.java")).x("Failed to parse latency event[%s].", string5);
                        return;
                    }
                }
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                int i6 = message.what;
                switch (i6) {
                    case 24:
                        this.b.g();
                        break;
                    case 25:
                        this.b.h();
                        break;
                    case 26:
                        this.b.i();
                        break;
                    default:
                        String string6 = data.getString("LatencyStateAnnotatorKey");
                        try {
                            gmb gmbVar = (gmb) Enum.valueOf(gmb.class, string6);
                            if (i6 != 27) {
                                if (i6 != 28) {
                                    ((zdv) ((zdv) LatencyLoggerService.a.d()).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithLatencyStateUpdate", 271, "LatencyLoggerService.java")).v("Received Unsupported message[%d].", i6);
                                    break;
                                } else {
                                    this.b.e(gmbVar);
                                    break;
                                }
                            } else {
                                this.b.f(gmbVar);
                                break;
                            }
                        } catch (IllegalArgumentException e4) {
                            ((zdv) ((zdv) ((zdv) LatencyLoggerService.a.d()).p(e4)).q("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService$IncomingMessageHandler", "handleMessageWithLatencyStateUpdate", 258, "LatencyLoggerService.java")).x("Failed to parse latency state annotator [%s].", string6);
                            return;
                        }
                }
        }
    }
}
