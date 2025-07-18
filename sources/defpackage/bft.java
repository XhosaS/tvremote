package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bft {
    public final Uri a;
    public final cmz b;
    public final byg c;
    public final bzs d;
    public final boolean e;
    public final wz f;

    public bft() {
        throw null;
    }

    public static bfs a() {
        bfs bfsVar = new bfs(null);
        bfsVar.d = bfw.a;
        bfsVar.b();
        bfsVar.b = true;
        bfsVar.c = (byte) (1 | bfsVar.c);
        return bfsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bft) {
            bft bftVar = (bft) obj;
            if (this.a.equals(bftVar.a) && this.b.equals(bftVar.b) && this.c.equals(bftVar.c) && biu.h(this.d, bftVar.d) && this.f.equals(bftVar.f) && this.e == bftVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        wz wzVar = this.f;
        bzs bzsVar = this.d;
        byg bygVar = this.c;
        cmz cmzVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(cmzVar) + ", handler=" + String.valueOf(bygVar) + ", migrations=" + String.valueOf(bzsVar) + ", variantConfig=" + String.valueOf(wzVar) + ", useGeneratedExtensionRegistry=" + this.e + ", enableTracing=false}";
    }

    public bft(Uri uri, cmz cmzVar, byg bygVar, bzs bzsVar, wz wzVar, boolean z) {
        this.a = uri;
        this.b = cmzVar;
        this.c = bygVar;
        this.d = bzsVar;
        this.f = wzVar;
        this.e = z;
    }
}
