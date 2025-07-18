package defpackage;

import com.google.common.collect.Lists;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnc extends wne {
    public final String a;
    public final yqt b;
    public final MessageLite c;
    public final wna d;
    public final yyk e;
    public final yqt f;
    public final yqt g;
    public final Executor h;

    public wnc(String str, yqt yqtVar, MessageLite messageLite, wna wnaVar, yyk yykVar, yqt yqtVar2, yqt yqtVar3, Executor executor) {
        this.a = str;
        this.b = yqtVar;
        this.c = messageLite;
        this.d = wnaVar;
        this.e = yykVar;
        this.f = yqtVar2;
        this.g = yqtVar3;
        this.h = executor;
    }

    @Override // defpackage.wne
    public final wna a() {
        return this.d;
    }

    @Override // defpackage.wne
    public final yqt b() {
        return this.f;
    }

    @Override // defpackage.wne
    public final yqt c() {
        return this.g;
    }

    @Override // defpackage.wne
    public final yqt d() {
        return this.b;
    }

    @Override // defpackage.wne
    public final yyk e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wne) {
            wne wneVar = (wne) obj;
            wneVar.i();
            if (this.a.equals(wneVar.g()) && this.b.equals(wneVar.d()) && this.c.equals(wneVar.f()) && this.d.equals(wneVar.a()) && Lists.d(this.e, wneVar.e()) && this.f.equals(wneVar.b()) && this.g.equals(wneVar.c()) && ((executor = this.h) != null ? executor.equals(wneVar.h()) : wneVar.h() == null)) {
                wneVar.j();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wne
    public final MessageLite f() {
        return this.c;
    }

    @Override // defpackage.wne
    public final String g() {
        return this.a;
    }

    @Override // defpackage.wne
    public final Executor h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (((wmx) this.d).a ^ (-722379962))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        Executor executor = this.h;
        return ((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
    }

    public final String toString() {
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=" + String.valueOf(this.b) + ", schema=" + this.c.toString() + ", storage=" + this.d.toString() + ", migrations=" + String.valueOf(this.e) + ", handler=" + String.valueOf(this.f) + ", logger=Optional.absent(), ioExecutor=" + String.valueOf(this.h) + ", lamsConfig=null}";
    }

    @Override // defpackage.wne
    public final void i() {
    }

    @Override // defpackage.wne
    public final void j() {
    }
}
