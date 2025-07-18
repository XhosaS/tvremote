package j$.nio.file;

/* renamed from: j$.nio.file.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0029c implements CopyOption {
    public final /* synthetic */ java.nio.file.CopyOption a;

    public /* synthetic */ C0029c(java.nio.file.CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    public static /* synthetic */ CopyOption a(java.nio.file.CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        return copyOption instanceof C0030d ? ((C0030d) copyOption).a : copyOption instanceof EnumC0038l ? AbstractC0002a.c((EnumC0038l) copyOption) : copyOption instanceof StandardCopyOption ? AbstractC0002a.d((StandardCopyOption) copyOption) : new C0029c(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.a;
        if (obj instanceof C0029c) {
            obj = ((C0029c) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
