package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjv extends Handler {
    final /* synthetic */ tjx a;
    final /* synthetic */ tjj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjv(tjx tjxVar, Looper looper, tjj tjjVar) {
        super(looper);
        this.b = tjjVar;
        this.a = tjxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws IOException {
        int i = message.what;
        if (i == 2) {
            this.a.d(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            tkc.a(this.a.g, ((Boolean) message.obj).booleanValue());
        } else {
            try {
                ((tms) message.obj).f(this.a.i);
            } catch (IOException e) {
                this.b.e(e);
            }
        }
    }
}
