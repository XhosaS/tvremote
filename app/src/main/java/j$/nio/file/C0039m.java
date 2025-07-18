package j$.nio.file;

import java.nio.file.OpenOption;

/* renamed from: j$.nio.file.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0039m implements InterfaceC0041o {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ C0039m(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.o, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.o, java.nio.file.LinkOption] */
    public static /* synthetic */ InterfaceC0041o a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        return openOption instanceof C0040n ? ((C0040n) openOption).a : openOption instanceof EnumC0038l ? AbstractC0002a.c((EnumC0038l) openOption) : openOption instanceof z ? AbstractC0002a.e((z) openOption) : new C0039m(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof C0039m) {
            obj = ((C0039m) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
