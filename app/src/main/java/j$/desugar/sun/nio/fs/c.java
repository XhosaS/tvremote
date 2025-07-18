package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.G;
import j$.nio.file.attribute.InterfaceC0012j;

/* loaded from: classes3.dex */
public final class c implements InterfaceC0012j {
    public final G a;
    public final G b;
    public final G c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Integer i;

    public c(G g, G g2, G g3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = g;
        this.b = g2;
        this.c = g3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final G creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final G lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final G lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final long size() {
        return this.h;
    }
}
