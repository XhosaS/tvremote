package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class roy extends rpk {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final yqt d;
    public final yqt e;
    public final yzq f;
    public final yqt g;
    private final Executor h;

    public roy(boolean z, String str, boolean z2, yqt yqtVar, yqt yqtVar2, yzq yzqVar, Executor executor, yqt yqtVar3) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = yqtVar;
        this.e = yqtVar2;
        this.f = yzqVar;
        this.h = executor;
        this.g = yqtVar3;
    }

    @Override // defpackage.rpk
    public final yqt a() {
        return this.d;
    }

    @Override // defpackage.rpk
    public final yqt b() {
        return this.g;
    }

    @Override // defpackage.rpk
    public final yqt c() {
        return this.e;
    }

    @Override // defpackage.rpk
    public final yzq d() {
        return this.f;
    }

    @Override // defpackage.rpk
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rpk) {
            rpk rpkVar = (rpk) obj;
            if (this.a == rpkVar.h() && this.b.equals(rpkVar.e()) && this.c == rpkVar.g() && this.d.equals(rpkVar.a()) && this.e.equals(rpkVar.c()) && this.f.equals(rpkVar.d()) && this.h.equals(rpkVar.f()) && this.g.equals(rpkVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rpk
    public final Executor f() {
        return this.h;
    }

    @Override // defpackage.rpk
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.rpk
    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "LoggerOptions{dumpable=" + this.a + ", loggerName=" + this.b + ", enableTikTokIntegration=" + this.c + ", appIdOverrideForProducts=" + String.valueOf(this.d) + ", maxEventsInMemory=Optional.absent(), appFlowListeners=" + String.valueOf(this.f) + ", listenerExecutor=" + String.valueOf(this.h) + ", loggerId=" + String.valueOf(this.g) + "}";
    }
}
