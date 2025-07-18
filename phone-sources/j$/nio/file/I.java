package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class I implements WatchEvent {
    public final /* synthetic */ J a;

    public /* synthetic */ I(J j) {
        this.a = j;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ Object context() {
        return AbstractC0040a.g(((H) this.a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((H) this.a).b();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        J j = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ WatchEvent.Kind kind() {
        return AbstractC0040a.f(((H) this.a).c());
    }
}
