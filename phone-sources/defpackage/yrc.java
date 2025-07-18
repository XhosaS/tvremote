package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrc extends CancellationException implements yoq {
    public final transient yqe a;

    public yrc(String str, yqe yqeVar) {
        super(str);
        this.a = yqeVar;
    }

    @Override // defpackage.yoq
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        yrc yrcVar = new yrc(message, this.a);
        yrcVar.initCause(this);
        return yrcVar;
    }
}
