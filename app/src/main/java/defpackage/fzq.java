package defpackage;

import com.google.protobuf.MessageLite;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzq implements owj {
    final /* synthetic */ ahap a;

    public fzq(ahap ahapVar) {
        this.a = ahapVar;
    }

    @Override // defpackage.owj
    public final /* bridge */ /* synthetic */ void a(Status status, Object obj) {
        MessageLite messageLite = (MessageLite) obj;
        if (!status.e()) {
            this.a.e(agpl.a(status.asException()));
            return;
        }
        ahap ahapVar = this.a;
        if (messageLite == null) {
            throw new IllegalStateException("Received null response for OK status.");
        }
        ahapVar.e(messageLite);
    }
}
