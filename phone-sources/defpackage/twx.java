package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class twx extends tvw {
    private final String a;

    protected twx(String str) {
        this.a = str;
    }

    @Override // defpackage.tvw
    public String a() {
        return this.a;
    }

    @Override // defpackage.tvw
    public void b(RuntimeException runtimeException, tvu tvuVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
