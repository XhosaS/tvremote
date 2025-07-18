package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.assistant.sdk.libassistant.AssistantManagerNative;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import com.google.assistant.sdk.libassistant.DeviceStateListener;
import com.google.assistant.sdk.libassistant.IllegalAssistantUsageException;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfu extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfu(jhh jhhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jfu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$destroyInternal$2", "invokeSuspend", 976, "AssistantWrapperImpl.kt")).u("Destroying Assistant");
            jhh jhhVar = this.b;
            AssistantManagerNative assistantManagerNative = jhhVar.af;
            if (assistantManagerNative != null) {
                assistantManagerNative.removeDeviceStateListener(jhhVar.aj);
            }
            try {
                AssistantManagerNative assistantManagerNative2 = jhhVar.af;
                if (assistantManagerNative2 != null) {
                    assistantManagerNative2.destroy();
                }
            } catch (IllegalAssistantUsageException e) {
                ((zdv) ((zdv) jhh.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$destroyInternal$2", "invokeSuspend", 981, "AssistantWrapperImpl.kt")).u("Exception while destroying current instance.");
            }
            jhh jhhVar2 = this.b;
            jhhVar2.af = null;
            jhhVar2.s(jhhVar2.Q);
            jhhVar2.M.c.remove(jhhVar2);
            jhhVar2.e.b.remove(jhhVar2);
            jhhVar2.U = false;
            jhhVar2.s(jhhVar2.d);
            this.a = 1;
            if (jhhVar2.ao(this) == agtgVar) {
                return agtgVar;
            }
        }
        jhh jhhVar3 = this.b;
        if (jhhVar3.ab) {
            File file = new File((String) jhhVar3.h.a());
            try {
                if (file.isFile()) {
                    file.delete();
                    jhhVar3.ab = false;
                }
            } catch (SecurityException e2) {
                ((zdv) ((zdv) jhh.a.d()).p(e2).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "deleteCastIdFile", 1895, "AssistantWrapperImpl.kt")).x("File delete failed. File path: %s", file);
            }
        }
        jhh jhhVar4 = this.b;
        Object objA = jhhVar4.z.a();
        objA.getClass();
        final ConversationStateListener conversationStateListener = (ConversationStateListener) objA;
        jhhVar4.ax("removeConversationStateListener", new agux() { // from class: jew
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                AssistantManagerNative assistantManagerNative3 = (AssistantManagerNative) obj2;
                zdy zdyVar = jhh.a;
                assistantManagerNative3.getClass();
                assistantManagerNative3.removeConversationStateListener(conversationStateListener);
                return agpu.a;
            }
        });
        jhhVar4.l.o = false;
        final agxf agxfVar = jhhVar4.ae;
        jhhVar4.c.removeTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: jdy
            /* JADX WARN: Type inference failed for: r0v1, types: [agux, agxf] */
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                zdy zdyVar = jhh.a;
                agxfVar.a(Boolean.valueOf(z));
            }
        });
        final DeviceStateListener deviceStateListener = jhhVar4.D.c;
        deviceStateListener.getClass();
        jhhVar4.ax("removeDeviceStateListener", new agux() { // from class: jfi
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                AssistantManagerNative assistantManagerNative3 = (AssistantManagerNative) obj2;
                zdy zdyVar = jhh.a;
                assistantManagerNative3.getClass();
                assistantManagerNative3.removeDeviceStateListener(deviceStateListener);
                return agpu.a;
            }
        });
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jfu(this.b, agswVar);
    }
}
