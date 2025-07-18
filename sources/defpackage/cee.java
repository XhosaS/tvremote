package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cee extends cdd {
    private final String a;

    protected cee(String str) {
        this.a = str;
    }

    @Override // defpackage.cdd
    public void a(RuntimeException runtimeException, cdb cdbVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.cdd
    public String e() {
        return this.a;
    }
}
