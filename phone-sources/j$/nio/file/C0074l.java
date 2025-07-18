package j$.nio.file;

import java.nio.file.OpenOption;

/* renamed from: j$.nio.file.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0074l implements InterfaceC0076n {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ C0074l(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.n, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.n, java.nio.file.LinkOption] */
    public static /* synthetic */ InterfaceC0076n a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        return openOption instanceof C0075m ? ((C0075m) openOption).a : openOption instanceof LinkOption ? AbstractC0040a.c((LinkOption) openOption) : openOption instanceof y ? AbstractC0040a.e((y) openOption) : new C0074l(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof C0074l) {
            obj = ((C0074l) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
