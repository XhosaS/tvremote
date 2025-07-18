package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kse implements Handler.Callback {
    private final idt a;

    public kse(idt idtVar) {
        this.a = idtVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.a.eb();
        return true;
    }
}
