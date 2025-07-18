package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zgv extends zft {
    private final String a;

    protected zgv(String str) {
        this.a = str;
    }

    @Override // defpackage.zft
    public void a(RuntimeException runtimeException, zfp zfpVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.zft
    public String d() {
        return this.a;
    }
}
