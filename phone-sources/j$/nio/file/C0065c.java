package j$.nio.file;

/* renamed from: j$.nio.file.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0065c implements CopyOption {
    public final /* synthetic */ java.nio.file.CopyOption a;

    public /* synthetic */ C0065c(java.nio.file.CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    public static /* synthetic */ CopyOption a(java.nio.file.CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        return copyOption instanceof C0066d ? ((C0066d) copyOption).a : copyOption instanceof LinkOption ? AbstractC0040a.c((LinkOption) copyOption) : copyOption instanceof StandardCopyOption ? AbstractC0040a.d((StandardCopyOption) copyOption) : new C0065c(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.a;
        if (obj instanceof C0065c) {
            obj = ((C0065c) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
