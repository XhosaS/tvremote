package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yx extends Handler {
    final /* synthetic */ yy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(yy yyVar) {
        super(Looper.getMainLooper());
        this.a = yyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        SparseArray sparseArray = this.a.e;
        Object obj = message.obj;
        Bundle bundlePeekData = message.peekData();
        tj tjVar = (tj) sparseArray.get(i2);
        if (tjVar == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        sparseArray.remove(i2);
        if (i == 3) {
            tjVar.f((Bundle) obj);
        } else {
            if (i != 4) {
                return;
            }
            tjVar.e(bundlePeekData == null ? null : bundlePeekData.getString("error"), (Bundle) obj);
        }
    }
}
