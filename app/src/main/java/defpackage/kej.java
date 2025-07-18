package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kej extends Exception {

    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public kej(Status status) {
        int i = status.f;
        String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }
}
