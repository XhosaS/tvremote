package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knn extends knj {
    final /* synthetic */ lvj a;

    public knn(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.knk
    public final void a(Status status, String str) {
        status.getClass();
        if (str == null) {
            str = "ERROR_ID_NOT_FOUND";
        }
        kid.a(status, str, this.a);
    }
}
