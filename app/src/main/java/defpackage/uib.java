package defpackage;

import android.net.Uri;
import com.google.common.collect.Lists;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uib extends ujm {
    public final Uri a;
    public final MessageLite b;
    public final yqt c;
    public final yyk d;
    public final umz e;
    public final boolean f;

    public uib(Uri uri, MessageLite messageLite, yqt yqtVar, yyk yykVar, umz umzVar, boolean z) {
        this.a = uri;
        this.b = messageLite;
        this.c = yqtVar;
        this.d = yykVar;
        this.e = umzVar;
        this.f = z;
    }

    @Override // defpackage.ujm
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.ujm
    public final umz b() {
        return this.e;
    }

    @Override // defpackage.ujm
    public final yqt c() {
        return this.c;
    }

    @Override // defpackage.ujm
    public final yyk d() {
        return this.d;
    }

    @Override // defpackage.ujm
    public final MessageLite e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujm) {
            ujm ujmVar = (ujm) obj;
            if (this.a.equals(ujmVar.a()) && this.b.equals(ujmVar.e()) && this.c.equals(ujmVar.c()) && Lists.d(this.d, ujmVar.d()) && this.e.equals(ujmVar.b()) && this.f == ujmVar.f()) {
                ujmVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ujm
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        umz umzVar = this.e;
        yyk yykVar = this.d;
        yqt yqtVar = this.c;
        MessageLite messageLite = this.b;
        return "ProtoDataStoreConfig{uri=" + this.a.toString() + ", schema=" + messageLite.toString() + ", handler=" + String.valueOf(yqtVar) + ", migrations=" + String.valueOf(yykVar) + ", variantConfig=" + umzVar.toString() + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    @Override // defpackage.ujm
    public final void g() {
    }
}
