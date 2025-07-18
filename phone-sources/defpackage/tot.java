package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tot extends Handler {
    final /* synthetic */ tov a;

    public tot(tov tovVar) {
        this.a = tovVar;
    }

    final Message a() {
        tou touVar = tou.SLOW;
        return b(touVar, touVar.d);
    }

    final Message b(tou touVar, int i) {
        return Message.obtain(this, 1, touVar.ordinal(), i);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            tov tovVar = this.a;
            tovVar.e = true;
            tovVar.k.f(tow.NONE, tlv.DOWN);
            return;
        }
        if (i != 1) {
            return;
        }
        tov tovVar2 = this.a;
        if (tovVar2.e) {
            return;
        }
        tovVar2.k.f(tovVar2.c, tlv.PRESS);
        int i2 = 0;
        removeMessages(0);
        removeMessages(1);
        tou touVar = tou.values()[message.arg1];
        int i3 = message.arg2;
        if (tovVar2.d) {
            tovVar2.d = false;
            r6.arg2--;
            sendMessageDelayed(a(), tovVar2.j[tou.SLOW.ordinal()]);
            return;
        }
        if (tovVar2.b.compareTo(touVar) < 0) {
            touVar = tovVar2.b;
        } else if (i3 > 0 || tovVar2.b.compareTo(touVar) <= 0) {
            i2 = i3;
        } else {
            touVar = tou.values()[touVar.ordinal() + 1];
            i2 = touVar.d;
        }
        sendMessageDelayed(b(touVar, i2 - 1), tovVar2.j[touVar.ordinal()]);
    }
}
