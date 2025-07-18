package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements WatchEvent.Modifier {
    public final /* synthetic */ H a;

    public /* synthetic */ G(H h) {
        this.a = h;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        H h = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return ((F) this.a).a();
    }
}
