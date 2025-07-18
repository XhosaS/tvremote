package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0045e implements InterfaceC0047g {
    public final /* synthetic */ BasicFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.a.setTimes(AbstractC0060u.c(fileTime), AbstractC0060u.c(fileTime2), AbstractC0060u.c(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0045e) {
            obj = ((C0045e) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0044d
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0048h.a(this.a.readAttributes());
    }
}
