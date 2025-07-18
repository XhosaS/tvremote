package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class H implements J {
    public final /* synthetic */ WatchEvent a;

    public final /* synthetic */ Object a() {
        return AbstractC0040a.g(this.a.context());
    }

    public final /* synthetic */ int b() {
        return this.a.count();
    }

    public final /* synthetic */ D c() {
        return AbstractC0040a.b(this.a.kind());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent watchEvent = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
