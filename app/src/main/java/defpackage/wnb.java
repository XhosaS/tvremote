package defpackage;

import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnb extends wnd {
    public String a;
    public yqt b;
    public wna c;
    public yqt d;
    public Executor e;
    public byte f;
    private MessageLite g;
    private yyk h;
    private final yqt i;

    public wnb() {
        ypv ypvVar = ypv.a;
        this.b = ypvVar;
        this.d = ypvVar;
        this.i = ypvVar;
    }

    @Override // defpackage.wnd
    public final wne a() {
        String str;
        MessageLite messageLite;
        wna wnaVar;
        if (this.h == null) {
            int i = yyk.e;
            this.h = zcg.b;
        }
        if (this.f == 1 && (str = this.a) != null && (messageLite = this.g) != null && (wnaVar = this.c) != null) {
            return new wnc(str, this.b, messageLite, wnaVar, this.h, this.d, this.i, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.g == null) {
            sb.append(" schema");
        }
        if (this.c == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.wnd
    public final void b(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null schema");
        }
        this.g = messageLite;
    }
}
