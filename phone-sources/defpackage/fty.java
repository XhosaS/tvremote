package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fty extends Handler {
    final /* synthetic */ ftz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fty(ftz ftzVar) {
        super(Looper.getMainLooper());
        this.a = ftzVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        SparseArray sparseArray = this.a.e;
        Object obj = message.obj;
        Bundle bundlePeekData = message.peekData();
        fus fusVar = (fus) sparseArray.get(i2);
        if (fusVar == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        sparseArray.remove(i2);
        if (i == 3) {
            fusVar.b((Bundle) obj);
        } else {
            if (i != 4) {
                return;
            }
            fusVar.a(bundlePeekData == null ? null : bundlePeekData.getString("error"), (Bundle) obj);
        }
    }
}
