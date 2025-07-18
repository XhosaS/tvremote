package defpackage;

import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rex {
    public static Object a(rey reyVar) {
        try {
            return reyVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return reyVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
