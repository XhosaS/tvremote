package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yt extends Handler {
    final /* synthetic */ yv a;
    private final ArrayList b = new ArrayList();
    private final List c = new ArrayList();

    public yt(yv yvVar) {
        this.a = yvVar;
    }

    final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    final void b(zu zuVar, zu zuVar2, int i, boolean z) {
        Message messageObtainMessage = obtainMessage(262, new byl(zuVar, zuVar2, z));
        messageObtainMessage.arg1 = i;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt.handleMessage(android.os.Message):void");
    }
}
