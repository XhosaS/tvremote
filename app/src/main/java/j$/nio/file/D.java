package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements WatchEvent.Kind {
    public final /* synthetic */ E a;

    public final /* synthetic */ boolean equals(Object obj) {
        E e = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
