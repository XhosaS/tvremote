package j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* renamed from: j$.nio.file.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0067e extends A {
    public final /* synthetic */ FileStore e;

    public C0067e(FileStore fileStore) {
        this.e = fileStore;
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ Object a(String str) {
        return this.e.getAttribute(str);
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ long b() {
        return this.e.getBlockSize();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ j$.nio.file.attribute.D c(Class cls) {
        FileStoreAttributeView fileStoreAttributeView = this.e.getFileStoreAttributeView(cls);
        if (fileStoreAttributeView == null) {
            return null;
        }
        return fileStoreAttributeView instanceof j$.nio.file.attribute.C ? ((j$.nio.file.attribute.C) fileStoreAttributeView).a : new j$.nio.file.attribute.B(fileStoreAttributeView);
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ long d() {
        return this.e.getTotalSpace();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ long e() {
        return this.e.getUnallocatedSpace();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.e;
        if (obj instanceof C0067e) {
            obj = ((C0067e) obj).e;
        }
        return fileStore.equals(obj);
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ long f() {
        return this.e.getUsableSpace();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ boolean g() {
        return this.e.isReadOnly();
    }

    public final /* synthetic */ int hashCode() {
        return this.e.hashCode();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ String n() {
        return this.e.name();
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ boolean o(Class cls) {
        return this.e.supportsFileAttributeView(AbstractC0040a.h(cls));
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ boolean p(String str) {
        return this.e.supportsFileAttributeView(str);
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ String q() {
        return this.e.type();
    }
}
