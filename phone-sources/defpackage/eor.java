package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eor extends Handler {
    final /* synthetic */ eou a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eor(eou eouVar, Looper looper) {
        super(looper);
        this.a = eouVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (eoo eooVar : this.a.b) {
            eooVar.i();
            if (Arrays.equals(eooVar.h, bArr)) {
                if (message.what == 2 && eooVar.c == 0 && eooVar.g == 4) {
                    String str = edt.a;
                    eooVar.e(false);
                    return;
                }
                return;
            }
        }
    }
}
