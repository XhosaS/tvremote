package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lya implements agux {
    public final /* synthetic */ String a;

    public /* synthetic */ lya(String str) {
        this.a = str;
    }

    @Override // defpackage.agux
    public final Object a(Object obj) {
        String str = this.a;
        Throwable th = (Throwable) obj;
        if (th == null) {
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer$Companion", "completionHandlerFor$lambda$0", 806, "KatnissVoiceInteractionServicePeer.kt")).x("%s succeeded", str);
        } else if (th instanceof CancellationException) {
            zdy zdyVar = lyp.a;
        } else {
            ((zdv) ((zdv) lyp.a.d()).p(th).q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer$Companion", "completionHandlerFor$lambda$0", 808, "KatnissVoiceInteractionServicePeer.kt")).x("%s failed", str);
        }
        return agpu.a;
    }
}
