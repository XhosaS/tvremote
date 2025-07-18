package defpackage;

import com.google.assistant.sdk.libassistant.DeviceStateListener;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhc extends DeviceStateListener {
    final /* synthetic */ jhh a;

    public jhc(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
    public final void OnAuthenticationReceived(boolean z) {
        ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$startCompletionListener$1", "OnAuthenticationReceived", 493, "AssistantWrapperImpl.kt")).x("LibAssistant received Auth Token in %s mode.", true != z ? "sign-out" : "sign-in");
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
    public final void OnDeviceStateChange(byte[] bArr) throws abxv {
        bArr.getClass();
        try {
            abxd abxdVarH = abxd.h(xwo.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
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
            }
            xwo xwoVar = (xwo) abxdVarH;
            xwoVar.getClass();
            if ((xwoVar.b & 131072) != 0) {
                xwk xwkVar = xwoVar.c;
                if (xwkVar == null) {
                    xwkVar = xwk.a;
                }
                if ((2 & xwkVar.b) != 0) {
                    xwk xwkVar2 = xwoVar.c;
                    if (xwkVar2 == null) {
                        xwkVar2 = xwk.a;
                    }
                    ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$startCompletionListener$1", "OnDeviceStateChange", 512, "AssistantWrapperImpl.kt")).x("LibAssistant device state gia conversation state: %s", Integer.toString((xwj.a(xwkVar2.c) != 0 ? r9 : 1) - 1));
                    return;
                }
            }
            zdy zdyVar = jhh.a;
        } catch (Exception e) {
            ((zdv) ((zdv) jhh.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$startCompletionListener$1", "OnDeviceStateChange", 504, "AssistantWrapperImpl.kt")).u("Failed to parse LibAssistant DeviceState");
        }
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
    public final void OnStartFinished() {
        jhh jhhVar = this.a;
        ahal.e(jhhVar.j, null, 0, new jhb(jhhVar, null), 3).w(new agux() { // from class: jha
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((zdv) ((zdv) jhh.a.c()).p(th).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$startCompletionListener$1", "OnStartFinished$lambda$0", 485, "AssistantWrapperImpl.kt")).u("Failed to process init_finished signal.");
                }
                return agpu.a;
            }
        });
    }
}
