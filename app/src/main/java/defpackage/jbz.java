package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbz implements ServiceConnection {
    final /* synthetic */ jca a;
    final /* synthetic */ jby b;

    public jbz(jca jcaVar, jby jbyVar) {
        this.a = jcaVar;
        this.b = jbyVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jdq jdoVar;
        try {
            jca jcaVar = this.a;
            jdq jdqVar = jcaVar.b;
            if (jdqVar != null) {
                this.b.a(jdqVar);
                return;
            }
            if (iBinder == null) {
                jdoVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tvsearch.voice.ipc.IKatnissVoiceInteractionService");
                jdoVar = iInterfaceQueryLocalInterface instanceof jdq ? (jdq) iInterfaceQueryLocalInterface : new jdo(iBinder);
            }
            jcaVar.b = jdoVar;
            this.b.a(jcaVar.b);
            jcaVar.a();
        } catch (ClassCastException e) {
            ((zdv) ((zdv) jca.a.c()).p(e).q("com/google/android/apps/tvsearch/voice/controller/VoiceInteractionController$run$1", "onServiceConnected", 54, "VoiceInteractionController.kt")).u("Failed to bind to VoiceInteractionService.");
            this.b.a(null);
            this.a.a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b = null;
    }
}
