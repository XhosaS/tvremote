package defpackage;

import android.text.TextUtils;
import com.google.assistant.sdk.libassistant.DeviceActionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jia extends DeviceActionHandler {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/SdkActionExecutor");
    private final lzb b;
    private final jhz c;

    public jia(lzb lzbVar, jhz jhzVar) {
        this.b = lzbVar;
        this.c = jhzVar;
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceActionHandler
    public final void Execute(String str) {
        jhz jhzVar = this.c;
        jhzVar.a(null, null);
        jhzVar.c();
        if (TextUtils.isEmpty(str)) {
            ((zdv) ((zdv) a.d()).q("com/google/android/apps/tvsearch/voice/libassistant/SdkActionExecutor", "Execute", 33, "SdkActionExecutor.java")).u("Empty sdk action client op args received");
            return;
        }
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/libassistant/SdkActionExecutor", "Execute", 36, "SdkActionExecutor.java")).u("Received sdk_actions.EXECUTE requestJson, getting SearchProcessClient to send it out");
        lzb lzbVar = this.b;
        String strA = fbo.M.a();
        byte[] bytes = str.getBytes();
        synchronized (lzbVar.j) {
            if (lzbVar.i) {
                lzbVar.g.add(lzb.g(strA, bytes));
            } else {
                lzbVar.u(strA, bytes);
            }
        }
    }
}
