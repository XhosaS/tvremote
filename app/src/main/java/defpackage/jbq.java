package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbq implements jbn {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/voice/audiostateholder/AudioStateHolderImpl");
    public Messenger a;
    private final jnb c;
    private final ConversationStateListener d;
    private final Messenger e;
    private int f;

    public jbq(jnb jnbVar) {
        jnbVar.getClass();
        this.c = jnbVar;
        this.f = 1;
        this.d = new jbp(this);
        this.e = new Messenger(new jbo(this));
    }

    @Override // defpackage.jbn
    public final IBinder a() {
        return this.e.getBinder();
    }

    @Override // defpackage.jbn
    public final void b() throws RemoteException {
        g(1);
        this.c.a(this.d);
    }

    @Override // defpackage.jbn
    public final void c() {
        this.c.b(this.d);
    }

    @Override // defpackage.jbn
    public final void d() {
        this.a = null;
    }

    @Override // defpackage.jbn
    public final boolean e() {
        return this.a != null;
    }

    public final void f() throws RemoteException {
        int iA;
        Messenger messenger = this.a;
        if (messenger == null) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/audiostateholder/AudioStateHolderImpl", "sendAudioStateMessage", 79, "AudioStateHolderImpl.kt")).u("No connection exists with the talkback to send updated audio state of Katniss.");
            return;
        }
        vdk vdkVar = vdk.a;
        vdj vdjVar = new vdj();
        int i = this.f;
        if ((vdjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vdjVar.y();
        }
        vdk vdkVar2 = (vdk) vdjVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        vdkVar2.c = i2;
        vdkVar2.b |= 16;
        abxd abxdVarV = vdjVar.v();
        abxdVarV.getClass();
        vdk vdkVar3 = (vdk) abxdVarV;
        Bundle bundle = new Bundle();
        try {
            int i3 = vdkVar3.memoizedSerializedSize;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(vdkVar3.getClass()).a(vdkVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i3 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(vdkVar3.getClass()).a(vdkVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    vdkVar3.memoizedSerializedSize = (Integer.MIN_VALUE & vdkVar3.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(vdkVar3.getClass()).m(vdkVar3, abwa.a(abvwVar));
            abvwVar.K();
            bundle.putByteArray("ssb_service:ssb_state", bArr);
            Message messageObtain = Message.obtain(null, 3, bundle);
            messageObtain.getClass();
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e) {
                ((zdv) ((zdv) b.c()).p(e).q("com/google/android/apps/tvsearch/voice/audiostateholder/AudioStateHolderImpl", "sendAudioStateMessage", 90, "AudioStateHolderImpl.kt")).u("Error while sending audio state update to talkback");
            }
        } catch (IOException e2) {
            throw new RuntimeException(a.x(vdkVar3, "Serializing ", " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public final void g(int i) throws RemoteException {
        if (this.f == i) {
            return;
        }
        this.f = i;
        f();
    }
}
