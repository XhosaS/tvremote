package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbq extends Handler {
    final /* synthetic */ fbv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbq(fbv fbvVar) {
        super(Looper.getMainLooper());
        this.a = fbvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws abxv, PackageManager.NameNotFoundException {
        String str;
        int iA;
        byte bByteValue;
        message.getClass();
        fbv fbvVar = this.a;
        PackageManager packageManager = fbvVar.o;
        String[] packagesForUid = packageManager.getPackagesForUid(message.sendingUid);
        abar abarVarG = null;
        abarVarG = null;
        Object obj = null;
        abxd abxdVar = null;
        if (packagesForUid != null) {
            for (int i = 0; i < packagesForUid.length; i++) {
                str = packagesForUid[i];
                if (((acfo) fbvVar.r.a()).b.contains(str)) {
                    if (fbv.b.contains(str)) {
                        Map map = fbv.c;
                        if (map.keySet().contains(str)) {
                            str.getClass();
                            Signature signature = (Signature) map.get(str);
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                                packageInfo.getClass();
                                SigningInfo signingInfo = packageInfo.signingInfo;
                                Signature[] signingCertificateHistory = signingInfo != null ? signingInfo.getSigningCertificateHistory() : null;
                                if (signingCertificateHistory == null || signingCertificateHistory.length == 0) {
                                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "verifySigningCertificate", 872, "AppAssistantIntegrationServicePeer.kt")).u("Signature verification of app sending message failed: app sending message doesn't have signing certificate in PackageInfo#signingInfo.");
                                } else if (!agvy.c(signature, signingCertificateHistory[0])) {
                                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "verifySigningCertificate", 863, "AppAssistantIntegrationServicePeer.kt")).u("Signature verification of app sending message failed: app sending message doesn't have expected signing certificate.");
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                ((zdv) ((zdv) fbv.a.d()).p(e).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "verifySigningCertificate", 851, "AppAssistantIntegrationServicePeer.kt")).x("Package name %s not found.", str);
                            }
                            str = null;
                        } else {
                            str = null;
                        }
                    }
                }
            }
            ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "checkPermissions", 838, "AppAssistantIntegrationServicePeer.kt")).u("Permission denied: App sending message is not allowlisted.");
            str = null;
        } else {
            ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "checkPermissions", 838, "AppAssistantIntegrationServicePeer.kt")).u("Permission denied: App sending message is not allowlisted.");
            str = null;
        }
        fbvVar.v = str;
        if (str == null) {
            return;
        }
        switch (message.what) {
            case 1:
                fbv fbvVar2 = this.a;
                if (fbvVar2.k == gph.a && agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    ahal.e(fbvVar2.h, null, 0, new fbt(fbvVar2, null), 3);
                    fbvVar2.x = new fbu(fbvVar2);
                    ConversationStateListener conversationStateListener = fbvVar2.x;
                    if (conversationStateListener != null) {
                        ((jnb) fbvVar2.n.a()).b(conversationStateListener);
                    }
                }
                fbvVar2.w = message.replyTo;
                fbvVar2.f.n(str);
                return;
            case 2:
                fbv fbvVar3 = this.a;
                Bundle bundle = (Bundle) message.obj;
                if (bundle == null) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleAppContext", 225, "AppAssistantIntegrationServicePeer.kt")).u("No bundle found in APP_CONTEXT message.");
                    fbvVar3.f.m(null);
                    return;
                }
                byte[] byteArray = bundle.getByteArray("data_as_bytes");
                if (byteArray == null || byteArray.length == 0) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleAppContext", 221, "AppAssistantIntegrationServicePeer.kt")).u("Data not found in APP_CONTEXT bundle.");
                    fbvVar3.f.m(null);
                    return;
                }
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                try {
                    abar abarVarB = abaw.b(new String(byteArray, charset));
                    abau abauVarF = abarVarB instanceof abau ? abarVarB.f() : null;
                    if (abauVarF != null) {
                        abarVarG = abauVarF.g("inAppInteractionEvent");
                    }
                } catch (abay unused) {
                }
                if (abarVarG != null) {
                    fbvVar3.b(abarVarG);
                    return;
                } else {
                    fbvVar3.f.m(abvo.u(byteArray, 0, byteArray.length));
                    return;
                }
            case 3:
            case 6:
            case 7:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            default:
                super.handleMessage(message);
                return;
            case 4:
                fbv fbvVar4 = this.a;
                if (!agvy.c(str, "com.netflix.ninja")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleGlobalQueryRoutingToken", 252, "AppAssistantIntegrationServicePeer.kt")).u("Received message GLOBAL_QUERY_ROUTING_TOKEN from a non-Netflix app. Unexpected!");
                    return;
                }
                Bundle bundle2 = (Bundle) message.obj;
                if (bundle2 == null) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleGlobalQueryRoutingToken", 247, "AppAssistantIntegrationServicePeer.kt")).u("No bundle found in the message.");
                    return;
                }
                String string = bundle2.getString("token");
                if (string != null) {
                    ahal.e(fbvVar4.h, null, 0, new fbr(fbvVar4, str, string, null), 3);
                    return;
                } else {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleGlobalQueryRoutingToken", 244, "AppAssistantIntegrationServicePeer.kt")).u("Global query routing token not found in the message bundle.");
                    return;
                }
            case 5:
                fbv fbvVar5 = this.a;
                if (!agvy.c(str, "com.netflix.ninja")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleInAppQueryRoutingToken", 276, "AppAssistantIntegrationServicePeer.kt")).u("Received message IN_APP_QUERY_ROUTING_TOKEN from a non-Netflix app. Unexpected!");
                    return;
                }
                Bundle bundle3 = (Bundle) message.obj;
                if (bundle3 == null) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleInAppQueryRoutingToken", 271, "AppAssistantIntegrationServicePeer.kt")).u("No bundle found in the message.");
                    return;
                }
                String string2 = bundle3.getString("token");
                if (string2 != null) {
                    fbvVar5.f.i(str, string2);
                    return;
                } else {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleInAppQueryRoutingToken", 268, "AppAssistantIntegrationServicePeer.kt")).u("In-app query routing token not found in the message bundle.");
                    return;
                }
            case 8:
                if (!agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideWatchActionsRequest", 334, "AppAssistantIntegrationServicePeer.kt")).u("Received message CLIENT_SIDE_WATCH_ACTIONS_REQUEST from a non-LauncherX app. Unexpected!");
                    return;
                }
                Bundle bundle4 = (Bundle) message.obj;
                fbvVar.w = message.replyTo;
                if (bundle4 == null) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideWatchActionsRequest", 352, "AppAssistantIntegrationServicePeer.kt")).u("No bundle found in the message.");
                    return;
                }
                byte[] byteArray2 = bundle4.getByteArray("data_as_bytes");
                if (byteArray2 == null) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideWatchActionsRequest", 349, "AppAssistantIntegrationServicePeer.kt")).u("clientSideSearchRequestByte not found in the message bundle.");
                    return;
                }
                try {
                    abxd abxdVarH = abxd.h(jao.a, byteArray2, 0, byteArray2.length, ExtensionRegistryLite.getGeneratedRegistry());
                    if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            if (true == zL) {
                                abxdVar = abxdVarH;
                            }
                            abxdVarH.cM(2, abxdVar);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                    jao jaoVar = (jao) abxdVarH;
                    jaoVar.getClass();
                    fbvVar.t = jaoVar.b;
                    fbvVar.u = jaoVar.c;
                    xmk xmkVar = xmk.a;
                    xmh xmhVar = new xmh();
                    String str2 = fbvVar.t;
                    if (str2 != null) {
                        if ((xmhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xmhVar.y();
                        }
                        xmk xmkVar2 = (xmk) xmhVar.b;
                        xmkVar2.b |= 1;
                        xmkVar2.e = str2;
                    }
                    int i2 = jaoVar.d;
                    if ((xmhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xmhVar.y();
                    }
                    xmk xmkVar3 = (xmk) xmhVar.b;
                    xmkVar3.b |= 2048;
                    xmkVar3.m = i2;
                    xmk xmkVarA = xlu.a(xmhVar);
                    xmy xmyVar = xmy.a;
                    xmv xmvVar = new xmv();
                    DesugarCollections.unmodifiableList(((xmy) xmvVar.b).b).getClass();
                    xmx xmxVar = xmx.a;
                    xmw xmwVar = new xmw();
                    if ((xmwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xmwVar.y();
                    }
                    xmx xmxVar2 = (xmx) xmwVar.b;
                    xmxVar2.c = xmkVarA;
                    xmxVar2.b |= 1;
                    abxd abxdVarV = xmwVar.v();
                    abxdVarV.getClass();
                    xmx xmxVar3 = (xmx) abxdVarV;
                    if ((xmvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xmvVar.y();
                    }
                    xmy xmyVar2 = (xmy) xmvVar.b;
                    abxs abxsVar = xmyVar2.b;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        xmyVar2.b = abxsVar.d(size + size);
                    }
                    xmyVar2.b.add(xmxVar3);
                    abxd abxdVarV2 = xmvVar.v();
                    abxdVarV2.getClass();
                    xmy xmyVar3 = (xmy) abxdVarV2;
                    fby fbyVar = fbvVar.f;
                    byte[] bArrY = fbyVar.y();
                    fbyVar.f();
                    if (fbvVar.a(bArrY).e.size() <= 0 || !fbvVar.d(bArrY)) {
                        fbp fbpVar = fbvVar.e;
                        try {
                            int i3 = xmyVar3.memoizedSerializedSize;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(xmyVar3.getClass()).a(xmyVar3);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i3 & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(xmyVar3.getClass()).a(xmyVar3);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    xmyVar3.memoizedSerializedSize = (Integer.MIN_VALUE & xmyVar3.memoizedSerializedSize) | iA;
                                }
                            }
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(xmyVar3.getClass()).m(xmyVar3, abwa.a(abvwVar));
                            abvwVar.K();
                            fbpVar.b(bArr);
                            return;
                        } catch (IOException e2) {
                            throw new RuntimeException(a.A(xmyVar3, "byte array"), e2);
                        }
                    }
                    return;
                } catch (abxv e3) {
                    ((zdv) ((zdv) fbv.a.b()).p(e3).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "sendClientSideSearchRequest", 686, "AppAssistantIntegrationServicePeer.kt")).u("Failed to parse ClientSideSearchRequest.");
                    return;
                }
            case 9:
                if (!agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleTriggerContextualSpaceTips", 360, "AppAssistantIntegrationServicePeer.kt")).u("Received message TRIGGER_CONTEXTUAL_SPACE_TIPS from a non-LauncherX app. Unexpected!");
                    return;
                }
                Bundle bundle5 = (Bundle) message.obj;
                if (bundle5 == null) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleTriggerContextualSpaceTips", 378, "AppAssistantIntegrationServicePeer.kt")).u("No bundle found in TRIGGER_CONTEXTUAL_SPACE_TIPS message.");
                    return;
                }
                boolean z2 = bundle5.getBoolean("is_assistant_content");
                byte[] byteArray3 = bundle5.getByteArray("data_as_bytes");
                if (byteArray3 == null || byteArray3.length == 0) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleTriggerContextualSpaceTips", 375, "AppAssistantIntegrationServicePeer.kt")).u("Data not found in TRIGGER_CONTEXTUAL_SPACE_TIPS bundle.");
                    return;
                } else {
                    fbvVar.e.c(z2, byteArray3);
                    return;
                }
            case 10:
                if (agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    fbvVar.e.a();
                    return;
                } else {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleCancelContextualSpaceTips", 386, "AppAssistantIntegrationServicePeer.kt")).u("Received message CANCEL_CONTEXTUAL_SPACE_TIPS from a non-LauncherX app. Unexpected!");
                    return;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTtsStopRequest", 323, "AppAssistantIntegrationServicePeer.kt")).u("Received message CLIENT_SIDE_TTS_STOP_REQUEST from a non-LauncherX app. Unexpected!");
                    return;
                } else {
                    ((jdt) fbvVar.g.a()).J();
                    ((zdv) fbv.a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTtsStopRequest", 327, "AppAssistantIntegrationServicePeer.kt")).u("#handleClientSideTtsStopRequest");
                    return;
                }
            case 15:
                if (((Boolean) fbvVar.i.a()).booleanValue()) {
                    if (!agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                        ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleKatnissTriggeredRenderingResult", 403, "AppAssistantIntegrationServicePeer.kt")).u("Received message KATNISS_TRIGGERED_RENDERING_RESULT from a non-LauncherX app. Unexpected!");
                        return;
                    }
                    Bundle bundle6 = (Bundle) message.obj;
                    if (bundle6 == null) {
                        ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleKatnissTriggeredRenderingResult", 412, "AppAssistantIntegrationServicePeer.kt")).u("No bundle found in the message.");
                        return;
                    }
                    byte[] byteArray4 = bundle6.getByteArray("data_as_bytes");
                    if (byteArray4 == null) {
                        ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleKatnissTriggeredRenderingResult", 419, "AppAssistantIntegrationServicePeer.kt")).u("No proto data found in the message bundle.");
                        return;
                    } else {
                        ahal.e(fbvVar.h, null, 0, new fbs(fbvVar.y.a(), Instant.now(), byteArray4, fbvVar, null), 3);
                        return;
                    }
                }
                return;
            case 16:
                if (!agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleGeminiSettingsUpdate", 547, "AppAssistantIntegrationServicePeer.kt")).u("Received message GEMINI_SETTINGS_UPDATE from a non-LauncherX app. Unexpected!");
                    return;
                }
                Bundle bundle7 = (Bundle) message.obj;
                if (bundle7 != null) {
                    lzb lzbVar = fbvVar.s;
                    lzbVar.k();
                    Message messageObtain = Message.obtain((Handler) null, 59);
                    messageObtain.setData(bundle7);
                    lzbVar.j(messageObtain);
                    return;
                }
                return;
            case 17:
                if (!agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                    ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 284, "AppAssistantIntegrationServicePeer.kt")).u("Unexpected CLIENT_SIDE_TAB_SEARCH_REQUEST message received from a non-LauncherX app.");
                    return;
                }
                Bundle bundle8 = (Bundle) message.obj;
                if (bundle8 != null) {
                    if (!bundle8.containsKey("tab_search_context")) {
                        ((zdv) fbv.a.c().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 291, "AppAssistantIntegrationServicePeer.kt")).u("Message argument for tab type is missing");
                        obj = agpu.a;
                    } else if (bundle8.containsKey("tab_search_query")) {
                        String string3 = bundle8.getString("tab_search_query");
                        if (string3 == null || string3.length() == 0) {
                            ((zdv) fbv.a.c().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 295, "AppAssistantIntegrationServicePeer.kt")).u("Query argument for message is empty");
                            obj = agpu.a;
                        } else {
                            String string4 = bundle8.getString("tab_search_query");
                            if (string4 != null) {
                                if (bundle8.getBoolean("tab_search_context")) {
                                    ((zdv) fbv.a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 299, "AppAssistantIntegrationServicePeer.kt")).x("Sending app search interaction with query \"%s\".", string4);
                                    ((jdt) fbvVar.g.a()).y(string4);
                                } else {
                                    ((zdv) fbv.a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 302, "AppAssistantIntegrationServicePeer.kt")).x("Sending search interaction with query \"%s\".", string4);
                                    ((gfn) fbvVar.m.a()).a(rpm.cZ()).b().c();
                                    ((jhs) fbvVar.j.a()).j(10);
                                    ((jdt) fbvVar.g.a()).A(string4, true, jlv.INVOCATION_TYPE_TEXT_SEARCH);
                                }
                                obj = string4;
                            }
                        }
                    } else {
                        ((zdv) fbv.a.c().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 293, "AppAssistantIntegrationServicePeer.kt")).u("Message argument for query is missing");
                        obj = agpu.a;
                    }
                    if (obj != null) {
                        return;
                    }
                }
                ((zdv) fbv.a.c().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "handleClientSideTabSearchRequest", 316, "AppAssistantIntegrationServicePeer.kt")).u("Message arguments are missing");
                return;
        }
    }
}
