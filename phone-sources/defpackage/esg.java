package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esg extends Handler {
    final /* synthetic */ esi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esg(esi esiVar, Looper looper) {
        super(looper);
        this.a = esiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        esh eshVar;
        esi esiVar = this.a;
        int i = message.what;
        if (i == 1) {
            eshVar = (esh) message.obj;
            int i2 = eshVar.a;
            int i3 = eshVar.b;
            try {
                esiVar.c.queueInputBuffer(i2, 0, eshVar.c, eshVar.e, eshVar.f);
            } catch (RuntimeException e) {
                a.v(esiVar.f, e);
            }
        } else if (i != 2) {
            eshVar = null;
            if (i == 3) {
                esiVar.h.g();
            } else if (i != 4) {
                a.v(esiVar.f, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    esiVar.c.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    a.v(esiVar.f, e2);
                }
            }
        } else {
            eshVar = (esh) message.obj;
            int i4 = eshVar.a;
            int i5 = eshVar.b;
            MediaCodec.CryptoInfo cryptoInfo = eshVar.d;
            long j = eshVar.e;
            int i6 = eshVar.f;
            try {
                synchronized (esi.b) {
                    esiVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                a.v(esiVar.f, e3);
            }
        }
        if (eshVar != null) {
            ArrayDeque arrayDeque = esi.a;
            synchronized (arrayDeque) {
                arrayDeque.add(eshVar);
            }
        }
    }
}
