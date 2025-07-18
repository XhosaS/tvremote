package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyb extends Handler {
    final /* synthetic */ dyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyb(dyd dydVar, Looper looper) {
        super(looper);
        this.a = dydVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        dwi[] dwiVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        dyd dydVar = this.a;
        while (true) {
            synchronized (dydVar.b) {
                ArrayList arrayList = dydVar.d;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                dwiVarArr = new dwi[size];
                arrayList.toArray(dwiVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                dwi dwiVar = dwiVarArr[i];
                ArrayList arrayList2 = (ArrayList) dwiVar.a;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dyc dycVar = (dyc) arrayList2.get(i2);
                    if (!dycVar.d) {
                        dycVar.b.onReceive(dydVar.a, (Intent) dwiVar.b);
                    }
                }
            }
        }
    }
}
