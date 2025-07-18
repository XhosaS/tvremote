package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfb extends ResultReceiver {
    final /* synthetic */ kwy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfb(Handler handler, kwy kwyVar) {
        super(handler);
        this.a = kwyVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.a.w(null);
    }
}
