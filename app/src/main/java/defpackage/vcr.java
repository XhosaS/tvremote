package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vcr implements Handler.Callback {
    final /* synthetic */ vct a;

    public vcr(vct vctVar) {
        this.a = vctVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        vct vctVar = this.a;
        vcs vcsVar = (vcs) message.obj;
        synchronized (vctVar.a) {
            if (vcsVar == null) {
                throw null;
            }
        }
        return true;
    }
}
