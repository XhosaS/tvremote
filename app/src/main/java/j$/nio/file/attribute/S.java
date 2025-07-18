package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements U {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    public final /* synthetic */ void c(String str) throws IOException {
        this.a.delete(str);
    }

    public final /* synthetic */ List d() {
        return this.a.list();
    }

    public final /* synthetic */ int e(String str, ByteBuffer byteBuffer) {
        return this.a.read(str, byteBuffer);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int f(String str) {
        return this.a.size(str);
    }

    public final /* synthetic */ int g(String str, ByteBuffer byteBuffer) {
        return this.a.write(str, byteBuffer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0006d
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
