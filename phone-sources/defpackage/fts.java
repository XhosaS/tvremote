package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fts extends Handler {
    final /* synthetic */ ftw a;
    private final ArrayList b = new ArrayList();
    private final List c = new ArrayList();

    public fts(ftw ftwVar) {
        this.a = ftwVar;
    }

    final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    final void b(fux fuxVar, fux fuxVar2, int i, boolean z) {
        Message messageObtainMessage = obtainMessage(262, new uof(fuxVar, fuxVar2, z));
        messageObtainMessage.arg1 = i;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0187 A[SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fts.handleMessage(android.os.Message):void");
    }
}
