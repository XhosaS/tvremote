package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class B implements D {
    public final /* synthetic */ WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.D
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.D
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
