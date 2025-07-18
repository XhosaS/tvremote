package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbv extends fbw implements fce {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer");
    public static final Set b;
    public static final Map c;
    public final fiu d;
    public final fbp e;
    public final fby f;
    public final agow g;
    public final ahbt h;
    public final agow i;
    public final agow j;
    public final gph k;
    public final gtu l;
    public final agow m;
    public final agow n;
    public final PackageManager o;
    public final fus p;
    public final agow q;
    public final agow r;
    public final lzb s;
    public String t;
    public String u;
    public String v;
    public Messenger w;
    public ConversationStateListener x;
    public final mcw y;

    static {
        agqj.p(new String[]{"dev.cobalt.coat", "com.netflix.ninja"});
        Set setSingleton = Collections.singleton("com.netflix.ninja");
        setSingleton.getClass();
        b = setSingleton;
        c = agrj.c(new agpi("com.netflix.ninja", fci.a));
        agrj.c(new agpi("com.netflix.ninja", fci.b));
    }

    public fbv(fiu fiuVar, fbp fbpVar, fby fbyVar, agow agowVar, mcw mcwVar, ahbt ahbtVar, agow agowVar2, agow agowVar3, gph gphVar, gtu gtuVar, agow agowVar4, agow agowVar5, PackageManager packageManager, fus fusVar, agow agowVar6, agow agowVar7, lzb lzbVar) {
        fiuVar.getClass();
        fbpVar.getClass();
        fbyVar.getClass();
        agowVar.getClass();
        mcwVar.getClass();
        ahbtVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        gtuVar.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        lzbVar.getClass();
        this.d = fiuVar;
        this.e = fbpVar;
        this.f = fbyVar;
        this.g = agowVar;
        this.y = mcwVar;
        this.h = ahbtVar;
        this.i = agowVar2;
        this.j = agowVar3;
        this.k = gphVar;
        this.l = gtuVar;
        this.m = agowVar4;
        this.n = agowVar5;
        this.o = packageManager;
        this.p = fusVar;
        this.q = agowVar6;
        this.r = agowVar7;
        this.s = lzbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e7, code lost:
    
        if (r10 != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jaw a(byte[] r10) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbv.a(byte[]):jaw");
    }

    public final void b(abar abarVar) {
        String strC;
        if (!(abarVar instanceof abau)) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "processInAppInteractionEvent", 558, "AppAssistantIntegrationServicePeer.kt")).u("In-app interaction event json element is not a json object.");
            return;
        }
        abau abauVarF = abarVar.f();
        int iA = 0;
        if (abauVarF.a.containsKey("type")) {
            try {
                iA = abauVarF.g("type").a();
            } catch (IllegalStateException e) {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "processInAppInteractionEvent", 581, "AppAssistantIntegrationServicePeer.kt")).u("Couldn't parse in-app interaction event type json element.");
            } catch (NumberFormatException e2) {
                ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "processInAppInteractionEvent", 571, "AppAssistantIntegrationServicePeer.kt")).u("Couldn't parse in-app interaction event type json element.");
            } catch (UnsupportedOperationException e3) {
                ((zdv) ((zdv) a.d()).p(e3).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "processInAppInteractionEvent", 576, "AppAssistantIntegrationServicePeer.kt")).u("Couldn't parse in-app interaction event type json element.");
            }
        }
        if (abauVarF.a.containsKey("inAppCommandIdentifier")) {
            try {
                strC = abauVarF.g("inAppCommandIdentifier").c();
                strC.getClass();
            } catch (IllegalStateException e4) {
                ((zdv) ((zdv) a.d()).p(e4).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "processInAppInteractionEvent", 598, "AppAssistantIntegrationServicePeer.kt")).u("Couldn't parse in-app interaction event identifier json element.");
            } catch (UnsupportedOperationException e5) {
                ((zdv) ((zdv) a.d()).p(e5).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "processInAppInteractionEvent", 593, "AppAssistantIntegrationServicePeer.kt")).u("Couldn't parse in-app interaction event identifier json element.");
            }
        } else {
            strC = "";
        }
        this.f.h(iA, strC);
    }

    public final void c(boolean z) throws RemoteException {
        Messenger messenger = this.w;
        if (messenger != null) {
            Message messageA = gzr.a(14);
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_tts_playing", z);
            messageA.obj = bundle;
            try {
                messenger.send(messageA);
            } catch (RemoteException unused) {
                ((zdv) a.b().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "updateTtsStatus", 917, "AppAssistantIntegrationServicePeer.kt")).u("Exception on updating tts status to bound app. The messenger is likely dead.");
            }
        }
    }

    @Override // defpackage.fce
    public final boolean d(byte[] bArr) throws abxv, RemoteException {
        int iA;
        bArr.getClass();
        Messenger messenger = this.w;
        if (messenger != null && agvy.c(this.v, "com.google.android.apps.tv.launcherx")) {
            Bundle bundle = new Bundle();
            jaw jawVarA = a(bArr);
            jawVarA.e.size();
            try {
                int i = jawVarA.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(jawVarA.getClass()).a(jawVarA);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(jawVarA.getClass()).a(jawVarA);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        jawVarA.memoizedSerializedSize = (Integer.MIN_VALUE & jawVarA.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr2 = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr2, 0, iA);
                abza.a.a(jawVarA.getClass()).m(jawVarA, abwa.a(abvwVar));
                abvwVar.K();
                bundle.putByteArray("data_as_bytes", bArr2);
                try {
                    messenger.send(Message.obtain(null, 7, bundle));
                    return true;
                } catch (RemoteException e) {
                    ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "onOnDeviceResultReceived", 769, "AppAssistantIntegrationServicePeer.kt")).u("Exception on sending on device results message to LauncherX.");
                }
            } catch (IOException e2) {
                throw new RuntimeException(a.x(jawVarA, "Serializing ", " to a byte array threw an IOException (should never happen)."), e2);
            }
        }
        return false;
    }
}
