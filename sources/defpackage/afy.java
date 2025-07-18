package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afy extends Exception {

    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public afy(Status status) {
        int i = status.d;
        String str = status.e;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }

    public final int a() {
        return this.a.d;
    }
}
