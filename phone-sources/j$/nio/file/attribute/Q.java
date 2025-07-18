package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q implements UserDefinedFileAttributeView {
    public final /* synthetic */ S a;

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(String str) throws IOException {
        ((P) this.a).c(str);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        S s = this.a;
        if (obj instanceof Q) {
            obj = ((Q) obj).a;
        }
        return s.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ List list() {
        return ((P) this.a).d();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((P) this.a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(String str, ByteBuffer byteBuffer) {
        return ((P) this.a).e(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(String str) {
        return ((P) this.a).f(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(String str, ByteBuffer byteBuffer) {
        return ((P) this.a).g(str, byteBuffer);
    }
}
