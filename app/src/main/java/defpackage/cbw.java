package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cbw extends cbx {
    public final int a;

    public cbw(int i) {
        this.a = i;
    }

    @Override // defpackage.cbx
    public final void a(String str, String str2) {
        if (this.a <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.cbx
    public final void b(String str, String str2, Throwable th) {
        if (this.a <= 3) {
            Log.d(str, str2, th);
        }
    }
}
