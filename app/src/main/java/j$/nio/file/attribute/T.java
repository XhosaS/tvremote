package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class T implements UserDefinedFileAttributeView {
    public final /* synthetic */ U a;

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(String str) throws IOException {
        ((S) this.a).c(str);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        U u = this.a;
        if (obj instanceof T) {
            obj = ((T) obj).a;
        }
        return u.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ List list() {
        return ((S) this.a).d();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((S) this.a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(String str, ByteBuffer byteBuffer) {
        return ((S) this.a).e(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(String str) {
        return ((S) this.a).f(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(String str, ByteBuffer byteBuffer) {
        return ((S) this.a).g(str, byteBuffer);
    }
}
