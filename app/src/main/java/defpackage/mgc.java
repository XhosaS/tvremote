package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgc extends ThreadLocal {
    public static final mgc a = new mgc();

    private mgc() {
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        int iMyTid = Process.myTid();
        return new mfz(Thread.currentThread(), iMyTid, true, Process.getThreadPriority(iMyTid), false, 112);
    }
}
