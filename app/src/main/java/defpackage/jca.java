package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jca {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/controller/VoiceInteractionController");
    public jdq b;
    private final Context c;
    private ServiceConnection d;

    public jca(Context context) {
        context.getClass();
        this.c = context;
    }

    public final void a() {
        ServiceConnection serviceConnection = this.d;
        if (serviceConnection == null) {
            return;
        }
        try {
            this.c.unbindService(serviceConnection);
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) a.b()).p(e).q("com/google/android/apps/tvsearch/voice/controller/VoiceInteractionController", "disconnect", 86, "VoiceInteractionController.kt")).u("Service already disconnected.");
        }
    }

    public final void b(jby jbyVar) {
        jbz jbzVar = new jbz(this, jbyVar);
        this.d = jbzVar;
        Context context = this.c;
        Intent intent = new Intent("KATNISS_VIS_INTERFACE");
        ComponentName componentName = irm.a;
        if (context.bindService(intent.setComponent(irm.p), jbzVar, 65)) {
            return;
        }
        jbyVar.a(null);
    }
}
