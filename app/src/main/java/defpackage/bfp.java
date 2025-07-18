package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class bfp extends Handler {
    final /* synthetic */ bfs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfp(bfs bfsVar, Looper looper) {
        super(looper);
        this.a = bfsVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        bfs bfsVar = this.a;
        synchronized (bfsVar.a) {
            ArrayList arrayList = bfsVar.c;
            int size = arrayList.size();
            if (size <= 0) {
                return;
            }
            bfq[] bfqVarArr = new bfq[size];
            arrayList.toArray(bfqVarArr);
            arrayList.clear();
            ArrayList arrayList2 = bfqVarArr[0].a;
            throw null;
        }
    }
}
