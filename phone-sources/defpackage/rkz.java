package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rkz extends Exception {
    public abstract nxc a();

    public abstract Status b();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return b().toString();
    }
}
