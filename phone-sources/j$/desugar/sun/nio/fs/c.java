package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;

/* loaded from: classes4.dex */
public final class c implements BasicFileAttributes {
    public final FileTime a;
    public final FileTime b;
    public final FileTime c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Integer i;

    public c(FileTime fileTime, FileTime fileTime2, FileTime fileTime3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = fileTime;
        this.b = fileTime2;
        this.c = fileTime3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.h;
    }
}
