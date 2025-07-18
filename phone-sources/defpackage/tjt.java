package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjt extends Thread {
    public boolean a;
    public final /* synthetic */ tju b;
    public tin c;
    private String d;

    public tjt(tju tjuVar) {
        this.b = tjuVar;
        setName("PairingThread");
    }

    public final synchronized String a() {
        if (!this.a) {
            String str = this.d;
            if (str != null) {
                return str;
            }
            try {
                wait();
                if (!this.a) {
                    return this.d;
                }
            } catch (InterruptedException e) {
                Log.e("AtvRemote.PairingClient", "Exception occurred", e);
                return null;
            }
        }
        return null;
    }

    public final synchronized void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        notify();
        new tjs(this).start();
    }

    public final synchronized void c(String str) {
        String str2 = this.d;
        if (str2 != null) {
            throw new IllegalStateException("Secret already set: ".concat(str2));
        }
        this.d = str;
        notify();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198 A[Catch: IOException -> 0x019f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x019f, blocks: (B:5:0x001a, B:70:0x0198), top: B:95:0x001a }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjt.run():void");
    }
}
