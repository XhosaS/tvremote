package defpackage;

import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class msy extends CommandRunCompletionCallback {
    final /* synthetic */ agih a;

    public msy(agih agihVar) {
        this.a = agihVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback
    public final void completion(Status status) {
        if (status.e()) {
            this.a.a();
        } else {
            this.a.c(status.asException());
        }
    }
}
