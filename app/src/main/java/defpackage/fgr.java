package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.assistant.sdk.libassistant.AssistantManagerNative;
import com.google.protobuf.ExtensionRegistryLite;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgr extends Handler {
    final /* synthetic */ fgs a;

    public fgr(fgs fgsVar) {
        this.a = fgsVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws abxv {
        byte bByteValue;
        byte bByteValue2;
        byte bByteValue3;
        byte bByteValue4;
        zdy zdyVar = fgs.a;
        int i = message.what;
        Bundle data = message.getData();
        int i2 = message.what;
        if (i2 == 12) {
            this.a.e.x();
            return;
        }
        if (i2 == 28) {
            this.a.g.a("");
            return;
        }
        if (i2 != 50 && i2 != 51) {
            switch (i2) {
                case -2:
                    fgs fgsVar = this.a;
                    fgsVar.e.u();
                    lzb lzbVar = fgsVar.n;
                    lzbVar.k();
                    lzbVar.j(Message.obtain((Handler) null, -2));
                    return;
                case -1:
                    this.a.b.c(data.getInt("state"));
                    return;
                case 0:
                    this.a.e.M();
                    return;
                case 1:
                    final String string = data.getString("searchTerm", "");
                    int i3 = data.getInt("discovery_channel");
                    if (i3 != 0) {
                        this.a.f.j(i3);
                    }
                    fgs fgsVar2 = this.a;
                    fgsVar2.k.execute(wyo.h(new Runnable() { // from class: fgq
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.e.A(string, false, jlv.INVOCATION_TYPE_SUGGESTION_INTENT);
                        }
                    }));
                    eyw eywVar = fgsVar2.b;
                    if (eywVar.q != null) {
                        eywVar.q.T(string);
                        return;
                    } else {
                        ((zdv) ((zdv) eyw.a.b()).q("com/google/android/apps/tvsearch/app/lifecycle/ActivityTracker", "updateSearchTerm", 249, "ActivityTracker.java")).u("Fail to update search term to the searchbar because it's null.");
                        return;
                    }
                case 2:
                    lzb.b = false;
                    return;
                case 3:
                    fgs fgsVar3 = this.a;
                    byte[] byteArray = data.getByteArray("displayContextParams");
                    lzb lzbVar2 = fgsVar3.n;
                    fas fasVar = lzbVar2.s;
                    if (fasVar != null && lzbVar2.t) {
                        iyr iyrVar = (iyr) fasVar;
                        iyrVar.a.a(byteArray);
                        iyrVar.a(null);
                        lzbVar2.t = false;
                        return;
                    }
                    synchronized (lzbVar2.f) {
                        zyu zyuVar = lzbVar2.k;
                        if (zyuVar == null || zyuVar.isDone()) {
                            lzbVar2.k = new zyu();
                        }
                        lzbVar2.k.p(new lyw(byteArray));
                    }
                    return;
                case 4:
                    if (data.containsKey("intentInput")) {
                        fgs fgsVar4 = this.a;
                        fgsVar4.c(fgsVar4.d(data, "intentInput"), data.getInt("discovery_channel"));
                    }
                    if (data.containsKey("tapInput")) {
                        fgs fgsVar5 = this.a;
                        fgsVar5.c(fgsVar5.d(data, "tapInput"), data.getInt("discovery_channel"));
                    }
                    if (data.containsKey("createRequestNotification")) {
                        fgs fgsVar6 = this.a;
                        byte[] bArrD = fgsVar6.d(data, "createRequestNotification");
                        jdt jdtVar = fgsVar6.e;
                        jdtVar.az(jlv.INVOCATION_TYPE_UI_CLICK_CLIENT_INPUT_INTENT);
                        jdtVar.X(bArrD, new AssistantManagerNative.VoicelessOptions(AssistantManagerNative.RequestSource.OTHER, true));
                        return;
                    }
                    return;
                case 5:
                    for (String str : data.keySet()) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != 292548765) {
                            if (iHashCode == 686388018 && str.equals("parentalAuthorizationResults")) {
                                byte[] byteArray2 = data.getByteArray(str);
                                try {
                                    jix jixVar = this.a.i.d;
                                    if (jixVar != null) {
                                        abxd abxdVarH = abxd.h(xhe.a, byteArray2, 0, byteArray2.length, ExtensionRegistryLite.getGeneratedRegistry());
                                        if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                                            if (bByteValue != 0) {
                                                boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                                abxdVarH.cM(2, true != zL ? null : abxdVarH);
                                                if (zL) {
                                                }
                                            }
                                            throw new abzz().a();
                                            break;
                                        }
                                        xhe xheVar = (xhe) abxdVarH;
                                        xheVar.getClass();
                                        jixVar.a.b(xheVar);
                                        jixVar.b.d = null;
                                    } else {
                                        continue;
                                    }
                                } catch (abxv e) {
                                    ((zdv) ((zdv) ((zdv) fgs.a.d()).p(e)).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer$IncomingHandler", "handleMessage", (char) 284, "KatnissInteractorProcessServicePeer.java")).u("Failed to parse incoming ClientOpResult.");
                                }
                            } else {
                                ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer$IncomingHandler", "handleMessage", 288, "KatnissInteractorProcessServicePeer.java")).x("Unsupported ClientOpResult[%s].", str);
                            }
                        } else if (str.equals("mediaOnDeviceResults")) {
                            byte[] byteArray3 = data.getByteArray(str);
                            fgs fgsVar7 = this.a;
                            fgsVar7.c.j(byteArray3);
                            try {
                                jjl jjlVar = fgsVar7.l.l;
                                if (jjlVar != null) {
                                    abxd abxdVarH2 = abxd.h(xhe.a, byteArray3, 0, byteArray3.length, ExtensionRegistryLite.getGeneratedRegistry());
                                    if (abxdVarH2 != null && (bByteValue2 = ((Byte) abxdVarH2.cM(1, null)).byteValue()) != 1) {
                                        if (bByteValue2 != 0) {
                                            boolean zL2 = abza.a.a(abxdVarH2.getClass()).l(abxdVarH2);
                                            abxdVarH2.cM(2, true != zL2 ? null : abxdVarH2);
                                            if (zL2) {
                                            }
                                        }
                                        throw new abzz().a();
                                        break;
                                    }
                                    xhe xheVar2 = (xhe) abxdVarH2;
                                    xheVar2.getClass();
                                    jjlVar.a.b(xheVar2);
                                    jjlVar.b.l = null;
                                } else {
                                    continue;
                                }
                            } catch (abxv e2) {
                                ((zdv) ((zdv) ((zdv) fgs.a.d()).p(e2)).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer$IncomingHandler", "handleMessage", (char) 270, "KatnissInteractorProcessServicePeer.java")).u("Failed to parse incoming ClientOpResult.");
                            }
                        } else {
                            ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer$IncomingHandler", "handleMessage", 288, "KatnissInteractorProcessServicePeer.java")).x("Unsupported ClientOpResult[%s].", str);
                        }
                    }
                    return;
                case 6:
                    this.a.b.p.addAndGet(1);
                    return;
                case 7:
                    this.a.b.p.addAndGet(-1);
                    return;
                case 8:
                    this.a.e.n();
                    return;
                case 9:
                    String string2 = data.getString("activityClassName");
                    String string3 = data.getString("lifecycleAction");
                    fgs fgsVar8 = this.a;
                    boolean zEquals = ((zdd) eyq.a).b.equals(string2);
                    eyw eywVar2 = fgsVar8.b;
                    if (zEquals) {
                        switch (string3.hashCode()) {
                            case -934426579:
                                if (string3.equals("resume")) {
                                    eywVar2.l = true;
                                    gph gphVar = eywVar2.d;
                                    if ((gphVar == gph.a || gphVar == gph.c) && ((Boolean) eywVar2.c.a()).booleanValue()) {
                                        eywVar2.f.d(eywVar2.e.a);
                                        break;
                                    }
                                }
                                break;
                            case 3540994:
                                if (string3.equals("stop")) {
                                    eywVar2.k = false;
                                    break;
                                }
                                break;
                            case 106440182:
                                if (string3.equals("pause")) {
                                    eywVar2.l = false;
                                    gph gphVar2 = eywVar2.d;
                                    if ((gphVar2 == gph.a || gphVar2 == gph.c) && ((Boolean) eywVar2.c.a()).booleanValue()) {
                                        eywVar2.f.a(eywVar2.e.a);
                                        break;
                                    }
                                }
                                break;
                            case 109757538:
                                if (string3.equals("start")) {
                                    eywVar2.k = true;
                                    break;
                                }
                                break;
                        }
                    }
                    if ("keyboardSearchActivityKey".equals(string2)) {
                        int iHashCode2 = string3.hashCode();
                        if (iHashCode2 != -934426579) {
                            if (iHashCode2 == 106440182 && string3.equals("pause")) {
                                eywVar2.j = false;
                            }
                        } else if (string3.equals("resume")) {
                            eywVar2.j = true;
                        }
                    }
                    if ("assistantSetupActivityKey".equals(string2)) {
                        int iHashCode3 = string3.hashCode();
                        if (iHashCode3 != -934426579) {
                            if (iHashCode3 == 106440182 && string3.equals("pause")) {
                                eywVar2.m = false;
                            }
                        } else if (string3.equals("resume")) {
                            eywVar2.m = true;
                        }
                    }
                    if ("assistantHotwordSetupActivityKey".equals(string2)) {
                        int iHashCode4 = string3.hashCode();
                        if (iHashCode4 != -934426579) {
                            if (iHashCode4 == 106440182 && string3.equals("pause")) {
                                eywVar2.n = false;
                            }
                        } else if (string3.equals("resume")) {
                            eywVar2.n = true;
                        }
                    }
                    if ("assistantHomegraphSetupActivityKey".equals(string2)) {
                        int iHashCode5 = string3.hashCode();
                        if (iHashCode5 != -934426579) {
                            if (iHashCode5 == 106440182 && string3.equals("pause")) {
                                eywVar2.o = false;
                            }
                        } else if (string3.equals("resume")) {
                            eywVar2.o = true;
                        }
                    }
                    if ("searchActivityKey".equals(string2)) {
                        switch (string3.hashCode()) {
                            case -934426579:
                                if (string3.equals("resume")) {
                                    Iterable$EL.forEach(eywVar2.b, new Consumer() { // from class: eys
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            ((eyn) obj).d();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return;
                                }
                                return;
                            case 3540994:
                                if (string3.equals("stop")) {
                                    eywVar2.h = false;
                                    eywVar2.i = false;
                                    Iterable$EL.forEach(eywVar2.b, new Consumer() { // from class: eyu
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            ((eyn) obj).f();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return;
                                }
                                return;
                            case 106440182:
                                if (string3.equals("pause")) {
                                    Iterable$EL.forEach(eywVar2.b, new Consumer() { // from class: eyt
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            ((eyn) obj).c();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return;
                                }
                                return;
                            case 109757538:
                                if (string3.equals("start")) {
                                    eywVar2.h = true;
                                    Iterable$EL.forEach(eywVar2.b, new Consumer() { // from class: eyr
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            ((eyn) obj).e();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return;
                                }
                                return;
                            case 1557372922:
                                if (string3.equals("destroy")) {
                                    Iterable$EL.forEach(eywVar2.b, new Consumer() { // from class: eyv
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            ((eyn) obj).b();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                case 10:
                    fgs fgsVar9 = this.a;
                    boolean z = data.getBoolean("response_rendered");
                    eyw eywVar3 = fgsVar9.b;
                    eywVar3.g = z;
                    if (z) {
                        Iterator it = eywVar3.b.iterator();
                        while (it.hasNext()) {
                            ((eyn) it.next()).a();
                        }
                        return;
                    }
                    return;
                default:
                    switch (i2) {
                        case 15:
                            fgs fgsVar10 = this.a;
                            if (data == null || data.isEmpty()) {
                                ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleMirrorSettingsRequest", 408, "KatnissInteractorProcessServicePeer.java")).u("Received an intent with a blank extras field. Ignoring.");
                                return;
                            }
                            for (String str2 : data.keySet()) {
                                icg icgVarA = icg.a.a(str2);
                                int i4 = icgVarA.x;
                                int i5 = i4 - 1;
                                if (i4 == 0) {
                                    throw null;
                                }
                                if (i5 == 0) {
                                    fgsVar10.m.e(icgVarA, data.getBoolean(str2, false));
                                } else if (i5 == 1) {
                                    fgsVar10.m.f(icgVarA, data.getInt(str2, 0));
                                } else if (i5 == 2) {
                                    fgsVar10.m.g(icgVarA, yqv.b(data.getString(str2)));
                                } else if (i5 == 3) {
                                    Collection stringArrayList = data.getStringArrayList(str2);
                                    if (stringArrayList == null) {
                                        int i6 = yyk.e;
                                        stringArrayList = zcg.b;
                                    }
                                    fgsVar10.m.h(icgVarA, stringArrayList);
                                }
                            }
                            return;
                        case 16:
                            String string4 = data.getString("query");
                            fgs fgsVar11 = this.a;
                            fgsVar11.f.k(null);
                            if (yqv.c(string4)) {
                                return;
                            }
                            fgsVar11.e.A(string4, false, jlv.INVOCATION_TYPE_ESCAPE_HATCH_REISSUE_QUERY);
                            return;
                        case 17:
                            byte[] byteArray4 = data.getByteArray("suggested_queries");
                            int i7 = yyk.e;
                            yyf yyfVar = new yyf(4);
                            if (byteArray4 != null) {
                                try {
                                    abxd abxdVarH3 = abxd.h(xuy.a, byteArray4, 0, byteArray4.length, ExtensionRegistryLite.getGeneratedRegistry());
                                    if (abxdVarH3 != 0 && (bByteValue3 = ((Byte) abxdVarH3.cM(1, null)).byteValue()) != 1) {
                                        if (bByteValue3 != 0) {
                                            boolean zL3 = abza.a.a(abxdVarH3.getClass()).l(abxdVarH3);
                                            if (true == zL3) {
                                                duration = abxdVarH3;
                                            }
                                            abxdVarH3.cM(2, duration);
                                            if (zL3) {
                                            }
                                        }
                                        throw new abzz().a();
                                    }
                                    yyfVar.h(((xuy) abxdVarH3).c);
                                } catch (abxv e3) {
                                    ((zdv) ((zdv) ((zdv) fgs.a.d()).p(e3)).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer$IncomingHandler", "handleMessage", (char) 351, "KatnissInteractorProcessServicePeer.java")).u("Invalid suggested queries response.");
                                }
                            }
                            this.a.f.l(yyfVar.f());
                            return;
                        case 18:
                            this.a.b.p.set(0);
                            return;
                        default:
                            switch (i2) {
                                case 34:
                                    fgs fgsVar12 = this.a;
                                    String strB = yqv.b(data.getString("ledAction"));
                                    jma jmaVar = fgsVar12.j;
                                    switch (strB.hashCode()) {
                                        case -828297909:
                                            if (strB.equals("led_set_is_hotword_source_false")) {
                                                jmaVar.b.h(false);
                                                return;
                                            }
                                            break;
                                        case 52986171:
                                            if (strB.equals("led_off")) {
                                                jmaVar.b.f();
                                                return;
                                            }
                                            break;
                                        case 315865462:
                                            if (strB.equals("led_to_idle_state")) {
                                                jmaVar.b.j();
                                                return;
                                            }
                                            break;
                                        case 666451046:
                                            if (strB.equals("led_set_is_hotword_source_true")) {
                                                jmaVar.b.h(true);
                                                return;
                                            }
                                            break;
                                        case 1642526669:
                                            if (strB.equals("led_mute")) {
                                                jmaVar.b.d();
                                                return;
                                            }
                                            break;
                                        case 2143412705:
                                            if (strB.equals("led_responding")) {
                                                jmaVar.b.g();
                                                return;
                                            }
                                            break;
                                    }
                                    ((zdv) jma.a.d().q("com/google/android/apps/tvsearch/voice/libassistant/led/LibAssistantLedUtils", "executeLedAction", 54, "LibAssistantLedUtils.kt")).x("Discarding unexpected LedAction: %s", strB);
                                    return;
                                case 35:
                                    break;
                                case 36:
                                    this.a.e.t();
                                    return;
                                default:
                                    switch (i2) {
                                        case 53:
                                            this.a.o.g = data.getByteArray("xuikitParams");
                                            return;
                                        case 54:
                                            this.a.r.a((Account) data.getParcelable("account"));
                                            return;
                                        case 55:
                                            String string5 = data.getString("searchTerm");
                                            jlv jlvVar = jlv.INVOCATION_TYPE_TEXT_SEARCH;
                                            jlv jlvVarB = jlv.b(data.getInt("invocationType", jlvVar.k));
                                            if (jlvVarB != null) {
                                                jlvVar = jlvVarB;
                                            }
                                            if (yqv.c(string5)) {
                                                return;
                                            }
                                            this.a.e.A(string5, true, jlvVar);
                                            return;
                                        case 56:
                                            String string6 = data.getString("fcmToken");
                                            if (string6 != null) {
                                                this.a.e.r(string6);
                                                return;
                                            }
                                            return;
                                        case 57:
                                            this.a.e.z(data);
                                            return;
                                        case 58:
                                            fgs fgsVar13 = this.a;
                                            if (data == null || !data.containsKey("KatnissAppFlowEvent")) {
                                                return;
                                            }
                                            try {
                                                byte[] byteArray5 = data.getByteArray("KatnissAppFlowEvent");
                                                abxd abxdVarH4 = abxd.h(ggi.a, byteArray5, 0, byteArray5.length, ExtensionRegistryLite.getGeneratedRegistry());
                                                if (abxdVarH4 != 0 && (bByteValue4 = ((Byte) abxdVarH4.cM(1, null)).byteValue()) != 1) {
                                                    if (bByteValue4 != 0) {
                                                        boolean zL4 = abza.a.a(abxdVarH4.getClass()).l(abxdVarH4);
                                                        if (true == zL4) {
                                                            duration = abxdVarH4;
                                                        }
                                                        abxdVarH4.cM(2, duration);
                                                        if (zL4) {
                                                        }
                                                    }
                                                    throw new abzz().a();
                                                }
                                                ((geu) fgsVar13.d.a()).a((ggi) abxdVarH4);
                                                return;
                                            } catch (abxv e4) {
                                                ((zdv) ((zdv) ((zdv) fgs.a.d()).p(e4)).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleKatnissAppFlowEventLogging", (char) 503, "KatnissInteractorProcessServicePeer.java")).u("Invalid Katniss AppFlow Event for AppFlow Logging");
                                                return;
                                            }
                                        default:
                                            ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer$IncomingHandler", "handleMessage", 401, "KatnissInteractorProcessServicePeer.java")).v("Receive unknown message %s cannot be handled", message.what);
                                            return;
                                    }
                            }
                    }
            }
        }
        fgs fgsVar14 = this.a;
        int i8 = message.what;
        if (data != null) {
            String string7 = data.getString("AppflowEventKey");
            if (i8 == 35) {
                rqs rqsVarA = rpn.a(string7);
                if (rqsVarA == null) {
                    ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 525, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging unknown AppFlow event with name: %s", string7);
                    return;
                }
                if (!data.containsKey("AppflowEventCustomStatusCode")) {
                    abqb abqbVarA = fgsVar14.a(data);
                    if (abqbVarA == null) {
                        ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 548, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging AppFlow event [%s] with invalid status code.", rqsVarA);
                        return;
                    } else {
                        fgsVar14.h.a(rqsVarA, abqbVarA, data.containsKey("AppflowElapsedTime") ? Duration.ofNanos(data.getLong("AppflowElapsedTime")) : null, fgsVar14.b(data));
                        return;
                    }
                }
                int iE = fgsVar14.e(data);
                if (iE == 0) {
                    ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 533, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging AppFlow event [%s] with invalid custom status code.", rqsVarA);
                    return;
                } else if (data.containsKey("AppflowElapsedTime")) {
                    fgsVar14.h.e(rqsVarA, iE, Duration.ofNanos(data.getLong("AppflowElapsedTime")));
                    return;
                } else {
                    fgsVar14.h.d(rqsVarA, iE);
                    return;
                }
            }
            if (i8 == 50) {
                rqs rqsVarA2 = rpn.a(string7);
                if (rqsVarA2 == null) {
                    ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 563, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging unknown AppFlow start event with name: %s", string7);
                    return;
                } else {
                    fgsVar14.h.b(rqsVarA2, data.containsKey("AppflowElapsedTime") ? Duration.ofNanos(data.getLong("AppflowElapsedTime")) : null, fgsVar14.b(data));
                    return;
                }
            }
            if (i8 != 51) {
                return;
            }
            rqw rqwVarB = rpn.b(string7);
            if (string7 != null && rqwVarB == null) {
                ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 580, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging unknown AppFlow end event with name: %s", string7);
                return;
            }
            if (!data.containsKey("AppflowEventCustomStatusCode")) {
                abqb abqbVarA2 = fgsVar14.a(data);
                if (abqbVarA2 == null) {
                    ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 604, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging AppFlow end event [%s] with invalid status code.", rqwVarB);
                    return;
                } else {
                    fgsVar14.h.c(rqwVarB, abqbVarA2, data.containsKey("AppflowElapsedTime") ? Duration.ofNanos(data.getLong("AppflowElapsedTime")) : null, fgsVar14.b(data));
                    return;
                }
            }
            int iE2 = fgsVar14.e(data);
            if (iE2 == 0) {
                ((zdv) ((zdv) fgs.a.d()).q("com/google/android/apps/tvsearch/controller/services/KatnissInteractorProcessServicePeer", "handleAppFlowLogging", 588, "KatnissInteractorProcessServicePeer.java")).x("Skipped logging AppFlow end event [%s] with invalid custom status code.", rqwVarB);
            } else if (data.containsKey("AppflowElapsedTime")) {
                fgsVar14.h.g(rqwVarB, iE2, Duration.ofNanos(data.getLong("AppflowElapsedTime")));
            } else {
                fgsVar14.h.f(rqwVarB, iE2);
            }
        }
    }
}
