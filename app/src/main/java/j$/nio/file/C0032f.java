package j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* renamed from: j$.nio.file.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0032f extends FileStore {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ B a;

    public final /* synthetic */ boolean equals(Object obj) {
        B b2 = this.a;
        if (obj instanceof C0032f) {
            obj = ((C0032f) obj).a;
        }
        return b2.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.a.a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.a.b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        j$.nio.file.attribute.E eC = this.a.c(cls);
        if (eC == null) {
            return null;
        }
        return eC instanceof j$.nio.file.attribute.C ? ((j$.nio.file.attribute.C) eC).a : new j$.nio.file.attribute.D(eC);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.a.d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.a.e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.a.f();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.a.n();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.a.o(AbstractC0002a.h(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.a.q();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.a.p(str);
    }
}
