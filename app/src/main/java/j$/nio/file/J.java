package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements WatchEvent {
    public final /* synthetic */ K a;

    public /* synthetic */ J(K k) {
        this.a = k;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ Object context() {
        return AbstractC0002a.g(((I) this.a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((I) this.a).b();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        K k = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return k.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ WatchEvent.Kind kind() {
        return AbstractC0002a.f(((I) this.a).c());
    }
}
