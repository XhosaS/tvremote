package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jct extends Handler {
    final /* synthetic */ jcv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jct(jcv jcvVar, Looper looper) {
        super(looper);
        this.a = jcvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zdy zdyVar = jcv.a;
        int i = message.what;
        if (message.what == 1) {
            jcu jcuVar = (jcu) message.obj;
            this.a.f(jcuVar.b(), jcuVar.a());
        } else if (message.what == 2) {
            this.a.k();
        } else if (message.what == 3) {
            jcv jcvVar = this.a;
            ((jcc) jcvVar.o).a.L(false);
            jcvVar.k();
        }
    }
}
