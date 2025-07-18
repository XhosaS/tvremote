package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rox extends rpj {
    public String a;
    public yqt b;
    public yzo c;
    public Executor d;
    private boolean e;
    private boolean f;
    private final yqt g;
    private yzq h;
    private yqt i;
    private byte j;

    public rox() {
        ypv ypvVar = ypv.a;
        this.b = ypvVar;
        this.g = ypvVar;
        this.i = ypvVar;
    }

    @Override // defpackage.rpj
    public final rpk a() {
        yzo yzoVar = this.c;
        if (yzoVar != null) {
            this.h = yzoVar.f();
        } else if (this.h == null) {
            this.h = zcp.b;
        }
        if (this.j == 3 && this.a != null && this.d != null) {
            return new roy(this.e, this.a, this.f, this.b, this.g, this.h, this.d, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" dumpable");
        }
        if (this.a == null) {
            sb.append(" loggerName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" enableTikTokIntegration");
        }
        if (this.d == null) {
            sb.append(" listenerExecutor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rpj
    public final void b() {
        this.e = true;
        this.j = (byte) (1 | this.j);
    }

    @Override // defpackage.rpj
    public final void c(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 2);
    }

    @Override // defpackage.rpj
    public final void d(int i) {
        this.i = yqt.i(Integer.valueOf(i));
    }
}
