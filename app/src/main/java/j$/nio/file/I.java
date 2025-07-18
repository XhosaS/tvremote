package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements K {
    public final /* synthetic */ WatchEvent a;

    public final /* synthetic */ Object a() {
        return AbstractC0002a.g(this.a.context());
    }

    public final /* synthetic */ int b() {
        return this.a.count();
    }

    public final /* synthetic */ E c() {
        return AbstractC0002a.b(this.a.kind());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent watchEvent = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
